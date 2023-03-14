package desafios.bootcampoo.dominio;

import java.time.LocalDate;

public class Main {
	
	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Java");
		curso1.setDescricao("descricao java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("JS");
		curso2.setDescricao("descricao javascript");
		curso2.setCargaHoraria(5);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria");
		mentoria.setDescricao("Descricao mentoria");
		mentoria.setData(LocalDate.now());
		
		/*System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);*/
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descricao do Bootcamp");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev dev = new Dev();
		dev.setNome("Danilo");
		dev.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos (curso, carga horária):");
		System.out.println(dev.getConteudosInscritos());
		System.out.println();
		dev.progredir();
		System.out.println("Conteudos Concluidos (curso, carga horária):");
		System.out.println(dev.getConteudosConcluidos());
		System.out.println();
		System.out.println("Conteudos inscritos depois de concluir alguns:");
		System.out.println(dev.getConteudosInscritos());
		System.out.println();
		System.out.println("Pontos obtidos:");
		System.out.println("Total XP: " + dev.calcularTotalXp());
	}
}
