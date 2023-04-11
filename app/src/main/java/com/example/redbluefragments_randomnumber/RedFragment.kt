package com.example.redbluefragments_randomnumber

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import kotlin.random.Random

/**
 * A simple [Fragment] subclass.
 * Use the [RedFragment.newInstance] factory method to
 * create an instance of this fragment.
 */

const val RANDOM_NUMBER_GENERATED = "com.example.blahblah1"
class RedFragment : Fragment() {

    private lateinit var sendRandomNumberButton: Button
    private lateinit var choiceAButton: Button
    private lateinit var choiceBButton: Button
    private lateinit var choiceATextView: TextView
    private lateinit var choiceBTextView: TextView

    private var countA = 0
    private var countB = 0

    private val randomNumberViewModel: RandomNumberViewModel by lazy {
        ViewModelProvider(requireActivity()).get(RandomNumberViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_red, container, false)
        sendRandomNumberButton = view.findViewById(R.id.send_random_number_button)

        sendRandomNumberButton.setOnClickListener {
            sendRandomNumber()
        }


        choiceAButton = view.findViewById(R.id.choice_a_button)
        choiceBButton = view.findViewById(R.id.choice_b_button)
        choiceATextView = view.findViewById(R.id.count_a_textview)
        choiceBTextView = view.findViewById(R.id.count_b_textview)

        choiceAButton.setOnClickListener {
            countA++
            choiceATextView.text = countA.toString()
        }

        choiceBButton.setOnClickListener {
            countB++
            choiceBTextView.text = countB.toString()
        }

        return view
    }

    private fun sendRandomNumber() {
        val random = Random.nextInt(100)
        randomNumberViewModel.randomNumber = random

        parentFragmentManager.setFragmentResult(RANDOM_NUMBER_GENERATED, Bundle.EMPTY)
    }

    private fun addToCountA() {

            RandomNumberViewModel.addCountB()
            updateCount()
        }

        private fun updateCount() {
            val palestinianCountInt = palestinianCountReturned + surveyViewModel.getPalestinian()
            val palestinianCountString = palestinianCountInt.toString()
            palestinianCount.text = palestinianCountString
            // Add the get functions from the ViewModel to the Extra int from the results activity
            val israeliCountInt = israeliCountReturned + surveyViewModel.getIsraeli()
            val israeliCountString = israeliCountInt.toString()
            israeliCount.text = israeliCountString
        }


    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         */
        @JvmStatic
        fun newInstance() = RedFragment()
    }
}

