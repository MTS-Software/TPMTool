package com.maintenance;

import java.io.File;
import java.util.ResourceBundle;

import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

import com.maintenance.util.ApplicationProperties;
import com.maintenance.view.tpm.MainFrame;

public class Main {

	private ResourceBundle resources = ResourceBundle.getBundle("language");
	public static String IP;

	public static void main(String[] args) {

		IP = null;
		if (args.length == 1) {
			IP = args[0];

		}

		new Main();

		new MainFrame();

	}

	public Main() {
		try {
		    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
		        if ("Nimbus".equals(info.getName())) {
		            UIManager.setLookAndFeel(info.getClassName());
		            break;
		        }
		    }
		} catch (Exception e) {
		    // If Nimbus is not available, you can set the GUI to another look and feel.
		}

		initProperties();

	}

	private void initProperties() {

		String userHome = System.getProperty("user.home");

		ApplicationProperties.configure("application.properties",
				userHome + File.separator + resources.getString("appname"), "application.properties");
		ApplicationProperties.getInstance().setup();

		if (Main.IP != null) {
			ApplicationProperties.getInstance().edit("db_host", Main.IP);

		}

	}

}
