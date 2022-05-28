package com.example.mental_health_app

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mental_health_app.chat.view.ChatActivity
import com.example.mental_health_app.databinding.ActivityMainBinding
import com.example.mental_health_app.databinding.FragmentHomeBinding
import com.example.notesapp.notes.view.NotesActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater)
        onClickActions()
        onClickActions_quotes()
        return binding.root
    }

    private fun onClickActions() {
        binding.llNotes.setOnClickListener(){
            val intent = Intent (activity, NotesActivity::class.java)
            activity?.startActivity(intent)
        }
    }
    private fun onClickActions_quotes() {
        binding.llQuotes.setOnClickListener(){
            val intent = Intent (activity, QuotesActivity::class.java)
            activity?.startActivity(intent)
        }
    }
}