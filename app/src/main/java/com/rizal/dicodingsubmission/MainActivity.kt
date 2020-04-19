package com.rizal.dicodingsubmission

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvStream: RecyclerView
    private var list: ArrayList<Stream> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val actionbar = supportActionBar
        actionbar!!.title="Home"

        rvStream = findViewById(R.id.rv_stream)
        rvStream.setHasFixedSize(true)

        list.addAll(StreamData.listData)
        showRecyclerList()
    }

    private fun  showRecyclerList(){
        rvStream.layoutManager = LinearLayoutManager(this)
        val  listStreamAdapter = ListStreamAdapter(list)
        rvStream.adapter = listStreamAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.option_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean{
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }


    private fun setMode(selectedMode: Int) {
        when(selectedMode){
            R.id.miCompose -> {
                val iAbout = Intent(this@MainActivity, About::class.java)
                startActivity(iAbout)
            }
        }
    }

}
