public class Main {
    public static void main(String[] args) {
        Triangulo novoTri = new Triangulo();

        novoTri.areaTriangulo();
        novoTri.mostrarArea();

        novoTri.setBase(8);
        novoTri.setAltura(8);

        novoTri.areaTriangulo();
        novoTri.mostrarArea();

        Triangulo outroTri = new Triangulo(4, 6);

        outroTri.areaTriangulo();
        outroTri.mostrarArea();

        
    }
}
