
public class Botao implements Componente, Toggle {
    int x1, y1, x2, y2;
    String texto;
    int fonte;
    Acao acao;
    Cor corTexto;
    Cor corFundo;
    
    public Botao(int x, int y, int largura, int altura, String texto, int fonte, Cor corTexto, Cor corFundo, Acao acao) {
        this.x1 = x;
        this.y1 = y;
        this.x2 = x + largura;
        this.y2 = y + altura;
        this.texto = texto;
        this.fonte = fonte;
        this.corTexto = corTexto;
        this.corFundo = corFundo;
        this.acao = acao;
    }
    
    public Botao(int x, int y, int largura, int altura, String texto, Acao acao) {
        this(x, y, largura, altura, texto, 16, Cor.BRANCO, Cor.rgbInt(0, 0, 0), acao);
    }
    
    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }

    public void desenhar(Tela t) {
        // Borda
        t.retangulo(x1, y1, x2 - x1, y2 - y1, corTexto);
        // Fundo
        t.retangulo(x1 + 3, y1 + 3, x2 - x1 - 6, y2 - y1 - 6, corFundo);
        // Label
        t.texto(texto, (x1 + x2)/2, (y1 + y2)/2, fonte, 0, corTexto);
    }

    public void clique(int x, int y) {
        acao.executa();
    }

    public void aperto(int x, int y) {
        Cor temp = corFundo;
        corFundo = corTexto;
        corTexto = temp;
    }

    public void solta(int x, int y) {
        Cor temp = corFundo;
        corFundo = corTexto;
        corTexto = temp;
    }

    public void arrasto(int x, int y) {
    }

    public void movimento(int x, int y) {
    }

    public void toggle() {
        Cor temp = corFundo;
        corFundo = corTexto;
        corTexto = temp;
    }
}
