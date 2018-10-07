package darryl.esteva.com.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("4ITH", "Tumakbo si OnCreate");


    }

    @Override
    protected void onStart()
    {
        super.onStart();
        Log.d("4ITH", "Tumakbo si OnStart");
    }


    @Override
    protected void onResume()
    {
        super.onResume();
        Log.d("4ITH", "Tumakbo si OnResume");
    }

    @Override
    protected void onStop()
    {
        super.onStop();
        Log.d("4ITH", "Tumakbo si OnStop");
    }

    @Override
    protected void onRestart()
    {
        super.onRestart();
        Log.d("4ITH", "Tumakbo si OnRestart");
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Log.d("4ITH", "Tumakbo si OnDestroy");
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        Log.d("4ITH", "Tumakbo si OnPause");
    }

    public void displayMsg(View v)
    {
        //Toast.makeText();
      Snackbar.make(v,"Hello Again...",Snackbar.LENGTH_LONG).show();
    }


    public void process(View v)
    {
        Intent i=null, chooser=null;
        if(v.getId()==R.id.btnScreen2)
        {
            i = new Intent(this,Activity2.class);
            startActivity(i);
        }
        else if(v.getId()==R.id.btnMap)
        {
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo: 14.610493, 120.991809"));
            startActivity(i);

        }
    }

}
