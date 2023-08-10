package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import conexao.ConexaoBanco;
import model.Usuario;

public class UsuarioRepository {
	private Connection conn;
	
	public UsuarioRepository() {
		conn = ConexaoBanco.getConnection();
	}
	
	public Usuario insereUsuario(Usuario objeto) throws Exception{
		
			String sql = "INSERT INTO user(login, senha) VALUES(?, ?);";
			
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, objeto.getUsuario());
			stmt.setString(2, objeto.getSenha());
			
			stmt.execute();
			
			conn.commit();	
			
			return this.consultarUsuario(objeto.getUsuario());
	}
	
	public Usuario consultarUsuario(String usuario) throws Exception{
		Usuario user01 = new Usuario();
		
		
		return user01;
	}
}
