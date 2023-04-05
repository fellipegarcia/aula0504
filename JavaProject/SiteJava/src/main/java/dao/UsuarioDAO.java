package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import modelo.Usuario;

	public class UsuarioDAO {
		public Usuario validarSignin(Usuario usuario) {
			Connection cnx = Dao.getConexao();
			String sql = "SELECT * FROM usuario WHERE usuario = ? AND senha = ?";
			Usuario u = new Usuario();
			
			//TRY CAT IDENTIFICA E MOSTRA UM ERRO INESPERADO
			
			try {
			PreparedStatement ps = cnx.prepareStatement(sql);
			
			ps.setString(1,  usuario.getUsuario());
			ps.setString(2, usuario.getSenha());
			
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				u.setId(rs.getInt("id"));
				u.setUsuario(rs.getString("usuario"));
				u.setSenha(rs.getString("senha"));
				u.setEmail(rs.getString("email"));
				u.setNome(rs.getString("nome"));
				
				
			}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return u;
		}
	}