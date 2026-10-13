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
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

/**
 *
 * @author aluno
 */
@Entity
@Table(name = "Usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usu_id")
    private Integer id;
    @Column(name = "usu_login", length = 20, nullable = false, unique = true)
    private String login;
    @Column(name = "usu_senha", length = 20, nullable = false, unique = false)
    private String senha;

    @OneToOne
    @JoinColumn(name = "bom_id", unique = true)
    private Bombeiro bombeiro;

    public Usuario() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setBombeiro(Bombeiro bombeiro) {
        this.bombeiro = bombeiro;
    }

    public Bombeiro getBombeiro() {
        return bombeiro;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Usuario) {
            Usuario aux = (Usuario) obj;
            if ((aux.getId().equals(this.id)) && (aux.getLogin().equals(this.login))) {
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
