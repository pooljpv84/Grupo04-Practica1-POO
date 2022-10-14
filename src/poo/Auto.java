package poo;

import java.util.Objects;

public class Auto
{
    private Marca objMarca;
    private String modelo;
    private int year;
    private String color;
    private int cilindraje;
    private double costo;

    public double calcularMatricula(int yearActual)
    {
        return (this.year - yearActual);
    }
    private int calcularEdad(int yearActual)
    {
        return (yearActual - this.year);
    }
    public boolean esTaxi()
    {
        return Objects.equals(getColor(), "amarillo");
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
}
