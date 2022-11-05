package hms.starter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LeaderboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_leaderboard)
        val button = findViewById<Button>(R.id.button_back_2)
        button.setOnClickListener{
            startActivity(Intent(this, MatchActivity::class.java))
        }
    }
}