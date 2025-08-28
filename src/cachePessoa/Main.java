package cachePessoa;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

		
		 public static Pessoa buscarID(List<Pessoa> lista, int id) {		
		//atribuir a lista à Pessoa
		for (Pessoa pessoaAtual : lista) {
		    if (pessoaAtual.getId() == id) {
		        return pessoaAtual;
		    }
		}
		 return null;
}
public static void main(String[] args) {
	//utilização do scanner
	Scanner sc = new Scanner(System.in);
	
	//criação da lista para armazenamento das informações
	//ArrayList --Array comum
	//pessoas do meu grupo
	List<Pessoa> banco = new ArrayList<>();
    banco.add(new Pessoa(1, "Silas", 19));
    banco.add(new Pessoa(2, "Daniel", 18));
    banco.add(new Pessoa(3, "Luiz", 18));
    banco.add(new Pessoa(4, "Gabriel", 16));
    banco.add(new Pessoa(5, "Letícia", 17));
    
    //pessoas aleatórias
    
    banco.add(new Pessoa(6, "Fábio", 40));
    banco.add(new Pessoa(7, "Gabriela", 27));
    banco.add(new Pessoa(8, "Hugo", 32));
    banco.add(new Pessoa(9, "Iara", 29));
    banco.add(new Pessoa(10, "João", 24));


//cache - LinkedList --mais otimizado para remover e adicionar elementos
	List<Pessoa> cache = new LinkedList<>();
	System.out.println("Digite o ID desejado");
	int buscaId = sc.nextInt();
	
	Pessoa encontrada = buscarID(cache, buscaId);
	
//-> != null (não procurar no banco)
	
	if (encontrada != null)  {
		System.out.println("Pessoa encontrada no cache!" + encontrada);
		
//-> else (procura no banco)
	} else {
		encontrada = buscarID(banco, buscaId); 
	}
	
	if (encontrada != null) {
		if (cache.size() >=10) cache.remove(0);
		cache.add(encontrada);
		System.out.println("Pessoa adicionada ao cache!" + encontrada);
	} else {
		System.out.println("Pessoa não encontrada!");
		System.out.print("Digite sua idade:");
		int idade = sc.nextInt();
		sc.nextLine();
		System.out.print("Digite seu nome: ");
		String nome = sc.nextLine();
		Pessoa nova = new Pessoa(buscaId, nome, idade);
		banco.add(nova); //add ao banco
		if (cache.size() >= 10) cache.remove(0);
        cache.add(nova);
        System.out.println("Nova pessoa adicionada ao cache: " + nova);
	}
	sc.close();
    }
}

