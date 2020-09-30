package com.example.databindingsample.recycler_view_module

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

@BindingAdapter("imageUrl")
fun setImageUrl( imgView: ImageView, imageUrl: String) {
    Glide.with(imgView.context)
        .load(imageUrl).apply(RequestOptions().circleCrop())
        .into(imgView)
}