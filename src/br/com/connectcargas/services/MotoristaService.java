package br.com.connectcargas.services;

import java.util.List;

import br.com.connectcargas.dao.IMotoristaDAO;
import br.com.connectcargas.dao.MotoristaDAO;
import br.com.connectcargas.model.Motorista;

public class MotoristaService implements IMotoristaService {
	
	private IMotoristaDAO dao;
	
	public MotoristaService() {
		this.dao = new MotoristaDAO();
	}

	@Override
	public void salvar(Motorista motorista) {
		// TODO Auto-generated method stub
	}

	@Override
	public void deletar(Motorista motorista) {
		
	}

	@Override
	public List<Motorista> consultar() {
		
		return this.dao.consultar();
	}

	@Override
	public Motorista atualizar(Motorista motorista) {
		if (motorista == null) {
			return null;
		} if (motorista.getId() == null) {
			return null;
		}
		return null;
	}

}
