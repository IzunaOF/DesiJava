/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;
import static Util.ConnectionClient.getConnection;

import io.github.cdimascio.dotenv.Dotenv;

public class Start {
        public static Dotenv dotenv = Dotenv.load();
        
        public static void main(String[] args){
              getConnection();
        }
}
