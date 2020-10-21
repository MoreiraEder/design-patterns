#
# Observer
## Padrão Estrutural

### Intenção
Este padrão define uma forma de comunicação que permite que objetos sejam notificados caso haja alguma mudança de estado relevante.

### Motivação
O motivo principal da existência desse padrão é pela dificuldade de se integrar sistemas geralmente legados ou bibliotecas a um outro sistema. Nesses casos onde fica inviável modificar os sistemas para que eles conversem - seja pela complexidade, ou por ser inpossível obter o código fonte - é criado um adaptador que funciona como intermediário fazendo a conversão da comunicação entre eles.

### Aplicabilidade
Em qualquer caso em que a mudaça de estado de um objeto requer que algo seja feito em outros objetos e, nós não sabemos quem são estes objetos.

### Estrutura
![Diagrama do padrão](./diagrama-padrao.jpg)
- *Diagrama do padrão*

### Participantes
- Subject: Esta é o objeto que tem um estado que precisa ser observado
- Observer: A interface que define os métodos de notificação de interesse dos observadores
- Observer_3, Observer_3, Observer_3, etc.: São as classes concretas que observam o estado da classe *Subject*

### Exemplo
[Aqui](./exemplo) segue o código de um incrível sistema de radar que dispõe as informações apenas em milhas e o software do fiscal que faz o monitoramento opera apenas em kilômentos por hora. Porém como não queremos alterar nenhum dos dois sistemas, criaremos um adaptador que fará a devida conversão e interligação entre eles.
