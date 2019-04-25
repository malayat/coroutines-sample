package com.antonioleiva.coroutines

import android.content.Context
import android.widget.Toast

inline fun Context.toast(message: CharSequence): Toast = Toast
    .makeText(this, message, Toast.LENGTH_SHORT)
    .apply {
        show()
    }