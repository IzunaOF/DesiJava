package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;

public class Collections {

    public Collections() {
        listaaa();
    }

    public void listaaa() {
        List alunos = new ArrayList<>();
        ArrayList professores = new ArrayList<>();

        professores.add("Filipe");
        professores.contains("Filipe");

        professores.get(professores.indexOf("Filipe"));
        professores.remove("Filipe");

        professores.lastIndexOf("Filipe");
    }

    public void leitorNumeros() {
        ArrayList par = new ArrayList<Integer>();
        ArrayList impar = new ArrayList<Integer>();
        ArrayList numList = new ArrayList<Integer>();

        int nums = 0;

        while (nums < 5) {
            Integer inserido = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro"));
            numList.add(inserido);
            if (inserido % 2 == 0) {
                par.add(inserido);
            } else {
                impar.add(inserido);
            }
            nums++;
        }

        JOptionPane.showMessageDialog(null, "Estes Foram os Números Pares: " + par.toString() + "\n" + "Estes Foram os Números Impares: " + impar.toString() + "\n" + "Lista Completa: " + numList.toString());
    }

    public void temperaturaAnual() {
        ArrayList ano = new ArrayList<>();
        String[] mes = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        while (ano.size() < 12) {
            ano.add(Integer.parseInt(JOptionPane.showInputDialog("Temperatura do mês de " + mes[ano.size()])));
        }
        int media = 0;

        for (int i = 0; i < ano.size(); i++) {
            media += Integer.parseInt(ano.get(i).toString());
        }
        media /= ano.size();

        String formatted = "";

        for (int i = 0; i < mes.length; i++) {
            if (Integer.parseInt(ano.get(i).toString()) > media) {
                formatted += "" + mes[i] + ": " + ano.get(i) + "º graus \n";
            }
        }

        JOptionPane.showMessageDialog(null, formatted);
    }

    public void aMurderBtw() {
        int resp = 0;
        int answer = 0;
        answer = JOptionPane.showConfirmDialog(null, "Telefonou para a vítima?");
        resp = calculateResp(answer, resp);
        answer = JOptionPane.showConfirmDialog(null, "Esteve no Local do crime?");
        resp = calculateResp(answer, resp);
        answer = JOptionPane.showConfirmDialog(null, "Mora perto da vítima?");
        resp = calculateResp(answer, resp);
        answer = JOptionPane.showConfirmDialog(null, "Devia para a vítima?");
        resp = calculateResp(answer, resp);
        answer = JOptionPane.showConfirmDialog(null, "ja trabalhou com a vítima?");

        System.out.println(resp);

        String setence = "";
        switch (resp) {
            case 2:
                setence = "Suspeita";
                break;
            case 3:
            case 4:
                setence = "Cúmplice";
                break;
            case 5:
                setence = "Assa Sino";
                break;

            default:
                setence = "Inocente";
                break;
        }

        JOptionPane.showMessageDialog(null, "Esta Pessoa é " + setence);
    }

    private int calculateResp(int answer, int ant) {
        int aux = 0;
        if (answer == 0) {
            aux = ant + 1;
            return aux;
        } else {
            return ant;
        }
    }
}
