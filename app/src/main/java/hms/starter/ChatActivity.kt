package hms.starter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ChatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)

        val button = findViewById<Button>(R.id.button_back)
        button.setOnClickListener{
            startActivity(Intent(this, MatchActivity::class.java))
        }
    }
}