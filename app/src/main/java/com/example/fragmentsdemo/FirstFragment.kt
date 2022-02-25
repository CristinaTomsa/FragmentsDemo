package com.example.fragmentsdemo

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup



class FirstFragment : Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i("tag", "fragment onAttach")
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        Log.i("tag", "fragment onCreate")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
        Log.i("tag", "fragment onCreateView")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("tag", "fragment onViewCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.i("tag", "fragment onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("tag", "fragment onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("tag", "fragment onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("tag", "fragment onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i("tag", "fragment onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("tag", "fragment onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.i("tag", "fragment onDetach")
    }

   companion object{
       const val tag = "tag"
   }
}