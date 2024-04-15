package view;

import lib.model.Fila;
import controller.TelefoneController;
import javax.swing.JOptionPane;

public class Principal
{
	public static void main(String[] args)
	{
		Fila<String> chamados = new Fila<>();
		TelefoneController tel = new TelefoneController();
		int opt;

		while (true) {
			opt = menu();
			if (opt == 0) {
				String num = JOptionPane.showInputDialog("Insira o número de telefone:");
				tel.insereLigacao(chamados, num);
			} else if (opt == 1)
				tel.consultaLigacoes(chamados);
			else
				break;
		}
		JOptionPane.showMessageDialog(null, "Aplicação encerrada!");
	}

	private static int menu()
	{
		String[] opts = {"Insere Ligação", "Consulta Ligações", "Sair"};
		return JOptionPane.showOptionDialog(
			null, "Selecione a opção desejada", "Identificador de Chamados",
			JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
			null, opts, opts[2]);
	}
}