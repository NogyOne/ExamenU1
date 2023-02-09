package mx.itson.edu.examenu1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val centigrados: TextView = findViewById(R.id.etCentigrados)
        val faren: TextView = findViewById(R.id.etFaren)
        val convCent: Button = findViewById(R.id.btnCentigrados)
        val convFaren: Button = findViewById(R.id.btnFaren)
        val reset: Button = findViewById(R.id.button3)

        var cent: Double = 0.0
        var far: Double = 0.0

        convCent.setOnClickListener{
            if(!faren.text.isBlank()){
                far = faren.text.toString().toDouble()
                cent = (far-32)/1.8

                val formattedNumber = "%.2f".format(cent)
                centigrados.setText(formattedNumber)
            }
        }

        convFaren.setOnClickListener{
            if(!centigrados.text.isBlank()){
                cent = centigrados.text.toString().toDouble()
                far = cent * 1.8 + 32

                val formattedNumber = "%.2f".format(far)
                faren.setText(formattedNumber)
            }
        }

        reset.setOnClickListener{
            centigrados.setText("")
            faren.setText("")
        }

    }
}