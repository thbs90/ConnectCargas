package br.com.connectcargas.services;

import java.util.List;

import br.com.connectcargas.dao.IJornadaDAO;
import br.com.connectcargas.dao.JornadaDAO;
import br.com.connectcargas.model.Jornada;

public class JornadaService implements IJornadaService {

	private IJornadaDAO dao;
	
	public JornadaService() {
		this.dao = new JornadaDAO();
	}
	
	@Override
	public boolean salvar(Jornada jornada) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deletar(int id) {
		if (id == 0) {
			return false;
		}
		return false;
	}

	@Override
	public List<Jornada> consultar() {
		
		return this.dao.consultar();
	}

	@Override
	public Jornada atualizar(Jornada jornada) {
		if (jornada == null) {
			return null;
		}
		if (jornada.getId() == null) {
			return null;
			}
		return null;
	}
	
}
