package principal {

import atividade.Carro;
import atividade.Livro;
import atividade.Pessoa;
import atividade.Camisa;


public static void main(String[] args){

Carro c1 = new Carro();
Carro c2 carro= new Carro();

c1.modelo = "gol";
c1.cor = "azul";
c1.ano = 2019;
c1.marca = "volkswagen";
c1.preco = 32568.99;


c2.modelo = "S10";
c2.cor = "amarelo";
c2.ano = 2019;
c2.marca = "chevrolet";
c2.preco = 53742.80;

System.out.println(c1.modelo+"\n"+c1.cor+"\n"+c1.ano+"\n"+c1.marca+"\n"+c1.preco+"\n");
System.out.println(c1.modelo+"\n"+c1.cor+"\n"+c1.ano+"\n"+c1.marca+"\n"+c1.preco+"\n");   



Livro l1 = new Livro();
Livro l2 = new Livro();

l1.titulo = "A culpa é das estrelas";
l1.autor = "John Green";
l1.editora = "ASA";
l1.genero = "Romance";
l1.ano = 2012;

l2.titulo = "Para todos os garotos que já amei";
l2.autor = "Jenny Han";
l2.editora = "INTRISECA";
l2.genero = "Conto";
l2.ano = 2015;

System.out.println(l1.titulo+"\n"+l1.autor+"\n"+l1.editora+"\n"+l1.genero+"\n"+l1.ano+"\n");
System.out.println(l2.titulo+"\n"+l2.autor+"\n"+l2.editora+"\n"+l2.genero+"\n"+l2.ano+"\n");



Pessoa p1 = new Pessoa()
Pessoa p2 = new Pessoa(System.in)

p1.nome = "Julia";
p1.altura = 1.60;
p1.idade = 20;
p1.cpf = "111111111-11";
p1.peso = 56.2;


p2.nome = "Artur"
p2.altura = 1.77;
p2.idade = 19;
p2.cpf = "222222222-22";
p2.peso = 68.6;

System.out.println(p1.nome+"\n"+p1.altura+"\n"+p1.idade+"\n"+p1.cpf+"\n"+p1.peso+"\n");
System.out.println(p2.nome+"\n"+p2.altura+"\n"+p2.idade+"\n"+p2.cpf+"\n"+p2.peso+"\n");



Camisa ca1 = new Camisa();
Camisa ca2 = new Camisa();

ca1.tamanho = "PP";
ca1.modelo = "Baby look";
ca1.cor = "roxo";
ca1.marca = "NerdUniverse";
ca1.referencia = "3029-99";

ca2.tamanho = "G";
ca2.modelo = "pólo";
ca2.cor = "azul";
ca2.marca = "Calvin Klein";
ca2.referencia = "4321-65";

System.out.println(ca1.tamanho+"\n"+ca1.modelo+"\n"+ca1.cor+"\n"+ca1.marca+"\n"+ca1.referencia+"\n");
System.out.println(ca2.tamanho+"\n"+ca2.modelo+"\n"+ca2.cor+"\n"+ca2.marca+"\n"+ca2.referencia+"\n");


}
}
