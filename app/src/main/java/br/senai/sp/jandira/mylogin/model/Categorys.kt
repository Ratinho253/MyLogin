package br.senai.sp.jandira.mylogin.model

import androidx.compose.ui.graphics.painter.Painter

data class Categorys(
    var id: Int = 0,
    var image: Painter? = null,
    var name: String = "",
) {

}