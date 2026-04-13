import controller.Controller;

public class Main {
    public static void main(String[] args) {

        Controller conn = new Controller();

        String path = "pagamentos-5002510704216591685_18.03.26.csv";

        conn.salvarArquivo("C:\\Users\\SolonDiego\\Desktop\\" + path,
                "C:\\Users\\SolonDiego\\Desktop\\arquivo_" + path);


    }
}