import java.util.Stack;

public class RoboQueDeveVoltar extends RoboAbstrato {
    private long energia, energiaDeVolta = 0;
    private short destinoX = 0, destinoY = 0, origemX, origemY;
    private Stack<Integer> memoriaX = new Stack<Integer>();
    private Stack<Integer> memoriaY = new Stack<Integer>();

    RoboQueDeveVoltar(String n, int px, int py, short d, long e) {
        super(n, px, py, d);
        energia = e;
        this.origemX = (short) px;
        this.origemY = (short) py;
    }


    public void move(int passos) {
        long energiaASerGasta = passos * 10;
        if (energiaASerGasta <= energia) {
            switch (direcaoAtual()) {
                case 0:
                    if (energiaDeVolta + energiaASerGasta <= energia){
                        moveX(+passos);
                        memoriaX.push(-passos);
                    }
                    break;
                case 45:
                    energiaASerGasta = 14 * passos;
                    if (energiaDeVolta + energiaASerGasta <= energia){
                        if (energiaASerGasta <= energia) {
                            moveX(+passos);
                            moveY(+passos);
                            memoriaX.push(-passos);
                            memoriaY.push(-passos);
                        }
                    }
                    break;
                case 90:
                    if (energiaDeVolta + energiaASerGasta <= energia){
                        moveY(+passos);
                        memoriaY.push(-passos);
                    }
                    break;
                case 135:
                    energiaASerGasta = 14 * passos;
                    if (energiaDeVolta + energiaASerGasta <= energia){
                        if (energiaASerGasta <= energia) {
                            moveY(+passos);
                            moveX(-passos);
                            memoriaY.push(-passos);
                            memoriaX.push(+passos);
                        }
                    }
                    break;
                case 180:
                    if (energiaDeVolta + energiaASerGasta <= energia){
                        moveX(-passos);
                        memoriaX.push(+passos);
                    }
                    break;
                case 225:
                    energiaASerGasta = 14 * passos;
                    if (energiaDeVolta + energiaASerGasta <= energia){
                        if (energiaASerGasta <= energia) {
                            moveX(-passos);
                            moveY(-passos);
                            memoriaX.push(+passos);
                            memoriaY.push(+passos);
                        }
                    }
                    break;
                case 270:
                    if (energiaDeVolta + energiaASerGasta <= energia){
                        moveY(-passos);
                        memoriaY.push(+passos);
                    }
                    break;
                case 315:
                    energiaASerGasta = 14 * passos;
                    if (energiaDeVolta + energiaASerGasta <= energia){
                        if (energiaASerGasta <= energia) {
                            moveY(-passos);
                            moveX(+passos);
                            memoriaY.push(+passos);
                            memoriaX.push(-passos);
                        }
                    }
                    break;
            }
            this.energiaDeVolta += energiaASerGasta;
            energia -= energiaASerGasta;
        }
    }

    public void retornaAOrigemCustoso () {
        while (!memoriaX.isEmpty())
            moveX(memoriaX.pop());

        while (!memoriaY.isEmpty())
            moveY(memoriaY.pop());
    }

    public void retornaAOrigemEficiente () {
        while (!memoriaX.isEmpty())
            destinoX += memoriaX.pop();

        while (!memoriaY.isEmpty())
            destinoY += memoriaY.pop();

        moveX(origemX - destinoX);
        moveY(origemY - destinoY);

    }

    @Override
    public String toString() {
        return "RoboQueDeveVoltar{" +
                "energia=" + energia +
                ", energiaDeVolta=" + energiaDeVolta +
                ", destinoX=" + destinoX +
                ", destinoY=" + destinoY +
                ", origemX=" + origemX +
                ", origemY=" + origemY +
                ", memoriaX=" + memoriaX +
                ", memoriaY=" + memoriaY +
                '}';
    }

    public void recarrega (double carga) {
        this.energia += carga;
    }
}
