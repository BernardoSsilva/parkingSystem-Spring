package com.activites.parking.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "park_take")
public class park {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String hourTake;

    @ManyToOne
    @JoinColumn(name = "carro_id")
    private carro car;

    @ManyToOne
    @JoinColumn(name = "vagas_id")
    private vagas vaga;

    public park() {

    }

    public park(Long id, String hourTake, carro car, vagas vaga) {
        this.id = id;
        this.hourTake = hourTake;
        this.car = car;
        this.vaga = vaga;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHourTake() {
        return hourTake;
    }

    public void setHourTake(String hourTake) {
        this.hourTake = hourTake;
    }

    public carro getCar() {
        return car;
    }

    public void setCar(carro car) {
        this.car = car;
    }

    public vagas getVaga() {
        return vaga;
    }

    public void setVaga(vagas vaga) {
        this.vaga = vaga;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((hourTake == null) ? 0 : hourTake.hashCode());
        result = prime * result + ((car == null) ? 0 : car.hashCode());
        result = prime * result + ((vaga == null) ? 0 : vaga.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        park other = (park) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (hourTake == null) {
            if (other.hourTake != null)
                return false;
        } else if (!hourTake.equals(other.hourTake))
            return false;
        if (car == null) {
            if (other.car != null)
                return false;
        } else if (!car.equals(other.car))
            return false;
        if (vaga == null) {
            if (other.vaga != null)
                return false;
        } else if (!vaga.equals(other.vaga))
            return false;
        return true;
    }

}
