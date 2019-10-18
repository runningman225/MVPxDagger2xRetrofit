package com.example.modelviewpresenterexample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast

import androidx.recyclerview.widget.RecyclerView
import com.example.modelviewpresenterexample.model.Item

class BookAdapter() : RecyclerView.Adapter<BookAdapter.BookViewHolder>() {

    var bookList= listOf<Item>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.list_item_book,parent,false)
        return BookViewHolder(view)
    }

    override fun getItemCount(): Int {
        return bookList.size
    }

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        val item = bookList[position]
        holder.tvTitle.text = item.volumeInfo?.title
        holder.tvAuthor.text = item.volumeInfo?.authors.toString()
    }

    inner class BookViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val tvTitle = view.findViewById<TextView>(R.id.tv_title)
        val tvAuthor = view.findViewById<TextView>(R.id.tv_authors)
    }
}