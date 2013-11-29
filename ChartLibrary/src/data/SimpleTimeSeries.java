package data;

import java.util.Date;

public class SimpleTimeSeries extends SimpleXYSeriesData {
	public void add(Date date,Double y) {
		super.add((double)date.getTime(), y);
	}
}
