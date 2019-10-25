package bonch.dev.school.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import bonch.dev.school.R

class SignUpActivity : AppCompatActivity() {

    private lateinit var textViewHeader: TextView
    private lateinit var editTextEmailSignUp: EditText
    private lateinit var editTextLogin: EditText
    private lateinit var editTextPasswordSignUp: EditText
    private lateinit var editTextPasswordConfirm: EditText
    private lateinit var buttonSignIn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.supportActionBar?.hide()
        setContentView(R.layout.sign_up_activity)
        initializeViews()
        buttonSignIn.setOnClickListener()
        {
            val intent = Intent(this, MainAppActivity::class.java)
            startActivity(intent)
        }
    }

    private fun initializeViews()
    {
        textViewHeader = findViewById(R.id.header_text_view)
        editTextEmailSignUp = findViewById(R.id.email_sign_up_et)
        editTextLogin = findViewById(R.id.login_et)
        editTextPasswordSignUp = findViewById(R.id.password_sign_up_et)
        editTextPasswordConfirm = findViewById(R.id.password_confirm_et)
        buttonSignIn = findViewById(R.id.sign_in_button)
    }
}