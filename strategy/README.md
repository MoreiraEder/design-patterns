# Strategy/Policy
## Padrão Comportamental

### Intenção
O.

### Motivação
A implementação do algoritmo de uma cafeteira grande que prepare café e chá. Várias tarefas são comuns entre preparar ambas as bebidas, mas há algumas particularidades. Dessa forma, poderia haver uma super classe que contenha a implementação de todos os métodos genéricos e os métodos especializados ficariam nas classes filhas.

### Aplicabilidade
Pode ser usado quando o algoritmo pode ser dividido em etapas de forma hierárquica.

### Estrutura
![Diagrama estrutural do padrão](./diagrama-padrao.jpg)
- *Diagrama estrutural do padrão*


### Participantes
- Classe abstrata: Contendo todos as etapas genéricas para execução do algoritmo
- Classes concretas: Que fazem uso do código genérico da classe abstrata, podendo altera-los e especializa-los conforme a necessidade

[Código de exemplo](./exemplo)
