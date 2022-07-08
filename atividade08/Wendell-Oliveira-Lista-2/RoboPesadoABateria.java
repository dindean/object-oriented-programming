public class RoboPesadoABateria extends RoboABateria{
    private long energia;
    private int peso;

    RoboPesadoABateria(String n, int px, int py, short d, long e, int p) {
        super(n, px, py, d, e);
        energia = e;
        peso = p;
    }

    @Override
    public void move(int passos) {
        double energiaASerGasta = passos * peso;
        if (energiaASerGasta <= energia) {
            switch (direcaoAtual()) {
                case 0:
                    moveX(+passos);
                    break;
                case 45:
                    energiaASerGasta = 1.4 * peso * passos;
                    if (energiaASerGasta <= energia) {
                        moveX(+passos);
                        moveY(+passos);
                    }
                    break;
                case 90:
                    moveY(+passos);
                    break;
                case 135:
                    energiaASerGasta = 1.4 * peso * passos;
                    if (energiaASerGasta <= energia) {
                        moveY(+passos);
                        moveX(-passos);
                    }
                    break;
                case 180:
                    moveX(-passos);
                    break;
                case 225:
                    energiaASerGasta = 1.4 * peso * passos;
                    if (energiaASerGasta <= energia) {
                        moveX(-passos);
                        moveY(-passos);
                    }
                    break;
                case 270:
                    moveY(-passos);
                    break;
                case 315:
                    energiaASerGasta = 1.4 * peso * passos;
                    if (energiaASerGasta <= energia) {
                        moveY(-passos);
                        moveX(+passos);
                    }
                    break;
            }
            energia -= energiaASerGasta;
        }
    }

    @Override
    public String toString() {
        return "RoboPesadoABateria{" +
                "energia=" + energia +
                ", peso=" + peso +
                '}';
    }
}
