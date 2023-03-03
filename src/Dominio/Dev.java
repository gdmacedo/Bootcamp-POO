package Dominio;


import java.util.*;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp){
        //Adiciona todo o conteudo do bbotcamp, no conteudo que o inscrito tera direito de acesso.
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    
    
 //      Atualiza o conteudo realizado de acordo com a progressão...
        public void progredir() {
		    Optional<Conteudo> conteudo = conteudosInscritos.stream().findFirst();
		    if (conteudo.isPresent()) {
			    this.conteudosConcluidos.add(conteudo.get()); 			// Atualiza conteudo que esta contido em: this.conteudosConcluidos
			    this.conteudosInscritos.remove(conteudo.get());         // Exclui, limpa, remove os dados de: "this.conteudosInscritos"
			}else{
				System.err.println("Você não se encontra matriculado em nenhum bootcamp.");
			}
		
	    }


        public double calcularTotalXp() {
            Iterator<Conteudo> iterator = this.conteudosConcluidos.iterator();
            double soma = 0;
            while(iterator.hasNext()){
                double next = iterator.next().calcularXp();
                soma += next;
            }
            return soma;
    
            /*return this.conteudosConcluidos
                    .stream()
                    .mapToDouble(Conteudo::calcularXp)
                    .sum();*/
        }	
    
    


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }


}
