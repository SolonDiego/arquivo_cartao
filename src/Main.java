import controller.Controller;

public class Main {
    public static void main(String[] args) {

        Controller conn = new Controller();

        String path = "pagamentos-12221870340885141141.csv";

        conn.salvarArquivo("C:\\Users\\SolonDiego\\Desktop\\" + path,
                "C:\\Users\\SolonDiego\\Desktop\\arquivo_" + path);


    }
}