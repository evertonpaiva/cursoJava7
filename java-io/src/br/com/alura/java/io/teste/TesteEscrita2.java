package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita2 {

	public static void main(String[] args) throws IOException {
		
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer isw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(isw);
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem3.txt"));
		
		bw.write("Teste de escrita em arquivo\r\n");		
		bw.newLine();
		bw.newLine();
		bw.write("Mais conteúdo no fim");
		
		bw.close();		
	}

}
