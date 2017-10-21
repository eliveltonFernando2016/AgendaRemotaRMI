/**
 * Inicializa o servico
 * autor: Rodrigo Campiolo
 * data: 22/11/2006
 */
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.util.LinkedList;

public class Servidor {

    public static void main(String args[]) {
        try {
            if (System.getSecurityManager() == null) {
                System.setSecurityManager(new SecurityManager());
            }
            Acoes comp = new Comp();

            /* registra o objeto remoto no Binder */
            Registry registry = LocateRegistry.getRegistry("localhost");
            registry.bind("ServicoAgenda", comp);
            
            comp.Adicionar(new Compromisso(0, "21/10/2017", "10:00", "TEste1", "Teste1", true));
            comp.Adicionar(new Compromisso(0, "22/10/2017", "11:00", "TEste2", "Teste2", true));
            comp.Adicionar(new Compromisso(0, "23/10/2017", "12:00", "TEste3", "Teste3", false));
            comp.Adicionar(new Compromisso(0, "24/10/2017", "01:00", "TEste4", "Teste4", true));
            comp.Adicionar(new Compromisso(0, "25/10/2017", "02:00", "TEste5", "Teste5", true));
            comp.Adicionar(new Compromisso(0, "26/10/2017", "03:00", "TEste6", "Teste6", true));
            comp.Adicionar(new Compromisso(0, "27/10/2017", "04:00", "TEste7", "Teste7", false));
            comp.Adicionar(new Compromisso(0, "28/10/2017", "05:00", "TEste8", "Teste8", true));
            comp.Adicionar(new Compromisso(0, "29/10/2017", "06:00", "TEste9", "Teste9", true));
            comp.Adicionar(new Compromisso(0, "30/10/2017", "07:00", "TEste10", "Teste10", true));
            comp.Adicionar(new Compromisso(0, "31/10/2017", "08:00", "TEste11", "Teste12", false));
            comp.Adicionar(new Compromisso(0, "01/11/2017", "09:00", "TEste12", "Teste12", true));
            comp.Adicionar(new Compromisso(0, "02/11/2017", "10:00", "TEste13", "Teste13", false));
            
            /*LinkedList<Compromisso> listComp = comp.Listar();
            for(int i=0; i < listComp.size(); i++){
                comp.Exibir(listComp.get(i));
            }*/

            /* aguardando invocacoes remotas */
            System.out.println("Servidor pronto ...");
        } catch (Exception e) {
            System.out.println(e);
        } //catch
    } //main
} //Servidor
