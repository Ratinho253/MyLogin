package br.senai.sp.jandira.mylogin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.mylogin.ui.theme.MyLoginTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyLoginTheme {
                login()
            }
        }
    }
}


@Preview(showBackground = true,showSystemUi = true)
@Composable
fun login() {
    Surface(
        modifier = Modifier.fillMaxSize(),
    ) {

        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            //Header
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ) {
                Surface(
                    modifier = Modifier
                        .width(140.dp)
                        .height(50.dp), color = Color(207,6,240),
                    shape = RoundedCornerShape(0.dp, 0.dp, 0.dp, 15.dp)

                ) {

                }
            }
            Spacer(modifier = Modifier.height(150.dp))

            //main
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(15.dp),
            ) {
                Text(
                    text = "Login",
                    fontSize = 48.sp ,
                    color = Color(207,6,240),
                    fontWeight = FontWeight(700)
                    )
                Text(
                    text = "Please sign in to continue.",
                    color = Color(160,156,156),
                )
                Spacer(modifier = Modifier.height(87.dp))
                OutlinedTextField(
                    value = "" , onValueChange = {},
                    modifier = Modifier
                        .fillMaxWidth(),
                    shape = RoundedCornerShape(16.dp),
                    label = { Text(text = "Email")},
                    leadingIcon = {
                        Icon(painter = painterResource(id = R.drawable.baseline_email_24), contentDescription = "", tint = Color(207,6,240) )
                    }

                )
                Spacer(modifier = Modifier.height(31.dp))
                OutlinedTextField(
                    value = "" , onValueChange = {},
                    modifier = Modifier
                        .fillMaxWidth(),
                    shape = RoundedCornerShape(16.dp),
                    label = { Text(text = "Password")},
                    leadingIcon = {
                        Icon(painter = painterResource(id = R.drawable.baseline_https_24), contentDescription = "", tint = Color(207,6,240))
                    }
                )
                Spacer(modifier = Modifier.height(31.dp))

                Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.End ) {
                    Button(onClick = { /*TODO*/ },
                        modifier = Modifier.height(48.dp).width(134.dp) ,
                        colors = ButtonDefaults.buttonColors(Color(207,6,240)),
                        shape = RoundedCornerShape(16.dp)
                    ) {
                        Text(text = "SIGN IN", color = Color.White)
                    }
                }

            }


           Column(modifier = Modifier
               .fillMaxSize()
               .padding(horizontal = 15.dp)
           ) {

           }

        }

    }
}



