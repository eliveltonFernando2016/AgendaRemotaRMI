
import java.rmi.Remote;
import java.rmi.RemoteException;
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
public interface Acoes extends Remote{
    public Compromisso Adicionar(Compromisso newCompromisso) throws RemoteException;
    public void Alterar(Compromisso comp) throws RemoteException;
    public boolean Remover(Integer id) throws RemoteException;
    public LinkedList<Compromisso> Listar() throws RemoteException;
    public void Exibir(Compromisso comp) throws RemoteException;
}
