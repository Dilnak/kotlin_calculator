package io.crazyamigos.calculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


        var res: Double = 0.0
        var flag: Int = 0
    var count:Int=0
    var key:Int=0
    fun delButtonClick(view: View) {
            displayTextView.text = ""
        res=0.0
        count=0
        flag=0
        }


        fun backButtonClick(view: View) {
            displayTextView.text=displayTextView.text.substring(0,displayTextView.text.lastIndex)

        }


        fun sevenButtonClick(view: View) {
            if ((displayTextView.text == "") || (flag == 1)) {
                displayTextView.text = "7"
                flag = 0
            } else {
                displayTextView.append("7")
            }
        }


        fun eightButtonClick(view: View) {
            if ((displayTextView.text == "") || (flag == 1)) {
                displayTextView.text = "8"
                flag = 0
            } else {
                displayTextView.append("8")
            }
        }


        fun nineButtonClick(view: View) {
            if ((displayTextView.text == "") || (flag == 1)) {
                displayTextView.text = "9"
                flag = 0
            } else {
                displayTextView.append("9")
            }
        }


        fun fourButtonClick(view: View) {
            if ((displayTextView.text == "") || (flag == 1)) {
                displayTextView.text = "4"
                flag = 0
            } else {
                displayTextView.append("4")
            }

        }


        fun fiveButtonClick(view: View) {
            if ((displayTextView.text == "") || (flag == 1)) {
                displayTextView.text = "5"
                flag = 0
            } else {
                displayTextView.append("5")
            }
        }


        fun sixButtonClick(view: View) {
            if ((displayTextView.text == "") || (flag == 1)) {
                displayTextView.text = "6"
                flag = 0
            } else {
                displayTextView.append("6")
            }
        }


        fun oneButtonClick(view: View) {
            if ((displayTextView.text == "") || (flag == 1)) {
                displayTextView.text = "1"
                flag = 0
            } else {
                displayTextView.append("1")
            }
        }


        fun twoButtonClick(view: View) {
            if ((displayTextView.text == "") || (flag == 1)) {
                displayTextView.text = "2"
                flag = 0
            } else {
                displayTextView.append("2")
            }
        }


        fun threeButtonClick(view: View) {
            if ((displayTextView.text == "") || (flag == 1)) {
                displayTextView.text = "3"
                flag = 0
            } else {
                displayTextView.append("3")
            }
        }

        fun dotButtonClick(view: View) {
            if ((displayTextView.text == "") || (flag == 1)) {
                displayTextView.text = "."
                flag = 0
            } else {
                displayTextView.append(".")
            }

        }

        fun zeroButtonClick(view: View) {
            if ((displayTextView.text == "") || (flag == 1)) {
                displayTextView.text = "0"
                flag = 0
            } else {
                displayTextView.append("0")
            }
        }


        fun equalsButtonClick(view: View) {
            when(key){
                1->{
                    res=res+displayTextView.text.toString().toDouble()
                    displayTextView.text=res.toString()

                }
                2->{
                    res=res-displayTextView.text.toString().toDouble()
                    displayTextView.text=res.toString()
                }
                3->{
                    res=res*displayTextView.text.toString().toDouble()
                    displayTextView.text=res.toString()

                }
                4->{
                    res=res/displayTextView.text.toString().toDouble()
                    displayTextView.text=res.toString()
                }

            }
            res=0.0
            count=0
            flag=1

        }

        fun plusButtonClick(view: View) {

            if ((res == 0.0)&&(count==0)) {
                flag = 1
                count++
                res = displayTextView.text.toString().toDouble()
                key=1
            } else {
                if(key==2){
                    res=res-displayTextView.text.toString().toDouble()
                    displayTextView.text=res.toString()
                    key=1
                }
                else if(key==3){
                    res=res*displayTextView.text.toString().toDouble()
                    displayTextView.text=res.toString()
                    key=1

                }
                else if(key==4){
                    res=res/displayTextView.text.toString().toDouble()
                    displayTextView.text=res.toString()
                    key=1

                }
                else{
                    res=res+displayTextView.text.toString().toDouble()
                    displayTextView.text=res.toString()
                    key=1
                }

                flag = 1
                count++

            }

        }

        fun minusButtonClick(view: View) {
            if ((res == 0.0)&&(count==0)) {
                flag = 1
                count++
                key=2
                res = displayTextView.text.toString().toDouble()
            } else {
                if(key==1){
                    res=res+displayTextView.text.toString().toDouble()
                    displayTextView.text=res.toString()
                    key=2
                }
                else if(key==3){
                    res=res*displayTextView.text.toString().toDouble()
                    displayTextView.text=res.toString()
                    key=2

                }
                else if(key==4){
                    res=res/displayTextView.text.toString().toDouble()
                    displayTextView.text=res.toString()
                    key=2

                }
                else{
                    res=res-displayTextView.text.toString().toDouble()
                    displayTextView.text=res.toString()
                    key=2
                }
                flag = 1
                count++
            }


        }

        fun productButtonClick(view: View) {

            if ((res == 0.0)&&(count==0)) {
                flag = 1
                count++
                res = displayTextView.text.toString().toDouble()
                key=3
            } else {
                if(key==1){
                    res=res+displayTextView.text.toString().toDouble()
                    displayTextView.text=res.toString()
                    key=3
                }
                else if(key==2){
                    res=res-displayTextView.text.toString().toDouble()
                    displayTextView.text=res.toString()
                    key=3
                }
                else if(key==4) {
                    res = res / displayTextView.text.toString().toDouble()
                    displayTextView.text = res.toString()
                    key = 3
                }
                else
                {
                    res=res*displayTextView.text.toString().toDouble()
                    displayTextView.text=res.toString()
                    key=3
                }
                flag = 1
                count++
            }

        }

        fun divisionButtonClick(view: View) {

            if ((res == 0.0)&&(count==0)) {
                flag=1
                count++
                res=displayTextView.text.toString().toDouble()
            } else {
                if(key==1){
                    res=res+displayTextView.text.toString().toDouble()
                    displayTextView.text=res.toString()
                    key=4

                }
                else if(key==2){
                    res=res-displayTextView.text.toString().toDouble()
                    displayTextView.text=res.toString()
                    key=4
                }
                else if(key==3){
                    res=res*displayTextView.text.toString().toDouble()
                    displayTextView.text=res.toString()
                    key=4
                }
                else{
                    res=res/displayTextView.text.toString().toDouble()
                    displayTextView.text=res.toString()
                    key=4
                }
                flag = 1
                count++

            }

        }


    }











