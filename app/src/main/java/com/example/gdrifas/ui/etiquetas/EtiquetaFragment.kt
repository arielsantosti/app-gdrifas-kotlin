package com.example.gdrifas.ui.etiquetas

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.gdrifas.databinding.FragmentEtiquetaBinding
import com.example.gdrifas.databinding.FragmentGalleryBinding

class EtiquetaFragment : Fragment() {

    private var _binding: FragmentEtiquetaBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val etiquetaViewModel =
            ViewModelProvider(this).get(EtiquetaViewModel::class.java)

        _binding = FragmentEtiquetaBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textEtiqueta
        etiquetaViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}