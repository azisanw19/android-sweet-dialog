package com.can.sweetdialog

import android.app.Dialog
import android.content.Context
import android.graphics.drawable.Drawable
import android.net.Uri
import android.os.Bundle
import android.util.TypedValue
import android.view.WindowManager
import androidx.annotation.DimenRes
import androidx.annotation.RawRes
import androidx.core.view.isVisible
import com.can.sweetdialog.databinding.DialogConfirmationBinding
import com.can.sweetdialog.databinding.DialogLoadingBinding

class DialogLoading(private val context: Context) : Dialog(context) {

    private var binding: DialogLoadingBinding = DialogLoadingBinding.inflate(layoutInflater)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        window?.attributes?.width = WindowManager.LayoutParams.MATCH_PARENT
    }

    /**
     * Set lottie raw
     *
     * @param rawRes: rawRes id
     */
    fun setImageDrawable(@RawRes rawRes: Int): DialogLoading {
        binding.ivImage.setAnimation(rawRes)
        return this
    }

    /**
     * Set negative text
     *
     * @param negativeText: String negative text
     */
    fun setNegativeText(negativeText: String): DialogLoading {
        binding.btnCancel.text = negativeText
        return this
    }

    /**
     * set visible negative button
     *
     * @param isVisible: Boolean
     */
    fun setVisibleNegativeButton(isVisible: Boolean) : DialogLoading {
        if (isVisible) {
            binding.btnCancel.isVisible = true
            setOnNegativeClickListener()
        }
        else {
            binding.btnCancel.isVisible = false
        }
        return this
    }

    /**
     * Set on negative click listener
     *
     * @param listener callback function
     */
    fun setOnNegativeClickListener(listener: () -> Unit) : DialogLoading {
        binding.btnCancel.setOnClickListener {
            listener()
            dismiss()
        }
        return this
    }

    private fun setOnNegativeClickListener() {
        binding.btnCancel.setOnClickListener {
            dismiss()
        }
    }
}