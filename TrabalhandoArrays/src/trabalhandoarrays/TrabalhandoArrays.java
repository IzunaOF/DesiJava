package trabalhandoarrays;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class TrabalhandoArrays {

    public static void main(String[] args) {
        // TODO programa com JOptionPane com 3 notas e fazer a media
        
        // para o array [10, -7, 10, 34, 50, 37];
        // remover o ultimo elemento do arraylist
        
        // remover o primeiro elemento do arraylist
        
        // remover o menor número do array
        
        //para u trecho, remover as vogais e trocar para o l33t;
    }

    public static void lista() {
        ArrayList<Double> notas = new ArrayList<>();
        String nota = " ";

        while (!nota.equals("-1")) {
            nota = JOptionPane.showInputDialog("Digite a nota ou -1 para encerrar.");
            if (!nota.equals("-1")) {
                notas.add(Double.parseDouble(nota));
            }
        }

        double soma = 0.0;
        double media;

        double maior = notas.get(0).doubleValue();
        double menor = maior;

        for (Double num : notas) {
            if (num > maior) {
                maior = num;
            }
            if (num < menor) {
                menor = num;
            }
        }
        Iterator<Double> it = notas.iterator();
        soma = 0;
        while (it.hasNext()) {
            soma += it.next();
        }

        media = soma / notas.size();

        JOptionPane.showMessageDialog(null, "A media das notas foi " + media + "\n"
                + "A menor nota foi " + menor + "\n"
                + "A maior nota foi " + maior);
    }

    public static void pedirVariasNotas() {
        Double[] notas = new Double[1];
        String resp = " ";

        int contador = 0;

        while (!resp.equals("-1")) {
            resp = JOptionPane.showInputDialog("Digite a nota ou -1 para encerrar.");
            if (resp.equals("-1")) {
                break;
            } else {
                if (notas.length == contador) {
                    Double[] newNotas = new Double[contador + 1];
                    for (int i = 0; i < notas.length; i++) {
                        newNotas[i] = notas[i];
                    }
                    notas = newNotas;
                }
                notas[contador] = Double.parseDouble(resp);
                contador++;
            }
        }
    }

    public static void media() {
        Double notas[] = new Double[3];
        double media = 0;

        for (int i = 0; i < notas.length; i++) {
            notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a " + (i + 1) + "ª nota: ").replace(',', '.'));
            media += notas[i];
        }

        JOptionPane.showMessageDialog(null, media);
    }

}
