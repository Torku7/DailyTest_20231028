package com.example.dailytest_20231028

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.btnLogin.setOnClickListener {

            val userId = binding.edtId.text.toString()
            val userPw = binding.edtPw.text.toString()

            
            if(userId == "admin@test.com" && userPw == "qwer"){
                Toast.makeText(this, "관리자입니다", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "로그인에실패하셨습니다", Toast.LENGTH_SHORT).show()
            }

    }
}