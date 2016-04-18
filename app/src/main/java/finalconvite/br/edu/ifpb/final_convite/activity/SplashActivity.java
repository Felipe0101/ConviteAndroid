package finalconvite.br.edu.ifpb.final_convite.activity;

import android.app.Activity;
import java.util.Timer;
import java.util.TimerTask;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;

import finalconvite.br.edu.ifpb.final_convite.R;

public class SplashActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
		
		new Timer().schedule(new TimerTask(){
			public void run() {
                finish();
 
                Intent intent = new Intent();
                intent.setClass(SplashActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        }, 3000);
    }
		}
