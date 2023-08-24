package com.can.sweetdialog

import android.app.Dialog
import android.content.Context
import android.graphics.drawable.Drawable
import android.net.Uri
import android.os.Bundle
import android.util.TypedValue
import android.view.WindowManager
import androidx.annotation.DimenRes
import com.can.sweetdialog.databinding.DialogErrorBinding

class DialogError(private val context: Context) : Dialog(context) {


    private var binding: DialogErrorBinding = DialogErrorBinding.inflate(layoutInflater)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        window?.attributes?.width = WindowManager.LayoutParams.MATCH_PARENT

        setOnNegativeClickListener()
    }

    /**
     * Set title text
     *
     * @param title: string for text
     */
    fun setTitle(title: String): DialogError {
        binding.tvTitle.text = title
        return this
    }

    /**
     * Set title text size from dimens
     *
     * @param size: dimens id
     */
    fun setTitleTextSize(@DimenRes size: Int): DialogError {
        binding.tvTitle.setTextSize(TypedValue.COMPLEX_UNIT_PX, context.resources.getDimension(size))
        return this
    }

    /**
     * Set drawable
     *
     * @param drawable: drawable id
     */
    fun setImageDrawable(drawable: Drawable?): DialogError {
        binding.ivImage.setImageDrawable(drawable)
        return this
    }

    /**
     * Set image from uri
     *
     * @param uri: uri image not online
     */
    fun setImageURI(uri: Uri): DialogError {
        binding.ivImage.setImageURI(uri)
        return this
    }

    /**
     * Set describe text
     *
     * @param describe: String describe
     */
    fun setDescribe(describe: String): DialogError {
        binding.tvDescribe.text = describe
        return this
    }

    /**
     * Set describe text size
     *
     * @param size: String describe text size
     */
    fun setDescribe(@DimenRes size: Int): DialogError {
        binding.tvDescribe.setTextSize(TypedValue.COMPLEX_UNIT_PX, context.resources.getDimension(size))
        return this
    }

    /**
     * Set negative text
     *
     * @param negativeText: String negative text
     */
    fun setNegativeText(negativeText: String): DialogError {
        binding.btnCancel.text = negativeText
        return this
    }

    /**
     * Set on negative click listener
     *
     * @param listener callback function
     */
    fun setOnNegativeClickListener(listener: () -> Unit) : DialogError {
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