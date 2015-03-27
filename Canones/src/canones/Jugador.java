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
public class Jugador {

    private final String nombre;
    private int ganados, perdidos, empatados, lugar;
    private String nickname, nacionalidad, foto;
    private Canon micanon;
    private int turno;

    public Jugador(String nombre, String nickname, Canon micanion) {
        this.nombre = nombre;
        this.nickname = nickname;
        this.micanon = micanion;
//        System.out.println(getNombre() + " " + getNickname() + " " + getMicanon());
    }

    public String getNombre() {
        return nombre;
    }

    public void guardar() {
        // guardar en un archivo con FileReader y FileWriter
    }

    public void leer() {
        // leer datos vía FileReader
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }
    
    
    
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getGanados() {
        return ganados;
    }

    public void setGanados(int ganados) {
        this.ganados = ganados;
    }

    public int getPerdidos() {
        return perdidos;
    }

    public void setPerdidos(int perdidos) {
        this.perdidos = perdidos;
    }

    public int getEmpatados() {
        return empatados;
    }

    public void setEmpatados(int empatados) {
        this.empatados = empatados;
    }

    public int getLugar() {
        return lugar;
    }

    public void setLugar(int lugar) {
        this.lugar = lugar;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Canon getMicanon() {
        return micanon;
    }

    public void setMicanon(Canon micanon) {
        this.micanon = micanon;
    }
}
