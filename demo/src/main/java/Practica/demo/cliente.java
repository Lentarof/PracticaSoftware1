package Practica.demo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
class cliente {

    private @Id @GeneratedValue Long id;
    private String nombre;
    private String cargo;

    cliente() {}

    cliente(String nombre, String cargo) {
        this.nombre = nombre;
        this.cargo = cargo;
    }
}