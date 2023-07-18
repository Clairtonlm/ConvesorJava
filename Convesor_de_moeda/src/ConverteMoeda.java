
import javax.swing.*;
public class ConverteMoeda {
	
	public static void main(String[] args) {
		String moeda;
		moeda= JOptionPane.showInputDialog("Escolha a opção de moeda desejada: "
				+ "\n1 - Euro;"
				+ "\n2 - Dolar;"
				+ "\n3 - Peso Argentino");
		
		int opcao;
		opcao = Integer.parseInt(moeda);
		
		if(opcao == 1) {
			String valor;
			valor = JOptionPane.showInputDialog("Digite o valor em reais que deseja converter:");
			double valorReal = Double.parseDouble(valor);
			final double euro = 3.298;
			double valorConvertido = valorReal / euro;
			String msg;
			msg = "O valor em Euro é : " +valorConvertido;
			JOptionPane.showMessageDialog(null, msg);
		}
		if(opcao == 2) {
			String valor;
			valor = JOptionPane.showInputDialog("Digite o valor em reais que deseja converter:");
			double valorReal = Double.parseDouble(valor);
			final double dolar = 3.093;
			double valorConvertido = valorReal / dolar;
			String msg;
			msg = "O valor em Dolar é : " + valorConvertido;
			JOptionPane.showMessageDialog(null, msg);
		}
		if(opcao == 3) {
			String valor;
			valor = JOptionPane.showInputDialog("Digite o valor em reais que deseja converter:");
			double valorReal = Double.parseDouble(valor);
			final double peso = 0.199;
			double valorConvertido = valorReal / peso;
			String msg;
			msg = "O valor em Peso Argentino é : " +valorConvertido;
			JOptionPane.showMessageDialog(null, msg);
		}
		
	}//fim main
}//fim da classe
