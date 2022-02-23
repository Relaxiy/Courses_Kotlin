package com.example.lesson4.presenter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lesson4.presenter.recycler.CardAdapter
import com.example.lesson4.R
import com.example.lesson4.domain.models.GraphicCardPresent
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class BottomFragment(private val send: (card: GraphicCardPresent) -> Unit) : BottomSheetDialogFragment() {

    private val viewModel = ViewModelBottomFragment()
    private val adapter by lazy { CardAdapter{
            card ->  saveText(card)
    } }
    private val recycler by lazy { view?.findViewById<RecyclerView>(R.id.recycle) }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.cardsLiveData.observe(viewLifecycleOwner) { cards ->
            recycler?.adapter = adapter
            adapter.submitList(cards)
        }
    }

    private fun saveText (card: GraphicCardPresent){
        send(card)
        dismiss()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.bottom_sheet_layout, container, false)

    companion object {
        const val TAG = "BottomFragment"
        fun newInstance(send: (card: GraphicCardPresent) -> Unit) = BottomFragment(send)
    }
}