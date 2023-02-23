package org.anvei.novelreader.ui.me

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import org.anvei.novelreader.R
import org.anvei.novelreader.activity.ReadActivity

class MeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =  inflater.inflate(R.layout.fragment_me, container, false)
        view.findViewById<Button>(R.id.test1).setOnClickListener {
            startActivity(Intent(activity, ReadActivity::class.java))
        }
        return view
    }
}