package com.example.ex05_04_calc_num_button


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    //1.멤버변수


    //2.(멤버)메소드 - onCreate()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "초간단 계산기"

        //1.kotlin객체 만들기
        //2.xml객체를 가져와서, kotlin 객체에 연결(바인딩)
        //3.kotlin객체로 이벤트처리~!

        //지역변수 자리

        // 1. + 2. -> kotlin 객체를 만들면서, 동시에 xml객체를 연결(바인딩)
        var edt1: EditText = findViewById(R.id.Edit1)
        var edt2: EditText = findViewById(R.id.Edit2)

        var btn1: Button = findViewById(R.id.BtnAdd)
        var btn2: Button = findViewById(R.id.BtnSub)
        var btn3: Button = findViewById(R.id.BtnMul)
        var btn4: Button = findViewById(R.id.BtnDiv)

        var btn5: Button = findViewById(R.id.BtnMod)

        var tv1: TextView = findViewById(R.id.TextResult)

        //추가:1. + 2. 버튼 10개 추가
//        var btnNum0: Button = findViewById(R.id.BtnNum0)
//        var btnNum1: Button = findViewById(R.id.BtnNum1)
//        var btnNum2: Button = findViewById(R.id.BtnNum2)
//        var btnNum3: Button = findViewById(R.id.BtnNum3)
//        var btnNum4: Button = findViewById(R.id.BtnNum4)
//        var btnNum5: Button = findViewById(R.id.BtnNum5)
//        var btnNum6: Button = findViewById(R.id.BtnNum6)
//        var btnNum7: Button = findViewById(R.id.BtnNum7)
//        var btnNum8: Button = findViewById(R.id.BtnNum8)
//        var btnNum9: Button = findViewById(R.id.BtnNum9)


        var btnIDArr = arrayOf(R.id.BtnNum0, R.id.BtnNum1, R.id.BtnNum2, R.id.BtnNum3, R.id.BtnNum4,
                               R.id.BtnNum5, R.id.BtnNum6, R.id.BtnNum7, R.id.BtnNum8, R.id.BtnNum9)

        //버튼(숫자버튼)을 "객체배열"
        var btnNumArr = ArrayList<Button>(10)

        for(i in 0..9)
        {
//            btnNumArr[0] = findViewById(R.id.BtnNum0)
//            btnNumArr[1] = findViewById(R.id.BtnNum1)
//            btnNumArr[i] = findViewById(btnIDArr[i])//이거는 일반 배열형식
            btnNumArr.add(findViewById(btnIDArr[i]))
        }



        for(i in 0..9)
        {
            //추가: 3. 버튼(숫자버튼) 이벤트처리 10개~
            btnNumArr[i].setOnClickListener {
                //포커스가 edt1 에 있는지, edt2에 있는지 체크~!
                if(edt1.isFocused)//edt1에 포커스가 있으면
                {
                    var str = edt1.text.toString() + i
                    edt1.setText(str)
                }
                else if(edt2.isFocused)
                {
                    var str = edt2.text.toString() + i
                    edt2.setText(str)
                }
                else//포커스 가 딴데 있으면
                {
                    Toast.makeText(applicationContext,"포커스 선택 해주세요", Toast.LENGTH_SHORT).show()
                }
            }
        }

//        btnNum1.setOnClickListener {
//            //포커스가 edt1 에 있는지, edt2에 있는지 체크~!
//            if(edt1.isFocused)//edt1에 포커스가 있으면
//            {
//                var str = edt1.text.toString() + "1"
//                edt1.setText(str)
//            }
//            else if(edt2.isFocused)
//            {
//                var str = edt2.text.toString() + "1"
//                edt2.setText(str)
//            }
//            else//포커스 가 딴데 있으면
//            {
//                Toast.makeText(applicationContext,"포커스 선택 해주세요", Toast.LENGTH_SHORT).show()
//            }
//        }
//
//        btnNum2.setOnClickListener {
//            //포커스가 edt1 에 있는지, edt2에 있는지 체크~!
//            if(edt1.isFocused)//edt1에 포커스가 있으면
//            {
//                var str = edt1.text.toString() + "2"
//                edt1.setText(str)
//            }
//            else if(edt2.isFocused)
//            {
//                var str = edt2.text.toString() + "2"
//                edt2.setText(str)
//            }
//            else//포커스 가 딴데 있으면
//            {
//                Toast.makeText(applicationContext,"포커스 선택 해주세요", Toast.LENGTH_SHORT).show()
//            }
//        }
//
//        btnNum3.setOnClickListener {
//            //포커스가 edt1 에 있는지, edt2에 있는지 체크~!
//            if(edt1.isFocused)//edt1에 포커스가 있으면
//            {
//                var str = edt1.text.toString() + "3"
//                edt1.setText(str)
//            }
//            else if(edt2.isFocused)
//            {
//                var str = edt2.text.toString() + "3"
//                edt2.setText(str)
//            }
//            else//포커스 가 딴데 있으면
//            {
//                Toast.makeText(applicationContext,"포커스 선택 해주세요", Toast.LENGTH_SHORT).show()
//            }
//        }
//
//        btnNum4.setOnClickListener {
//            //포커스가 edt1 에 있는지, edt2에 있는지 체크~!
//            if(edt1.isFocused)//edt1에 포커스가 있으면
//            {
//                var str = edt1.text.toString() + "4"
//                edt1.setText(str)
//            }
//            else if(edt2.isFocused)
//            {
//                var str = edt2.text.toString() + "4"
//                edt2.setText(str)
//            }
//            else//포커스 가 딴데 있으면
//            {
//                Toast.makeText(applicationContext,"포커스 선택 해주세요", Toast.LENGTH_SHORT).show()
//            }
//        }
//
//        btnNum5.setOnClickListener {
//            //포커스가 edt1 에 있는지, edt2에 있는지 체크~!
//            if(edt1.isFocused)//edt1에 포커스가 있으면
//            {
//                var str = edt1.text.toString() + "5"
//                edt1.setText(str)
//            }
//            else if(edt2.isFocused)
//            {
//                var str = edt2.text.toString() + "5"
//                edt2.setText(str)
//            }
//            else//포커스 가 딴데 있으면
//            {
//                Toast.makeText(applicationContext,"포커스 선택 해주세요", Toast.LENGTH_SHORT).show()
//            }
//        }
//
//        btnNum6.setOnClickListener {
//            //포커스가 edt1 에 있는지, edt2에 있는지 체크~!
//            if(edt1.isFocused)//edt1에 포커스가 있으면
//            {
//                var str = edt1.text.toString() + "6"
//                edt1.setText(str)
//            }
//            else if(edt2.isFocused)
//            {
//                var str = edt2.text.toString() + "6"
//                edt2.setText(str)
//            }
//            else//포커스 가 딴데 있으면
//            {
//                Toast.makeText(applicationContext,"포커스 선택 해주세요", Toast.LENGTH_SHORT).show()
//            }
//        }
//
//        btnNum7.setOnClickListener {
//            //포커스가 edt1 에 있는지, edt2에 있는지 체크~!
//            if(edt1.isFocused)//edt1에 포커스가 있으면
//            {
//                var str = edt1.text.toString() + "7"
//                edt1.setText(str)
//            }
//            else if(edt2.isFocused)
//            {
//                var str = edt2.text.toString() + "7"
//                edt2.setText(str)
//            }
//            else//포커스 가 딴데 있으면
//            {
//                Toast.makeText(applicationContext,"포커스 선택 해주세요", Toast.LENGTH_SHORT).show()
//            }
//        }
//
//        btnNum8.setOnClickListener {
//            //포커스가 edt1 에 있는지, edt2에 있는지 체크~!
//            if(edt1.isFocused)//edt1에 포커스가 있으면
//            {
//                var str = edt1.text.toString() + "8"
//                edt1.setText(str)
//            }
//            else if(edt2.isFocused)
//            {
//                var str = edt2.text.toString() + "8"
//                edt2.setText(str)
//            }
//            else//포커스 가 딴데 있으면
//            {
//                Toast.makeText(applicationContext,"포커스 선택 해주세요", Toast.LENGTH_SHORT).show()
//            }
//        }
//
//        btnNum9.setOnClickListener {
//            //포커스가 edt1 에 있는지, edt2에 있는지 체크~!
//            if(edt1.isFocused)//edt1에 포커스가 있으면
//            {
//                var str = edt1.text.toString() + "9"
//                edt1.setText(str)
//            }
//            else if(edt2.isFocused)
//            {
//                var str = edt2.text.toString() + "9"
//                edt2.setText(str)
//            }
//            else//포커스 가 딴데 있으면
//            {
//                Toast.makeText(applicationContext,"포커스 선택 해주세요", Toast.LENGTH_SHORT).show()
//            }
//        }

        //3.kotlin객체에 이벤트 처리

        btn1.setOnTouchListener { view, motionEvent ->

            var val1 = edt1.text;
            var val2 = edt2.text;

            var str1 = val1.toString()
            var str2 = val2.toString()

//            int n1 = Integer.parseInt(str1)

//            if(str1.equals("") || str2.equals(""))
            if (str1.trim() == "" || str2.trim() == "") {
                Toast.makeText(applicationContext, "값이 비었습니다!", Toast.LENGTH_SHORT).show()
            } else {
//                var n1 = str1.toInt()
//                var n2 = str2.toInt()
//
//                var n3 = n1 + n2;
                var n1 = str1.toDouble()
                var n2 = str2.toDouble()

                var n3 = n1 + n2;

                tv1.setText("계산 결과 : " + n3)
            }



            false
        }

        btn2.setOnTouchListener { view, motionEvent ->
            var n1 = edt1.text.toString().toDouble()
            var n2 = edt2.text.toString().toDouble()
            var n3 = n1 - n2

            tv1.setText("계산 결과 : " + n3)

            false
        }

        btn3.setOnTouchListener { view, motionEvent ->
            var n1 = edt1.text.toString().toDouble()
            var n2 = edt2.text.toString().toDouble()
            var n3 = n1 * n2

            tv1.setText("계산 결과 : " + n3)

            false
        }

//        btn4.setOnTouchListener { view, motionEvent ->
//            var n1 = edt1.text.toString().toInt()
//            var n2 = edt2.text.toString().toInt()
//            var n3 = n1 / n2
//
//            tv1.setText("계산 결과 : "+n3)
//
//            false
//        }

        btn4.setOnClickListener {
            var val1 = edt1.text;
            var val2 = edt2.text;

            var str1 = val1.toString()
            var str2 = val2.toString()

//            int n1 = Integer.parseInt(str1)

//            if(str1.equals("") || str2.equals(""))
            if (str1.trim() == "" || str2.trim() == "") {
                Toast.makeText(applicationContext, "값이 비었습니다!", Toast.LENGTH_SHORT).show()
            } else//str1이 공백이 아니면, 계산하라~!
            {
                if (str2.trim() == "0") {
                    Toast.makeText(applicationContext, "0으로 못나눔~!", Toast.LENGTH_SHORT).show()
                } else {
                    //                var n1 = str1.toInt()
//                var n2 = str2.toInt()
//
//                var n3 = n1 + n2;
                    var n1 = str1.toDouble()
                    var n2 = str2.toDouble()

                    var n3 = n1 / n2;
                    n3 = (n3 * 100).toInt() / 100.0

                    tv1.setText("계산 결과 : " + n3)
                }

            }
        }

        btn5.setOnClickListener {
            var n1 = edt1.text.toString().toDouble()
            var n2 = edt2.text.toString().toDouble()
            var n3 = n1 % n2

            tv1.setText("계산 결과 : " + n3)
        }
    }
}
