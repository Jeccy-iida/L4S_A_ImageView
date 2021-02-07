package app.iida.jessy.imageview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //url
        val url = "URL"
        val imageView = findViewById<ImageView>(R.id.imageView)

        imageView.load(url)

    }
}