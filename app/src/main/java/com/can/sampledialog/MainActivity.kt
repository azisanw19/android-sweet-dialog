package com.can.sampledialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.can.sampledialog.databinding.ActivityMainBinding
import com.can.sweetdialog.DialogConfirmation
import com.can.sweetdialog.DialogError
import com.can.sweetdialog.DialogLoading
import com.can.sweetdialog.DialogSuccess
import com.can.sweetdialog.DialogWarning

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnDialogConfirmation.setOnClickListener {
            val dialog = DialogConfirmation(this)
            dialog.setTitle("Logout Account")
                .setImageDrawable(ContextCompat.getDrawable(this, android.R.drawable.ic_menu_manage))
                .setDescribe("Lorem ipsum")
                .setOnNegativeClickListener {
                    // TODO(on set negative click)
                }
                .setOnPositiveClickListener {
                    // TODO(on set positive click)
                }

            // for show dialog
            dialog.show()

            // for dismiss dialog
            dialog.dismiss()


        }

        binding.btnDialogConfirmationDefault.setOnClickListener {
            val dialog = DialogConfirmation(this)
                .show()
        }

        binding.btnDialogError.setOnClickListener {
            val dialog = DialogError(this)

            dialog.setTitle("this is title")
                .setDescribe("This is describe")
                .setOnNegativeClickListener {
                    Toast.makeText(this, "Error negative click", Toast.LENGTH_LONG).show()
                }
                .show()
        }

        binding.btnDialogErrorDefault.setOnClickListener {
            val dialog = DialogError(this).show()
        }

        binding.btnDialogSuccess.setOnClickListener {
            val dialog = DialogSuccess(this)

            dialog.setTitle("this is title")
                .setDescribe("This is describe")
                .setOnNegativeClickListener {
                    Toast.makeText(this, "Error negative click", Toast.LENGTH_LONG).show()
                }
                .show()
        }

        binding.btnDialogSuccessDefault.setOnClickListener {
            val dialog = DialogSuccess(this).show()
        }

        binding.btnDialogWarning.setOnClickListener {
            val dialog = DialogWarning(this)
                .setTitle("Logout Account")
                .setImageDrawable(ContextCompat.getDrawable(this, android.R.drawable.ic_menu_manage))
                .setDescribe("Lorem ipsum")
                .show()


        }

        binding.btnDialogWarningDefault.setOnClickListener {
            val dialog = DialogWarning(this)
                .show()
        }

        binding.btnDialogLoading.setOnClickListener {
            val dialog = DialogLoading(this)
                .setVisibleNegativeButton(true)
                .show()
        }

        binding.btnDialogLoadingDefault.setOnClickListener {
            val dialog = DialogLoading(this)
                .show()
        }
    }
}