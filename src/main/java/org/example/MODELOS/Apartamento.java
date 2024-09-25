package org.example.MODELOS;

public class Apartamento {

    private Long id;

    private String direccion;

    private Integer numeroHabitaciones;

    private Integer numeroBanos;

    private Double tamano;

    private Double precio;

    private String tipo;

    public Apartamento(Long id, String direccion, Integer numeroHabitaciones, Integer numeroBanos, Double tamano, Double precio, String tipo) {
        this.id = id;
        this.direccion = direccion;
        this.numeroHabitaciones = numeroHabitaciones;
        this.numeroBanos = numeroBanos;
        this.tamano = tamano;
        this.precio = precio;
        this.tipo = tipo;
    }

    public Apartamento() {


    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public void setNumeroHabitaciones(Integer numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }

    public Integer getNumeroBanos() {
        return numeroBanos;
    }

    public void setNumeroBanos(Integer numeroBanos) {
        this.numeroBanos = numeroBanos;
    }

    public Double getTamano() {
        return tamano;
    }

    public void setTamano(Double tamano) {
        this.tamano = tamano;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
