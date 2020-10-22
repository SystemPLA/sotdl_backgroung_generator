package ru.systempla.sotdl_background_generator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import ru.systempla.sotdl_background_generator.databinding.ActivityMainBinding
import ru.systempla.sotdl_background_generator.view_model.MainViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var mainViewModel = MainViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        mainViewModel.getCharacterDesc().observe(this, {
            data -> editTextTextMultiLine.setText(data)
        })

        ge_bt.setOnClickListener { mainViewModel.generateCharacter("Dwarf") }
    }
}