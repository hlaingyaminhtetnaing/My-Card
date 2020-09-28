package com.hlaingyaminhtetnaing.mycart.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.*
import com.hlaingyaminhtetnaing.mycart.R
import com.hlaingyaminhtetnaing.mycart.model.Card
import kotlinx.android.synthetic.main.my_card.view.*

class cardAdapter(var cardList:ArrayList<Card>):
    Adapter<cardAdapter.cardViewHolder>(){
    class cardViewHolder(itemView:View): ViewHolder(itemView)
    {
        fun bind(card:Card)
        {
            itemView.txtName.text=card.name
            itemView.txtPrice.text=card.price.toString()
            itemView.txtKg.text=card.kg.toString()
            itemView.imgCart.setImageResource(card.imgCard)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): cardViewHolder {
        var view=LayoutInflater.from(parent.context).inflate(R.layout.my_card,parent,false)
        return  cardViewHolder(view)
    }

    override fun getItemCount(): Int=cardList.size

    override fun onBindViewHolder(holder: cardViewHolder, position: Int) {
        holder.bind(cardList[position])
    }
}