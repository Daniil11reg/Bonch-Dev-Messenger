package bonch.dev.school.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import bonch.dev.school.R

class SignInActivity : AppCompatActivity() {
    private lateinit var textViewHeader: TextView
    private lateinit var editTextSignIn: EditText
    private lateinit var editTextSignUp: EditText
    private lateinit var buttonSignIn: Button
    private lateinit var buttonSignUp: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.supportActionBar?.hide()
        setContentView(R.layout.sign_in_activity)
        initializeViews()
        setOnClickListeners()

    }

    private fun initializeViews()
    {
        textViewHeader = findViewById(R.id.header_text_view)
        editTextSignIn = findViewById(R.id.email_sign_in_edit_text)
        editTextSignUp = findViewById(R.id.password_sign_in_edit_text)
        buttonSignIn = findViewById(R.id.sign_in_button)
        buttonSignUp = findViewById(R.id.sign_up_button)
    }

    private fun setOnClickListeners()
    {
        buttonSignIn.setOnClickListener()
        {
            val intent = Intent(this, MainAppActivity::class.java)
            startActivity(intent)
        }

        buttonSignUp.setOnClickListener()
        {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
    }
}