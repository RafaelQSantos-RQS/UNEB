#include <stdio.h>
#include "Fila.h"

int main() {
    T_Item item;
    T_fila fila;

    iniciarFila(&fila);

// Teste de inserção
    char resp;
    printf("Deseja inserir um elemento na fila (s/n)? \n");
    scanf(" %c",&resp);
    while (resp == 's') {
        printf("Informe o item : ");
        scanf("%d",&item.campo);

        int resultado = inserir(&fila,item);
        if (resultado == 1){
            printf("Item inserido com sucesso. \n");
        } else {
            printf("Erro ao inserir o item. \n");
        }

        printf("Deseja inserir um elemento na fila (s/n)? \n");
        scanf(" %c",&resp);
    }

    // Teste de impressão
    printf("Fila = ");
    imprimir_fila(&fila);

    // Teste de remoção
    printf("\nTeste de remocao\n");
    remover(&fila);
    printf("Fila = ");
    imprimir_fila(&fila);

    return 0;
}
