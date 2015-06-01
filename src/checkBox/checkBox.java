package checkBox;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

public class checkBox extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					checkBox frame = new checkBox();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public checkBox() {
		setTitle("checkBox");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 362, 197);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblElijeLoQue = new JLabel("Elije lo que te gusta:");
		lblElijeLoQue.setBounds(40, 12, 187, 15);
		contentPane.add(lblElijeLoQue);
		
		JCheckBox chckbxCoches = new JCheckBox("Coches");
		chckbxCoches.setBounds(50, 35, 129, 23);
		contentPane.add(chckbxCoches);
		
		JCheckBox chckbxMotos = new JCheckBox("Motos");
		chckbxMotos.setBounds(50, 69, 129, 23);
		contentPane.add(chckbxMotos);
		
		JCheckBox chckbxBicis = new JCheckBox("Bicis");
		chckbxBicis.setBounds(50, 103, 129, 23);
		contentPane.add(chckbxBicis);
		
		List<JCheckBox> grupo = new ArrayList<JCheckBox>();
		grupo.add(chckbxCoches);
		grupo.add(chckbxMotos);
		grupo.add(chckbxBicis);

		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Entro al boton ok");
				System.out.print("Le gusta los: ");
			    for (JCheckBox checkBox : grupo) {
			        if (checkBox.isSelected()) {
			            System.out.print(" "+checkBox.getText());
			        }
			    }
			}
		});
		btnOk.setBounds(210, 46, 117, 25);
		contentPane.add(btnOk);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("\n Entro al boton Cancelar");
			 for (JCheckBox checkBox : grupo) {
			        if (checkBox.isSelected()) {
			        	checkBox.setSelected(false);
			        }
			    }
			}
		});
		btnCancelar.setBounds(210, 102, 117, 25);
		contentPane.add(btnCancelar);
	}
}
