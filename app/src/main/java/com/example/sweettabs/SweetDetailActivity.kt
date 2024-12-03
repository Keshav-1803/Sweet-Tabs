package com.example.sweettabs

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SweetDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sweet_detail)

        val sweetName = intent.getStringExtra(EXTRA_SWEET_NAME) ?: "Unknown Sweet"
        val sweetImageResId = intent.getIntExtra(EXTRA_SWEET_IMAGE, -1)

        val sweetImageView: ImageView = findViewById(R.id.sweet_detail_image)
        val sweetNameTextView: TextView = findViewById(R.id.sweet_detail_name)

        if (sweetImageResId == -1) {
            Log.e("SweetDetailActivity", "Invalid image resource ID received")
            sweetImageView.setImageResource(R.drawable.ic_launcher_background) // Ensure you have a fallback drawable
        } else {
            sweetImageView.setImageResource(sweetImageResId)
        }
        sweetNameTextView.text = sweetName
    }

    companion object {
        const val EXTRA_SWEET_NAME = "EXTRA_SWEET_NAME"
        const val EXTRA_SWEET_IMAGE = "EXTRA_SWEET_IMAGE"

        fun start(context: Context, sweet: Sweet) {
            val intent = Intent(context, SweetDetailActivity::class.java)
            intent.putExtra(EXTRA_SWEET_NAME, sweet.name)
            intent.putExtra(EXTRA_SWEET_IMAGE, sweet.imageResId)
            context.startActivity(intent)
        }
    }
}
