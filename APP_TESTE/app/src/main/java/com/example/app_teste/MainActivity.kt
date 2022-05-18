package com.example.app_teste

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.core.view.*

class MainActivity : AppCompatActivity() {
    lateinit var resposta_1: LinearLayout;
    lateinit var resposta_2: LinearLayout;
    lateinit var pergunta_1: LinearLayout;
    lateinit var pergunta_2: LinearLayout;
    lateinit var pergunta_3: LinearLayout;
    lateinit var img_pergunta_1: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        resposta_1 = findViewById(R.id.resposta_1);
        resposta_2 = findViewById(R.id.resposta_2);
        pergunta_1 = findViewById(R.id.pergunta_1);
        pergunta_2 = findViewById(R.id.pergunta_2);
        pergunta_3= findViewById(R.id.pergunta_3);
    }

    fun teste1(V: View) {
        val sideBarParam = resposta_1.layoutParams as ViewGroup.MarginLayoutParams;
        val sideBarParam2 = pergunta_2.layoutParams as ViewGroup.MarginLayoutParams;
        val sideBarParam3 = pergunta_3.layoutParams as ViewGroup.MarginLayoutParams;
        val sideBarParam4 = resposta_2.layoutParams as ViewGroup.MarginLayoutParams;

        var top = pergunta_1.marginTop
        var bottom = pergunta_1.marginBottom
        var right = pergunta_1.marginRight
        var left = pergunta_1.marginLeft
        val top_2 = pergunta_2.marginTop
        val bottom_2 = pergunta_2.marginBottom
        val right_2 = pergunta_2.marginRight
        val left_2 = pergunta_2.marginLeft
        val top_3 = pergunta_3.marginTop
        val bottom_3 = pergunta_3.marginBottom
        val right_3 = pergunta_3.marginRight
        val left_3 = pergunta_3.marginLeft
        val top_4 = resposta_2.marginTop
        val bottom_4 = resposta_2.marginBottom
        val right_4 = resposta_2.marginRight
        val left_4 = resposta_2.marginLeft
        if (sideBarParam.topMargin == 0 && sideBarParam4.topMargin < 500) {
            sideBarParam.setMargins(left, top+195, right, bottom);
            sideBarParam2.setMargins(left_2, top_2+195, right_2, bottom_2);
            sideBarParam3.setMargins(left_3, top_3+195, right_3, bottom_3);

            resposta_1.layoutParams = sideBarParam
            pergunta_2.layoutParams = sideBarParam2
            pergunta_3.layoutParams = sideBarParam3
            resposta_2.layoutParams = sideBarParam4
            pergunta_1.background
            resposta_1.isVisible = true

        }
        else if(sideBarParam.topMargin== 0 && sideBarParam4.topMargin > 400){
            sideBarParam.setMargins(left, top+195, right, bottom);
            sideBarParam2.setMargins(left_2, top_2+195, right_2, bottom_2);
            sideBarParam3.setMargins(left_3, top_3+195, right_3, bottom_3);
            sideBarParam4.setMargins(left_2, top_2+390, right_2, bottom_2);

            resposta_1.layoutParams = sideBarParam
            pergunta_2.layoutParams = sideBarParam2
            pergunta_3.layoutParams = sideBarParam3
            resposta_2.layoutParams = sideBarParam4
            resposta_1.isVisible = true
        }
        else if(resposta_2.isVisible == true){
            sideBarParam.setMargins(0, 0, 0,0);
            sideBarParam2.setMargins(left_2, top_2-195, right_2, bottom_2);
            sideBarParam3.setMargins(left_3, top_3-195, right_3, bottom_3);
            sideBarParam4.setMargins(left_3, top_2, right_3, bottom_3);
            resposta_1.layoutParams = sideBarParam
            pergunta_2.layoutParams = sideBarParam2
            pergunta_3.layoutParams = sideBarParam3
            resposta_2.layoutParams = sideBarParam4

            resposta_1.isVisible = false
        }

        else {

            sideBarParam.setMargins(0, 0, 0,0);
            sideBarParam2.setMargins(left_2, top_2-195, right_2, bottom_2);
            sideBarParam3.setMargins(left_3, top_3-195, right_3, bottom_3);
            resposta_1.layoutParams = sideBarParam
            pergunta_2.layoutParams = sideBarParam2
            pergunta_3.layoutParams = sideBarParam3
            resposta_2.layoutParams = sideBarParam4

            resposta_1.isVisible = false

        }
    }
    fun teste2(V: View) {
        val sideBarParam4 = resposta_1.layoutParams as ViewGroup.MarginLayoutParams;
        val sideBarParam = resposta_2.layoutParams as ViewGroup.MarginLayoutParams;
        val sideBarParam2 = pergunta_2.layoutParams as ViewGroup.MarginLayoutParams;
        val sideBarParam3 = pergunta_3.layoutParams as ViewGroup.MarginLayoutParams;


        val top_2 = pergunta_2.marginTop
        val bottom_2 = pergunta_2.marginBottom
        val right_2 = pergunta_2.marginRight
        val left_2 = pergunta_2.marginLeft
        val top_3 = pergunta_3.marginTop
        val bottom_3 = pergunta_3.marginBottom
        val right_3 = pergunta_3.marginRight
        val left_3 = pergunta_3.marginLeft

        if (sideBarParam.topMargin == 0) {
            sideBarParam.setMargins(left_2, top_2+195, right_2, bottom_2);
            sideBarParam3.setMargins(left_3, top_3+195, right_3, bottom_3);
            resposta_2.layoutParams = sideBarParam
            pergunta_2.layoutParams = sideBarParam2
            pergunta_3.layoutParams = sideBarParam3

            resposta_2.isVisible = true

        }else if (sideBarParam.topMargin == 0 && sideBarParam4.topMargin >=345 && sideBarParam3.topMargin <= 790) {
            sideBarParam.setMargins(left_2, top_2+195, right_2, bottom_2);
            sideBarParam3.setMargins(left_3, top_3+195, right_3, bottom_3);
            resposta_2.layoutParams = sideBarParam
            pergunta_2.layoutParams = sideBarParam2
            pergunta_3.layoutParams = sideBarParam3

            resposta_2.isVisible = true

        }else if (sideBarParam.topMargin == 0 && sideBarParam4.topMargin >=345 && sideBarParam3.topMargin > 790) {
            sideBarParam.setMargins(left_2, top_2+195, right_2, bottom_2);
            resposta_2.layoutParams = sideBarParam
            pergunta_2.layoutParams = sideBarParam2
            pergunta_3.layoutParams = sideBarParam3

            resposta_2.isVisible = true

        } else {
            sideBarParam.setMargins(0, 0, 0,0);
            sideBarParam3.setMargins(left_3, top_3-195, right_3, bottom_3);
            resposta_2.layoutParams = sideBarParam
            pergunta_2.layoutParams = sideBarParam2
            pergunta_3.layoutParams = sideBarParam3

            resposta_2.isVisible = false

        }
    }
    }
