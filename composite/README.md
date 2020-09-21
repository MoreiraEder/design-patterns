# Composite Pattern
## Padrões estruturais

Este padrão é usado para estruturar uma árvore com objetos semelhantes, de forma que a árvore fique uniforme e homogênea. O cliente que usará dos atributos de uma estrutura Composite consegue ter acesso a todos os objetos da árvore através de um único objeto.



Aplicabilidade
O padrão composite é aplicavel a todos os casos em que seja necessário usar uma estrutura de árvore/hierarquia com funcionalidades genéricas por toda a estrutura, como registros gerais, estruturas de arquivos, etc.

Estrutura

Participantes
Component: Esta será a "classe molde" para todos os objetos da árvore. Essa classe pode tanto ser uma interface como uma classe abstrata
Composite: São todos os objetos da árvore, exceto as folhas e o nó raíz
Leaf: São os objetos da árvore que não têm filhos
Cliente: As classes que usarão os recursos da estrutura

Código de exemplo
