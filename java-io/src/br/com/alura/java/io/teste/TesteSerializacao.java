package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacao {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Cliente cliente = new Cliente();
		cliente.setNome("Nico");
		cliente.setProfissao("Desenvolvedor");
		cliente.setCpf("123456789");
				
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));		
		oos.writeObject(cliente);
		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
		Cliente clienteLido = (Cliente) ois.readObject();
		ois.close();
		System.out.println(clienteLido.getNome() + clienteLido.getCpf());
		
	}

}
