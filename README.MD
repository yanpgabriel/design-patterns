
# Design Patterns

## Objetivo do Repositório
Este repositório tem como objetivo armazenar exemplos de implementações de Padrões de Projeto em Java.

## Créditos
Os exemplos de implementações de Padrões de Projeto em Java foram retirados do site [Refactoring Guru](https://refactoring.guru/pt-br/design-patterns).
Com exceção do Padrão de Projeto **Bidge**, que foi retirado do site [Wikipedia](https://en.wikipedia.org/wiki/Bridge_pattern).

### Tipos de Padrões de Projeto
 - **Creational patterns:** Padrões de criação fornecem mecanismos de criação de objetos que aumentam a flexibilidade e a reutilização do código existente.
    - **Factory Method:** Define uma interface para criar um objeto, mas permite que as subclasses alterem o tipo de objetos que serão criados.
    - **Abstract Factory:** Fornece uma interface para criar famílias de objetos relacionados ou dependentes sem especificar suas classes concretas.
    - **Builder:** Separa a construção de um objeto complexo de sua representação, permitindo a criação de diferentes representações do mesmo objeto.
    - **Prototype:** Especifica os tipos de objetos a serem criados usando uma instância prototípica e cria novos objetos copiando esse protótipo.
    - **Singleton:** Garante que uma classe tenha apenas uma instância e fornece um ponto de acesso global a ela.
 - **Structural patterns:** Padrões estruturais explicam como montar objetos e classes em estruturas maiores, mantendo essas estruturas flexíveis e eficientes.
    - **Adapter:** Permite que objetos com interfaces incompatíveis trabalhem juntos.
    - **Bridge:** Divide uma classe abstrata de sua implementação para que as duas possam variar independentemente.
    - **Composite:** Permite que os clientes tratem objetos individuais e composições de objetos de maneira uniforme.
    - **Decorator:** Adiciona responsabilidades a objetos dinamicamente.
    - **Facade:** Fornece uma interface unificada para um conjunto de interfaces em um subsistema.
    - **Flyweight:** Permite que um objeto represente um grupo de objetos semelhantes, minimizando o uso de memória.
    - **Proxy:** Fornece um substituto ou marcador de posição para outro objeto para controlar o acesso a ele.
 - **Behavioral patterns:** Os padrões comportamentais cuidam da comunicação eficaz e da atribuição de responsabilidades entre objetos.
    - **Chain of Responsibility:** Permite que vários objetos manipulem uma solicitação sem o remetente saber qual objeto a está manipulando.
    - **Command:** Encapsula uma solicitação como um objeto, permitindo que você parametrize clientes com diferentes solicitações, filas ou registre solicitações e suporte operações de cancelamento.
    - **Iterator:** Fornece uma maneira de acessar os elementos de um objeto agregado sequencialmente sem expor sua representação subjacente.
    - **Mediator:** Define um objeto que encapsula como os objetos interagem e permite que você os desacople.
    - **Memento:** Captura e restaura o estado interno de um objeto sem violar a encapsulação.
    - **Observer:** Define uma dependência um-para-muitos entre objetos para que, quando um objeto muda de estado, todos os seus dependentes sejam notificados e atualizados automaticamente.
    - **State:** Permite que um objeto altere seu comportamento quando seu estado interno muda.
    - **Strategy:** Define uma família de algoritmos, encapsula cada um deles e os torna intercambiáveis.
    - **Template Method:** Define o esqueleto de um algoritmo em uma operação, adiando alguns passos para subclasses.
    - **Visitor:** Define uma nova operação a um conjunto de classes sem alterar as classes.