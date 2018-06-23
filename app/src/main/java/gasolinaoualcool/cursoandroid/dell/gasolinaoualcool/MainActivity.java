package gasolinaoualcool.cursoandroid.dell.gasolinaoualcool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editGasolina;
    private EditText editAlcool;
    private Button botaoCalcular;
    private TextView textoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editGasolina = (EditText) findViewById(R.id.edit_gasolina_id);
        editAlcool = (EditText) findViewById(R.id.edit_alcool_id);
        botaoCalcular = (Button) findViewById(R.id.botao_calcular_id);
        textoResultado = (TextView) findViewById(R.id.texto_resultado_id);

        botaoCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String gasolinaString = editGasolina.getText().toString();
                String alcoolString = editAlcool.getText().toString();

                if(gasolinaString.isEmpty() || alcoolString.isEmpty()) {
                    textoResultado.setText("Informe o valor do alcool e da gasolina");
                } else {
                    double valorGasolina = Double.parseDouble(gasolinaString);
                    double valorAlcool = Double.parseDouble(alcoolString);

                    double perc = valorAlcool / valorGasolina;

                    if (perc > 0.7) {
                        textoResultado.setText("Melhor utilizar Gasolina");
                    } else {
                        textoResultado.setText("Melhor utilizar Alcool");
                    }


                }

            }
        });
    }
}
