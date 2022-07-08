import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.Vector;

public class ContadorDePalavras extends ListaDePalavras{
    private Vector<numPalavras> listaPalavras = new Vector<numPalavras>();
    private String str = "";
    private numPalavras plvAux = new numPalavras();


    @Override
    public void adiciona(String palavras) {
        super.adiciona(palavras);

        StringTokenizer stj = new StringTokenizer(palavras);
        while(stj.hasMoreTokens()) {
            str = stj.nextToken();
            if (listaPalavras.contains(str)) {
                for (int i = 0; i < listaPalavras.size(); i++) {
                    if (listaPalavras.get(i).getPalavra() == str)
                        listaPalavras.get(i).setQtd(1);
                }
            }
            else {
                plvAux.setPalavra(str);
                plvAux.setQtd(1);
                listaPalavras.add(plvAux);
            }
        }

    }

    public Vector<numPalavras> getListaPalavras() {
        return listaPalavras;
    }
}

class numPalavras {
    private String palavra;
    private int qtd;

    public numPalavras () {
        this.palavra = "";
        this.qtd = 0;
    }

    public void setQtd(int qtd) {
        this.qtd += qtd;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public int getQtd() {
        return qtd;
    }

    public String getPalavra() {
        return palavra;
    }
}
