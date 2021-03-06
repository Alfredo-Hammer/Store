package com.hammer67.store.utils

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatTextView

class MSPButton(context:Context, attributeSet: AttributeSet) : AppCompatButton(context, attributeSet) {

    init {
        applyFont()
    }

    private fun applyFont(){
        val boldTypeface : Typeface =
        Typeface.createFromAsset(context.assets,"Montserrat-Bold.ttf")
        typeface = boldTypeface
    }

}