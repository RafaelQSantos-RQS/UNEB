#include <stdio.h>

int const TAM_MAX = 5;

struct T_Item
{
    int dado;
};

struct T_Fila_Est
{
    int first;
    int last;
    int quantity;
    T_Item data[TAM_MAX];
};

void InitRow(T_Fila_Est *fila) {
    // Definimos os ponteiros first e last para indicar que a fila está vazia
    fila -> first = 0;
    fila -> last = 0;

    // Definimos a quantidade de itens dentro da fila como 0
    fila -> quantity = 0;
}

int ChkEmptyRow(T_Fila_Est *fila) {
    return fila->quantity == 0;
}

int append(T_Fila_Est *fila, T_Item item) {
    int flag = 0;

    if (fila->quantity < TAM_MAX){
        fila->data[fila->last] = item;
        fila->last = (fila->last + 1) % TAM_MAX;
        fila->quantity++;
        flag = 1;
    }

    return flag;
}

int Remove(T_Fila_Est *fila) {
    if(fila->quantity > 0) {
        fila->first = (fila->first + 1) % TAM_MAX; // MAX_SIZE é o tamanho máximo da fila
        fila->quantity--;
        return 1;
    }
    return 0;
}

void printRow(T_Fila_Est *fila) {
    int i = fila->first;
    int count=0;

    printf("Fila: ");
    while(count < fila->quantity) {
        printf("%d ", fila->data[i].dado);
        i = (i+1) % TAM_MAX;
        count++;
    }
    printf("\n");
}
