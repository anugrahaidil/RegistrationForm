package com.example.registrationform

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.registrationform.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    // Deklarasi binding
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Inisialisasi binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // Menambahkan listener untuk tombol sign up
        binding.btnSignup.setOnClickListener {
            submitData(it)
        }
    }
    // Fungsi untuk menangani klik tombol "Sign Up"
    private fun submitData(view: View) {
        val email = binding.email.text.toString()
        val name = binding.name.text.toString()
        val username = binding.uname.text.toString()
        val password = binding.pass.text.toString()
        // Lakukan sesuatu dengan data yang diperoleh, contoh sederhana menampilkan toast
        Toast.makeText(this, "Email: $email\nName: $name\nUsername: $username\nPassword: $password", Toast.LENGTH_LONG).show()
    }
}
