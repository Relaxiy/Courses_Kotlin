import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lesson4.enums.Cars
import com.example.lesson4.recycler.CarAdapter
import com.example.lesson4.recycler.clickListener.EditButtonToFragment
import com.example.lesson4.recycler.clickListener.TextViewOnClick
import com.example.lesson4.R
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class BottomFragment(editButtonToFragment: EditButtonToFragment) : BottomSheetDialogFragment() {


    private val textViewOnClick by lazy {
        object: TextViewOnClick {
            override fun textViewClick(item: Cars) {
                val editButton = editButtonToFragment.getButton()
                editButton.setText(item.carsModel)
                dismiss()
            }
        }
    }

    private val adapter by lazy { CarAdapter(textViewOnClick) }
    private val recycler by lazy { view?.findViewById<RecyclerView>(R.id.recycle) }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.bottom_sheet_layout, container, false)

    companion object {
        const val TAG = "BottomFragment"
        fun newInstance(editButtonToFragment: EditButtonToFragment) = BottomFragment(editButtonToFragment)
    }

    override fun onStart() {
        super.onStart()
        recycler?.adapter = adapter
        adapter.submitList(Cars.values().asList())
    }
}