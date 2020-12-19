package com.hammer67.store.utils

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatEditText
import androidx.appcompat.widget.AppCompatTextView

class MSPEditText(context:Context, attributeSet: AttributeSet) : AppCompatEditText(context, attributeSet) {

    init {
        applyFont()
    }

    private fun applyFont(){
        val boldTypeface : Typeface =
        Typeface.createFromAsset(context.assets,"Montserrat-Regular.ttf")
        typeface = boldTypeface
    }

}