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
void inserir_no_fim(T_Lista *lista, T_Item item) {
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

// Remoção do fim
void remover_do_fim(T_Lista *lista) {
    T_No *atual = lista->primeiro;

    // Caso lista vazia: Exibe a mensagem de alerta e não efetua nenhum operação
    if (chkListaVazia(lista)) {
        printf("Lista vazia !! Nada a remover...\n");
        return;
    }

    // Caso Lista unitária: Lista com apenas um elemento
    if (lista->primeiro->proximo == NULL) {
        free(lista->primeiro);
        lista->primeiro = NULL;
        lista->ultimo = NULL;
        lista->qtdeAtual--;
        return;
    }

    // Caso geral: Percorre a lista toda verificando o proximo do proximo
    while (atual->proximo->proximo != NULL) {
        atual = atual->proximo;
    }

    free(atual->proximo);
    atual->proximo = NULL;
    lista->ultimo = atual;
    lista->qtdeAtual--;
}

void remover_do_inicio(T_Lista *lista) {

    // Caso lista vazia: Exibe a mensagem de alerta e não efetua nenhum operação
    if(chkListaVazia(lista)) {
        printf("\nLista vazia!! Nada a remover...\n");
        return;
    }

    // Caso Lista unitária: Lista com apenas um elemento
    if (lista->primeiro->proximo == NULL) {
        free(lista->primeiro);
        lista->primeiro = NULL;
        lista->ultimo = NULL;
        lista->qtdeAtual--;
        return;
    }

    // Caso geral:
    T_No *auxiliar = lista->primeiro;
    free(lista->primeiro);
    lista->primeiro = auxiliar->proximo;
    lista->qtdeAtual--;
}

void remover_pelo_indice(T_Lista *lista, int indice) {
    // Verificando o indice
    if (indice < 0 || indice >= lista->qtdeAtual) {
        printf("\nIndice invalido!! Nada a remover...\n");
        return;
    }

    // Caso especial: removendo o primeiro elemento
    if (indice == 0) {
        remover_do_inicio(lista);
        return;
    }

    // Caso Geral: Percorre até o nó anterior
    T_No *anterior = lista->primeiro;
    for (int i = 0;i < indice-1;i++) anterior = anterior->proximo;

    T_No *removido = anterior->proximo;

    // Atualiza a referencia pulando o no a ser removido
    anterior->proximo = removido->proximo;

    if(removido == lista->ultimo) lista->ultimo = anterior;

    free(removido);

    lista->qtdeAtual--;

}

void inserir_pelo_indice(T_Lista *lista,T_Item item, int indice) {
    // Verificação do indice
    if (indice < 0 || indice > lista->qtdeAtual + 1) {
        printf("Indice invalido!! Nada a inserir...\n");
        return;
    }

    // Caso especial: Inserção na primeiro posição
    if (indice == 0) {
        inserir_na_frente(lista,item);
        return;
    }

    T_No *noNovo = (T_No*)malloc(sizeof(T_No));
    if (noNovo == NULL) {
        fprintf(stderr, "Erro ao alocar memoria para o novo no.\n");
        exit(EXIT_FAILURE);
    }

    T_No *anterior = lista -> primeiro;
    noNovo -> item = item;

    for (int i=0;i< indice - 1;i++) anterior = anterior->proximo;

    noNovo->proximo = anterior->proximo;
    anterior->proximo = noNovo;

    lista->qtdeAtual++;
}

void imprimir_lista(T_Lista *lista) {
    if (chkListaVazia(lista)) {
        printf("\nA LISTA ESTA VAZIA!!!\n\n");
        return;
    }

    T_No *atual = lista->primeiro;

    printf("\nLista: ");

    while (atual != NULL) {
        printf("> %d ", atual->item.dado);
        atual = atual->proximo;
    }

    printf("\n\n");
}


