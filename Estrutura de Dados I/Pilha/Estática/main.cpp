#include <stdio.h>
#include "Pilha.h"

int main(){
    // Declaração de variáveis
    T_pilha pilha;
    T_Item item;

    // Iniciando a pilha
    iniciarPilha(&pilha);

    // Teste de inserção
    char resp;
    printf("Deseja inserir um elemento na pilha (s/n)? \n");
    scanf(" %c",&resp);
    while (resp == 's') {
        printf("Informe o item : ");
        scanf("%d",&item.campo);

        int resultado = inserir(&pilha,item);
        if (resultado == 1){
            printf("Item inserido com sucesso. \n");
        } else {
            printf("Erro ao inserir o item. \n");
        }

        printf("Deseja inserir um elemento na pilha (s/n)? \n");
        scanf(" %c",&resp);
    }
    imprimir_pilha(&pilha);

    // Teste de remoção
    printf("Deseja remover um elemento na pilha (s/n)? \n");
    scanf(" %c",&resp);
    if(resp == 's') remover(&pilha);
    imprimir_pilha(&pilha);
    return 0;
}
