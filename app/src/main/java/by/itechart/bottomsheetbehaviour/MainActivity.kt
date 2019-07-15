package by.itechart.bottomsheetbehaviour

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btOption1.setOnClickListener { startActivity(Intent(this, Option1Activity::class.java)) }
        btOption2.setOnClickListener { startActivity(Intent(this, Option2Activity::class.java)) }
        btOption3.setOnClickListener { startActivity(Intent(this, Option3Activity::class.java)) }
    }
}
