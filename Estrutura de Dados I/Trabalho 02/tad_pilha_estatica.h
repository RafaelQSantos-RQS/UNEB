#include <stdio.h>

int const max = 255;

struct T_Item
{
	char campo;
};

struct T_Pilha
{
	int base;
	int topo;
	int qtdeAtual;
	T_Item dados[max];
};


void iniciarPilha(T_Pilha *pilha)
{
	(*pilha).base = 0;
	(*pilha).topo = 0;
	(*pilha).qtdeAtual = 0;
}

int chkPilhaVazia(T_Pilha *pilha)
{
	return (*pilha).topo == 0;
}


int inserir(T_Pilha *pilha, T_Item item)
{
	int flag = 0;

	if ((*pilha).qtdeAtual < max)
	{
		(*pilha).dados[(*pilha).topo] = item;
		(*pilha).topo++;
		(*pilha).qtdeAtual++;
		flag = 1;
	}

	return flag;
}

int remover(T_Pilha *pilha)
{
	int flag;

	if (chkPilhaVazia(pilha) )
		flag = 0;
	else
	{
		(*pilha).topo--;
		(*pilha).qtdeAtual--;

		flag = 1;
	}

	return flag;
}

void imprimir(T_Pilha *pilha)
{
    for(int i=(*pilha).base;i<(*pilha).qtdeAtual;i++) {
        printf("%c",(*pilha).dados[i]);
    }
    printf("\n");
}

