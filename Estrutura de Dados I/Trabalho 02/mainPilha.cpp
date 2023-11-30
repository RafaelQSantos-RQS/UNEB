#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>
#include "tad_pilha_estatica.h"

// Declaração de funções
void posfixa_simples(T_Pilha *plOutput, char exp[]);
char operacao(char num1, char num2, char op); // Função para efetuar a operação de 2 numeros
char calcular_expressao(T_Pilha *plOutput); // Calcular a Expressão

int main()
{
    // Variaveis
    T_Pilha pilha;
    iniciarPilha(&pilha);
    char exp[255];
    printf("Insira a expressao que deseja calcular:\n");
    fgets(exp, sizeof(exp), stdin);

    // Processamento
    // Etapa 1 - Gerar a Expressão Posfixa - Versão Simplificada
    posfixa_simples(&pilha,exp);
    printf("\nA expressao a ser calculada:\n");
    imprimir(&pilha);
    // Etapa 2 -
    printf("O resultado e: %c",calcular_expressao(&pilha));
    return 0;
}

// Etapa 1 - Geração de Expressão Posfixa
enum Operacoes
{
    MULT='*',
    SOMA='+',
    SUB='-',
    DIV='/'
};
void posfixa_simples(T_Pilha *plOutput, char exp[])
{
    T_Pilha plOperadores;
    iniciarPilha(&plOperadores);
    T_Item item;
    for (int i = 0; i < strlen(exp); i++)
    {
        item.campo=exp[i];
        switch (exp[i])
        {
        case '0'...'9' :
            inserir(plOutput, item);
            break;
        case MULT...DIV :
            inserir(&plOperadores, item);
            break;
        case ')' :
        {
            inserir(plOutput, plOperadores.dados[plOperadores.topo-1]);
            remover(&plOperadores);
            break;
        }
        }
    }
}

// Etapa 2 - Calcular a Expressão
char calcular_expressao(T_Pilha *plOutput)
{
    T_Pilha plResult;
    iniciarPilha(&plResult);
    T_Item item;

    for (int i=(*plOutput).base; i<(*plOutput).qtdeAtual;i++)
    {
        switch((*plOutput).dados[i].campo)
        {
        case '0'...'9':
            item.campo = (*plOutput).dados[i].campo;
            inserir(&plResult,item);
            break;
        case MULT...DIV:
            item.campo = operacao(plResult.dados[plResult.topo-1].campo,plResult.dados[plResult.topo-2].campo,(*plOutput).dados[i].campo);
            for(int j=0;j<2;j++) remover(&plResult);
            inserir(&plResult,item);
        }
    }
    return plResult.dados[plResult.base].campo;
}

char operacao(char num1, char num2, char op) // Função para efetuar a operação de 2 numeros
{
    int n1, n2, res;

    // Converte os números char para inteiros
    n1 = (int)num1 - '0';
    n2 = (int)num2 - '0';

    // Realiza a operação
    switch (op)
    {
        case '+':
            res = n1 + n2;
            break;
        case '-':
            res = n1 - n2;
            break;
        case '*':
            res = n1 * n2;
            break;
        case '/':
            res = n1 / n2;
            break;
    }

    // Converte o resultado inteiro para char
    return (char)(res + '0');
}
