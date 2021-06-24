package tw.edu.pu.s1081631.animal_crazy

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.Canvas
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_game.*
import kotlinx.android.synthetic.main.activity_main.*


class GameActivity : AppCompatActivity() {

    var FlagAnimal:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        btnBack.isEnabled = true

        var intent =getIntent()
        FlagAnimal = intent.getIntExtra("動物",0)
        when(FlagAnimal){
            1->txvMsg.text="請選出台灣藍鵲"
            2->txvMsg.text="請選出石虎"
            3->txvMsg.text="請選出歐亞水獺"
            4->txvMsg.text="請選出山羌"
        }


        btnBack.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                finish()

            }
        })

        var FlagDraw:Int = 0

        button4.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {

                FlagDraw= 1
                if(FlagAnimal == FlagDraw) {
                    val intent1 = Intent(this@GameActivity, BirdActivity::class.java)
                    startActivity(intent1)
                }
                else{
                    txvMsg.text = "請再試試看喔!"
                }
            }


        })

        button3.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {

                FlagDraw= 2
                if(FlagAnimal == FlagDraw) {
                    val intent2 = Intent(this@GameActivity, LionActivity::class.java)
                    startActivity(intent2)
                }
                else{
                    txvMsg.text = "請再試試看喔!"
                }
            }

        })

        button2.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {

                FlagDraw= 3
                if(FlagAnimal == FlagDraw) {
                    val intent3 = Intent(this@GameActivity, OtterActivity::class.java)
                    startActivity(intent3)
                }
                else{
                    txvMsg.text = "請再試試看喔!"
                }
            }

        })

        button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {

                FlagDraw= 4
                if(FlagAnimal == FlagDraw) {
                    val intent4 = Intent(this@GameActivity, ShanqiangActivity::class.java)
                    startActivity(intent4)
                }
                else{
                    txvMsg.text = "請再試試看喔!"
                }
            }

        })


    }
}