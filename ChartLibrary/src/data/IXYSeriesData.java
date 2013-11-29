package data;

public interface IXYSeriesData extends ISeriesData {
	public double getX(int index);
	public double getY(int index);
	public double getXMin() throws EmptyValuesExceptions;
	public double getYMin() throws EmptyValuesExceptions;
	public double getXMax() throws EmptyValuesExceptions;
	public double getYMax() throws EmptyValuesExceptions;

}
