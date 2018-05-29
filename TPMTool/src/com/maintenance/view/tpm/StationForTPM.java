package com.maintenance.view.tpm;

import com.maintenance.db.dto.Station;

public class StationForTPM {

	private final Station station;

	public StationForTPM(Station station) {
		this.station = station;
	}

	public Station getStation() {
		return station;
	}

	@Override
	public String toString() {
		return station.getAnlage().getName() + ": " + station.getName();
	}

}
