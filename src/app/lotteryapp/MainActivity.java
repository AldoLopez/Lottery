package app.lotteryapp;

//import android.R;
import android.os.AsyncTask;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	static Button pick3, pick4, cash5, pick6, megamillions, powerball;
	Context ctx;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);		
		ctx = this;
		showToast("FINISH DATABASES!", Toast.LENGTH_LONG);
		pick3 = (Button) findViewById(R.id.pick_three_button);
		pick4 = (Button) findViewById(R.id.pick_four_button);
		cash5 = (Button) findViewById(R.id.jersey_cash_five_button);
		pick6 = (Button) findViewById(R.id.pick_six_button);
		megamillions = (Button) findViewById(R.id.mega_button);
		powerball = (Button) findViewById(R.id.powerball_button);
		new doTheThings().execute();
	}	

	private class doTheThings extends AsyncTask<Void, Void, Void>{

		@Override
		protected Void doInBackground(Void... params) {
			pick3.setOnClickListener(new View.OnClickListener() {				
				@Override
				public void onClick(View v) {
					showToast("Pick 3 goes here");
				}
			});
			pick4.setOnClickListener(new View.OnClickListener() {				
				@Override
				public void onClick(View v) {
					showToast("Pick 4 goes here");
				}
			});
			cash5.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					showToast("Cash 5 goes here");
				}
			});
			pick6.setOnClickListener(new View.OnClickListener() {				
				@Override
				public void onClick(View v) {
					showToast("Pick 6 goes here");
				}
			});
			megamillions.setOnClickListener(new View.OnClickListener() {				
				@Override
				public void onClick(View v) {
					showToast("Mega Millions goes here");
				}
			});
			powerball.setOnClickListener(new View.OnClickListener() {				
				@Override
				public void onClick(View v) {
					showToast("Powerball goes here");
				}
			});
			return null;
		}
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void showToast(String toast){
		Toast.makeText(ctx, toast, Toast.LENGTH_SHORT).show();
	}
	
	private void showToast(String toast, int length) {
		Toast.makeText(ctx, toast, length).show();
	}
}
