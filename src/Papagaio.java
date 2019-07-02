/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public class Papagaio extends Ave{
    
    private String frase;

    public Papagaio(String n, Boolean v, String f) {
        super(n, v);
        this.setFrase(f);
    }

    @Override
    public void talk() {

        System.out.println("Som: " + getFrase());

    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String f) {
        this.frase = f;
    }
    
}
