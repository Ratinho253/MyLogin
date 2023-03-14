package br.senai.sp.jandira.mylogin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.R
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.mylogin.ui.theme.ui.theme.MyLoginTheme

class SignUpActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyLoginTheme {
                singUp()
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun singUp() {
    Surface(
        modifier = Modifier.fillMaxSize(),
    ) {

        Column(
            modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceBetween
        ) {
            //Header
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ) {
                Surface(
                    modifier = Modifier
                        .width(120.dp)
                        .height(40.dp), color = Color(207, 6, 240),
                    shape = RoundedCornerShape(0.dp, 0.dp, 0.dp, 15.dp)

                ) {

                }
            }
            //main
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(15.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Sign Up",
                    fontSize = 32.sp,
                    color = Color(207, 6, 240),
                    fontWeight = FontWeight(700)
                )
                Text(
                    text = "Please sign in to continue.",
                    color = Color(160, 156, 156),
                )
                Spacer(modifier = Modifier.height(31.dp))
                OutlinedTextField(
                    value = "", onValueChange = {},
                    modifier = Modifier
                        .fillMaxWidth(),
                    shape = RoundedCornerShape(16.dp),
                    label = { Text(text = "Username") },
                    leadingIcon = {
                        Icon(
                            painter = painterResource(id = br.senai.sp.jandira.mylogin.R.drawable.baseline_person_24),
                            contentDescription = "",
                            tint = Color(207, 6, 240)
                        )
                    }

                )
                Spacer(modifier = Modifier.height(31.dp))
                OutlinedTextField(
                    value = "", onValueChange = {},
                    modifier = Modifier
                        .fillMaxWidth(),
                    shape = RoundedCornerShape(16.dp),
                    label = { Text(text = "Phone") },
                    leadingIcon = {
                        Icon(
                            painter = painterResource(id = br.senai.sp.jandira.mylogin.R.drawable.baseline_phone_android_24),
                            contentDescription = "",
                            tint = Color(207, 6, 240)
                        )
                    }

                )
                Spacer(modifier = Modifier.height(31.dp))
                OutlinedTextField(
                    value = "", onValueChange = {},
                    modifier = Modifier
                        .fillMaxWidth(),
                    shape = RoundedCornerShape(16.dp),
                    label = { Text(text = "Email") },
                    leadingIcon = {
                        Icon(
                            painter = painterResource(id = br.senai.sp.jandira.mylogin.R.drawable.baseline_email_24),
                            contentDescription = "",
                            tint = Color(207, 6, 240)
                        )
                    }

                )
                Spacer(modifier = Modifier.height(31.dp))
                OutlinedTextField(
                    value = "", onValueChange = {},
                    modifier = Modifier
                        .fillMaxWidth(),
                    shape = RoundedCornerShape(16.dp),
                    label = { Text(text = "Password") },
                    leadingIcon = {
                        Icon(
                            painter = painterResource(id = br.senai.sp.jandira.mylogin.R.drawable.baseline_https_24),
                            contentDescription = "",
                            tint = Color(207, 6, 240)
                        )
                    }
                )
                Spacer(modifier = Modifier.height(21.dp))
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.Start
                ) {
                    Row() {
                        Checkbox(checked = false, onCheckedChange ={} )
                        Row(modifier = Modifier.padding(top = 14.dp)) {
                            Text(text = "Over 18?")
                        }
                    }
                }


                Spacer(modifier = Modifier.height(31.dp))

                Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.End) {
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier.fillMaxWidth().height(48.dp),
                        colors = ButtonDefaults.buttonColors(Color(207, 6, 240)),
                        shape = RoundedCornerShape(16.dp)
                    ) {
                        Text(
                            text = "CREATE ACCOUNT", color = Color.White,

                            )
                    }
                }

                Spacer(modifier = Modifier.height(31.dp))
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End) {

                    Text(
                        text = "Already have an account?",
                        fontSize = 12.sp,
                        color = Color(160, 156, 156),
                        fontWeight = FontWeight(400)
                    )
                    Text(
                        text = "Sign in",
                        fontSize = 12.sp,
                        color = Color(207, 6, 240),
                        fontWeight = FontWeight(400)
                    )
                }

            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Start
            ) {
                Surface(
                    modifier = Modifier
                        .width(120.dp)
                        .height(40.dp), color = Color(207, 6, 240),
                    shape = RoundedCornerShape(0.dp, 15.dp, 0.dp, 0.dp)

                ) {

                }
            }


        }

    }
}