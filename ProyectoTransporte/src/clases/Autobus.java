/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author hp
 */
public class Autobus {
    //Atributos 
    private String numero_ruta;
    private double tarifa;
    private String color;
    private String diasDeServicio;
    
    public Autobus( String numero_ruta, double tarifa, String color, String diasDeServicio) {
        this.numero_ruta = numero_ruta;
        this.color = color;
        this.tarifa = tarifa;
        this.diasDeServicio = diasDeServicio;
    }
    
    //Generamos los metodos gets y sets de cada uno de los atributos de la clase autobus.

    public String getNumero_ruta() {
        return numero_ruta;
    }

    public void setNumero_ruta(String numero_ruta) {
        this.numero_ruta = numero_ruta;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDiasDeServicio() {
        return diasDeServicio;
    }

    public void setDiasDeServicio(String diasDeServicio) {
        this.diasDeServicio = diasDeServicio;
    }
    
    
}
