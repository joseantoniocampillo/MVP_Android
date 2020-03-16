package es.jacampillo.mvpexample

import kotlin.math.pow

class AlCuadradoModel(val presenter: AlCuadrado.Presenter) : AlCuadrado.Model {

    override fun alCuadrado(dato: String) {
        try {
            val resultado = dato.toDouble().pow(2).toString()
            presenter.showResult(resultado)
        } catch (e: NumberFormatException) {
            presenter.showResult("No se obtuvo un número")
        }
    }
}