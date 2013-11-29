package models;

import java.util.ArrayList;

import mvc.IModel;
import mvc.IModelListener;

public class ModelImpl implements IModel {
	private ArrayList<IModelListener> listeners;

	@Override
	public void addModelListener(IModelListener modelListener) {
		this.listeners.add(modelListener);
	}

	@Override
	public void removeModelListener(IModelListener modelListener) {
		this.listeners.remove(modelListener);
	}

	@Override
	public void modelChange() {
		for (int i = 0; i < this.listeners.size(); i++) {
			this.listeners.get(i).onChanged(this);
		}
	}

}
