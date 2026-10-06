/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifc.ibirama.hibernate;

import ifc.ibirama.hibernate.entidades.Bombeiro;
import ifc.ibirama.hibernate.util.HibernateUtil;
import java.time.LocalDate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author aluno
 */
public class GerenciarBombeiro {
    public static void main(String[] args) {
      Session sessao =  HibernateUtil.getSessionFactory().openSession();
      
        System.out.println("Sessão estabelecida");
        Transaction transacao = null;
        
        Bombeiro bombeiro = new Bombeiro();
        bombeiro.setCpf("12345678");
        bombeiro.setDataNascimento(LocalDate.of(1990,2,2));
        bombeiro.setNomeCompleto("Fulano da Silva");
        bombeiro.setNomeGuerra("Silva");
        
        
        
        try{
            transacao = sessao.beginTransaction();
            
            sessao.persist(bombeiro);
           
            System.out.println("Bombeiro 'salvo'");
             sessao.close();
        }catch (Exception e){
            if (transacao != null ) {
                transacao.rollback();
                
            }
        }
        HibernateUtil.shutdown();
    }
}
