package com.curso.android.app.practica.proyecto;

class MainViewModel: ViewModel() {

        // Solo queremos que se pueda leer el contador
        val counter: LiveData<Counter> get() = _counter
// no nos interesa que se modifique por fuera del ViewModel
private var _counter = MutableLiveData<Counter>(Counter(0, Date()))

        fun incrementCounter() {
        val next = (_counter.value?.number ?: 0) + 1
        updateCounter(next)
        }

        fun decrementCounter() {
        val next = (_counter.value?.number ?: 0) - 1
        updateCounter(next)
        }

private fun updateCounter(next: Int) {
        viewModelScope.launch {
        _counter.value = Counter(next, Date())
        }
        }
        }
