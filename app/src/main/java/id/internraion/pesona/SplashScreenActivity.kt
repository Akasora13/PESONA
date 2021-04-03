package id.internraion.pesona

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Window
import id.internraion.pesona.intro.screens.FirstScreen
import id.internraion.pesona.intro.ViewPagerFragment

class SplashScreenActivity : AppCompatActivity() {

    private val timeout = 1500L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_splash_screen)

        Handler(mainLooper).postDelayed(
            {
                startActivity(Intent(this, FirstScreen::class.java))

            },timeout
        )
    }
}