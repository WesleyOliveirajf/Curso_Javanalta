package java_curso_poo;

public class PlantaCasa {
    // Atributos
    int metragem;
    int numeroQuartos;
    int numeroBanheiro;
    String cor;
    String material;

    public void construir(){
        System.out.println("A casa foi construida e as carateristicas sao: ");
        System.out.println("metragem: " + metragem);
        System.out.println("Numero de Quartos: " + numeroQuartos);
        System.out.println("Numero de Banheiros: " + numeroBanheiro);
        System.out.println("Materia : " + material);
    }

    public void pintar (){
        System.out.println("A casa foi pintada na Cor:" + cor);
    }






}