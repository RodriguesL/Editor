import java.util.ArrayList;
import java.util.HashSet;

public abstract class GuiApp implements App {
	ArrayList<Componente> componentes = new
			ArrayList<Componente>();
	Componente este;
	public void tecla(String t) {}

	public void tique(HashSet<String> teclas, double dt) {}

	public void desenhar(Tela t) {
		for(Componente c: componentes)
			c.desenhar(t);
	}

	public void movimento(int x, int y) {
		for(Componente c: componentes) {
			if(x >= c.getX1() && x <= c.getX2() && y >= c.getY1() && y <= c.getY2())
				c.movimento(x - c.getX1(), y - c.getY1());
		}
	}

	public void arrasto(int x, int y) {
		//if(x >= este.getX1() && x <= este.getX2() && y >= este.getY1() && y <= este.getY2())
				este.arrasto(x - este.getX1(), y - este.getY1());
			
	}

	public void clique(int x, int y) {
		for(Componente c: componentes) {
			if(x >= c.getX1() && x <= c.getX2() && y >= c.getY1() && y <= c.getY2())
				c.clique(x - c.getX1(), y - c.getY1());
		}
	}

	public void aperto(int x, int y) {
		for(Componente c: componentes) {
			if(x >= c.getX1() && x <= c.getX2() && y >= c.getY1() && y <= c.getY2())
				c.aperto(x - c.getX1(), y - c.getY1());
			este = c;
		}
	}

	public void solta(int x, int y) {
			//if(x >= este.getX1() && x <= este.getX2() && y >= este.getY1() && y <= este.getY2())
				este.solta(x - este.getX1(), y - este.getY1());
		
	}
}
