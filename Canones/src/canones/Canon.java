/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package canones;

/**
 *
 * @author TOSHIBA
 */
public class Canon {

    private int largo;  //en cm
    private int calibre; // en mm
    private int polvora; // en gr
    private String nombre;
    private double velocidadinicial;

    public Canon(int largo, int calibre, String nombre) {
        this.largo = largo;
        this.calibre = calibre;
        this.nombre = nombre;
    }

//    public double dispara(int angulo, int granos){
//        
//        velocidadinicial = calibre * polvora;
//        
//    }
    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getCalibre() {
        return calibre;
    }

    public void setCalibre(int calibre) {
        this.calibre = calibre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
