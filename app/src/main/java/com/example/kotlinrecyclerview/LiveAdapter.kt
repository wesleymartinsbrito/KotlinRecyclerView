package com.example.kotlinrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinrecyclerview.models.live
import com.google.android.gms.fido.fido2.api.common.RequestOptions
import kotlinx.android.synthetic.main.res_item_live.view.*

class LiveAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var itens: List<live> = ArrayList()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        return LiveViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.res_item_live, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        when (holder) {
            is LiveViewHolder -> {
                holder.bind(itens[position])
            }
        }
    }

    override fun getItemCount(): Int {
        return itens.size
    }

    fun setDataSet(lives: List<live>) {
        this.itens = lives
    }

    class LiveViewHolder constructor(
        itemView: View
    ) : RecyclerView.ViewHolder(itemView) {
        private val liveTitle = itemView.title
        private val liveAuthor = itemView.author

        fun bind(live: live) {
            liveTitle.text = live.title
            liveAuthor.text = live.author

        }
    }
}