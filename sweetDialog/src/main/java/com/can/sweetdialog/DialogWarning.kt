package com.can.sweetdialog

import android.app.Dialog
import android.content.Context
import android.graphics.drawable.Drawable
import android.net.Uri
import android.os.Bundle
import android.util.TypedValue
import android.view.WindowManager
import androidx.annotation.DimenRes
import androidx.core.view.isVisible
import com.can.sweetdialog.databinding.DialogWarningBinding

class DialogWarning(private val context: Context) : Dialog(context) {

    private var binding: DialogWarningBinding = DialogWarningBinding.inflate(layoutInflater)

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
    fun setTitle(title: String): DialogWarning {
        binding.tvTitle.text = title
        return this
    }

    /**
     * Set title text size from dimens
     *
     * @param size: dimens id
     */
    fun setTitleTextSize(@DimenRes size: Int): DialogWarning {
        binding.tvTitle.setTextSize(TypedValue.COMPLEX_UNIT_PX, context.resources.getDimension(size))
        return this
    }

    /**
     * Set drawable
     *
     * @param drawable: drawable id
     */
    fun setImageDrawable(drawable: Drawable?): DialogWarning {
        binding.ivImage.setImageDrawable(drawable)
        return this
    }

    /**
     * Set image from uri
     *
     * @param uri: uri image not online
     */
    fun setImageURI(uri: Uri): DialogWarning {
        binding.ivImage.setImageURI(uri)
        return this
    }

    /**
     * Set describe text
     *
     * @param describe: String describe
     */
    fun setDescribe(describe: String): DialogWarning {
        binding.tvDescribe.isVisible = true
        binding.tvDescribe.text = describe
        return this
    }

    /**
     * Set describe text size
     *
     * @param size: String describe text size
     */
    fun setDescribe(@DimenRes size: Int): DialogWarning {
        binding.tvDescribe.setTextSize(TypedValue.COMPLEX_UNIT_PX, context.resources.getDimension(size))
        return this
    }

    /**
     * Set positive text
     *
     * @param positiveText: String positive text
     */
    fun setPositiveText(positiveText: String): DialogWarning {
        binding.btnConfirmation.text = positiveText
        return this
    }

    /**
     * Set negative text
     *
     * @param negativeText: String negative text
     */
    fun setNegativeText(negativeText: String): DialogWarning {
        binding.btnCancel.text = negativeText
        return this
    }

    /**
     * Set on positive click listener
     *
     * @param listener callback function
     */
    fun setOnPositiveClickListener(listener: () -> Unit) : DialogWarning {
        binding.btnConfirmation.setOnClickListener {
            listener()
        }
        return this
    }

    /**
     * Set on negative click listener
     *
     * @param listener callback function
     */
    fun setOnNegativeClickListener(listener: () -> Unit) : DialogWarning {
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