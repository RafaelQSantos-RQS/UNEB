#include <stdio.h>

int const max = 5;

struct T_Item
{
    int campo;
};

struct T_fila
{
    int inicio;
    int fim;
    int tamanho;
    T_Item dados [max];
};

void iniciarFila(T_fila *fila)
{
    (*fila).inicio = 0;
    (*fila).fim = 0;
    (*fila).tamanho = 0;
}

int chkFilaVazia(T_fila *fila)
{
    return (*fila).fim == 0;
}

int inserir(T_fila *fila, T_Item item)
{
    int flag = 0;
    if ((*fila).tamanho < max)
    {
        (*fila).dados[(*fila).fim] = item;
        (*fila).fim++;
        (*fila).tamanho++;
        flag = 1;
    }
    return flag;
}

int remover(T_fila *fila) {
    int flag = 0;
    if ((*fila).tamanho > 0) {
        (*fila).inicio++;
        (*fila).tamanho--;
        flag = 1;
    }
    return flag;
}

void imprimir_fila(T_fila *fila) {
    for (int i = (*fila).inicio; i <= (*fila).fim - 1; i++) {
        printf(" %d",(*fila).dados[i].campo);
    }
}
