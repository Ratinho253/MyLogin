package br.senai.sp.jandira.mylogin.dao.category

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import br.senai.sp.jandira.mylogin.R
import br.senai.sp.jandira.mylogin.model.Categorys

class CategoryRepository {

    companion object {

        @Composable
        fun getListCategory(): List<Categorys> {
            return listOf<Categorys>(
                Categorys(
                    1,
                    image = painterResource(id = R.drawable.ellipse2),
                    name = "Montain"
                ),
                Categorys(
                    2,
                    image = painterResource(id = R.drawable.ellipse3),
                    name = "Snow"
                ),
                Categorys(
                    3,
                    image = painterResource(id = R.drawable.ellipse4),
                    name = "Beach"
                )
            )
        }
    }

}