public class Main {
    public static void main(String[] args) {
        double alea, somaQuadrados;

        alea = Math.random();
        Quadrado novoQuad0 = new Quadrado(alea);

        alea = Math.random();
        Quadrado novoQuad1 = new Quadrado(alea);

        alea = Math.random();
        Quadrado novoQuad2 = new Quadrado(alea);

        alea = Math.random();
        Quadrado novoQuad3 = new Quadrado(alea);

        alea = Math.random();
        Quadrado novoQuad4 = new Quadrado(alea);

        alea = Math.random();
        Quadrado novoQuad5 = new Quadrado(alea);

        alea = Math.random();
        Quadrado novoQuad6 = new Quadrado(alea);

        alea = Math.random();
        Quadrado novoQuad7 = new Quadrado(alea);

        alea = Math.random();
        Quadrado novoQuad8 = new Quadrado(alea);

        alea = Math.random();
        Quadrado novoQuad9 = new Quadrado(alea);

        somaQuadrados = novoQuad0.calcularArea();
        somaQuadrados += novoQuad1.calcularArea();
        somaQuadrados += novoQuad2.calcularArea();
        somaQuadrados += novoQuad3.calcularArea();
        somaQuadrados += novoQuad4.calcularArea();
        somaQuadrados += novoQuad5.calcularArea();
        somaQuadrados += novoQuad6.calcularArea();
        somaQuadrados += novoQuad7.calcularArea();
        somaQuadrados += novoQuad8.calcularArea();
        somaQuadrados += novoQuad9.calcularArea();

        System.out.println("A soma das areas dos 10 quadrados e: " + somaQuadrados);

        
    }
}
