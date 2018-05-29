package com.maintenance.view.tpm;

import java.util.ArrayList;
import java.util.List;

import javax.swing.ListModel;
import javax.swing.event.ListDataEvent;
import javax.swing.event.ListDataListener;

public class StationListModel implements ListModel {

	private List<ListDataListener> listener = new ArrayList<ListDataListener>();
	private List<StationForTPM> stationen;

	@Override
	public int getSize() {

		return stationen.size();
	}

	@Override
	public StationForTPM getElementAt(int index) {

		return stationen.get(index);
	}

	@Override
	public void addListDataListener(ListDataListener l) {
		listener.add(l);

	}

	@Override
	public void removeListDataListener(ListDataListener l) {
		listener.remove(l);

	}

	public void setStationen(List<StationForTPM> stationen) {

		this.stationen = stationen;

		for (ListDataListener ld : this.listener) {
			ListDataEvent e = new ListDataEvent(this, ListDataEvent.CONTENTS_CHANGED, 0, this.stationen.size());
			ld.contentsChanged(e);
		}

	}

}
