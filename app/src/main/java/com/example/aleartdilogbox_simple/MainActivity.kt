package com.example.aleartdilogbox_simple

import android.annotation.SuppressLint
import android.app.Dialog
import android.content.DialogInterface
import android.graphics.drawable.Icon
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AlertDialog.Builder

class MainActivity : AppCompatActivity() {

    lateinit var submit:Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        submit = findViewById(R.id.submit_Button)

        submit.setOnClickListener {
           var alertDialog = AlertDialog.Builder(this)
            alertDialog.setTitle("Alert")

            alertDialog.setMessage("Are You Exit")

            alertDialog.setPositiveButton("yes",(DialogInterface.OnClickListener { dialog, which ->
              finish()
            Toast.makeText(this,"Are you Exit",Toast.LENGTH_SHORT).show()
            }
                    ));
            alertDialog.setNegativeButton("No",(DialogInterface.OnClickListener { dialog, which ->
                dialog.cancel()
//                Toast.makeText(this,"Are you creat",Toast.LENGTH_LONG).show()
            }));

            val alertdialog = alertDialog
            alertdialog.show()

        }
    }
}