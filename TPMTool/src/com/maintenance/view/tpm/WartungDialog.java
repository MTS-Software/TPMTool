package com.maintenance.view.tpm;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

import com.maintenance.db.dto.Wartung;
import com.maintenance.db.dto.Wartung.EWartungArt;
import com.maintenance.db.service.Service;
import com.maintenance.view.wartung.EWartungStatus;
import com.toedter.calendar.JDateChooser;

public class WartungDialog extends JDialog {

	private static final long serialVersionUID = 1L;

	private JFrame parent;

	private StationForTPM station;
	private Wartung wartung;

	private JLabel lblDate;
	private JLabel lblMitarbeiter;
	private JLabel lblInfo;

	private JDateChooser dcDate;
	private JTextField tfMitarbeiter;
	private JTextPane tpInfo;

	private JButton btnSave;
	private JButton btnCancel;

	private JPanel panelNorth;
	private JPanel panelCenter;
	private JPanel panelSouth;

	private JLabel lblHeader;

	public WartungDialog(JFrame parent, StationForTPM station) {

		super(parent, true);

		this.parent = parent;
		this.station = station;

		initComponents();
	}

	private void initComponents() {

		setTitle("Wartung");

		getContentPane().setLayout(new BorderLayout());

		panelNorth = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panelNorth.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		getContentPane().add(panelNorth, BorderLayout.NORTH);

		lblHeader = new JLabel(station.getStation().getAnlage().getName() + ": " + station.getStation().getName());
		lblHeader.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelNorth.add(lblHeader);

		// Panel
		panelCenter = new JPanel();
		GridBagLayout gbl_panelCenter = new GridBagLayout();
		gbl_panelCenter.columnWidths = new int[] { 130, 148, 196, 0 };
		gbl_panelCenter.rowHeights = new int[] { 35, 30, 152, 0 };
		gbl_panelCenter.columnWeights = new double[] { 0.0, 1.0, 0.0, Double.MIN_VALUE };
		gbl_panelCenter.rowWeights = new double[] { 0.0, 1.0, 0.0, Double.MIN_VALUE };
		panelCenter.setLayout(gbl_panelCenter);

		// Datum
		lblDate = new JLabel("Datum");
		lblDate.setFont(MainFrame.FONT);
		GridBagConstraints gbc_lblDate = new GridBagConstraints();
		gbc_lblDate.fill = GridBagConstraints.BOTH;
		gbc_lblDate.insets = new Insets(5, 5, 5, 5);
		gbc_lblDate.gridx = 0;
		gbc_lblDate.gridy = 0;
		panelCenter.add(lblDate, gbc_lblDate);

		dcDate = new JDateChooser();
		dcDate.setDate(Calendar.getInstance().getTime());
		dcDate.setFont(MainFrame.FONT);
		GridBagConstraints gbc_dcDate = new GridBagConstraints();
		gbc_dcDate.fill = GridBagConstraints.BOTH;
		gbc_dcDate.insets = new Insets(5, 5, 5, 5);
		gbc_dcDate.gridx = 1;
		gbc_dcDate.gridy = 0;
		panelCenter.add(dcDate, gbc_dcDate);

		// Mitarbeiter
		lblMitarbeiter = new JLabel("Mitarbeiter");
		lblMitarbeiter.setVerticalAlignment(SwingConstants.TOP);
		lblMitarbeiter.setFont(MainFrame.FONT);
		GridBagConstraints gbc_lblMitarbeiter = new GridBagConstraints();
		gbc_lblMitarbeiter.fill = GridBagConstraints.BOTH;
		gbc_lblMitarbeiter.insets = new Insets(5, 5, 5, 5);
		gbc_lblMitarbeiter.gridx = 0;
		gbc_lblMitarbeiter.gridy = 1;
		panelCenter.add(lblMitarbeiter, gbc_lblMitarbeiter);

		tfMitarbeiter = new JTextField();
		tfMitarbeiter.setFont(MainFrame.FONT);
		GridBagConstraints gbc_tpMitarbeiter = new GridBagConstraints();
		gbc_tpMitarbeiter.gridwidth = 2;
		gbc_tpMitarbeiter.fill = GridBagConstraints.BOTH;
		gbc_tpMitarbeiter.insets = new Insets(5, 5, 5, 5);
		gbc_tpMitarbeiter.gridx = 1;
		gbc_tpMitarbeiter.gridy = 1;
		panelCenter.add(tfMitarbeiter, gbc_tpMitarbeiter);

		// Info
		lblInfo = new JLabel("Info");
		lblInfo.setVerticalAlignment(SwingConstants.TOP);
		lblInfo.setFont(MainFrame.FONT);
		GridBagConstraints gbc_lblInfo = new GridBagConstraints();
		gbc_lblInfo.fill = GridBagConstraints.BOTH;
		gbc_lblInfo.insets = new Insets(5, 5, 0, 5);
		gbc_lblInfo.gridx = 0;
		gbc_lblInfo.gridy = 2;
		panelCenter.add(lblInfo, gbc_lblInfo);

		tpInfo = new JTextPane();
		tpInfo.setFont(MainFrame.FONT);
		GridBagConstraints gbc_tpInfo = new GridBagConstraints();
		gbc_tpInfo.gridwidth = 2;
		gbc_tpInfo.insets = new Insets(5, 5, 0, 5);
		gbc_tpInfo.fill = GridBagConstraints.BOTH;
		gbc_tpInfo.gridx = 1;
		gbc_tpInfo.gridy = 2;
		panelCenter.add(tpInfo, gbc_tpInfo);

		getContentPane().add(panelCenter);

		// Panel South
		panelSouth = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panelSouth.getLayout();
		flowLayout_1.setAlignment(FlowLayout.RIGHT);

		btnSave = new JButton("Speichern");
		btnSave.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				save(e);

			}
		});
		panelSouth.add(btnSave);

		btnCancel = new JButton("Abbrechen");
		btnCancel.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();

			}
		});
		panelSouth.add(btnCancel);

		getContentPane().add(panelSouth, BorderLayout.SOUTH);

		pack();

		setLocationRelativeTo(parent);

		setVisible(true);

	}

	protected void save(ActionEvent e) {

		wartung = new Wartung();

		wartung.setStationId(station.getStation().getId());
		wartung.setStation(station.getStation());
		wartung.setDate(dcDate.getDate());

		wartung.setMitarbeiter(tfMitarbeiter.getText());
		wartung.setInfo(tpInfo.getText());

		if (validateFields())
			insert();

	}

	private boolean validateFields() {

		String text = "";

		if (dcDate.getDate() == null)
			text += "Datum eingeben\n";
		if (tfMitarbeiter.getText().length() == 0)
			text += "Mitarbeiter eingeben\n";
		if (tpInfo.getText().length() == 0)
			text += "Info eingeben\n";

		if (!text.isEmpty()) {
			JOptionPane.showMessageDialog(this, text, "Wartung speichern", JOptionPane.INFORMATION_MESSAGE);
			return false;
		} else
			return true;

	}

	private void insert() {

		Service.getInstance().insertWartung(wartung);

		wartung.setStatus(EWartungStatus.DONE.ordinal());

		if (wartung.getStatus() == EWartungStatus.DONE.ordinal()
				|| wartung.getStatus() == EWartungStatus.NOT_POSSIBLE.ordinal()) {

			if (station.getStation().getWartungArt() == EWartungArt.STUECKZAHL.ordinal()) {
				wartung.setProzent(Service.getInstance().calcProzent(station.getStation()));
				station.getStation().setLastWartungStueckzahl(station.getStation().getAnlage().getAktuelleStueck());

			}

			if (station.getStation().getWartungArt() == EWartungArt.TIME_INTERVALL.ordinal()) {
				wartung.setProzent(-1);

			}
			station.getStation().setLastWartungDate(wartung.getDate());
			station.getStation().setMailSent(false);
			Service.getInstance().updateStation(station.getStation());

		} else
			wartung.setProzent(-1);

		Service.getInstance().updateWartung(wartung);

		if (Service.getInstance().isErrorStatus()) {
			JOptionPane.showMessageDialog(this, "Die Wartung konnte nicht gespeichert werden.", "Wartung",
					JOptionPane.ERROR_MESSAGE);
			return;
		} else
			JOptionPane.showMessageDialog(this, "Die Wartung wurde erfolgreich gespeichert.", "Wartung",
					JOptionPane.INFORMATION_MESSAGE);

		dispose();

	}

}
