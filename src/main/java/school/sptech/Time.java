package school.sptech;

public class Time {
    String nome;
    Integer vitorias, empates, derrotas;

    public Time(){
        vitorias = 0;
        empates = 0;
        derrotas = 0;
    }

    public void registrarVitoria(){
        vitorias += 1;
    }

    public void registrarEmpate(){
        empates +=1;
    }

    public void registrarDerrota(){
        derrotas +=1;
    }

    public Integer getPontos(){

       int pontosVitorias = vitorias * 3;


        int pontos = pontosVitorias + empates;
        return pontos;
    }


    public Integer getTotalPartidas(){

        int partidas = vitorias + empates + derrotas;

        return partidas;
    }

    public Integer getAproveitamento(){
        int partidas = 0;
        partidas = vitorias + empates + derrotas;

           Integer aproveitamento = (vitorias * 100/partidas) ;

        return aproveitamento;
    }

    public void compararAproveitamento(Time adversario){
        if(getAproveitamento() > adversario.getAproveitamento()){
            System.out.println("O time" + nome +  "tem um aproveitamento maior que o time" + adversario.nome);
        }else {
            System.out.println("O time" + adversario.nome +  "tem um aproveitamento maior que o time" + nome);
        }
    }

    public void exibirInformacoes(){

        System.out.println("Nome:" + nome + "número de: vitórias:" + vitorias + "Empates" + empates + "Derrotas:"
                + derrotas + "pontos" + "total de partidas" + "aproveitamento");
    }


}

