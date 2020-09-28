package com.hlaingyaminhtetnaing.mycart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.hlaingyaminhtetnaing.mycart.adapter.cardAdapter
import com.hlaingyaminhtetnaing.mycart.model.Card
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var cardlist=ArrayList<Card>()
        cardlist.add(Card("Fine Grain Sugar",20.00,1,R.drawable.sugar))
        cardlist.add(Card("Peanuts",20.00,3,R.drawable.peanuts))
        cardlist.add(Card("Dawat Rice",20.00,2,R.drawable.rice))
        var cardadapter=cardAdapter(cardlist)
       // myCardRecycler.layoutManager= LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)
        myCardRecycler.layoutManager= LinearLayoutManager(this)
        myCardRecycler.adapter=cardadapter
    }
}