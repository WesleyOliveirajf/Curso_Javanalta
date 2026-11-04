package java_curso_poo;

public class PlantaCasa {
    // Atributos
    public int  metragem;
    public int numeroQuartos;
    public int numeroBanheiro;
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

    public int somarMetragem (){
        return  metragem * numeroBanheiro + numeroQuartos;

    }




    public static void main(String[] args) {
        // Criando o Objeto
        PlantaCasa casa = new PlantaCasa();

        casa.numeroBanheiro = 2;
        casa.numeroQuartos = 3 ;
        casa.metragem = 70;
        casa.material = "Tijolo";
        casa.cor = "Cinza";

        casa.construir();

        casa.pintar();

        int resultado = casa.somarMetragem();
        System.out.println("A metragem e: " + resultado + " metros" );


    }








}