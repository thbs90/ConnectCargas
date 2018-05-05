package br.com.connectcargas.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import br.com.connectcargas.model.Motorista;

public class MotoristaDAO extends Conexao implements IMotoristaDAO {

	@Override
	public void salvar(Motorista motorista) throws SQLException  {
		String sql = "INSERT INTO motorista(nome, cpf, matricula, endereco, dataNascimento) VALUES (?, ?, ?, ?, ?)";
		
		PreparedStatement ps = getConnection().prepareStatement(sql);
		
		if (motorista != null) {
			try {
				ps.setString(1, motorista.getNome());
				ps.setString(2, motorista.getCpf());
				ps.setString(3, motorista.getMatricula());
				ps.setString(4, motorista.getEndereco());
				ps.setDate(5, (Date) motorista.getDataNascimento());
				ps.execute();
				
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				ps.close();
			}
		}
		
	}

	@Override
	public void deletar(Motorista motorista) throws SQLException{
		// TODO Auto-generated method stub
		
		String sql = "DELETE FROM motorista WHERE id = ?";
		
		PreparedStatement ps = getConnection().prepareStatement(sql);
		
		if (motorista != null) {
			try {
				ps.setInt(1, motorista.getId());
				ps.execute();
				
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				ps.close();
			}
		}
		
	}

	@Override
	public List<Motorista> consultar() {
		PreparedStatement ps = null;
		final List<Motorista> motoristas  = new ArrayList<>();	
		
		final String sql = "Select * from motorista";
		try {
			ps = getConnection().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			
			while(rs.next()) {
				Motorista dadosMotorista = new Motorista();
				dadosMotorista.setId(rs.getInt("id"));
				dadosMotorista.setCpf(rs.getString("cpf"));
				dadosMotorista.setNome(rs.getString("nome"));
				dadosMotorista.setDataNascimento(rs.getDate("dataNascimento"));
				dadosMotorista.setMatricula(rs.getString("matricula"));
				dadosMotorista.setEndereco(rs.getString("endereco"));
				
				motoristas.add(dadosMotorista);
			}
		}catch (SQLException e) {
			e.printStackTrace();
		} 
		return motoristas;
	}

	@Override
	public Motorista atualizar(Motorista motorista) {
		// TODO Auto-generated method stub
		return null;
	}

}
