package com.rizal.dicodingsubmission

import android.content.Intent
import android.inputmethodservice.ExtractEditText
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.rizal.dicodingsubmission.DetailStream.Companion.EXTRA_FOUNDED
import com.rizal.dicodingsubmission.DetailStream.Companion.EXTRA_FOUNDER
import com.rizal.dicodingsubmission.DetailStream.Companion.EXTRA_HEADQUARTERS
import com.rizal.dicodingsubmission.DetailStream.Companion.EXTRA_LINK

class ListStreamAdapter(private val listStream: ArrayList<Stream>) : RecyclerView.Adapter<ListStreamAdapter.ListViewHolder>() {

    inner class ListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)

    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder{
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_card_stream,viewGroup, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listStream.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (name, photo, detail, founded, founder, headquarters, link ) = listStream[position]

        Glide.with(holder.itemView.context)
            .load(photo)
            .apply(RequestOptions().override(60,60))
            .into(holder.imgPhoto)

        holder.tvName.text = name
        holder.tvDetail.text= detail

        val mContext = holder.itemView.context

        holder.itemView.setOnClickListener{
            val moveDetailStream = Intent(mContext, DetailStream::class.java)
            moveDetailStream.putExtra(DetailStream.EXTRA_NAME, name)
            moveDetailStream.putExtra(DetailStream.EXTRA_PHOTO, photo)
            moveDetailStream.putExtra(DetailStream.EXTRA_DETAIL, detail)
            moveDetailStream.putExtra(DetailStream.EXTRA_FOUNDED, founded)
            moveDetailStream.putExtra(DetailStream.EXTRA_FOUNDER, founder)
            moveDetailStream.putExtra(DetailStream.EXTRA_HEADQUARTERS, headquarters)
            moveDetailStream.putExtra(DetailStream.EXTRA_LINK, link)
            mContext.startActivity(moveDetailStream)
        }
    }

}