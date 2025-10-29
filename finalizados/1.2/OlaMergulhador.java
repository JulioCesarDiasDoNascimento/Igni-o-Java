public class OlaMergulhador {

    public static void main(String[] args) {
        System.out.println("Olá mergulhador!");

        String nomeCompleto; // Eu já posso passar valor na declaração
        //Ex: String nomeCompleto = "Julio César";
        nomeCompleto = "Júlio César"; // String literal;

        System.out.println(nomeCompleto);
        // print concatenando
        System.out.println("Nome: " + nomeCompleto);

        int minhaIdade = 22;
        int suaIdade = 25;
        int totalIdades = minhaIdade + suaIdade;
        System.out.println("Total de idades: " + totalIdades);

        double peso = 75.5d; // d é para indicar que é do tipo double, mas já e literal que e double.
        System.out.println("Peso: " + peso);

        float taxa = 1294.93f; // se não colocar o f, ele acha que é um double.
        // Pode usar o _ para separar os números. Exemplo: 1_294.93f
        boolean compraAprovada = false;
        System.out.println(compraAprovada);

        boolean maiorDeIdade = minhaIdade >= 18;
        System.out.println(maiorDeIdade);
    }
}
