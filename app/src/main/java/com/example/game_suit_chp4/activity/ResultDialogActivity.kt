package com.example.game_suit_chp4.activity

import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.game_suit_chp4.R

class ResultDialogActivity() : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dialog_fragment_result)

        val resultDialog = AlertDialog.Builder(this)
        resultDialog.show()

        setDialogListener()
    }
    
    private fun setDialogListener(){
        val btnMainLagi = findViewById<Button>(R.id.btn_mainlagi)
        val btnMenu = findViewById<Button>(R.id.btn_balikmenu)
        
        val toGameIntent = Intent(this,GameUtamaActivity::class.java)
        val toMenuIntent = Intent(this, HalamanMenuActivity::class.java)
        
        btnMainLagi.setOnClickListener{
            this.onStop()
            startActivity(toGameIntent)
        }
        btnMenu.setOnClickListener{
            this.onStop()
            startActivity(toMenuIntent)
        }
    }
}