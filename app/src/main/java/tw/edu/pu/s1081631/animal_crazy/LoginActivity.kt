package tw.edu.pu.s1081631.animal_crazy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_game.*
import kotlinx.android.synthetic.main.activity_game.button4
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var intent = getIntent()

        button5.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {


                val intent5 = Intent(this@LoginActivity, MainActivity::class.java)
                startActivity(intent5)

            }


        })
    }
}
