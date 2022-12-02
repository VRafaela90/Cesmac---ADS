package Interface;

import Folha.FolhaAtivos;
import Folha.FolhaInativos;
import Servidor.ServAtivos;
import Servidor.ServInativos;

public class Principal {
	
	public static void main(String[] args) {
	    
		//FOLHA ATIVOS
		FolhaAtivos fa_01 = new FolhaAtivos("11/2022", 150.00, 0.00, 0.00, 300.00, 175.00, 3500.00, 500.00, 0.00, 160.00);
		
		//FOLHA ATIVOS
		FolhaInativos fi_01 = new FolhaInativos("11/2022", 0.00, 0.00, 0.00, 300.00, 175.00, 12000.00);
				
		
		//SERVIDORES ATIVOS
		ServAtivos sa_01 = new ServAtivos("123.456.789-10", "Neymar Junior","Estatutario","Policia Civil","Delegado","Delegado Geral");
		
		//SERVIDORES INATIVOS
		ServInativos si_01 = new ServInativos("987.654.321-00", "Gustavo Lima","Aposentado");
		
		
		
		//LISTAGEM COM CHAMADA DOS METODOS
		System.out.println("### LISTAGEM DE SERVIDORES ATIVOS ###");
		System.out.println("-------------------------------------------------------------------------|");
		System.out.println("      CPF      |     Nome      |     Orgao     | Mes/Ano | Total Liquido |");
		System.out.println("-------------------------------------------------------------------------|");
		System.out.println(sa_01.getCpf() +" | "+ sa_01.getNome() +" | "+ sa_01.getOrgao() +" | "+ fa_01.getPeriodo() +" | R$:"+ fa_01.getTotalLiquido()+"     |");
		System.out.println("-------------------------------------------------------------------------|");
		
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("### LISTAGEM DE SERVIDORES INATIVOS ###");
		System.out.println("------------------------------------------------------------------------|");
		System.out.println("      CPF      |      Nome    |   Vinculo   | Mes/Ano |  Total Liquido  |");
		System.out.println("------------------------------------------------------------------------|");
		System.out.println(si_01.getCpf() +" | "+ si_01.getNome() +" | "+ si_01.getVinculo() +" | "+ fi_01.getPeriodo() +" | R$:"+ fi_01.getTotalLiquido()+"       |");
		System.out.println("------------------------------------------------------------------------|");
		
		

	}
}
