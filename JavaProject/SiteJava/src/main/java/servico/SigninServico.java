package servico;

import dao.UsuarioDAO;
import modelo.Usuario;

public class SigninServico {
	public boolean verificarUsuario(Usuario usuario) {
		UsuarioDAO dao = new UsuarioDAO();
		
		Usuario u = dao.validarSignin(usuario);
		
		
		if(u.getNome() != null) {
			return true;
		} else {
			return false;
		}
	}
}