package com.example.sweettabs

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SweetListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_sweet_list, container, false)

        val recyclerView: RecyclerView = view.findViewById(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = SweetListAdapter(getSweetList())

        recyclerView.setPadding(0, 0, 0, 200)
        recyclerView.clipToPadding = false

        return view
    }

    private fun getSweetList(): List<Sweet> {
        val sweetNames = resources.getStringArray(R.array.sweet_names)
        val sweetImages = arrayOf(
            R.drawable.img_boomer, R.drawable.img_bournville, R.drawable.img_dairy_milk, R.drawable.img_doublemint,
            R.drawable.img_ferrero_focher, R.drawable.img_five_star, R.drawable.img_galaxy, R.drawable.img_gulab_jamun,
            R.drawable.img_hajmola, R.drawable.img_hersheys, R.drawable.img_kaccha_mango_bite, R.drawable.img_kalakand,
            R.drawable.img_kit_kat, R.drawable.img_laddu, R.drawable.img_m_and_m, R.drawable.img_milkybar,
            R.drawable.img_rasgulla, R.drawable.img_sandesh, R.drawable.img_snickers,
            R.drawable.img_toblerone
        )
        return sweetNames.mapIndexed { index, name ->
            Sweet(name, sweetImages[index % sweetImages.size])
        }
    }
}
