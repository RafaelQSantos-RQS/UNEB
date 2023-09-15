#include <stdio.h>

int const max = 5;

struct T_Item
{
    int campo;
};

struct T_pilha
{
    int base;
    int topo;
    int tamanho;
    T_Item dados [max];
};

void iniciarPilha(T_pilha *pilha)
{
    (*pilha).base = 0;
    (*pilha).topo = 0;
    (*pilha).tamanho = 0;
}

int chkPilhaVazia(T_pilha *pilha)
{
    return (*pilha).topo == 0;
}

int inserir(T_pilha *pilha, T_Item item)
{
    int flag = 0;
    if ((*pilha).tamanho < max)
    {
        (*pilha).dados[(*pilha).topo] = item;
        (*pilha).topo++;
        (*pilha).tamanho++;
        flag = 1;
    }
    return flag;
}

int remover(T_pilha *pilha) {
    int flag = 0;
    if ((*pilha).tamanho > 0) {
        (*pilha).topo--;
        (*pilha).tamanho--;
        flag = 1;
    }
    return flag;
}

void imprimir_pilha(T_pilha *pilha) {
    for (int i = (*pilha).tamanho - 1; i >= 0 ; i--) {
        printf("Item[%d] = %d\n",i,(*pilha).dados[i].campo);
    }
}
