public class Canvas implements Componente {
    int x1;
    int y1;
    int x2;
    int y2;
    ObservadorCanvas oc;
    Tela tela;
    
    public Canvas(int x, int y, int largura, int altura, ObservadorCanvas oc) {
        this.x1 = x;
        this.y1 = y;
        this.x2 = x + largura;
        this.y2 = y + altura;
        this.oc = oc;
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
        this.tela = t;
        // Borda
        t.retangulo(x1, y1, x2 - x1, y2 - y1, Cor.BRANCO);
        // Fundo
        t.retangulo(x1 + 3, y1 + 3, x2 - x1 - 6, y2 - y1 - 6, Cor.rgbInt(0, 0, 0));
        // Resto
        oc.desenhar(this);
    }

    public void clique(int x, int y) {}

    public void aperto(int x, int y) {
        oc.aperto(x, y);
    }

    public void solta(int x, int y) {
        oc.solta(x, y);
    }

    public void arrasto(int x, int y) {
        oc.arrasto(x, y);
    }

    public void movimento(int x, int y) {
        oc.movimento(x, y);
    }

    public void retangulo(int x, int y, int largura, int altura, double r, double g, double b) {
        tela.retangulo(x1 + x, y1 + y, largura, altura, Cor.rgbDouble(r, g, b));
    }

    public void circulo(int cx, int cy, int raio, double r, double g, double b) {
        tela.circulo(x1 + cx, y1 + cy, raio, Cor.rgbDouble(r, g, b));
    }
}