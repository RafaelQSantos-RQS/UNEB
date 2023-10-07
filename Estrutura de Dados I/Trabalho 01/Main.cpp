#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include "Fila_estatica.h"

// Declara��o do caixa
int caixa[4] = {0,0,0,0};

// Declara��es de fun��es
void PrintBanco(); // Fun��o para printar o titulo banco
int ClienteChegou(); // Fuin��o que define se chegou um ciente ou n�o
int Transaction(); // Fun��o que define qual a transa��o que ir� fazer
void TransactionName(int transacao); // Retorna a transa��o efetuada peelo cliente
int ChkCaixaVazio(); // Fun��o que checa se h� um caixa vazio e retorna a posi��o do caixa
void PrintCaixa(); // Fun��o para imprimir o caixa
void AttCaixa(); // Fun��o para atualizar a situa��o do caixa
void PrintCronometro(int cron);
void estatisticas(int total,int filaCheia,int atendimento,int espera);

int main() {
    T_Fila_Est fila;
    T_Item item;
    int cronometro = 1, fimExpediente = 100, totalDeClientes = 0, clientesFilaCheia = 0,transacao, caixaVazio,espera = 0,cliente;

    // Iniciando a fila
    InitRow(&fila);

    // Inicializando a semente do gerador de n�mero aleat�rios com o tempo atual
    srand(time(NULL));

    // Loop da l�gica principal
    while(cronometro<=fimExpediente){
        AttCaixa();
        PrintBanco();
        PrintCronometro(cronometro);
        if(ClienteChegou() == 0){ // Situa��o onde cliente chegou
            item.dado = cronometro;
            printf("O cliente %d chegou!!\n",cronometro);
            if (append(&fila,item) == 0) {
                printf("O cliente %d foi embora por causa de fila cheia...\n",cronometro);
                clientesFilaCheia++;
            } else {
                printf("O cliente %d entrou na fila..\n",cronometro);
                cliente = fila.data[fila.first].dado;
                totalDeClientes++;
            }
            caixaVazio = ChkCaixaVazio();
            if(caixaVazio != -1) { // Situa��o onde temos um caixa vazio
                transacao = Transaction();
                printf("O cliente %d saiu da fila e entrou no caixa para: ",fila.data[fila.first].dado);
                TransactionName(transacao);
                printf("\n");
                caixa[caixaVazio] = transacao;
                espera = espera + (cronometro - fila.data[fila.first].dado);
                printf("Espera: %d\n",espera);
                Remove(&fila);
            }
        } else {
            printf("Nao chegou cliente!!\n",cronometro);
            caixaVazio = ChkCaixaVazio();
            if(caixaVazio != -1 && ChkEmptyRow(&fila) == 0) { // Situa��o onde temos um caixa vazio e gente na fila
                transacao = Transaction();
                printf("O cliente %d saiu da fila e entrou no caixa para: ",fila.data[fila.first].dado);
                TransactionName(transacao);
                printf("\n");
                caixa[caixaVazio] = transacao;
                espera = espera + (cronometro - fila.data[fila.first].dado);
                printf("Espera: %d\n",espera);
                Remove(&fila);
            }
        }
        PrintCaixa();
        printRow(&fila);
        cronometro++;
    }
    estatisticas(totalDeClientes,clientesFilaCheia,fimExpediente,espera);
    return 0;
}

int ClienteChegou() {
    return rand() % 3;
}

int Transaction(){
    switch(rand() % 5){
    case 0:
        return 10;
    case 1:
        return 20;
    case 2:
        return 30;
    case 3:
        return 40;
    case 4:
        return 50;
    }
}

void TransactionName(int transacao) {
    switch(transacao){
    case 10:
        printf("Consulta de saldo");
        break;
    case 20:
        printf("Saque");
        break;
    case 30:
        printf("Aplicacao");
        break;
    case 40:
        printf("Extrato Semanal");
        break;
    case 50:
        printf("Extrato de Mensal");
        break;
    }
}

int ChkCaixaVazio(){
    for(int i=0;i < sizeof(caixa)/sizeof(int);i++) if(caixa[i] == 0) return i;
    return -1;
}

void PrintCaixa() {
    printf("\nCaixa: ");
    for(int i=0;i < sizeof(caixa)/sizeof(int);i++) {
        printf("%d ",caixa[i]);
    }
    printf("\n");
}

void AttCaixa() {
    for(int i=0;i < sizeof(caixa)/sizeof(int);i++) {
        if(caixa[i] != 0) caixa[i]--;
    }
}

void PrintBanco() {
    printf("\n\t#########\n");
    printf("\t# BANCO #\n");
    printf("\t#########\n");
}

void PrintCronometro(int cron) {
    printf("Cronometro: %d\n",cron);
}

void estatisticas(int total,int filaCheia,int atendimento,int espera) {
    float medio = (espera*1.0)/(total);
    printf("\n\t## ESTATISTICAS ##\n");
    printf("Tempo de Atendimento : %d\n",atendimento);
    printf("Total de clientes : %d\n",total);
    printf("Tempo total de espera : %d\n",espera);
    printf("Tempo medio de espera : %.2f\n", medio);
}
