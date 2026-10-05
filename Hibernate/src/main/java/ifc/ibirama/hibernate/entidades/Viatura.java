/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifc.ibirama.hibernate.entidades;

import jakarta.persistence.Column;
import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author aluno
 */
@Entity
@Table(name = "Viatura")
public class Viatura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "via_id")
    private Integer id;
    @Column(name = "via_placa", length = 7, unique = true, nullable = false)
    private String placa;
    @Column(name = "via_combustivel", length = 45, nullable = false, unique = false)
    private String combustivel;
    @Column(name = "via_ultima_revisao", nullable = false, unique = false)
    private LocalDate ultimarevisao;
    @Column(name = "via_km", nullable = false, unique = false)
    private Integer km;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public LocalDate getUltimarevisao() {
        return ultimarevisao;
    }

    public void setUltimarevisao(LocalDate ultimarevisao) {
        this.ultimarevisao = ultimarevisao;
    }

    public Integer getKm() {
        return km;
    }

    public void setKm(Integer km) {
        this.km = km;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Viatura) {
            Viatura aux = (Viatura) obj;
            if ((aux.getId().equals(this.id)) && (aux.getPlaca().equals(this.placa))) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
