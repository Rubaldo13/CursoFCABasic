package ejemplo.ejemplo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
//Declaración de variables
    TextView TV2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //Declaramos el intent sin contexto porque solo obtenedremos el dato que nos mandó la otra actividad
        Intent intent;


        TV2=findViewById(R.id.TEXTO2);//

        intent = getIntent();//Obtenemos el intent de la otra actividad
        String text = intent.getStringExtra("TEXT"); //Obtenemos el paquete que tiene el intent
        if(text.length() != 0 ){//Verificamos que no venga vacío, esto lo hacemos preguntando por la longitud de la cadena del editText
                                //Si no introducimos nada en el EditText entonces el programa nos mandará al else.
            TV2.setText(text);//Ponemos lo que obtuvimos del Intent en el TextView de la segunda activity
            Toast.makeText(this,"Todo salió chido. :D",Toast.LENGTH_SHORT ).show(); //Mandamos un mensaje al usuario que salieron bien las cosas
        }else{
            Toast.makeText(this,"ALGO OCURRIÓ :,(", Toast.LENGTH_LONG).show(); //Si el intent viene vacio nos mandará este mensaje
        }






    }
}
