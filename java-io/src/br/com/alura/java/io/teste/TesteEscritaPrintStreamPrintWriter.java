package br.com.alura.java.io.teste;

import java.io.IOException;
import java.io.PrintWriter;

public class TesteEscritaPrintStreamPrintWriter {

	public static void main(String[] args) throws IOException {
		
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer isw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(isw);
		
//		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem3.txt"));
//		PrintStream ps = new PrintStream("lorem4.txt");
		
		PrintWriter ps = new PrintWriter("lorem4.txt", "UTF-8");
		
		ps.println("Teste de escrita em arquivo");
		ps.println();
		
		ps.println("Mais conteúdo no fim áéíóú");		
		ps.close();		
	}

}
