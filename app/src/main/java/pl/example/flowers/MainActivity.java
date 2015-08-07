package pl.example.flowers;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends Activity implements View.OnClickListener {
	private RadioGroup roses;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		roses = (RadioGroup) findViewById(R.id.roses);
		Button showButton = (Button) findViewById(R.id.show_button);
		showButton.setOnClickListener(this);
	}
	@Override
	public void onClick(View v) {
		Intent intent = new Intent(this, RoseActivity.class);
		int id = roses.getCheckedRadioButtonId();


		switch (id) {
		case R.id.rose1:
			intent.putExtra("flowerId", R.drawable.rose1);
			break;
		case R.id.rose2:
			intent.putExtra("flowerId", R.drawable.rose2);

			break;
		case R.id.rose3:
			intent.putExtra("flowerId", R.drawable.rose3);
			break;
		}
		String text = ((RadioButton) findViewById(id)).getText()
				.toString();
		intent.putExtra("text", text);

		startActivity(intent);
	}

}
