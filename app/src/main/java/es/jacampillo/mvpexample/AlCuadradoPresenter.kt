package es.jacampillo.mvpexample

import kotlin.math.pow

class AlCuadradoPresenter(val view: AlCuadrado.View): AlCuadrado.Presenter {

    private val model = AlCuadradoModel(this)

    override fun showResult(cadena: String) {
        view.showResult(cadena)
    }

    override fun alCuadrado(cadena: String) {
        model.alCuadrado(cadena)
    }

}