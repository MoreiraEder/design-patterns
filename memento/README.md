#
# Memento
## Padrão Comportamental

### Intenção
Este padrão permite que você salve o estado de um objeto sem violar seu encapsulamento e sem conhecer sua implementação.

### Motivação
Imagine que em uma aplicação qualquer, você precise implementar um histórico para desfazer ações (Crtl Z), como um editor de texto ou imagens. Acaba que sendo um recurso muito útil, que a maioria dos usuários desejam que todas as aplicações tenham.

### Aplicabilidade
- Quando um objeto precise de pontos de restauração para um estado anterior; ou
- Para fazer tratativas para que o objeto se recupere de erros

### Estrutura
![Diagrama do padrão](./diagrama-padrao.jpg)
- *Diagrama do padrão*

### Participantes
- Originator: é a classe alvo que se dejesa salvar e restaurar o estado. Ela mesma cria os *"snapshots"* de seu estado
- Memento: este é o objeto retrato do estado da classe *Originator*
- Caretaker: este é o responsável por manter o histórico dos mementos para futura restauração. Ele mantém salvo os estados da classe *Originator*

### Exemplo
[Neste link](./exemplo) segue um exemplo de um editor de texto que salva seu estado atual para uma possível restauração.
