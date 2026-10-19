/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifc.ibirama.hibernate.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 *
 * @author aluno
 */
@Entity
@Table(name = "Telefone_Contato")
public class TelefoneContato {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "tec_numero")
    private String numero;
    @Column(name = "tec_tipo")
    private String tipo;
    @ManyToOne
    @JoinColumn(name = "bom_id", unique = true)
    private Bombeiro bombeiro;
    
    public TelefoneContato(){
        
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Bombeiro getBombeiro() {
        return bombeiro;
    }

    public void setBombeiro(Bombeiro bombeiro) {
        this.bombeiro = bombeiro;
    }
     
    
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof TelefoneContato) {
            TelefoneContato aux = (TelefoneContato) obj;
            if ((aux.getId().equals(this.id)) && (aux.getId().equals(this.id))) {
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
