#
# Factory Method
## Padrão Criacional

### Intenção
A principal intenção desse padrão é definir uma interface para criação de objetos, tudo especificado na superclasse, porém, ele permite que as subclasses alterem o tipo de objeto que será criado.

### Motivação
Uma das melhores motivações ao usar esse projeto é definir um ponto único onde será criado um objeto que possui uma hierarquia que precisa ser criada, ou quando ele possui dependência com a instâncias de vários objetos.
Um caso em que poderia ser citado o uso desse padrão é em algum sistema de pizzaria que fizesse pizzas deliciosas com bastante queijo. Há diversos tipos de pizza, mas poderia haver uma superclasse (ou hierarquia de classes) que cuidasse de tudo o que é comum em todas as pizzas, como a massa e as bordas, por exemplo. Então, as subclasses que herdassem de pizza poderiam adquirir todos os atributos da superclasse e adicionar seus próprios ingredientes à ela, como queijo, frango, presunto, azeitonas, queijo e mais queijo!

### Aplicabilidade
- Quando um objeto possui dependência com vários outros em sua criação
- Criar um único ponto com a resposabilidade de criação do objeto, reduzindo assim o acoplamento

### Estrutura
![Diagrama do padrão](./diagrama-padrao.jpg)
- *Diagrama do padrão*

### Participantes
- Product: declara a interface que é comum em todos os tipos de objeto relacionados
- AbstractFactory: essa é a interface que representa uma fábrica concreta
- ConcreteFactory1, - ConcreteFactory2: são as fábricas responsáveis por criar diferentes famílias de produtos
- AbstractProductA, - AbstractProductB: são as interfaces que representam os produtos
- ProductA1, ProductA2, ProductB1, ProductB2: são os produtos finais, que derivam de famílias diferentes

### Exemplo
[Neste link](./exemplo) segue um ex.
