/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * A classe <b>Animal</b> define um tipo de dado abstrato para a criação da
 * estrutura de classes de animais
 *
 * @since Junho 2019
 * @version 1.4
 * @author david
 */
public abstract class Animal {

    /**
     * o atrubuto nome é usado para referenciar o nome
     */
    private String nome;

    /**
     *
     * construtor da classe <b>Animal</b>.<br>
     * <b>Uso:</b><br>
     * a classe <b>Animal</b> é uma classe abstrata<br>
     * <b>Onde:</b><br>
     * @param n String que identifica o nome do animal<br>
     */
    public Animal(String n) {
        this.setNome(n);

    }
/**
 * O método <b>Imprime</b> tem a função de imprimir o nome na tela de execução<br>
 * <b>Uso:</b><br>
 * <i>Somente nas classes que seguem a linha de herança da classe</i> <b>Animal</b><br><br>
 * A1.imprime();<br><br>
 * <b>Onde:</b><br>
 * o método não recebe nehum parametro<br>
 */
    public void imprime() {
        System.out.println("nome: " + this.getNome());

    }
/**
 * O método <b>talk</b> terá a função de descrever o som dos Animais nas classes concretas<br>
 * <b>Uso:</b><br>
 * <i>Somente nas classes que seguem a linha de herança da classe</i> <b>Animal</b><br><br>
 * metodo Abstrata<br><br>
 * <b>Onde:</b><br>
 * o método não recebe nehum parametro<br>
 */
    public abstract void talk();
/**
 * O método <b>getNome</b> tem a função de devolver o conteudo do atributo nome<br>
 * <b>Uso:</b><br>
 * <i>Somente nas classes que seguem a linha de herança da classe</i> <b>Animal</b><br><br>
 * A1.getNome();<br><br>
 * <b>Onde:</b><br>
 * o método não recebe nehum parametro<br>
 * @return retorna o conteudo do atributo nome
 */
    public String getNome() {
        return nome;
    }
/**
 * O método <b>setNome</b> tem a função de receber o conteudo do atributo nome<br>
 * <b>Uso:</b><br>
 * <i>Somente nas classes que seguem a linha de herança da classe</i> <b>Animal</b><br><br>
 * A1.setNome("Joao andate");<br><br>
 * <b>Onde:</b><br>
 * @param n recebe a String com o conteudo do nome do Animal<br><br>
 */
    public void setNome(String n) {
        this.nome = n;
    }
}
