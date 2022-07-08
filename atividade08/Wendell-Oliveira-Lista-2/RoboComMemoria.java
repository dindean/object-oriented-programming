import java.util.Stack;

public class RoboComMemoria extends RoboAbstrato{
    private Stack<Integer> memoriaX = new Stack<Integer>();
    private Stack<Integer> memoriaY = new Stack<Integer>();

    RoboComMemoria(String n, int px, int py, short d) {
        super(n, px, py, d);
    }

    @Override
    public void move(int passos) {
        switch (direcaoAtual()) {
            case 0:
                moveX(+passos);
                memoriaX.push(-passos);
                break;
            case 45:
                moveX(+passos);
                moveY(+passos);
                memoriaX.push(-passos);
                memoriaY.push(-passos);
                break;
            case 90:
                moveY(+passos);
                memoriaY.push(-passos);
                break;
            case 135:
                moveY(+passos);
                moveX(-passos);
                memoriaY.push(-passos);
                memoriaX.push(+passos);
                break;
            case 180:
                moveX(-passos);
                memoriaX.push(+passos);
                break;
            case 225:
                moveX(-passos);
                moveY(-passos);
                memoriaX.push(+passos);
                memoriaY.push(+passos);
                break;
            case 270:
                moveY(-passos);
                memoriaY.push(+passos);
                break;
            case 315:
                moveY(-passos);
                moveX(+passos);
                memoriaY.push(+passos);
                memoriaX.push(-passos);
                break;
        }
    }

    public void retornaAOrigem () {
        while (!memoriaX.isEmpty())
            moveX(memoriaX.pop());

        while (!memoriaY.isEmpty())
            moveY(memoriaY.pop());
    }

    @Override
    public String toString() {
        return "RoboComMemoria{" +
                "memoriaX=" + memoriaX +
                ", memoriaY=" + memoriaY +
                '}';
    }
}
