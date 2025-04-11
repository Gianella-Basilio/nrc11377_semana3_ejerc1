package caso1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class V1 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField txtN1;
	private JTextField txtN2;
	private JTextField txtN3;
	private JButton btnS2E;
	private JButton btnS3E;
	private JButton btnS2R;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					V1 frame = new V1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public V1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 303, 422);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("Primer número:");
			lblNewLabel.setBounds(26, 28, 90, 14);
			contentPane.add(lblNewLabel);
		}
		{
			lblNewLabel_1 = new JLabel("Segundo número:");
			lblNewLabel_1.setBounds(26, 65, 90, 14);
			contentPane.add(lblNewLabel_1);
		}
		{
			lblNewLabel_2 = new JLabel("Tercer número (opcional):");
			lblNewLabel_2.setBounds(26, 101, 138, 14);
			contentPane.add(lblNewLabel_2);
		}
		{
			txtN1 = new JTextField();
			txtN1.setBounds(175, 25, 86, 20);
			contentPane.add(txtN1);
			txtN1.setColumns(10);
		}
		{
			txtN2 = new JTextField();
			txtN2.setBounds(175, 62, 86, 20);
			contentPane.add(txtN2);
			txtN2.setColumns(10);
		}
		{
			txtN3 = new JTextField();
			txtN3.setBounds(174, 98, 86, 20);
			contentPane.add(txtN3);
			txtN3.setColumns(10);
		}
		{
			btnS2E = new JButton("Sumar dos enteros");
			btnS2E.addActionListener(this);
			btnS2E.setBounds(26, 145, 235, 23);
			contentPane.add(btnS2E);
		}
		{
			btnS3E = new JButton("Sumar tres enteros");
			btnS3E.addActionListener(this);
			btnS3E.setBounds(26, 179, 235, 23);
			contentPane.add(btnS3E);
		}
		{
			btnS2R = new JButton("Sumar dos reales");
			btnS2R.addActionListener(this);
			btnS2R.setBounds(26, 213, 235, 23);
			contentPane.add(btnS2R);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(26, 258, 235, 98);
			contentPane.add(scrollPane);
			{
				txtS = new JTextArea();
				scrollPane.setViewportView(txtS);
			}
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnS2R) {
			do_btnS2R_actionPerformed(e);
		}
		if (e.getSource() == btnS3E) {
			do_btnS3E_actionPerformed(e);
		}
		if (e.getSource() == btnS2E) {
			do_btnS2E_actionPerformed(e);
		}
	}
	protected void do_btnS2E_actionPerformed(ActionEvent e) {
		try {
			int n1 = Integer.parseInt(txtN1.getText());
			int n2 = Integer.parseInt(txtN2.getText());
			Calculadora c = new Calculadora(n1, n2);
			txtS.setText("");
			txtS.append("La suma es: "+c.Sumar(n1, n2));
		}catch(Exception e1){
			JOptionPane.showMessageDialog(null, "Ingrese números enteros.");
		}
	}
	protected void do_btnS3E_actionPerformed(ActionEvent e) {
		try {
			int n1 = Integer.parseInt(txtN1.getText());
			int n2 = Integer.parseInt(txtN2.getText());
			int n3 = Integer.parseInt(txtN3.getText());
			Calculadora c = new Calculadora(n1, n2, n3);
			txtS.setText("");
			txtS.append("La suma es: "+c.Sumar(n1, n2, n3));
		}catch (Exception e1) {
			JOptionPane.showMessageDialog(null, "Ingrese números enteros.");
		}
	}
	protected void do_btnS2R_actionPerformed(ActionEvent e) {
		try {
			double num1 = Double.parseDouble(txtN1.getText());
			double num2 = Double.parseDouble(txtN2.getText());
			Calculadora c = new Calculadora(num1, num2);
			txtS.setText("");
			txtS.append("La suma es: "+c.Sumar(num1, num2));
		}catch (Exception e1) {
			JOptionPane.showMessageDialog(null, "Ingrese números reales.");
		}
	}
}
