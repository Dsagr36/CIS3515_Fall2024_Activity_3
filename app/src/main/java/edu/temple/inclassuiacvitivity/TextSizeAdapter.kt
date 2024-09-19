package edu.temple.inclassuiacvitivity

import android.content.Context
import android.util.Size
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class TextSizeAdapter(private val context: Context, private val sizes: Array<Int>): BaseAdapter() {

    override fun getCount() = sizes.size

    override fun getItem(position: Int) = sizes[position]

    override fun getItemId(position: Int) = position.toLong()


    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val textView = TextView(context)

        textView.setPadding(5,10,0,10)

        textView.textSize = getItem(position).toString().toFloat()

        return textView
    }

}