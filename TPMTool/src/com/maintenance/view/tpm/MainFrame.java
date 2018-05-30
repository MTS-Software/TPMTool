package com.maintenance.view.tpm;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import com.maintenance.db.dto.Anlage;
import com.maintenance.db.dto.Station;
import com.maintenance.db.dto.Wartung.EWartungArt;
import com.maintenance.db.service.Service;
import com.maintenance.util.ProzentCalc;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	public static final Font FONT = new Font("Arial", Font.PLAIN, 16);

	private List<StationForTPM> stationenForTPM;

	private JList<StationForTPM> listStationen;
	private StationListModel listModel;

	private JMenuBar menuBar;

	public MainFrame() {

		this.setSize(new Dimension(600, 400));
		this.setTitle("TPMTool");
		this.setLayout(new BorderLayout());

		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		menuBar = new JMenuBar();

		JMenu dataMenu = new JMenu("Datei");
		//menuBar.add(dataMenu);

		JMenu infoMenu = new JMenu("Info");
		menuBar.add(infoMenu);

		JMenuItem aboutSubMenu = new JMenuItem("About");

		aboutSubMenu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new AboutDialog(MainFrame.this);

			}
		});
		infoMenu.add(aboutSubMenu);

		this.setJMenuBar(menuBar);

		listStationen = new JList<>();
		listStationen.setFont(FONT);
		listStationen.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent evt) {

				if (evt.getClickCount() == 2) {

					JList list = (JList) evt.getSource();

					StationForTPM selectedItem = (StationForTPM) list.getSelectedValue();
					System.out.println(selectedItem);

					new WartungDialog(MainFrame.this, selectedItem);
					initListModel();
				}

			}
		});
		listStationen.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {

				if (e.getKeyCode() == KeyEvent.VK_F5) {
					initListModel();
					System.out.println(e);
				}

				super.keyPressed(e);
			}

		});

		this.getContentPane().add(listStationen, BorderLayout.CENTER);

		this.setVisible(true);

		initListModel();
	}

	private void initListModel() {

		listModel = new StationListModel();
		stationenForTPM = new ArrayList<>();

		for (Station station : getStationenElapsed()) {

			System.out.println("Anlage: " + station.getAnlage().getName() + "; Station: " + station.getName());
			stationenForTPM.add(new StationForTPM(station));
		}

		listModel.setStationen(stationenForTPM);
		listStationen.setModel(listModel);

	}

	public List<Station> getStationenElapsed() {

		List<Station> stationenElapsed = new ArrayList<>();

		for (Anlage anlage : Service.getInstance().getAllAnlageLeerflaecheAbteilungPanelFormat()) {

			for (Station station : Service.getInstance().getStationenFromAnlage(anlage)) {

				if (station.isTpm()) {

					if (checkStationElapsed(station))
						stationenElapsed.add(station);

				}

			}
		}

		return stationenElapsed;
	}

	private boolean checkStationElapsed(Station station) {

		String remark = null;
		float prozent = 0;
		boolean maintenanceElapsed = false;

		if (station.getWartungArt() == EWartungArt.STUECKZAHL.ordinal()) {

			prozent = ProzentCalc.calcProzent(station);

			if (prozent >= station.getWartungStueckWarnung() && prozent < station.getWartungStueckFehler())
				maintenanceElapsed = true;

			else if (prozent >= station.getWartungStueckFehler())
				maintenanceElapsed = true;
		}

		if (station.getWartungArt() == EWartungArt.TIME_INTERVALL.ordinal()) {

			if (station.getCreateDate() != null || station.getLastWartungDate() != null) {

				Date nextWarnungDate = null;
				Date nextWartungDate;

				if (station.getLastWartungDate() != null) {
					nextWartungDate = ProzentCalc.calcNextWartungDate(station.getLastWartungDate(),
							station.getIntervallDateUnit(), station.getWartungDateIntervall());
					nextWarnungDate = ProzentCalc.calcNextWarnungDate(station.getWarnungDateUnit(),
							station.getLastWartungDate(), nextWartungDate, station.getWartungDateWarnung());
					prozent = ProzentCalc.calcProzent(station.getLastWartungDate().getTime(),
							nextWartungDate.getTime());
				} else {
					nextWartungDate = ProzentCalc.calcNextWartungDate(station.getCreateDate(),
							station.getIntervallDateUnit(), station.getWartungDateIntervall());
					nextWarnungDate = ProzentCalc.calcNextWarnungDate(station.getWarnungDateUnit(),
							station.getCreateDate(), nextWartungDate, station.getWartungDateWarnung());
					prozent = ProzentCalc.calcProzent(station.getCreateDate().getTime(), nextWartungDate.getTime());
				}

				SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
				remark = df.format(nextWartungDate);

				if (Calendar.getInstance().getTime().after(nextWarnungDate)
						&& Calendar.getInstance().getTime().before(nextWartungDate))
					maintenanceElapsed = true;

				if (Calendar.getInstance().getTime().after(nextWartungDate))
					maintenanceElapsed = true;

			}

		}

		return maintenanceElapsed;

	}

}
