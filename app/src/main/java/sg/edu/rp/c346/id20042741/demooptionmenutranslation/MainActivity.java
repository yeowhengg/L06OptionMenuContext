package sg.edu.rp.c346.id20042741.demooptionmenutranslation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvTranslatedText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTranslatedText = findViewById(R.id.idTvTranslatedText);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        // this is used to open the menu when it is pressed
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        // this method is used to handle what happens when the options is clicked

        int id = item.getItemId();

        if (id == R.id.EnglishSelection) {
            tvTranslatedText.setText("Hello");
            return true;
        }
        else if(id == R.id.ItalianSelection){
            tvTranslatedText.setText("Ciao");
            return true;
        }else{
            tvTranslatedText.setText("Error translating");
        }

        return super.onOptionsItemSelected(item);
    }
}