package psti.unram.tugas2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etMinutes = findViewById<EditText>(R.id.etMinutes)
        val btnConvert = findViewById<Button>(R.id.btnConvert)
        val tvResult = findViewById<TextView>(R.id.tvResult)

        btnConvert.setOnClickListener {
            val minutes = etMinutes.text.toString().toIntOrNull()

            if (minutes != null) {
                val seconds = minutes * 60
                tvResult.text = "$minutes menit = $seconds detik"
            } else {
                tvResult.text = "Masukkan angka yang valid!"
            }
        }
    }
}
