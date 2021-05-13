# jantar-do-5-filosofos

DEFINIÇÃO DO PROBLEMA DO JANTAR DOS FILÓSOFOS

Cinco filósofos estão sentados em uma mesa redonda para jantar. Cada filósofo tem um prato com espaguete à sua frente. Cada prato possui um garfo para pegar o espaguete. O espaguete está muito escorregadio e, para que um filósofo consiga comer, será necessário utilizar dois garfos. 

Lembre-se que é apenas uma analogia. Nesse sentido, cada filósofo alterna entre duas tarefas: comer ou pensar. Quando um filósofo fica com fome, ele tenta pegar os garfos à sua esquerda e à sua direita; um de cada vez, independente da ordem. Caso ele consiga pegar dois garfos, ele come durante um determinado tempo e depois recoloca os garfos na mesa. Em seguida ele volta a pensar.

Por definição, o problema em questão é:

Você é capaz de propor um algoritmo que implemente cada filósofo de modo que ele execute as tarefas de comer e pensar sem nunca ficar travado?

![image](https://user-images.githubusercontent.com/60722028/118083391-3247d700-b395-11eb-9cd7-565dd596ff55.png)


Nas seções à seguir iremos ver 4 soluções para o problema do Jantar dos filósofos. De forma incremental iremos entender como solucioná-lo e porque esse problema não é tão simples quanto parece. Em cada uma das 3 primeiras abordagens entenderemos onde a solução não evita que o programa filósofo fique travado.

SOLUÇÃO JANTAR DOS FILÓSOFOS 1 - DEADLOCK/IMPASSE
A classe Philosopher implementa as duas tarefas executadas por qualquer filósofo descrito no contexto de nosso problema. Podemos imaginar então, de forma bem simples, que um programa para fazer essas tarefas deve apenas tentar pegar um garfo qualquer. Caso não consiga, fique aguardando. Em seguida faz o mesmo para o segundo garfo. Uma vez com os garfos nas mãos começa a comer. Ao final devolve um garfo e depois o outro. 

O grande problema nesse algoritmo é que existem momentos em que se todos os filósofos pegarem um garfo, todos irão ficar parados para sempre aguardando o segundo garfo ficar disponível; gerando assim um Deadlock ou Impasse! Ou seja, não é uma solução completa.
