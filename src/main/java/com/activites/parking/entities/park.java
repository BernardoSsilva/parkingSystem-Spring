package com.activites.parking.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
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
    private carro carro_id;

    @ManyToOne
    @JoinColumn(name = "vaga_id")
    private vagas vaga_id;

    public park() {

    }

    public park(Long id, String hourTake, carro carro_id, vagas vaga_id) {
        this.id = id;
        this.hourTake = hourTake;
        this.carro_id = carro_id;
        this.vaga_id = vaga_id;
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

    public carro getCarro_id() {
        return carro_id;
    }

    public void setCarro_id(carro carro_id) {
        this.carro_id = carro_id;
    }

    public vagas getVaga_id() {
        return vaga_id;
    }

    public void setVaga_id(vagas vaga_id) {
        this.vaga_id = vaga_id;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((hourTake == null) ? 0 : hourTake.hashCode());
        result = prime * result + ((carro_id == null) ? 0 : carro_id.hashCode());
        result = prime * result + ((vaga_id == null) ? 0 : vaga_id.hashCode());
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
        if (carro_id == null) {
            if (other.carro_id != null)
                return false;
        } else if (!carro_id.equals(other.carro_id))
            return false;
        if (vaga_id == null) {
            if (other.vaga_id != null)
                return false;
        } else if (!vaga_id.equals(other.vaga_id))
            return false;
        return true;
    }

}
