package com.example.showtoasts

import android.content.Context
import android.widget.Toast

class ToastViewer {
    fun showToast(context: Context, message: String, duration: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(context, message, duration).show()
    }
}