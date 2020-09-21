package view;

import javax.swing.JOptionPane;

import controller.Metodos;

public class Main {

	public static void main(String[] args) {

		String so = ("");
		Metodos met = new Metodos();
		so = met.so();
		String nome;
		int PID;
		int Opc = 0;
		while (Opc != 9) {
			Opc = Integer.parseInt(JOptionPane.showInputDialog(
					"\n      Atividade 2 \n 1 . Ver processos \n 2 . Encerrar processo usando PID \n 3 . Encerrar processo usando NOME \n 9 . Sair"));
			switch (Opc) {
			case 1:
				met.processosAtivos(so);
				System.out.println(" ");
				break;
			case 2:
				PID = Integer.parseInt(JOptionPane.showInputDialog("Digite o PID do Processo que deseja encerrar: "));
				met.killProcessPID(so, PID);
				System.out.println(" ");
				break;
			case 3:
				nome = JOptionPane.showInputDialog("Digite o nome do Processo que deseja encerrar: ");
				met.killProcessNome(so, nome);
				System.out.println(" ");
				break;
			case 9:
				System.out.println("Finalizado");
				break;
			default:
				System.out.println("Erro, digite novamente");
			}
		}
	}

}
