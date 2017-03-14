import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Comprobacion extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Create the dialog.
	 */
	public Comprobacion(String usuario){
		
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JButton buttonContinuar = new JButton("Continuar");
			buttonContinuar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					abrirAcciones();
				}
			});
			buttonContinuar.setFont(new Font("Tahoma", Font.BOLD, 11));
			buttonContinuar.setBounds(156, 146, 89, 23);
			contentPanel.add(buttonContinuar);
		}
		{
			JLabel labelOngiEtorri = new JLabel("Ongi etorri : ");
			labelOngiEtorri.setBounds(105, 86, 177, 14);
			contentPanel.add(labelOngiEtorri);
		}
	}

	protected void abrirAcciones() {
		// TODO Auto-generated method stub
		Acciones acciones = new Acciones();
		acciones.setVisible(true);
		this.dispose();
	}

}
