package models;

import data.ISeriesData;

public class ChartSeries<S extends ISeriesData, R extends SeriesRenderingModel> extends ModelImpl {
	private S data;
	private R srm;
	
	public ChartSeries(S d, R s){
		this.data = d;
		this.srm = s;
	}

	public S getData() {
		return data;
	}

	public void setData(S data) {
		this.data = data;
	}

	public R getSerieRenderingModel() {
		return srm;
	}

	public void setSerieRenderingMode(R srm) {
		this.srm = srm;
	}
}
