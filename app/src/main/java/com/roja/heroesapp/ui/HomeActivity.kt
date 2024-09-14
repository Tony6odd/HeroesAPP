package com.roja.heroesapp.ui

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.roja.heroesapp.MainActivity
import com.roja.heroesapp.R
import com.roja.heroesapp.adapters.Publisher2Adapter
import com.roja.heroesapp.adapters.PublisherAdapter
import com.roja.heroesapp.models.Publisher
import com.roja.heroesapp.models.Publisher2
import com.squareup.picasso.Picasso


class HomeActivity : AppCompatActivity() {
    lateinit var username: TextView
    lateinit var logoutBTN: ImageView
    lateinit var publishersRecyclerView: RecyclerView
    lateinit var publishersRecyclerView2: RecyclerView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)

        username = findViewById(R.id.usernameTV)
        logoutBTN = findViewById(R.id.logoutBTN)
        publishersRecyclerView = findViewById(R.id.publishers_recyclerview)
        publishersRecyclerView2 = findViewById(R.id.publishers_recyclerview2)

        val sharedPreferences = getSharedPreferences("mypref", MODE_PRIVATE)
        val userName = sharedPreferences.getString("userName", "Invitado") ?: "Invitado"

        username.text = getString(R.string.user_greeting, userName)

        publishersRecyclerView.adapter = PublisherAdapter(Publisher.publishers) { publisher ->

            val dialogView = layoutInflater.inflate(R.layout.dialog_publisher, null)

            val imageView = dialogView.findViewById<ImageView>(R.id.publisher_image_dialog)
            val nameView = dialogView.findViewById<TextView>(R.id.publisher_name_dialog)
            val descriptionView = dialogView.findViewById<TextView>(R.id.publisher_description_dialog)

            nameView.text = publisher.name
            descriptionView.text = publisher.description
            Picasso.get().load(publisher.image).into(imageView)

            val dialog = AlertDialog.Builder(this)
                .setView(dialogView)
                .create()



            dialog.show()
        }


        publishersRecyclerView2.adapter = Publisher2Adapter(Publisher2.publishers2) { publisher2 ->

            val dialogView = layoutInflater.inflate(R.layout.dialog_publisher, null)
            val imageView = dialogView.findViewById<ImageView>(R.id.publisher_image_dialog)
            val nameView = dialogView.findViewById<TextView>(R.id.publisher_name_dialog)
            val descriptionView = dialogView.findViewById<TextView>(R.id.publisher_description_dialog)

            nameView.text = publisher2.name
            descriptionView.text = publisher2.description
            Picasso.get().load(publisher2.image).into(imageView)

            val dialog = AlertDialog.Builder(this)
                .setView(dialogView)
                .create()

            dialog.show()
        }


        publishersRecyclerView2.layoutManager = GridLayoutManager(this, 2)


        publishersRecyclerView.layoutManager = GridLayoutManager(this, 2)
        publishersRecyclerView2.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        logoutBTN.setOnClickListener {
            val editor = sharedPreferences.edit()
            editor.remove("isLogged")
            editor.remove("userName")
            editor.apply()

            val intent = Intent(this@HomeActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
