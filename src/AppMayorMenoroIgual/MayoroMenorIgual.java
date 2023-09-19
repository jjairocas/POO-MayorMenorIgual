package AppMayorMenoroIgual;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MayoroMenorIgual extends JFrame {
    private JTextField txtValorA;
    private JTextField txtValorB;
    private JPanel MainPanel;
    private JLabel lbResultado;
    private JButton btnresultado;
    private JButton btnborrar;
    private JButton btnsalir;
    private JTextField textField2;

    public MayoroMenorIgual() {
        setContentPane(MainPanel);
        setTitle("Resultados Numero Mayor Menor Igual");
        setSize(400, 200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);


        btnresultado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int ValorA=0,ValorB=0;
                String Resultado;

                try{
                    ValorA=Integer.parseInt(txtValorA.getText());
                }
                catch (NumberFormatException exception){
                    JOptionPane.showMessageDialog(null,
                            "DEBES INGRESAR EL VALOR NUMERICO DEL VALOR DE A",
                            "INGRESA SOLO NUMEROS",
                            JOptionPane.WARNING_MESSAGE);
                }

                try{
                    ValorB=Integer.parseInt((txtValorB.getText()));
                }
                catch (NumberFormatException exception){
                    JOptionPane.showMessageDialog(null,
                            "DEBES INGRESAR EL VALOR NUMERICO DEL VALOR DE B",
                            "INGRESA SOLO NUMEROS",
                            JOptionPane.WARNING_MESSAGE);

                }

                if((ValorA == 0) ||(ValorB ==0)){
                    txtValorA.setText("");
                    txtValorB.setText("");
                    lbResultado.setText("");
                }
                else{
                    Comparador Compara=new Comparador(ValorA,ValorB);
                    Resultado=Compara.Comparador();
                    lbResultado.setText(Resultado);

                    JOptionPane.showMessageDialog(null,
                            Resultado,
                            "SALARIO BASICO",
                            JOptionPane.INFORMATION_MESSAGE);
                }

            }
        });
        btnborrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtValorA.setText("");
                txtValorB.setText("");
                lbResultado.setText("");

            }
        });
        btnsalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);

            }
        });
    }

}
