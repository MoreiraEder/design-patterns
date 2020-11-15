# Strategy/Policy
## Padrão Comportamental

### Intenção
A ideia principal do *Strategy* é delegar responsabilidades, fazendo com que o código fique mais coeso.

### Motivação
Imagine que você tenha um código que precise executar algorimos diferentes para atividades semelhantes, como por exemplo, calcular o valor da mensalidade de alunos de uma faculdade, sendo que há alunos que sejam bolsistas, gradistas, ou de transferência, e para cada caso um algoritmo diferente tem de ser executado. Nesse caso ao invés de implementar todo o cálculo do valor da mensalidade para todos os casos em apenas uma classe, o cálculo será delegado para classes especializadas conforme cada caso.

### Aplicabilidade
- Quando a classe tem um operador condicional muito grande que troca entre diferentes variantes do mesmo algoritmo.
- Para isolar a lógica do negócio de uma classe dos detalhes de implementação de algoritmos que podem não ser tão importantes no contexto da lógica.
- Quando você tem muitas classes parecidas que somente diferem na forma que elas executam algum comportamento.
- Quando você quer usar diferentes variantes de um algoritmo dentro de um objeto e ser capaz de trocar de um algoritmo para outro durante a execução.

### Estrutura
![Diagrama estrutural do padrão](./diagrama-padrao.jpg)
- *Diagrama estrutural do padrão*


### Participantes
- Classe abstrata: Contendo todos as etapas genéricas para execução do algoritmo
- Classes concretas: Que fazem uso do código genérico da classe abstrata, podendo altera-los e especializa-los conforme a necessidade

[Código de exemplo](./exemplo)
