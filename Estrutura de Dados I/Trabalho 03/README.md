# Trabalho 03
Desenvolver uma bibliota de listra dinâmica simplesmente encadeada.
## Ferramentas
- ![Visual Studio Code](https://img.shields.io/badge/Visual%20Studio%20Code-0078d7.svg?style=for-the-badge&logo=visual-studio-code&logoColor=white)
- ![C](https://img.shields.io/badge/c-%2300599C.svg?style=for-the-badge&logo=c&logoColor=white)
- ![Ubuntu](https://img.shields.io/badge/Ubuntu-E95420?style=for-the-badge&logo=ubuntu&logoColor=white)
## Descrição dos arquivos
* O arquivo main.cpp é onde se pode testar as funções uma a uma, separadamente.
* O arquivo DynamicListLib.h é a biblioteca que abriga a lógica por trás da lista simplesmente encadeada, contendo as seguintes funções:
  * **iniciar_lista:** Função para inicializar a lista.
  * **chkListaVazia:** Função que verifica se a lista passada está vazia.
  * **inserir_no_fim:** Função que insere o item no final da lista.
  * **inserir_na_frente:** Função que insere o item passado no inicio da lista.
  * **remover_do_fim:** Função que remove o último elemento da lista.
  * **remover_do_inicio:** Função que remover o primeiro elemento da lista.
  * **remover_pelo_indice:** Função que remove o elemento do indicado no indice passado.
  * **inserir_pelo_indice:** Função que insere o elemento no indice passado.
  * **imprimir_lista:** Função que imprime a lista encadeada passada.
* O arquivo trab01.cpp é o arquivo no qual aplica-se o trabalho 01 usando a biblioteca de lista encadeada.