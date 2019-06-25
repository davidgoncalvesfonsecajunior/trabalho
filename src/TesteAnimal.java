/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public class TesteAnimal {
    
    public static void main(String[] args) {

        Papagaio p = new Papagaio("Papagaio zeca", true, "oh loro");
        p.talk();
        p.imprime();

        Arara a = new Arara("Arara Azul", true);
        a.talk();
        a.imprime();

        Cachorro c = new Cachorro("cachorro Amarelao", 4, true);
        c.talk();
        c.imprime();

        Vaca v = new Vaca("vaca pintada", 4, true);
        v.talk();
        v.imprime();
    }
    
}
