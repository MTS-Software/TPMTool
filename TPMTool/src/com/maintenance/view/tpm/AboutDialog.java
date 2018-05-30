package com.maintenance.view.tpm;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JTextPane;

public class AboutDialog extends JDialog {

	public AboutDialog(JFrame parent) {
		
		super(parent, true);

		setTitle("About");
		
		setSize(new Dimension(400, 300));
		getContentPane().setLayout(null);

		JLabel lblHeader = new JLabel("TPMTool");
		lblHeader.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblHeader.setBounds(12, 13, 114, 16);
		getContentPane().add(lblHeader);

		JTextPane txtpnMitDiesemProgramm = new JTextPane();
		txtpnMitDiesemProgramm.setEnabled(false);
		txtpnMitDiesemProgramm.setEditable(false);
		txtpnMitDiesemProgramm.setText(
				"Mit diesem Programm k\u00F6nnen anstehende TPM Wartungen\r\nim MaintenanceManager zur\u00FCckgemeldet werden.");
		txtpnMitDiesemProgramm.setBounds(12, 42, 358, 83);
		getContentPane().add(txtpnMitDiesemProgramm);

		JLabel lblProgramer = new JLabel("Programer: Markus Thaler");
		lblProgramer.setBounds(12, 226, 190, 16);
		getContentPane().add(lblProgramer);

		
		setVisible(true);

	}
}
