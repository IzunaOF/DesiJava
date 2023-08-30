package Models;

import Util.ConnectionClient;
import Views.Sistema;
import java.util.HashMap;
import java.util.Set;
import static Util.ConnectionClient.getConnection;

import io.github.cdimascio.dotenv.Dotenv;

public class Main {

    public static Bank banco = new Bank();
    public static Dotenv dotenv = Dotenv.load();

    public static void main(String[] args) {
        getConnection();

        new Sistema().setVisible(true);

    }
}
