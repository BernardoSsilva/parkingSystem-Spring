package com.activites.parking.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_carro")
public class carro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCarro;
    private String placa;
    private String modelo;
    private String documento;
    private Integer ano;

    public carro() {

    }

    public carro(Long idCarro, String placa, String modelo, String documento, Integer ano) {
        this.idCarro = idCarro;
        this.placa = placa;
        this.modelo = modelo;
        this.documento = documento;
        this.ano = ano;
    }

    public Long getIdCarro() {
        return idCarro;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public String getDocumento() {
        return documento;
    }

    public Integer getAno() {
        return ano;
    }

    public void setIdCarro(Long idCarro) {
        this.idCarro = idCarro;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((idCarro == null) ? 0 : idCarro.hashCode());
        result = prime * result + ((placa == null) ? 0 : placa.hashCode());
        result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
        result = prime * result + ((documento == null) ? 0 : documento.hashCode());
        result = prime * result + ((ano == null) ? 0 : ano.hashCode());
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
        carro other = (carro) obj;
        if (idCarro == null) {
            if (other.idCarro != null)
                return false;
        } else if (!idCarro.equals(other.idCarro))
            return false;
        if (placa == null) {
            if (other.placa != null)
                return false;
        } else if (!placa.equals(other.placa))
            return false;
        if (modelo == null) {
            if (other.modelo != null)
                return false;
        } else if (!modelo.equals(other.modelo))
            return false;
        if (documento == null) {
            if (other.documento != null)
                return false;
        } else if (!documento.equals(other.documento))
            return false;
        if (ano == null) {
            if (other.ano != null)
                return false;
        } else if (!ano.equals(other.ano))
            return false;
        return true;
    }

}
