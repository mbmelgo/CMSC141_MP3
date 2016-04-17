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
    private char[] line;
    private char[] line_old;

    public Rule_30(int width, int iterations) {
        this.width = width;
        this.iterations = iterations;
    }

    public void print() {
        line = new char[width + 2];
        line_old = new char[width + 2];

        for (int i = 0; i <= width; i++) {
            line[i] = ' ';
        }
        line[width / 2] = '*';
        for (int i = 1; i <= width; i++) {
            System.out.print(line[i]);
        }
        System.out.println(" ");
        for (int j = 1; j <= iterations; j++) {
            for (int i = 1; i < width + 2; i++) {
                line_old[i] = line[i];
            }
            for (int i = 1; i <= width; i++) {
                if ((line_old[i - 1] == ' ' && line_old[i] == ' ' && line_old[i + 1] == '*')
                        || (line_old[i - 1] == ' ' && line_old[i] == '*' && line_old[i + 1] == ' ')
                        || (line_old[i - 1] == ' ' && line_old[i] == '*' && line_old[i + 1] == '*')
                        || (line_old[i - 1] == '*' && line_old[i] == ' ' && line_old[i + 1] == ' ')) {
                    line[i] = '*';
                } else {
                    line[i] = ' ';
                }
            }
            line[0] = line[width];
            line[width + 1] = line[1];
            for (int i = 1; i <= width; i++) {
                System.out.print(line[i]);
            }
            System.out.println(" ");
        }
    }

}
