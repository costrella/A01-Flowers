package pl.example.flowers;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class RoseActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_rose);

		Intent intent = getIntent();
		Bundle bundle = intent.getExtras();
		String text = (String) bundle.get("text");

		TextView description = (TextView) findViewById(R.id.rose_description);
		description.setText("Selected: " + text);
		int roseId = (Integer) bundle.get("flowerId");

		ImageView iv = (ImageView) findViewById(R.id.large_flower);
		iv.setImageResource(roseId);
		Button backButton = (Button) findViewById(R.id.back_button);
		backButton.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				finish();
			}
		});
	}
}
