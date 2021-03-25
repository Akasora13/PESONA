package id.internraion.pesona

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.internraion.pesona.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setActionBar(binding.toolbar)
    }
}