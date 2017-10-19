package code;

public class CEO extends Funcionario{
	private String usuario, senha;

	public String getUsuario() {
		return usuario;
	}
	
	public String getSenha() {
		return senha;
	}

	public boolean pass(String senha, String usuario) {
		if(usuario.equals(getUsuario())&&senha.equals(getSenha())) {
			return true;
		}else
			return false;
	}
	
	
	
}
