package uz.ghost.expensivview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.ghost.expensivview.databinding.ActivityMain2Binding
import uz.ghost.expensivview.databinding.ActivityMainBinding
import uz.ghost.expensivview.utils.Mydata

class MainActivity2 : AppCompatActivity() {
    private val binding by lazy { ActivityMain2Binding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val nomi = intent.getStringExtra("name")

        if (nomi == Mydata.map[Mydata.titleList[0]]?.get(0)){
            binding.btnText.text =
                "$nomi \n\n "
        }

    }
}