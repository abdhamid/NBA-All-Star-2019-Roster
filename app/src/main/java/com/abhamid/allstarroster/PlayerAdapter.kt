package com.abhamid.allstarroster

import android.content.Intent
import android.graphics.Color
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.squareup.picasso.Picasso
import java.text.FieldPosition

class PlayerAdapter(private val player: ArrayList<Players>): RecyclerView.Adapter<PlayerAdapter.ViewHolder>(){

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val view =LayoutInflater.from(viewGroup.context).inflate(
            R.layout.item_player_card, viewGroup, false
        )
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return player.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       val (playerName, playerPosition, playerNumber, playerPhoto, playerDesc, playerTeam ) = player[position]
        Picasso.get().load(playerTeam).placeholder(R.drawable.placeholder).into(holder.playerImg)
        if (position== 0){
            holder.captLabel.text = "CAPTAIN"
            holder.captLabel.setBackgroundColor(Color.parseColor("#0099CC"))
        }
        else if (position > 0 && position < 5){
            holder.captLabel.text = "STARTER"
            holder.captLabel.setBackgroundColor(Color.parseColor("#3bae3b"))
        }
        else {
            holder.captLabel.text = "RESERVE"
            holder.captLabel.setBackgroundColor(Color.parseColor("#ffa500"))
        }
        holder.playerName.text = playerName
        holder.playerPosition.text = playerPosition
        holder.playerNumber.text = playerNumber



    }


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var playerName: TextView = itemView.findViewById(R.id.player_name)
        var playerNumber: TextView = itemView.findViewById(R.id.player_number)
        var playerPosition: TextView = itemView.findViewById(R.id.player_position)
        var playerImg: ImageView = itemView.findViewById(R.id.player_img)
        var captLabel: TextView = itemView.findViewById(R.id.capt_label)

        init {
            itemView.setOnClickListener {
                val pos = adapterPosition
                val item = player[pos]
                val detailsIntent = Intent(itemView.context, DetailsActivity::class.java)
//                println("""
//                    ${item.name},
//                    ${item.position},
//                    ${item.number},
//                    ${item.team},
//                    ${item.desc},
//                    ${item.photo}
//                """.trimIndent())
                detailsIntent.putExtra("name", item.name)
                detailsIntent.putExtra("desc", item.desc)
                detailsIntent.putExtra("number", item.number)
                detailsIntent.putExtra("photo", item.photo)
                detailsIntent.putExtra("position", item.position)
                detailsIntent.putExtra("team", item.team)
                detailsIntent.putExtra("link", item.hg)
                itemView.context.startActivity(detailsIntent)
            }
        }

    }

    interface OnItemClickListener{
        fun onItemClicked()
    }
}