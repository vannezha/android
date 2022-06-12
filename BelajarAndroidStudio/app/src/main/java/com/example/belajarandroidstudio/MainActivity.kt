package com.example.belajarandroidstudio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.text.DecimalFormat

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var panjang :EditText
    private lateinit var lebar :EditText
    private lateinit var tinggi :EditText
    private lateinit var btnCalc :Button
    private lateinit var tv :TextView
    companion object {
        private const val STATE_RESULT = "state_result"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        panjang = findViewById(R.id.id_length)
        lebar = findViewById(R.id.id_width)
        tinggi = findViewById(R.id.id_height)
        btnCalc = findViewById(R.id.btn_calculate)
        tv = findViewById(R.id.tv_result)

        btnCalc.setOnClickListener(this)
        if (savedInstanceState != null){
            tv.text = savedInstanceState.getString(STATE_RESULT)
        }
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.btn_calculate){
            val p = panjang.text.toString().trim()
            val l = lebar.text.toString().trim()
            val t = tinggi.text.toString().trim()
            when {
                p.isEmpty() -> {
                    panjang.error = "tidak boleh kosong ngab"
                }
                l.isEmpty() -> {
                    lebar.error = "tidak boleh kosong ngab"
                }
                t.isEmpty() -> {
                    tinggi.error = "tidak boleh kosong ngab"
                }
            }
            val df = DecimalFormat("#.##")
            if (p.isNotEmpty() and l.isNotEmpty() and t.isNotEmpty()){
                tv.text = (df.format(p.toDouble() * l.toDouble() * t.toDouble())).toString()
            }
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString(STATE_RESULT,tv.text.toString())
    }
}