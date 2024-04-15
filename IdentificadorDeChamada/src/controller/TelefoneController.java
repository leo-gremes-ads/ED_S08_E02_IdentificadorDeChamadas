package controller;

import lib.model.Fila;

public class TelefoneController
{
	public TelefoneController()
	{
		super();
	}

	public void insereLigacao(Fila<String> f, String numero)
	{
		f.insert(numero);
	}

	public void consultaLigacoes(Fila<String> f)
	{
		try {
			while (!f.isEmpty())
				System.out.println(f.remove());
		} catch (Exception e) {
			System.out.println("Não há ligações!");
		}
	}
}