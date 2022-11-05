package hms.starter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MatchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_match)
        title = "Main"

        val button = findViewById<Button>(R.id.button_yes)
        button.setOnClickListener{
            startActivity(Intent(this, ChatActivity::class.java))
        }

        val button2 = findViewById<Button>(R.id.button_leaderboard)
        button2.setOnClickListener{
            startActivity(Intent(this, LeaderboardActivity::class.java))
        }
    }
}