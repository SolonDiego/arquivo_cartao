import controller.Controller;

public class Main {
    public static void main(String[] args) {

        Controller conn = new Controller();

        String path = "pagamentos-10602216264921641995_15.10.25.csv";

        conn.salvarArquivo("C:\\Users\\SolonDiego\\Desktop\\" + path,
                "C:\\Users\\SolonDiego\\Desktop\\arquivo_" + path);


    }
}