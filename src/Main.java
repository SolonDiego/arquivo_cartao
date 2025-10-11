import controller.Controller;

public class Main {
    public static void main(String[] args) {

        Controller conn = new Controller();

        String path = "pagamentos-15456984517328655732_09.10.25.csv";

        conn.salvarArquivo("C:\\Users\\SolonDiego\\Desktop\\" + path,
                "C:\\Users\\SolonDiego\\Desktop\\arquivo_" + path);


    }
}