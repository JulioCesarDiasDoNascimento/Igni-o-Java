public class CalculadoraCortisol {
    // Cortisol é um hormónio do stresse

    public static void main(String[] args) {
        double cortisol = 5.0;

        boolean resultadoNormal = cortisol >= 6.0 && cortisol <= 18.4;
        boolean resultadoAnormal = !resultadoNormal;

        System.out.println("Cortisol: " + cortisol);
//        if(resultadoNormal){
//            System.out.println("Cortisol Normal: " + resultadoNormal);
//        } else {
//            System.out.println("Cortisol Anormal: " + resultadoAnormal);
//        }
        if(cortisol >= 6.0 && cortisol <= 18.4){
            System.out.println("Cortisol Normal");
        } else if(cortisol > 18.4){
            System.out.println("Cortisol Alto");
        }else{
            System.out.println("Cortisol Baixo");
        }

    }
}
