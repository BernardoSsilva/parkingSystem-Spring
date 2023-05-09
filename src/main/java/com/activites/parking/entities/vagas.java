package com.activites.parking.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_vagasEstacionamento")
public class vagas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer numeroVaga;
    private Boolean ocupada;

    public vagas() {

    }

    public vagas(Long id, Integer numeroVaga, Boolean ocupada) {
        this.id = id;
        this.numeroVaga = numeroVaga;
        this.ocupada = ocupada;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumeroVaga() {
        return numeroVaga;
    }

    public void setNumeroVaga(Integer numeroVaga) {
        this.numeroVaga = numeroVaga;
    }

    public Boolean getOcupada() {
        return ocupada;
    }

    public void setOcupada(Boolean ocupada) {
        this.ocupada = ocupada;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((numeroVaga == null) ? 0 : numeroVaga.hashCode());
        result = prime * result + ((ocupada == null) ? 0 : ocupada.hashCode());
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
        vagas other = (vagas) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (numeroVaga == null) {
            if (other.numeroVaga != null)
                return false;
        } else if (!numeroVaga.equals(other.numeroVaga))
            return false;
        if (ocupada == null) {
            if (other.ocupada != null)
                return false;
        } else if (!ocupada.equals(other.ocupada))
            return false;
        return true;
    }

}
