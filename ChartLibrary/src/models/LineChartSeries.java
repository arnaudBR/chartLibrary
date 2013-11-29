package models;

import data.SimpleXYSeriesData;

public class LineChartSeries extends ChartSeries<SimpleXYSeriesData, LineChartSeriesRenderingModel> {

	public LineChartSeries(SimpleXYSeriesData d, LineChartSeriesRenderingModel s) {
		super(d, s);
	}

}
