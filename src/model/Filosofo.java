package model;

import javax.swing.ImageIcon;

import view.Main;

public class Filosofo extends Thread implements Filosofos{
	private String nome;
	private Garfo garfos;
	private boolean comendo = false;
	private int tempo = 5000;

	public Filosofo(String nome, Garfo garfos) {
		this.nome = nome;
		this.garfos = garfos;
	}

	public boolean pegarGarfos() {
		if (garfos.isDisponivel()) {
			garfos.down();
			Main.processo.setText(nome + " comendo...");
			System.out.println(nome + " comendo!");
			return true;
		}
		return false;
	}

	public void soltarGarfos() {
		garfos.up();
		setComendo(false);
		Main.processo.setText(nome + " deixou de comer!");
		System.out.println(nome + " deixou de comer!");
	}

	public String conversar() throws InterruptedException {
		Main.processo.setText(nome + " Pensando ! ! !");
		System.out.println(nome + " Pensando ! ! !");
		Thread.sleep(tempo);
		return "Pensando ! ! !";
	}

	@Override
	public void run() {

		while (true) {
			try {
				if (garfos.getDir() == 1 && garfos.getEsq() == 2) {
					if (pegarGarfos()) {
						Main.pensar1.setIcon(null);
						Main.garfo1.setIcon(new ImageIcon(Main.class.getResource("/icon/null.png")));
						Main.garfo2.setIcon(new ImageIcon(Main.class.getResource("/icon/null.png")));
						Main.prato1.setIcon(new ImageIcon(Main.class.getResource("/icon/comida-2.png")));
						Main.prato3.setIcon(new ImageIcon(Main.class.getResource("/icon/comida-1.png")));
						Main.prato2.setIcon(new ImageIcon(Main.class.getResource("/icon/comida-1.png")));
						setComendo(true);
						Main.p1++;
						Main.comer1.setText(""+Main.p1 );
						Thread.sleep(tempo);
						soltarGarfos();
						Main.garfo1.setIcon(new ImageIcon(Main.class.getResource("/icon/grafo1.png")));
						Main.garfo2.setIcon(new ImageIcon(Main.class.getResource("/icon/garfo2.png")));
						conversar();
						Main.pensar1.setIcon(new ImageIcon(Main.class.getResource("/icon/pensar1.png")));
					}
				} else {
					try {
						conversar();
						Main.pensar1.setIcon(new ImageIcon(Main.class.getResource("/icon/pensar1.png")));
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				if (garfos.getDir() == 2 && garfos.getEsq() == 3) {
					if (pegarGarfos()) {
						Main.pensar2.setIcon(null);
						Main.garfo2.setIcon(new ImageIcon(Main.class.getResource("/icon/null.png")));
						Main.garfo3.setIcon(new ImageIcon(Main.class.getResource("/icon/null.png")));
						Main.prato2.setIcon(new ImageIcon(Main.class.getResource("/icon/comida-2.png")));
						Main.prato4.setIcon(new ImageIcon(Main.class.getResource("/icon/comida-1.png")));
						Main.prato3.setIcon(new ImageIcon(Main.class.getResource("/icon/comida-1.png")));
						setComendo(true);
						Main.p2++;
						Main.comer2.setText(""+Main.p2);
						Thread.sleep(tempo);
						soltarGarfos();
						Main.garfo2.setIcon(new ImageIcon(Main.class.getResource("/icon/garfo2.png")));
						Main.garfo3.setIcon(new ImageIcon(Main.class.getResource("/icon/garfo3.png")));
						conversar();
						Main.pensar2.setIcon(new ImageIcon(Main.class.getResource("/icon/pensar2.png")));
					}
				} else {
					try {
						conversar();
						Main.pensar2.setIcon(new ImageIcon(Main.class.getResource("/icon/pensar2.png")));
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				if (garfos.getDir() == 3 && garfos.getEsq() == 4) {
					if (pegarGarfos()) {
						Main.pensar3.setIcon(null);
						Main.garfo3.setIcon(new ImageIcon(Main.class.getResource("/icon/null.png")));
						Main.garfo4.setIcon(new ImageIcon(Main.class.getResource("/icon/null.png")));
						Main.prato3.setIcon(new ImageIcon(Main.class.getResource("/icon/comida-2.png")));
						Main.prato5.setIcon(new ImageIcon(Main.class.getResource("/icon/comida-1.png")));
						Main.prato4.setIcon(new ImageIcon(Main.class.getResource("/icon/comida-1.png")));
						setComendo(true);
						Main.p3++;
						Main.comer3.setText(""+Main.p3);
						Thread.sleep(tempo);
						soltarGarfos();
						Main.garfo3.setIcon(new ImageIcon(Main.class.getResource("/icon/garfo3.png")));
						Main.garfo4.setIcon(new ImageIcon(Main.class.getResource("/icon/grafo4.png")));
						conversar();
						Main.pensar3.setIcon(new ImageIcon(Main.class.getResource("/icon/pensar3.png")));
					}
				} else {
					try {
						conversar();
						Main.pensar3.setIcon(new ImageIcon(Main.class.getResource("/icon/pensar3.png")));
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				if (garfos.getDir() == 4 && garfos.getEsq() == 5) {
					if (pegarGarfos()) {
						Main.pensar4.setIcon(null);
						Main.garfo4.setIcon(new ImageIcon(Main.class.getResource("/icon/null.png")));
						Main.garfo5.setIcon(new ImageIcon(Main.class.getResource("/icon/null.png")));
						Main.prato4.setIcon(new ImageIcon(Main.class.getResource("/icon/comida-2.png")));
						Main.prato1.setIcon(new ImageIcon(Main.class.getResource("/icon/comida-1.png")));
						Main.prato5.setIcon(new ImageIcon(Main.class.getResource("/icon/comida-1.png")));
						setComendo(true);
						Main.p4++;
						Main.comer4.setText(""+Main.p4);
						Thread.sleep(tempo);
						soltarGarfos();
						Main.garfo4.setIcon(new ImageIcon(Main.class.getResource("/icon/grafo4.png")));
						Main.garfo5.setIcon(new ImageIcon(Main.class.getResource("/icon/grafo5.png")));
						conversar();
						Main.pensar4.setIcon(new ImageIcon(Main.class.getResource("/icon/pensar4.png")));
					}
				} else {
					try {
						conversar();
						Main.pensar4.setIcon(new ImageIcon(Main.class.getResource("/icon/pensar4.png")));
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				if (garfos.getDir() == 5 && garfos.getEsq() == 1) {
					if (pegarGarfos()) {
						Main.pensar5.setIcon(null);
						Main.garfo5.setIcon(new ImageIcon(Main.class.getResource("/icon/null.png")));
						Main.garfo1.setIcon(new ImageIcon(Main.class.getResource("/icon/null.png")));
						Main.prato5.setIcon(new ImageIcon(Main.class.getResource("/icon/comida-2.png")));
						Main.prato2.setIcon(new ImageIcon(Main.class.getResource("/icon/comida-1.png")));
						Main.prato1.setIcon(new ImageIcon(Main.class.getResource("/icon/comida-1.png")));
						setComendo(true);
						Main.p5++;
						Main.comer5.setText(""+Main.p5);
						Thread.sleep(tempo);
						soltarGarfos();
						Main.garfo5.setIcon(new ImageIcon(Main.class.getResource("/icon/grafo5.png")));
						Main.garfo1.setIcon(new ImageIcon(Main.class.getResource("/icon/grafo1.png")));
						conversar();
						Main.pensar5.setIcon(new ImageIcon(Main.class.getResource("/icon/pensar5.png")));
					}
				} else {
					try {
						conversar();
						Main.pensar5.setIcon(new ImageIcon(Main.class.getResource("/icon/pensar5.png")));
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isComendo() {
		return comendo;
	}

	public void setComendo(boolean comendo) {
		this.comendo = comendo;
	}

}
