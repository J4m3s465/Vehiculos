package com.taller.vh.Entidad;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "registro")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre_propietario;
    private String apellido_propietario;
    private String marca;
    private String modelo;
    private String year_vehiculo;
    private String placa;
    private String color;

    public Long getId() {
        return id;
    }

    // Setter for id
    public void setId(Long id) {
        this.id = id;
    }

    // Getter for nombre_propietario
    public String getNombre_propietario() {
        return nombre_propietario;
    }

    // Setter for nombre_propietario
    public void setNombre_propietario(String nombre_propietario) {
        this.nombre_propietario = nombre_propietario;
    }

    // Getter for apellido_propietario
    public String getApellido_propietario() {
        return apellido_propietario;
    }

    // Setter for apellido_propietario
    public void setApellido_propietario(String apellido_propietario) {
        this.apellido_propietario = apellido_propietario;
    }

    // Getter for marca
    public String getMarca() {
        return marca;
    }

    // Setter for marca
    public void setMarca(String marca) {
        this.marca = marca;
    }

    // Getter for modelo
    public String getModelo() {
        return modelo;
    }

    // Setter for modelo
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Getter for year_vehiculo
    public String getYear_vehiculo() {
        return year_vehiculo;
    }

    // Setter for year_vehiculo
    public void setYear_vehiculo(String year_vehiculo) {
        this.year_vehiculo = year_vehiculo;
    }

    // Getter for placa
    public String getPlaca() {
        return placa;
    }

    // Setter for placa
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    // Getter for color
    public String getColor() {
        return color;
    }

    // Setter for color
    public void setColor(String color) {
        this.color = color;
    }

}