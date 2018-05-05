package br.com.connectcargas.dao;

import java.sql.SQLException;
import java.util.List;

import br.com.connectcargas.model.Motorista;

public interface IMotoristaDAO {
	
	public void salvar(Motorista motorista) throws SQLException;
	public void deletar(Motorista motorista) throws SQLException;
	public List<Motorista> consultar();
	public Motorista atualizar(Motorista motorista);

}
