package com.uzlahpri.january21finalproject

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {

    companion object{
        fun getLaunchService(from: Context) = Intent(from, MainActivity::class.java).apply {
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        setUpRequestUI()
    }
//    private fun setConfigurationUi() {
//        btn_sign_out.setOnClickListener {
//            signOut()
//        }
//    }
//    private fun signOut() {
//        startActivity(LoginActivity.getLaunchService(this))
//        FirebaseAuth.getInstance().signOut()
//    }
}