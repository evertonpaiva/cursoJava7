package br.com.bytebank.banco.teste.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteSerializacao {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Cliente cliente = new br.com.bytebank.banco.modelo.Cliente();
		cliente.setNome("Nico");
		cliente.setProfissao("Desenvolvedor");
		cliente.setCpf("123456789");
		
		ContaCorrente cc = new ContaCorrente(222, 333);
		cc.deposita(200.5);
		cc.setTitular(cliente);
				
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));		
		oos.writeObject(cc);
		oos.close();

	}

}
