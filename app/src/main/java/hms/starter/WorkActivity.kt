package hms.starter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class WorkActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_work)

        val button = findViewById<Button>(R.id.button_next_work)
        button.setOnClickListener{
            startActivity(Intent(this, MatchActivity::class.java))
        }

    }
}