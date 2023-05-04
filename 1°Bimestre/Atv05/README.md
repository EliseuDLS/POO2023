# Notebook Atv05

1 - Declare uma variável do tipo real chamada gastosJaneiro e inicialize-a com o valor gasto no mês de janeiro, declare também as variáveis gastosFevereiro e gastosMarco, inicializando-as com os respectivos gastos, utilize uma linha para cada declaração;

2 - Crie uma variável chamada gastosTrimestre e inicialize-a com a soma das outras variáveis;

3 - Exiba a variável gastosTrimestre;

4 - Declare a variável mediaMensal e faça o cálculo para a média mensal de gastos;

5 - Exiba a mensagem "Valor da média mensal = " juntamente com o valor da média mensal.

```
// delcaração da variável gastosJaneiro
float gastosJaneiro = 6000.20f;
// delcaração da variável gastosFevereiro
float gastosFevereiro = 5303.77f;
// delcaração da variável gastosMarco
float gastosMarco = 8299.01f;

// calculo simples para definir a média mensal
float mediaMensal = gastosJaneiro + gastosFevereiro + gastosMarco / 3;

// mensagem ao usuário + a variável mediaMensal
System.out.println("Valor da média mensal = " + mediaMensal);
```
