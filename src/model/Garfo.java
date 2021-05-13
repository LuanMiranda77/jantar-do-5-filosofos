package model;

import java.util.Random;

import view.Main;

public class Garfo extends Thread {
	private int dir;
	private int esq;

	public Garfo(int dir, int esq) {
		this.dir = dir;
		this.esq = esq;
	}

	public int getDir() {
		return dir;
	}

	public void setDir(int dir) {
		this.dir = dir;
	}

	public int getEsq() {
		return esq;
	}

	public void setEsq(int esq) {
		this.esq = esq;
	}

	public void down() {
		Main.semaforo[dir-1] = 0;
		Main.semaforo[esq-1] = 0;

	}

	public void up() {
		Main.semaforo[dir-1] = 1;
		Main.semaforo[esq-1] = 1;
	}

	public boolean isDisponivel() {
		if (Main.semaforo[dir-1] == 1 && Main.semaforo[esq-1] == 1) {
			return true;
		} else {
			return false;
		}

	}
	public boolean direitoDisponivel() {
		if (Main.semaforo[dir-1] == 1) {
			Main.semaforo[dir-1] = 0;
			return true;
		} else {
			return false;
		}

	}
	public boolean esquerdoDisponivel() {
		if (Main.semaforo[esq-1] == 1) {
			Main.semaforo[esq-1] = 0;

			return true;
		} else {
			return false;
		}

	}
	@Override
	public void run() {
		while (true) {
			try {
				testGrafoDir();
				testGrafoEsq();
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void testGrafoDir() {
		int di;
		Random d = new Random();
		di = d.nextInt(5);
	}

	public void testGrafoEsq() {
		int es;
		Random d = new Random();
		es = d.nextInt(5);
	}

}
