package data;

import java.util.ArrayList;

public class SimpleXYSeriesData implements IXYSeriesData {
	private ArrayList<Double> xValues;
	private ArrayList<Double> yValues;

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getX(int index) {
		return this.xValues.get(index);
	}

	@Override
	public double getY(int index) {
		return this.yValues.get(index);
	}

	@Override
	public double getXMin() throws EmptyValuesExceptions{
		if(this.xValues.isEmpty()) throw new EmptyValuesExceptions("x");

		double xMin = this.xValues.get(0);

		for (int i = 1; i < this.xValues.size(); i++) {
			xMin = (this.xValues.get(i) < xMin)? this.xValues.get(i): xMin;
		}

		return xMin;
	}

	@Override
	public double getXMax() throws EmptyValuesExceptions{
		if(this.xValues.isEmpty()) throw new EmptyValuesExceptions("x");

		double xMax = this.xValues.get(0);

		for (int i = 1; i < this.xValues.size(); i++) {
			xMax = (this.xValues.get(i) > xMax)? this.xValues.get(i): xMax;
		}

		return xMax;
	}
	
	@Override
	public double getYMin() throws EmptyValuesExceptions{
		if(this.xValues.isEmpty()) throw new EmptyValuesExceptions("y");

		double yMin = this.yValues.get(0);

		for (int i = 1; i < this.yValues.size(); i++) {
			yMin = (this.xValues.get(i) < yMin)? this.yValues.get(i): yMin;
		}

		return yMin;	
	}


	@Override
	public double getYMax() throws EmptyValuesExceptions{
		if(this.xValues.isEmpty()) throw new EmptyValuesExceptions("y");

		double yMax = this.yValues.get(0);

		for (int i = 1; i < this.yValues.size(); i++) {
			yMax = (this.xValues.get(i) > yMax)? this.yValues.get(i): yMax;
		}

		return yMax;
	}
	
	
	public void add(Double x, Double y){
		this.xValues.add(x);
		this.yValues.add(y);
	}

}
