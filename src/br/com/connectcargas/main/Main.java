package br.com.connectcargas.main;

import java.util.List;
import java.util.Scanner;

import br.com.connectcargas.dao.MotoristaDAO;
import br.com.connectcargas.model.*;
import br.com.connectcargas.services.IJornadaService;
import br.com.connectcargas.services.IMotoristaService;
import br.com.connectcargas.services.ITransportadoraService;
import br.com.connectcargas.services.IUsuarioService;
import br.com.connectcargas.services.JornadaService;
import br.com.connectcargas.services.MotoristaService;
import br.com.connectcargas.services.TransportadoraService;
import br.com.connectcargas.services.UsuarioService;

public class Main {

	public static void main(String[] args) {
		
		IJornadaService jornadaService = new JornadaService();
		
		List<Jornada> listaDados = jornadaService.consultar();
		System.out.println(listaDados);
		
		IMotoristaService motoristaService = new MotoristaService();
		
		List<Motorista> listaMotoristas = motoristaService.consultar();
		System.out.println(listaMotoristas);
		
		ITransportadoraService transportadoraService = new TransportadoraService();
		
		List<Transportadora> listaTransportadora = transportadoraService.consultar();
		System.out.println(listaTransportadora);
		
		IUsuarioService usuarioService = new UsuarioService();
		
		List<Usuario> listaUsuario = usuarioService.consultar();
		System.out.println(listaUsuario);
		
		
	}

}
