#include <stdio.h>

int const TAM_MAX = 5;

struct T_Item
{
    int dado;
};

struct T_Lista_Est
{
    int first;
    int last;
    int quantity;
    int data[TAM_MAX];
};

void InitList(T_Lista_Est *lista) {
    // Definimos os ponteiros first e last para indicar que a lista está vazia
    lista -> first = 0;
    lista -> last = 0;

    // Definimos a quantidade de itens dentro da lista como 0
    lista -> quantity = 0
}

int ChkEmptyList(T_Lista_Est *lista) {
    return lista->quantity == 0;
}

int append(T_Lista_Est *lista, T_Item item) {
    int flag = 0;
    if (lista->quantity < TAM_MAX){
        lista->data[lista->last] = item;
        lista->last++;
        lista->quantity++;
        flag = 1;
    }
    return flag;
}
