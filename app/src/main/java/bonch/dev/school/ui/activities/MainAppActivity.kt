package bonch.dev.school.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import bonch.dev.school.R
import bonch.dev.school.ui.fragments.ChatFragment

class MainAppActivity : AppCompatActivity() {

    val fragmentManager = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_app)
        attachChatFragment()
    }

    private fun attachChatFragment()
    {
        val fragment = ChatFragment()

        fragmentManager
            .beginTransaction()
            .add(R.id.fragment, fragment)
            .commit()
    }
}