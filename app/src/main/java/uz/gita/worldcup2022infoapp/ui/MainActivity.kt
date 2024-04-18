package uz.gita.worldcup2022infoapp.ui

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import uz.gita.worldcup2022infoapp.R
import uz.gita.worldcup2022infoapp.ui.adapter.TableAdapter
import uz.gita.worldcup2022infoapp.data.domain.TableRepository

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rv = findViewById<RecyclerView>(R.id.rvTable)
        val adapter = TableAdapter()
        rv.adapter = adapter
        val repository = TableRepository.getInstance()
        adapter.submitList(repository.getTableData())
        adapter.setItemClickListener {
            val intent = Intent(this@MainActivity, InfoActivity::class.java)
            intent.putExtra("TEAM_ID", it.first)
            intent.putExtra("TEAM_FLAG", it.second)
            startActivity(intent)
        }
    }

}
