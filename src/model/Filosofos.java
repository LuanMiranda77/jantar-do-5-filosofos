package model;

public interface Filosofos {
	public boolean pegarGarfos();

	public void soltarGarfos();

	public String conversar() throws InterruptedException;

	public String getNome();

	public void setNome(String nome);

	public boolean isComendo();

	public void setComendo(boolean comendo);

}
