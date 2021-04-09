package id.internraion.pesona

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_home.*

class HomeFragment : Fragment() {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttonfaf.setOnClickListener {
            // Handler code here.
            val intent = Intent(context, faforit::class.java)
            startActivity(intent);
        }
        buttonpop.setOnClickListener {
            // Handler code here.
            val intent = Intent(context, popular::class.java)
            startActivity(intent);
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.activity_home, container, false)

        }

        }






