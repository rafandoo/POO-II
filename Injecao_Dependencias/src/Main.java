import com.classes.BO.ContatoBO;
import com.classes.DTO.Contato;
import com.persistencias.*;

public class Main {
    public static void main(String[] args) {

        ContatoBO bo = new ContatoBO();

        Persistencia persistencia = new PersistenciaMYSQL(); // mudar aqui para testar as persistencias

        Contato contato = new Contato(
                "Rafa",
                "01/01/2002",
                "93300-0961",
                "rafael@mail.com"
        );
        bo.salvar(contato, persistencia);

        contato = new Contato(
                "Daniel",
                "01/01/2000",
                "99999-9999",
                "daniel@mail.com"
        );
        bo.salvar(contato, persistencia);

        System.out.println(bo.lerContatos(persistencia));
    }
}