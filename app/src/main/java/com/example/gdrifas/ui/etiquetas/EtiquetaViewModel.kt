package com.example.gdrifas.ui.etiquetas

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class EtiquetaViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Está é a lista de etiqueta do App!"
    }
    val text: LiveData<String> = _text
}