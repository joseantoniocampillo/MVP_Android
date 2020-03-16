package es.jacampillo.mvpexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class AlCuadradoView : AppCompatActivity(), AlCuadrado.View {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt_calcular.setOnClickListener {
            val numero = et_introduce_numero.text.toString()

            AlCuadradoPresenter(this).alCuadrado(numero)
        }
    }

    override fun showResult(resultado: String) {
        tv_numero_al_cuadrado.text = resultado
    }
}
