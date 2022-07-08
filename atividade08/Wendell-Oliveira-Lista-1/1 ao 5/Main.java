
public class Main {
    public static void main(String[] args) {
        Gato g = new Gato();
        Ramo r = new Ramo();
        String str = "";
        String str2 = "";

        if (g.isVivo()) System.out.println("O Gato esta vivo..");;
        g.mata();
        g.mata();
        g.mata();
        g.mata();
        g.mata();
        g.mata();
        g.mata();
        g.mata();

        System.out.println();
        System.out.println(g.toString());

        System.out.println();
        System.out.println();

        if (r.isVivo()) System.out.println("O Ramo esta intacto..");

        r.mata();

        if (r.isEsquerda()) str = "Intacto";
        if (!r.isEsquerda()) str = "Quebrado";
        if (r.isDireita()) str2 = "Intacto";
        if (!r.isDireita()) str2 = "Quebrado";

        System.out.println("O ramo da esquerda esta " + str);
        System.out.println("O ramo da direita esta " + str2);

        System.out.println();
        System.out.println(r.toString());
    }
}
