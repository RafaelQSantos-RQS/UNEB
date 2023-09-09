#include <stdio.h>
#include "lista.h"

int main()
{
    T_lista lista;
    T_Item item;
    iniciarLista(&lista);

    item.campo = 10;
    inserir(&lista,item);

    item.campo = 20;
    inserir(&lista,item);

    printf("Teste do inserir\n");
    imprimir_lista(&lista);

    printf("Teste do remover\n");
    remover(&lista);
    imprimir_lista(&lista);
    return 0;
}
