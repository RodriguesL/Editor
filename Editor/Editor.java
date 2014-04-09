public class Editor extends GuiApp {
	ModeloEditor modelo;
			
	public Editor() {
	    Botao bmover = new Botao(30, 30, 100, 30, "Mover", new Acao(){
	        public void executa() {
	            modelo.mover();
	        }
	    });
	    modelo = new ModeloEditor(bmover);
	    componentes.add(bmover);
	    Botao bescala = new Botao(30, 80, 100, 30, "Escala",  new Acao(){
	        public void executa() {
	            modelo.redim();
	        }
	    });
	    modelo.tescala = bescala;
	    componentes.add(bescala);
	    Botao bret = new Botao(30, 140, 100, 30, "Retângulo",  new Acao(){
	        public void executa() {
	            modelo.retangulo();
	        }
	    });
	    modelo.tret = bret;
	    componentes.add(bret);
	    Botao bcirc = new Botao(30, 190, 100, 30, "Círculo",  new Acao(){
	        public void executa() {
	            modelo.circulo();
	        }
	    });
	    modelo.tcirc = bcirc;
	    componentes.add(bcirc);
	    componentes.add(new Botao(30, 250, 100, 30, "Desfazer",  new Acao(){
	        public void executa() {
	           modelo.desfazer();
	        }
	    }));
	    componentes.add(new Botao(30, 300, 100, 30, "Refazer",  new Acao(){
	        public void executa() {
	           modelo.refazer();
	        }
	    }));
	    componentes.add(new Botao(30, 350, 100, 30, "Apagar",  new Acao(){
	        public void executa() {
	           modelo.apagar();
	        }
	    }));
	    componentes.add(new Canvas(160, 0, 800 - 160, 600, new ObservadorCanvas() {
	        public void desenhar(Canvas c) {
	            modelo.desenhar(c);
	        }
	        public void movimento(int x, int y) {}
	        public void arrasto(int x, int y) {
	            modelo.parcial(x, y);
	        }
	        public void aperto(int x, int y) {
	            modelo.selecionar(x, y);
	        }
	        public void solta(int x, int y) {
	            modelo.terminar(x, y);
	        }
	    }));
	}
	
	public String getTitulo() {
		return "Editor";
	}

	public int getLargura() {
		return 1024;
	}

	public int getAltura() {
		return 768;
	}

	public static void main(String[] args) {
		new Motor(new Editor());
	}
}
