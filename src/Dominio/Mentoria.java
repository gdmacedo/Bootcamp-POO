package Dominio;


import java.time.LocalDate;

public class Mentoria extends Conteudo{
    private LocalDate data;   // LacalDate é uma das classes que podemos trabalhar com data. Ver também LocalDateTime também.
    

    public Mentoria() {
    }
    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }


    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data + '\'' +
                ", coordenador='" + getCoordenador() + 
                '}';
    }   
}
