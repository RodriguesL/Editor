public class TesteApp implements App {
    public String getTitulo() { return "TESTE"; }
    public int getAltura() { return 600; }
    public int getLargura() { return 800; }
    public void desenhar(Tela t) {
    	t.texto("TESTE", 400, 100, 24, -1, Cor.BRANCO);
    	t.texto("TESTE", 400, 200, 24, 0, Cor.BRANCO);
    	t.texto("TESTE", 400, 300, 24, 1, Cor.BRANCO);
    }
    public void tique(java.util.HashSet<String> ts, double dt) {}
    public void tecla(String t) {}
    public void movimento(int x, int y) {
        System.out.println("MOV: " + x + "," + y);
    }
    public void arrasto(int x, int y) {
        System.out.println("DRG: " + x + "," + y);
    }
    public void clique(int x, int y) {
        System.out.println("CLK: " + x + "," + y);
    }
    public void aperto(int x, int y) {
        System.out.println("PRS: " + x + "," + y);
    }
    public void solta(int x, int y) {
        System.out.println("RLS: " + x + "," + y);
    }
    public static void main(String[] args) {
    	new Motor(new TesteApp());
    }
}