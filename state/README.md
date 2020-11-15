# State
## Padrão comportamental

### Intenção
Com esse padrão, criamos uma máquina de estados, onde dependendo do estado em que se encontra nosso lindo objeto, ele terá comportamentos diferentes.


![Analogia do funcionamento do padrão](./analogia-padrao.jpg)
- *Analogia do funcionamento do padrão. Fonte: <https://refactoring.guru/pt-br/design-patterns/state>*

### Motivação
Imagine que tenhamos em um sistema de entregas um objeto que representasse um pacote para um destinatário qualquer. Esse pacote no sistema tem três estados: **preparação**, **em trânsito** e **enviado**. Há estados em que, uma vez que o objeto entra nele, não pode mais sair, como é o caso do status *enviado*. E dependendo das ocorrências o pacote pode ter seu estado alterado de *preparação* para *em trânsito*, nesse nosso exemplo hipotético. Porém, como somos super organizados, não queremos que toda a lógica de funcionamento e alternância entre os estados aconteça na mesma classe do objeto *pacote*, então criamos outras classes para delegar esta atividade a elas, deixando o código mais limpo e organizado.

### Aplicabilidade
- Quando é necessário gerenciar comportamentos diferentes dependendo do estado do objeto
- Quando você tem muito código duplicado em muitos estados parecidos e transições de uma máquina de estado baseada em condições

### Estrutura
![Diagrama estrutural do padrão](./diagrama-padrao.jpg)
- *Diagrama estrutural do padrão*


### Participantes
- Context: Este é o intermediador entre a lógica dos estados e o cliente. Aqui o *Context* armazena um objeto do tipo *State*, o qual representa o estado atual do objeto
- State: Esta é a interface responsável por definir a encapsulação dos estados possíveis
- ConcreteStates: São as implementações concretas dos estados
- Client: O fulano que usará o nosso lindo objeto com estado bem estruturado

### Exemplo
[Aqui nesse exemplo](./exemplo) temos um objeto "ar-condicionado" implementado com o padrão *State*. Porém ele é um aparelho meio diferente dos outros, e só possúi três modos possíveis e de destaca dos aparelhos convencionais. Ele possui os estados **ventilar**, **esfriar** e **esquentar**. Não há como definir qualquer estado intermediário entre eles.
