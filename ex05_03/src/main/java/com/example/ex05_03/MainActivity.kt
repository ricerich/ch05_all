package com.example.ex05_03

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        //뷰 -> 레이아웃 + 뷰(위젯)

        //0.레이아웃 옵션값이 필요함(param) - 예)layout_width, layout_height
        //1.레이아웃을 kotlin객체로만 만든다(only) : 예) LinearLayout
        //2.레이아웃 속성 설정 , 예)backgraouncolor, orientation
        //3.(레이아웃과 옵션값)뷰를 꽂는다 액티비티에..


        //0.레이아웃 옵션값이 필요함(param) - 예)layout_width, layout_height
        var option = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                                               LinearLayout.LayoutParams.MATCH_PARENT)

        //1.레이아웃을 kotlin객체로만 만든다(only) : 예) LinearLayout
        var layout1 = LinearLayout(this)//생성자 매개변수에, 액티비티(위치)가 필요하다

        //2.레이아웃 속성 설정 , 예)backgraouncolor, orientation
        layout1.orientation = LinearLayout.VERTICAL
        layout1.setBackgroundColor(Color.rgb(0,255,0))

        //3.(레이아웃과 옵션값)뷰를 꽂는다 액티비티에..
        setContentView(layout1, option)

        //위젯추가
        //1.kotlin객체로 뷰(버튼)를 만든다.activity위치 적어줌 예)버튼 , xml객체 아님!
        //2.뷰(버튼)의 속성을 설정한다. 예) text, backgroundcolo, textSize
        //3.버튼을 레이아웃에 꽂는다.
        //4.중요: 버튼 이벤트 처리. 예) setOnClickListener

        //1.kotlin객체로 뷰(버튼)를 만든다.생성자매개변수에 activity위치 적어줌 예)버튼 , xml객체 아님!
        var btn1 = Button(this)

        //2.뷰(버튼)의 속성을 설정한다. 예) text, backgroundcolo, textSize
        btn1.text = "버튼1111"
        btn1.setBackgroundColor(Color.CYAN)

        //3.버튼을 레이아웃에 꽂는다.
        layout1.addView(btn1)

        //4.중요: 버튼 이벤트 처리. 예) setOnClickListener
        btn1.setOnClickListener {
            Toast.makeText(applicationContext,"버튼클릭했네~!",Toast.LENGTH_SHORT).show()
        }
    }
}