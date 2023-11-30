#include <stdio.h>
#include <stdlib.h>
#include "DynamicListLib.h"

int main() {
    T_Lista lista;
    T_Item item;

    iniciar_lista(&lista);
    item.dado = 10;
    append(&lista,item);
    item.dado = 20;
    append(&lista,item);
    item.dado = 30;
    append(&lista,item);
    item.dado = 40;
    inserir_na_frente(&lista,item);
    imprimir_lista(&lista);

    return 0;
}
