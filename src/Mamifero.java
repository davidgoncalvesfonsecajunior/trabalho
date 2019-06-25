/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public abstract class Mamifero extends Animal {

    private int patas;

    public Mamifero(String n, int p) {

        super(n);
        this.setPatas(p);
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int p) {
        this.patas = p;
    }
}
