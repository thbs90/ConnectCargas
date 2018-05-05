package br.com.connectcargas.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.connectcargas.model.Usuario;

public class UsuarioDAO extends Conexao implements IUsuarioDAO{

	@Override
	public boolean salvar(Usuario usuario) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deletar(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Usuario> consultar() {
		PreparedStatement ps = null;
		final List<Usuario> usuarios = new ArrayList<>();

		final String sql = "Select * from usuario";
		try {
			ps = getConnection().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();


			while(rs.next()) {
				Usuario dadosUsuario = new Usuario();
				dadosUsuario.setId(rs.getInt("id"));
				dadosUsuario.setNome(rs.getString("nome"));
				dadosUsuario.setCpf(rs.getString("cpf"));
				dadosUsuario.setMatricula(rs.getString("matricula"));
				dadosUsuario.setFuncao(rs.getString("funcao"));
				dadosUsuario.setEmail(rs.getString("email"));
				dadosUsuario.setLogin(rs.getString("login"));
				dadosUsuario.setSenha(rs.getString("senha"));
				
				usuarios.add(dadosUsuario);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return usuarios;
	}

	@Override
	public Usuario atualizar(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

}
