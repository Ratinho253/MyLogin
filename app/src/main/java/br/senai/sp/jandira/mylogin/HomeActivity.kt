package br.senai.sp.jandira.mylogin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.mylogin.ui.theme.ui.theme.MyLoginTheme

class HomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyLoginTheme {
                homeActivity()
            }
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun homeActivity() {
    Surface(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.fillMaxSize()) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(300.dp)
            )
            {
                Image(painter = painterResource(id = R.drawable.paris), contentDescription = "")
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(19.dp), horizontalAlignment = Alignment.End
                )
                {
                    Image(painter = painterResource(
                        id = R.drawable.susanna_profile),
                        contentDescription = "",
                        modifier = Modifier
                            .clip(
                                RoundedCornerShape(200.dp)
                            )
                            .height(61.dp))

                    Text(text = "Susanna Hoffs", color = Color.White )
                    Column(
                        modifier = Modifier.fillMaxWidth(),
                        verticalArrangement = Arrangement.Bottom
                    ) {
                        Spacer(modifier = Modifier.height(51.dp))
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(
                                painterResource(id = R.drawable.baseline_location_on_24 )  ,
                                contentDescription = "",
                                tint = Color.White )
                            Text(text = "You're in Paris", color = Color.White,  )
                        }
                        Column(modifier = Modifier.padding(start = 24.dp)) {
                            Text(
                                text = "My Trips",
                                color = Color.White,
                                fontSize = 24.sp,
                                fontWeight = FontWeight(1000),
                            )
                        }




                    }
                }
            }
        }

    }

}