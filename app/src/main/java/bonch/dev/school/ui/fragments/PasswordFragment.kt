package bonch.dev.school.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.DialogFragment
import bonch.dev.school.R

class PasswordFragment: DialogFragment() {

    private lateinit var editTextEmailSignUp: EditText
    private lateinit var editTextLogin: EditText
    private lateinit var editTextPasswordSignUp: EditText
    private lateinit var buttonChange: Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val myFragmentView = inflater.inflate(R.layout.fragment_password, container, false)
        initializeViews(myFragmentView)
        return myFragmentView
    }

    private fun initializeViews(fragmentView: View)
    {
        editTextEmailSignUp = fragmentView.findViewById(R.id.email_sign_up_et)
        editTextLogin = fragmentView.findViewById(R.id.login_et)
        editTextPasswordSignUp = fragmentView.findViewById(R.id.password_sign_up_et)
        buttonChange = fragmentView.findViewById(R.id.change_button)
    }
}