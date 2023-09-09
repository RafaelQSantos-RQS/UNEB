#include <stdio.h>

int const max = 5;

struct T_Item
{
    int campo;
};

struct T_lista
{
    int primeiro;
    int ultimo;
    int qtdeAtual;
    T_Item dados [max];
};

void iniciarLista(T_lista *lista)
{
    (*lista).primeiro = 0;
    (*lista).ultimo = 0;
    (*lista).qtdeAtual = 0;
}

int chkListaVazia(T_lista *lista)
{
    return (*lista).ultimo == 0;
}

int inserir(T_lista *lista, T_Item item)
{
    int flag = 0;
    if ((*lista).qtdeAtual < max)
    {
        (*lista).dados[(*lista).ultimo] = item;
        (*lista).ultimo++;
        (*lista).qtdeAtual++;
        flag = 1;
    }
    return flag;
}

int remover(T_lista *lista) {
    int flag = 0;
    if ((*lista).qtdeAtual > 0) {
        (*lista).ultimo--;
        (*lista).qtdeAtual--;
        flag = 1;
    }
    return flag;
}

void imprimir_lista(T_lista *lista) {
    for (int i = 0; i < (*lista).qtdeAtual; i++) {
        printf("Item[%d] = %d\n",i,(*lista).dados[i].campo);
    }
}
