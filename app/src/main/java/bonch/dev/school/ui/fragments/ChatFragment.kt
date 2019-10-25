package bonch.dev.school.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import bonch.dev.school.R
import kotlinx.android.synthetic.*

class ChatFragment : Fragment() {

    private lateinit var editTextMessage: EditText
    private lateinit var buttonSendMessage: Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val myFragmentView = inflater.inflate(R.layout.fragment_chat, container, false)
        initializeViews(myFragmentView)
        buttonSendMessage.setOnClickListener()
        {
            val fragment = ProfileFragment()
            replaceFragment(fragment)
        }
        return myFragmentView
    }

    private fun initializeViews(fragmentView: View)
    {
        editTextMessage = fragmentView.findViewById(R.id.message_et)
        buttonSendMessage = fragmentView.findViewById(R.id.send_message_button)
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