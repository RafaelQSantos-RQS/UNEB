#include <stdio.h>
#include <stdlib.h>
#include "DynamicListLib.h"

int menu();

int main() {
    T_Lista lista;
    T_Item item;
    iniciar_lista(&lista);

    int resposta_menu = menu();
    while(resposta_menu != 8) {
    switch(resposta_menu){
        case 1:{
            printf("INSIRA O DADO:\n");
            scanf("%d",&item.dado);
            inserir_na_frente(&lista,item);
            break;
        }
        case 2:{
            printf("INSIRA O DADO:\n");
            scanf("%d",&item.dado);
            inserir_no_fim(&lista,item);
            break;
        }
        case 3: {
            int indice = 0;
            printf("INSIRA O INDICE:\n");
            scanf("%d",&indice);
            printf("INSIRA O DADO:\n");
            scanf("%d",&item.dado);
            inserir_pelo_indice(&lista,item,indice);
            break;
        }
        case 4:{
            printf("REMOVENDO...\n");
            remover_do_inicio(&lista);
            printf("REMOVIDO...\n");
            system("pause");
            break;
        }
        case 5: {
            printf("REMOVENDO...\n");
            remover_do_fim(&lista);
            printf("REMOVIDO...\n");
            system("pause");
            break;
        }
        case 6: {
            int indice = 0;
            printf("INSIRA O INDICE:\n");
            scanf("%d",&indice);
            printf("REMOVENDO...\n");
            remover_pelo_indice(&lista,indice);
            printf("REMOVIDO...\n");
            system("pause");
            break;
        }
        case 7:{
            imprimir_lista(&lista);
            system("pause");
            break;
        }
        }
        resposta_menu = menu();
    }
    return 0;
}

int menu() {
    int op;
    while(1){
    system("cls");
    printf("\tSELECIONE O QUE DESEJA FAZER:\n");
    printf("1 - INSERIR NO INICIO\n");
    printf("2 - INSERIR NO FIM\n");
    printf("3 - INSERIR PELO INDICE\n");
    printf("4 - REMOVER NO INICIO\n");
    printf("5 - REMOVER NO FIM\n");
    printf("6 - REMOVER PELO INDICE\n");
    printf("7 - IMPRIMIR LISTA\n");
    printf("8 - FECHAR O PROGRAMA\n");
    scanf("%d",&op);
    if(op>0 && op<=8) {
        system("cls");
        return op;
    }
    printf("OPCAO INVALIDA!!! SELCIONE UMA ACEITAVEL\n");
    system("pause");
    system("cls");
    }
}
