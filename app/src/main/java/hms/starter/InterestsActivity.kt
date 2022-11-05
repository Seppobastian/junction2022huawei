package hms.starter

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class InterestsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_interests)
        title = "Interests"

        val button = findViewById<Button>(R.id.button_next_interests)
        button.setOnClickListener{
            startActivity(Intent(this, WorkActivity::class.java))
        }

    }
}