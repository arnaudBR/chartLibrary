package mvc;

import android.content.Context;
import android.graphics.Canvas;
import android.view.SurfaceView;

public class View extends SurfaceView implements IModelListener{
	
	private IModel model;
	private Renderer renderer;
	private Controller controller;
	
	public View(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	public IModel getModel() {
		return model;
	}

	public void setModel(IModel model) {
		this.model = model;
	}

	public Renderer getRenderer() {
		return renderer;
	}

	public void setRenderer(Renderer renderer) {
		this.renderer = renderer;
	}

	public Controller getController() {
		return controller;
	}

	public void setController(Controller controller) {
		this.controller = controller;
	}

	public void onDraw(Canvas canvas){
		this.renderer.renderView(canvas, this.model);
	}
	
	@Override
	public void onChanged(IModel model) {
		this.invalidate();
	}

}
