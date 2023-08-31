#include <stdio.h>
#include "lista.h"

int main()
{
    T_lista lista;
    T_Item item;
//    iniciarLista(&lista);
    
    item.campo = 10;
    lista.dados[0] = item;

    item.campo = 20;
    lista.dados[1] = item;

    return 0;
}
