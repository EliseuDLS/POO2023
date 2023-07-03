# Notebook Atv08
### Aluno: Eliseu da Luz 3°INF

Uma pequena companhia aérea acabou de comprar um computador para seu novo sistema automatizado de reservas. Você foi solicitado a desenvolver o novo sistema. Você escreverá um aplicativo para atribuir assentos em cada voo da companhia aérea (capacidade: 10 assentos).
O sistema deve exibir as seguintes alternativas: 

- Por favor digite 1 para Primeira Classe e digite 2 para Classe Econômica .  Se o usuário digitar 1, o sistema deve atribuir assentos na primeira classe (poltronas 1 a 5). Se o usuário digitar 2, o sistema deve atribuir um assento na classe econômica (poltronas 6 a 10). 

- O sistema deve ainda exibir um cartão de embarque indicando o número da poltrona da pessoa e se ela está na primeira classe ou na classe econômica.

- Utilize um array unidimensional do tipo primitivo boolean para representar o gráfico de assentos do avião. 

- Inicialize todos os elementos do array como false para indicar que todas as poltronas estão desocupadas. 

- À medida que cada assento é atribuído, configure o elemento correspondente do array como true para indicar que o assento não está mais disponível.

- O sistema nunca deve atribuir uma poltrona que já foi reservada. 

- Quando a classe econômica estiver lotada, o sistema deve perguntar à pessoa se ela aceita ficar na primeira classe (e vice-versa). Se sim, faça a atribuição apropriada de assento. Se não, exiba a mensagem "O próximo voo parte em 3 horas".
