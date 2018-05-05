package br.com.connectcargas.main;

import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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

	public static void main(String[] args) throws SQLException, ParseException {
		
//		IJornadaService jornadaService = new JornadaService();
//		
//		List<Jornada> listaDados = jornadaService.consultar();
//		System.out.println(listaDados);
//		
//		IMotoristaService motoristaService = new MotoristaService();
//		
//		List<Motorista> listaMotoristas = motoristaService.consultar();
//		System.out.println(listaMotoristas);
//		
//		ITransportadoraService transportadoraService = new TransportadoraService();
//		
//		List<Transportadora> listaTransportadora = transportadoraService.consultar();
//		System.out.println(listaTransportadora);
//		
//		IUsuarioService usuarioService = new UsuarioService();
//		
//		List<Usuario> listaUsuario = usuarioService.consultar();
//		System.out.println(listaUsuario);
		
//		IMotoristaService deletarMotorista = new MotoristaService();
		Scanner sc = new Scanner(System.in);
//		System.out.println("Digite o ID do motorista");
//		if (deletarMotorista.deletar(sc.nextInt())) {
//			System.out.println("Motorista excluido com sucesso");
//		}else {
//			System.out.println("Erro ao excluir!"); 
//			}
//		
//		IMotoristaService incluirMotorista = new MotoristaService();
//		Motorista cadastro = new Motorista();
//		
//		System.out.println("Digite os dados do Motorista:");
//		cadastro.setNome(sc.nextLine());
//		sc.nextLine();
//		cadastro.setCpf(sc.nextLine());
//		cadastro.setMatricula(sc.nextLine());
//		cadastro.setEndereco(sc.nextLine());
//		
//		String data = sc.nextLine();
//		DateFormat dataFormatada = new SimpleDateFormat("dd/mm/yyyy");
//			
//		Date dataNasc = dataFormatada.parse(data);
//		cadastro.setDataNascimento(dataNasc);
//		
//		incluirMotorista.salvar(cadastro);
		
		IMotoristaService atualizarMotorista = new MotoristaService();
		Motorista atualizar = new Motorista();
		
		System.out.println("Digite os dados do Motorista:");
		atualizar.setId(sc.nextInt());
		sc.nextLine();
		atualizar.setNome(sc.nextLine());
		
		atualizar.setCpf(sc.nextLine());
		atualizar.setMatricula(sc.nextLine());
		atualizar.setEndereco(sc.nextLine());
		
		String data = sc.nextLine();
		DateFormat dataFormatada = new SimpleDateFormat("dd/mm/yyyy");
			
		Date dataNasc = dataFormatada.parse(data);
		atualizar.setDataNascimento(dataNasc);
		
		atualizarMotorista.atualizar(atualizar);
	}

}
