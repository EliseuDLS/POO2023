# Notebook Atv03
Usando a classe JOptionPane para entrada de dados, crie uma classe que receba a nota de duas provas e de um trabalho. Calcule e mostre a média.

```
// importação do pacote JOptionPane
import javax.swing.JOptionPane;

// declaraçao da variável mensagem
String mensagem;
// declaraçao da variável primeiraProva
float primeiraProva = 0;
// declaraçao da variável segundaProva
float segundaProva = 0;
// declaraçao da variável trabalho
float trabalho = 0;

// entrada dos dados com a classe JOptionPane
mensagem = JOptionPane.showInputDialog("Aluno, digite a sua nota da primeira prova: ");
// conversão da String mensagem para Float
primeiraProva = Float.parseFloat(mensagem); 

// entrada dos dados com a classe JOptionPane
mensagem = JOptionPane.showInputDialog("Agora, digite a sua nota da segunda prova: ");
// conversão da String mensagem para Float
segundaProva = Float.parseFloat(mensagem);

// entrada dos dados com a classe JOptionPane
mensagem = JOptionPane.showInputDialog("Por fim, digite a sua nota do seu trabalho: ");
// conversão da String mensagem para Float
trabalho = Float.parseFloat(mensagem);

// declaração da variável media e cálculo
float media = (primeiraProva + segundaProva + trabalho) / 3;

// imprimindo a média usando o showMessageDialog da classe JOptionPane
JOptionPane.showMessageDialog(null, "Sua média é = " + media);
```
