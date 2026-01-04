
import javax.swing.*;
import java.awt.*;

public class TelaAluguel extends JFrame {
    public TelaAluguel() {
        setTitle("Programa Aluguel");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Painel principal com BoxLayout na vertical
        JPanel painel = new JPanel();
        painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS));

        // Campo Aluguel
        JLabel Laluguel = new JLabel("Digite o valor do Aluguel:");
        JTextField Taluguel = new JTextField();
        Taluguel.setMaximumSize(new Dimension(200, 30)); // Define largura e altura
        painel.add(Laluguel);
        painel.add(Taluguel);

        // Campo Água
        JLabel Lagua = new JLabel("Digite o valor da Água:");
        JTextField Tagua = new JTextField();
        Tagua.setMaximumSize(new Dimension(200, 30));
        painel.add(Lagua);
        painel.add(Tagua);

        // Campo Luz
        JLabel Lluz = new JLabel("Digite o valor da Luz:");
        JTextField Tluz = new JTextField();
        Tluz.setMaximumSize(new Dimension(200, 30));
        painel.add(Lluz);
        painel.add(Tluz);

        // Campo Quantidade de Moradores
        JLabel Lqtdmoradores = new JLabel("Digite a quantidade de moradores:");
        JTextField Tqtdmoradores = new JTextField();
        Tqtdmoradores.setMaximumSize(new Dimension(200, 30));
        painel.add(Lqtdmoradores);
        painel.add(Tqtdmoradores);

        // Adiciona painel à janela

        add(painel, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        new TelaAluguel();
    }
}
