package com.nextin.dailytaskwithlistviewapp

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.nextin.dailytaskwithlistviewapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding: ActivityMainBinding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val taskList = arrayOf(
            "I have to wake up at 5:30 am for jogging",
            "I have to read the 10 pages of Money Stories",
            "I have to Maintain a streak of Duolingo",
            "I have to learn a two Designing Lectures",
            "2 pm is a lunch time",
            "I have to upload todays work on github",
            "Repair Phone",
            "Pay the wife bills and Phone Bills",
            "Hostel Rent",
            "I have to wake up at 5:30 am for jogging",
            "I have to read the 10 pages of Money Stories",
            "I have to Maintain a streak of Duolingo",
            "I have to learn a two Designing Lectures",
            "2 pm is a lunch time",
            "I have to upload todays work on github",
            "Repair Phone",
            "Pay the wife bills and Phone Bills",
            "Hostel Rent",
            "I have to wake up at 5:30 am for jogging",
            "I have to read the 10 pages of Money Stories",
            "I have to Maintain a streak of Duolingo",
            "I have to learn a two Designing Lectures",
            "2 pm is a lunch time",
            "I have to upload todays work on github",
            "Repair Phone",
            "Pay the wife bills and Phone Bills",
            "Hostel Rent"
               )


        val listViewAdapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1,taskList)

        binding.listView.adapter = listViewAdapter

        binding.listView.setOnItemClickListener { parent, view, position, id ->
            val text = "Clicked on item : ${(view as TextView).text.toString()}"

            Toast.makeText(this,text,
                Toast.LENGTH_SHORT).show()

        }
    }
}