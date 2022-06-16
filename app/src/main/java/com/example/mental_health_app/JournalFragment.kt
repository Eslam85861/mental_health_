package com.example.mental_health_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.chaquo.python.Python
import dagger.hilt.android.AndroidEntryPoint

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

@AndroidEntryPoint
class JournalFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
            val random :Array<Array<Any>> =random()
            val best :Array<Array<Any>> =best()
            val recommend :Array<Array<Any>> =recommend()
            //
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_journal, container, false)
    }


    private fun random(): Array<Array<Any>> {

        val python = Python.getInstance()
        val pythonFile = python.getModule("functions")
        return pythonFile.callAttr("Random_Recommendations").toJava(Array<Array<Any>>::class.java)
        //return pythonFile.callAttr("mai2n",2).toJava(ArrayList<String>)

    }
    private fun recommend(): Array<Array<Any>> {

        val python = Python.getInstance()
        val pythonFile = python.getModule("functions")
        return pythonFile.callAttr("Best_recommendations").toJava(Array<Array<Any>>::class.java)
        //return pythonFile.callAttr("mai2n",2).toJava(ArrayList<String>)

    }
    private fun best(): Array<Array<Any>> {

        val python = Python.getInstance()
        val pythonFile = python.getModule("functions")
        return pythonFile.callAttr("Best_recommendations").toJava(Array<Array<Any>>::class.java)
        //return pythonFile.callAttr("mai2n",2).toJava(ArrayList<String>)

    }
}