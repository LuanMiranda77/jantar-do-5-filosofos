package model;

import javax.swing.ImageIcon;

import view.Main;

public class FilososfoComDeadLock extends Thread implements Filosofos{
	private String nome;
	private Garfo garfos;
	private boolean comendo = false;
	private int tempo = 5000;

	public FilososfoComDeadLock(String nome, Garfo garfos) {
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
				if (garfos.direitoDisponivel()) {
						Thread.sleep(tempo);
						conversar();
						Main.pensar1.setIcon(new ImageIcon(Main.class.getResource("/icon/pensar1.png")));
						Main.garfo1.setIcon(new ImageIcon(Main.class.getResource("/icon/null.png")));
						Main.garfo2.setIcon(new ImageIcon(Main.class.getResource("/icon/null.png")));
						Main.garfo3.setIcon(new ImageIcon(Main.class.getResource("/icon/null.png")));
						Main.garfo4.setIcon(new ImageIcon(Main.class.getResource("/icon/null.png")));
						Main.garfo5.setIcon(new ImageIcon(Main.class.getResource("/icon/null.png")));
				} else {
					try {
						//soltarGarfos();
						conversar();
						Main.pensar1.setIcon(new ImageIcon(Main.class.getResource("/icon/pensar1.png")));
						Main.pensar2.setIcon(new ImageIcon(Main.class.getResource("/icon/pensar2.png")));
						Main.pensar3.setIcon(new ImageIcon(Main.class.getResource("/icon/pensar3.png")));
						Main.pensar4.setIcon(new ImageIcon(Main.class.getResource("/icon/pensar4.png")));
						Main.pensar5.setIcon(new ImageIcon(Main.class.getResource("/icon/pensar5.png")));

					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			while (true) {
				try {
					if (garfos.esquerdoDisponivel()) {
						Thread.sleep(tempo);
						conversar();
						Main.pensar1.setIcon(new ImageIcon(Main.class.getResource("/icon/pensar1.png")));
						Main.garfo1.setIcon(new ImageIcon(Main.class.getResource("/icon/null.png")));
						Main.garfo2.setIcon(new ImageIcon(Main.class.getResource("/icon/null.png")));
						Main.garfo3.setIcon(new ImageIcon(Main.class.getResource("/icon/null.png")));
						Main.garfo4.setIcon(new ImageIcon(Main.class.getResource("/icon/null.png")));
						Main.garfo5.setIcon(new ImageIcon(Main.class.getResource("/icon/null.png")));
				} else {
					try {
						//soltarGarfos();
						conversar();
						Main.pensar1.setIcon(new ImageIcon(Main.class.getResource("/icon/pensar1.png")));
						Main.pensar2.setIcon(new ImageIcon(Main.class.getResource("/icon/pensar2.png")));
						Main.pensar3.setIcon(new ImageIcon(Main.class.getResource("/icon/pensar3.png")));
						Main.pensar4.setIcon(new ImageIcon(Main.class.getResource("/icon/pensar4.png")));
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
