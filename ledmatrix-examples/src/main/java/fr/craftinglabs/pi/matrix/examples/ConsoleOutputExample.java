package fr.craftinglabs.pi.matrix.examples;

import fr.craftinglabs.pi.matrix.Matrix;
import fr.craftinglabs.pi.matrix.Size;
import fr.craftinglabs.pi.matrix.frame.SlidingGlyphs;
import fr.craftinglabs.pi.matrix.font.Font6;
import fr.craftinglabs.pi.matrix.io.ConsoleMatrixIO;

public class ConsoleOutputExample {
 
    public static void main(String[] args) throws InterruptedException {

        Matrix matrix = new Matrix(new Size(6, 8), new ConsoleMatrixIO());

        matrix.print(10, new SlidingGlyphs(new Size(6, 8), Font6.H, Font6.e, Font6.l, Font6.l, Font6.o, Font6.SPACE, Font6.W, Font6.o, Font6.r, Font6.l, Font6.d, Font6.MARK));
    }
}