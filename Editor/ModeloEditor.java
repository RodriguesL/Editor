import java.util.ArrayList;
import java.util.Stack;

public class ModeloEditor {
    ArrayList<Figura> figuras = new ArrayList<Figura>();
    Stack<Comando> feitos = new Stack<Comando>();
    Stack<Comando> desfeitos = new Stack<Comando>();
    Estado estado;
    
    Toggle tmover;
    Toggle tescala;
    Toggle tret;
    Toggle tcirc;
    
    public ModeloEditor(Toggle tmover) {
    	this.tmover = tmover;
    	tmover.toggle();
        estado = new EstadoMover(this, tmover);
    }
    
    public void mover() {
        estado.sair();
        tmover.toggle();
        estado = new EstadoMover(this, tmover);
    }
    
    public void redim() {
        estado.sair();
        tescala.toggle();
        estado = new EstadoEscala(this, tescala);
    }
    
    public void retangulo() {
        estado.sair();
        tret.toggle();
        estado = new EstadoRetangulo(this, tret);
    }
    
    public void circulo() {
        estado.sair();
        tcirc.toggle();
        estado = new EstadoCirculo(this, tcirc);
    }
    
    public void selecionar(int x, int y) {
        estado.selecionar(x, y);
    }
    
    public void parcial(int x, int y) {
        estado.parcial(x, y);
    }
    
    public void terminar(int x, int y) {
        estado.terminar(x, y);
    }
    
    public void desenhar(Canvas c) {
        for(Figura figura: figuras) {
            figura.desenhar(c);
        }
        estado.desenhar(c);
    }
    
    public void mudaEstado(Estado estado) {
        this.estado = estado;
    }
    
    public Figura figura(int x, int y) {
        for(int i = figuras.size() - 1; i >= 0; i--) {
            if(figuras.get(i).dentro(x, y))
                return figuras.get(i);
        }
        return null;
    }
    
    public void desfazer() {
        if(!feitos.isEmpty()) {
            Comando ultimo = feitos.pop();
            ultimo.desfazer(this);
            desfeitos.push(ultimo);
        }
    }
    
    public void refazer() {
        if(!desfeitos.isEmpty()) {
            Comando ultimo = desfeitos.pop();
            ultimo.refazer(this);
            feitos.push(ultimo);
        }
    }
    
    public void feito(Comando c) {
        feitos.push(c);
    }
}
