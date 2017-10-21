import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author elivelton
 */
public class Comp extends UnicastRemoteObject implements Acoes{
    private final LinkedList<Compromisso> listaCompromisso = new LinkedList();
    public int contaCompromisso = 0;
    
    public Comp() throws RemoteException{
        super();
        System.out.println("Objeto remoto instanciado");
    }

    @Override
    public Compromisso Adicionar(Compromisso newCompromisso) throws RemoteException {
        if(!listaCompromisso.isEmpty()){
            newCompromisso.setId(listaCompromisso.getLast().getId()+1);
        }
        listaCompromisso.add(newCompromisso);
        return newCompromisso;
    }

    @Override
    public void Alterar(Compromisso comp) throws RemoteException {
        int j = 0;
        for(int i=0; i < listaCompromisso.size(); i++){
            if(listaCompromisso.get(i).getId().equals(comp.getId())){
                j = i;
                listaCompromisso.set(i, comp);
                break;
            }
        }
        
        Exibir(listaCompromisso.get(j));
    }

    @Override
    public boolean Remover(Integer id) throws RemoteException{
        boolean ok = false;
        System.out.println("quantidade antes: "+listaCompromisso.size());
        for(int i=0; i < listaCompromisso.size(); i++){
            if(listaCompromisso.get(i).getId().equals(id)){
                listaCompromisso.remove(i);
                ok = true;
            }
        }
        
        System.out.println("quantidade depois: "+listaCompromisso.size());

        return ok;
    }
    
    @Override
    public LinkedList<Compromisso> Listar() throws RemoteException{
        return listaCompromisso;
    }
    
    @Override
    public void Exibir(Compromisso comp) throws RemoteException{
        System.out.println("Compromisso["+comp.getId()+"]");
        System.out.println("    Data: "+comp.getData());
        System.out.println("    Hora: "+comp.getHora());
        System.out.println("    Assunto: "+comp.getAssunto());
        System.out.println("    Descrição: "+comp.getDescricao());   
    }
}
