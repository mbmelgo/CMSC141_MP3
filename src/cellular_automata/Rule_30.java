/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cellular_automata;

/**
 *
 * @author Melgo
 */
public class Rule_30 {

    private int width;
    private int iterations;
    private char[] x;
    private char[] x_old;

    public Rule_30(int width, int iterations) {
        this.width = width;
        this.iterations = iterations;
    }

    public void print() {
        x = new char[width + 2];
        x_old = new char[width + 2];

        for (int i = 0; i <= width; i++) {
            x[i] = ' ';
        }
        x[width / 2] = '*';
        for (int i = 1; i <= width; i++) {
            System.out.print(x[i]);
        }
        System.out.println(" ");
        for (int j = 1; j <= iterations; j++) {
            for (int i = 1; i < width + 2; i++) {
                x_old[i] = x[i];
            }
            for (int i = 1; i <= width; i++) {
                if ((x_old[i - 1] == ' ' && x_old[i] == ' ' && x_old[i + 1] == '*')
                        || (x_old[i - 1] == ' ' && x_old[i] == '*' && x_old[i + 1] == ' ')
                        || (x_old[i - 1] == ' ' && x_old[i] == '*' && x_old[i + 1] == '*')
                        || (x_old[i - 1] == '*' && x_old[i] == ' ' && x_old[i + 1] == ' ')) {
                    x[i] = '*';
                } else {
                    x[i] = ' ';
                }
            }
            x[0] = x[width];
            x[width + 1] = x[1];
            for (int i = 1; i <= width; i++) {
                System.out.print(x[i]);
            }
            System.out.println(" ");
        }
    }

}
