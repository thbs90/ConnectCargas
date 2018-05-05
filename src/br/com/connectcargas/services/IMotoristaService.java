package br.com.connectcargas.services;

import java.sql.SQLException;
import java.util.List;

import br.com.connectcargas.model.Motorista;


public interface IMotoristaService {
	
	public boolean salvar(Motorista motorista) throws SQLException;
	public boolean deletar(int id) throws SQLException;
	public List<Motorista> consultar();
	public boolean atualizar(Motorista motorista) throws SQLException;
	
}
