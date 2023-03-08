package uz.ghost.expensivview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import uz.ghost.expensivview.aadter.Adapter
import uz.ghost.expensivview.databinding.ActivityMainBinding
import uz.ghost.expensivview.utils.Mydata

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private lateinit var exception: Adapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        Mydata.addElement()

        exception = Adapter(Mydata.titleList,Mydata.map)
        binding.myExpenView.setAdapter(exception)

        binding.myExpenView.setOnChildClickListener { parent, v, groupPosition, childPosition, id ->
            val intent = Intent(this,MainActivity2::class.java)
            intent.putExtra("name", Mydata.map[Mydata.titleList[groupPosition]]?.get(childPosition))
            startActivity(intent)
            true
        }



    }
}
