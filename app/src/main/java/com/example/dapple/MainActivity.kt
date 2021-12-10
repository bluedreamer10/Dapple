package com.example.dapple

import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.dapple.PaintView.Companion.colorList
import com.example.dapple.PaintView.Companion.currentBrush
import com.example.dapple.PaintView.Companion.pathList
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object{
        var path = Path()
        var paintBrush = Paint()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        redColor.setOnClickListener{
            paintBrush.color = Color.RED
            currentColor(paintBrush.color)
        }

        blueColor.setOnClickListener{
            paintBrush.color = Color.BLUE
            currentColor(paintBrush.color)
        }

        blackColor.setOnClickListener{
            paintBrush.color = Color.BLACK
            currentColor(paintBrush.color)
        }

        whiteColor.setOnClickListener{
            paintBrush.color = Color.WHITE
            currentColor(paintBrush.color)
        }

        resetButton.setOnClickListener{
            pathList.clear()
            colorList.clear()
            path.reset()
        }
    }

    private  fun currentColor(color: Int){
        currentBrush = color
        path = Path()
    }
}