/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifc.ibirama.hibernate;
import ifc.ibirama.hibernate.entidades.Bombeiro;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author aluno
 */
public class ConsultarBombeiro {
    public static void main(String[] args) {
        Session sessao = HibernateUtil.getSessionFactory().openSesion();
        
        String meuHql = "from Bombeiro";
        
       List<Bombeiro> bombeiros = sessao.createQuery(meuHql, Bombeiro.class).getResultList();
        
       for (Iterator<Bombeiro> index = bombeiros.iterator(); index.hasNext()){
           Bombeiro meuBombeiro = index.next();
           System.out.println(meuBombeiro.getCpf());
       }
       
       for (int index = 0; index< bombeiros.size(); index++){
           Bombeiro meuBombeiro = bombeiros.get(index);
           System.out.println(meuBombeiro.getCpf());
       }
       
        HibernateUtil.shutdown();
    }
}
