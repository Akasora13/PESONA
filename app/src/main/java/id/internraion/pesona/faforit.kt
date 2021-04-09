package id.internraion.pesona

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_faforit.*
import kotlinx.android.synthetic.main.activity_home.*

class faforit : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_faforit)
        detailfaf.setOnClickListener {
            // Handler code here.
            val intent = Intent(this, DetailActivity::class.java)
            startActivity(intent);
        }
    }
}