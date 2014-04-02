import java.util.HashMap;

/**
 * Cores em RGB
 */
public class Cor
{
    public int r;
    public int g;
    public int b;
    
    private static HashMap<Integer, Cor> cores = 
        new HashMap<Integer, Cor>();
    
    // Variáveis globais
    static Cor BRANCO = new Cor("branco");
    static Cor AZUL = new Cor("azul");
    static Cor VERMELHO = new Cor("vermelho");
    static Cor VERDE = new Cor("verde");
    
    /*
     * Cria uma cor dados os componentes entre 0 e 255
     */
    private Cor(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }
   
    /*
     * Cria uma cor dado seu nome
     */
    private Cor(String cor) {
        if(cor.equals("branco")) {
            this.r = 255;
            this.g = 255;
            this.b = 255;
        } else if(cor.equals("azul")) {
            this.b = 255;
        } else if(cor.equals("vermelho")) {
            this.r = 255;
        } else if(cor.equals("verde")) {
            this.g = 255;
        }
    }
    
    /* Cria uma cor dados os componentes */
    public static Cor rgbInt(int r, int g, int b) {
        int rgb = (r << 16) | (g << 8) | b;
        if(!cores.containsKey(rgb)) {
            cores.put(rgb, new Cor(r, g, b));
        }           
        return cores.get(rgb);
    }
    
    /*
     * Cria uma cor dados os componentes entre 0 e 1
     */
    public static Cor rgbDouble(double r, double g, double b) {
        return rgbInt((int)(r*255), (int)(g*255), (int)(b*255));
    }

}
