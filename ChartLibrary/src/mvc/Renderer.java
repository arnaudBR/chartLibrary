package mvc;

import android.graphics.Canvas;

public interface Renderer {
	public void setView(View view);
	public View getView();

	public void renderView(Canvas canvas, IModel model);

}
