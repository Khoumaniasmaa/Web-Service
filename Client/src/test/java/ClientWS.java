import proxy.BanqueService;
import proxy.Banques;
import proxy.Compte;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService stub=new Banques().getBanqueServicePort();
        System.out.println(stub.convert(7600));
        Compte CP = stub.getCompte(5);
        System.out.println(CP.getCode());
        System.out.println(CP.getSolde());
    }
}
