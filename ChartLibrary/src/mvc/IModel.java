package mvc;

public interface IModel {
	public void addModelListener(IModelListener modelListener);
	public void removeModelListener(IModelListener modelListener);
	
	public void modelChange();
}
