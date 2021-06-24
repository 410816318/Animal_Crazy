package tw.edu.pu.s1081631.animal_crazy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.bumptech.glide.annotation.GlideModule
import com.bumptech.glide.module.AppGlideModule
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

@GlideModule
public final class MyAppGlideModule : AppGlideModule()

class MainActivity : AppCompatActivity() {

    var Flag:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(baseContext, "作品：動物急轉彎", Toast.LENGTH_LONG).show()
        rndAnimal()

        GlideApp.with(this)
            .load(R.drawable.bbkpf)
            .override(1000, 800)
            .into(imgTitle)


        imgNext.setOnLongClickListener(object : View.OnLongClickListener {
            override fun onLongClick(p0: View?): Boolean {
                intent = Intent(this@MainActivity, GameActivity::class.java).apply{
                    putExtra("動物",Flag)
                }
                //startActivity(intent)
                startActivityForResult(intent,101)
                return true
            }
        })

        imgNext.setOnClickListener(object:View.OnClickListener{
            override fun onClick(v: View?) {
                rndAnimal()
            }

        })
    }

    fun rndAnimal(){
        Flag = (1..4).random()
        when(Flag){
            1->imgNext.setImageResource(R.drawable.bird)
            2->imgNext.setImageResource(R.drawable.lion)
            3->imgNext.setImageResource(R.drawable.otter)
            4->imgNext.setImageResource(R.drawable.shanqiang)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == 101){
            intent = Intent(this@MainActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}