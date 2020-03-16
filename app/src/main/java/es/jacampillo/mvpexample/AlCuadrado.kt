package es.jacampillo.mvpexample

interface AlCuadrado {

    interface View {
        fun showResult(resultado: String)
    }

    interface Presenter {
        fun showResult(cadena: String)
        fun alCuadrado(cadena: String)
    }

    interface Model {
        fun alCuadrado(dato: String)
    }
}