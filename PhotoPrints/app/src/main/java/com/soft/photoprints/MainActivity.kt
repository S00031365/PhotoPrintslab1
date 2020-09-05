package com.soft.photoprints

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        buOrderPrints.setOnClickListener {
            var id: Int = rgPaperSize.checkedRadioButtonId
            if (etNumberPrints.text.toString().length > 0) {
                var numberPrints = etNumberPrints.text.toString().toInt()
                if (id != -1) { 
                    val radio: RadioButton = findViewById(id)

                    val idString = resources.getResourceEntryName(radio.id)
                    var orderCost: Double = 0.0
                    when (idString) {
                        "r1" -> {
                            orderCost = numberPrints * 0.19
                        }
                        "r2" -> {
                            orderCost = numberPrints * 0.49
                        }
                        "r3" -> {
                            orderCost = numberPrints * 0.79
                        }
                    }
                    tvOrdersCost.text = "The Order costis $ " + orderCost.toString()

                }
            }
        }
    }
}