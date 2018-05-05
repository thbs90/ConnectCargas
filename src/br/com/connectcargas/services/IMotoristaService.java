package br.com.connectcargas.services;

import java.sql.SQLException;
import java.util.List;

import br.com.connectcargas.model.Motorista;


public interface IMotoristaService {
	
	public void salvar(Motorista motorista) throws SQLException;
	public void deletar(Motorista motorista) throws SQLException;
	public List<Motorista> consultar();
	public Motorista atualizar(Motorista motorista);
	
}
