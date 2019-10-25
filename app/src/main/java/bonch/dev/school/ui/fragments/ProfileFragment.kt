package bonch.dev.school.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import bonch.dev.school.R
import org.w3c.dom.Text

class ProfileFragment : Fragment() {

    private lateinit var imageViewAvatar: ImageView
    private lateinit var textEditName: EditText
    private lateinit var textViewEmail: TextView
    private lateinit var buttonEmailConfirm: Button
    private lateinit var buttonPasswordChange: Button
    private lateinit var buttonSignOut: Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val myFragmentView = inflater.inflate(R.layout.fragment_profile, container, false)
        initializeViews(myFragmentView)
        setOnClickListeners()
        return myFragmentView
    }

    private fun initializeViews(fragmentView: View)
    {
        imageViewAvatar = fragmentView.findViewById(R.id.avatar_image_view)
        textEditName = fragmentView.findViewById(R.id.name_edit_text)
        textViewEmail = fragmentView.findViewById(R.id.email_text_view)
        buttonEmailConfirm = fragmentView.findViewById(R.id.email_confirm_button)
        buttonPasswordChange = fragmentView.findViewById(R.id.change_password_button)
        buttonSignOut = fragmentView.findViewById(R.id.sign_out_button)
    }

    private fun setOnClickListeners()
    {
        buttonSignOut.setOnClickListener()
        {
            fragmentManager!!.beginTransaction().remove(this).commit()
        }

        buttonPasswordChange.setOnClickListener()
        {
            val fragment = PasswordFragment()
            replaceFragment(fragment)
        }
    }

    private fun replaceFragment(replacingFragment: Fragment)
    {
        fragmentManager!!
            .beginTransaction()
            .add(R.id.fragment, replacingFragment)
            .addToBackStack("fragment")
            .commit()
    }
}