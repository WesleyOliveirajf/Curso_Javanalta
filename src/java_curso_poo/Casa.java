package java_curso_poo;

public class Casa {
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


    }

}