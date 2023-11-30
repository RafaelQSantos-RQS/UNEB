#include <stdio.h>
#include <stdlib.h>

struct T_Item {
    int dado;
};

struct T_No {
    T_Item item;
    T_No *proximo;
};

struct T_Lista {
    T_No *primeiro;
    T_No *ultimo;
    int qtdeAtual;
};

void iniciar_lista(T_Lista *lista) {
    T_No *cabeca = (T_No*)malloc(sizeof(T_No));
    cabeca->proximo = NULL;
    lista->primeiro = cabeca;
    lista->ultimo = cabeca;
    lista->qtdeAtual = 0;
}

int chkListaVazia(T_Lista *lista) {
    return lista->qtdeAtual == 0;
}

// Inserção no fundo
void append(T_Lista *lista, T_Item item) {
    T_No *novoNo = (T_No*)malloc(sizeof(T_No));
    novoNo->item = item;
    novoNo->proximo = NULL;
    if (chkListaVazia(lista)) {
        lista->primeiro = novoNo;
        lista->ultimo = novoNo;
    } else {
        lista->ultimo->proximo = novoNo;
        lista->ultimo = novoNo;
    }

    lista->qtdeAtual++;
}

// Inserção na frente
void inserir_na_frente(T_Lista *lista, T_Item item) {
    T_No *novoNo = (T_No*)malloc(sizeof(T_No));
    novoNo->item = item;
    novoNo->proximo = NULL;
    if (chkListaVazia(lista)) {
        lista->primeiro = novoNo;
        lista->ultimo = novoNo;
    }else{
        novoNo->proximo = lista->primeiro;
        lista->primeiro = novoNo;
    }

    lista->qtdeAtual++;
}

void imprimir_lista(T_Lista *lista) {
    T_No *atual = lista->primeiro;

    printf("Lista: ");

    while (atual != NULL) {
        printf("> %d ", atual->item.dado);
        atual = atual->proximo;
    }

    printf("\n");
}

