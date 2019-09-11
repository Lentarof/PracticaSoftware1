package Practica.demo;

import org.springframework.data.jpa.repository.JpaRepository;

interface ClienteRepositorio extends JpaRepository<cliente, Long> {

}