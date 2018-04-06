package ejemplo.ejemplo;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //Declaración de variables
    TextView TV;
    EditText ET;
    Button BTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this,"He nacido", Toast.LENGTH_SHORT).show();

        //Buscamos las views por su id
        TV=findViewById(R.id.Title);
        ET=findViewById(R.id.ETx);
        BTN=findViewById(R.id.Boton);

        //Le decimos al botón que esté al pendiente de lo que haga el usuario
        //this es para indicarle el contexto, es decir, la activitty en la que nos encontramos
        BTN.setOnClickListener(this);

    }

    //Método para poner lo que ahrá el botón al ser presionado
    @Override
    public void onClick(View view) { //View view es para indicar que utilizaremos una view
        String stret=ET.getText().toString(); //Obtenemos el texto que esté en el EditText, lo convertimos a cadena yh lo guardamos en una variable tipo String
        Intent intent=new Intent(MainActivity.this, SecondActivity.class); //Declaramos un intent, le decimos el contexto en el que estamos y hacia a dónde vamos
        intent.putExtra("TEXT",stret);//Guardamos la String que habíamos obtenido del EditText
        startActivity(intent);//Iniciamos la nueva actividad y le pasamos el intent

    }
}
