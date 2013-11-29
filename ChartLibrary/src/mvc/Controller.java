package mvc;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

public class Controller implements OnTouchListener {
	private View view;
	private IModel model;
	
	public View getView() {
		return view;
	}

	public void setView(View view) {
		this.view = view;
	}

	public IModel getModel() {
		return model;
	}

	public void setModel(IModel model) {
		this.model = model;
	}

	@Override
	public boolean onTouch(View v, MotionEvent event) {
		// TODO Auto-generated method stub
		return false;
	}

}
