package tests;

import code.Cliente;
import code.Orcamento;

public class Test_orcamento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Orcamento x = new Orcamento();
		Cliente arthur = new Cliente();
		
		x.setCliente(arthur);
		x.getCliente().setNome("Arthur");
		x.getCliente().setContato(911);
		x.getCliente().setEmail("@@");
		x.getCliente().getListOrcamento().add(x);
		
		System.out.println(x.getCliente().getNome());
	}
}
