package com.example.mvrxpaged.ui.main.view

import android.content.Context
import android.util.AttributeSet
import android.widget.LinearLayout
import android.widget.TextView
import com.airbnb.epoxy.ModelView
import com.example.mvrxpaged.R
import com.example.mvrxpaged.R2
import com.example.mvrxpaged.ui.OnClick
import com.example.mvrxpaged.ui.main.ItemViewModel

class CategoryView @JvmOverloads constructor(
    context: Context,
    attributeSet: AttributeSet? = null
) : LinearLayout(context, attributeSet) {

    data class Model(override val id: String, val content: String, val onClick: OnClick) : ItemViewModel

    private val contentTextView: TextView by lazy { findViewById<TextView>(R.id.content) }
    private val headerTextView: TextView by lazy { findViewById<TextView>(R.id.header) }
    private val footerTextView: TextView by lazy { findViewById<TextView>(R.id.footer) }

    fun setContent(value: String) {
        contentTextView.text = value
    }

    fun setHeader(value: String) {
        headerTextView.text = "-- CATEGORY HEADER OF $value ---".toUpperCase()
    }

    fun setFooter(value: String) {
        footerTextView.text = "-- CATEGORY FOOTER OF $value ---".toUpperCase()
    }

    fun setOnClick(onClick: OnClick? = null) {
        contentTextView.setOnClickListener(onClick)
    }
}