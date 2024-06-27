package com.example.myreaderapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myreaderapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate((layoutInflater))



        setContentView(binding.root)
        binding.rvAuthor.layout = LinearLayoutManager(this)
        displayArtist()


    }
    fun displayArtist(){
      val artist1 = Artist  ("Bian Tracy","","3rd May 2024","Eat That Frog","",
          "The book was established in 2016 and continues to be the best selling books around the world. " +
                  "Some of the prevailing themes in the look include poverty,religion,racism,community," +
                  "love and a sense of belonging.The author describes how " +
                  "race mixing was one of the worst crime that an individual could commit during the apartheid time.")

        val artist2 = Artist  ("Kelly Belson","","4th June 2026","Long live the crown","",
            "The book was established in 2016 and continues to be the best selling books around the world. " +
                    "Some of the prevailing themes in the look include poverty,religion,racism,community," +
                    "love and a sense of belonging.The author describes how " +
                    "race mixing was one of the worst crime that an individual could commit during the apartheid time.")


        val artist3 = Artist  ("Megan Katana","","5th September 2022","Long live the crown","",
            "The book was established in 2016 and continues to be the best selling books around the world. " +
                    "Some of the prevailing themes in the look include poverty,religion,racism,community," +
                    "love and a sense of belonging.The author describes how " +
                    "race mixing was one of the worst crime that an individual could commit during the apartheid time.")


        val artist4 = Artist  ("Catherine Mweu","","7th October 2022","Long live the crown","",
            "The book was established in 2016 and continues to be the best selling books around the world. " +
                    "Some of the prevailing themes in the look include poverty,religion,racism,community," +
                    "love and a sense of belonging.The author describes how " +
                    "race mixing was one of the worst crime that an individual could commit during the apartheid time.")



        val artist5 = Artist  ("Mitchelle Obama","","9th October 2000","I am because you are","",
            "The book was established in 2016 and continues to be the best selling books around the world. " +
                    "Some of the prevailing themes in the look include poverty,religion,racism,community," +
                    "love and a sense of belonging.The author describes how " +
                    "race mixing was one of the worst crime that an individual could commit during the apartheid time.")



        val artist6 = Artist  ("Barrack Obama","","10th January 1988","I am because you are","",
            "The book was established in 2016 and continues to be the best selling books around the world. " +
                    "Some of the prevailing themes in the look include poverty,religion,racism,community," +
                    "love and a sense of belonging.The author describes how " +
                    "race mixing was one of the worst crime that an individual could commit during the apartheid time.")


        val myArtist = listOf(artist1,artist2,artist3,artist4,artist5,artist6)
        val artistAdapter = ArtistAdapter(myArtist)
        binding.rvAuthor. = artistAdapter
    }


}