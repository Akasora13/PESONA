package id.internraion.pesona

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.internraion.pesona.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()
    }
}