package com.example.art_mega

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.windowInsetsStartWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.art_mega.ui.theme.Art_MegaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Art_MegaTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding)
                            .background(Color(0xFF22396F))
                    ) {
                        navBar()
                        gallery()
                    }
                }
            }
        }
    }

    @Composable
    fun navBar(modifier: Modifier = Modifier) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
                .background(Color(0xFF22396F)),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "ART GALLERY",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
        }
    }

    @Composable
    fun gallery(modifier: Modifier = Modifier) {
        var tahap by remember { mutableStateOf(1) }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFBFC9D1))
                .padding(16.dp),

            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            when (tahap) {
                1 -> {
                    Spacer(Modifier.weight(1f))
                    Image(
                        painter = painterResource(R.drawable.flowers),
                        contentDescription = "Matahari",
                        modifier = Modifier
                            .size(250.dp)
                            .background(Color(0xFFBFC9D1))
                    )
                    Spacer(Modifier.padding(top = 30.dp))
                    Column(
                        modifier = Modifier
                            .background(Color(0xFFC8D1D8))
                    ) {
                        Text(
                            text = "Judul: Tournesols",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .padding(top = 20.dp)
                                .padding(horizontal = 10.dp),
                            textAlign = TextAlign.Center
                        )

                        Text(
                            text = "Karya: Vincent van Gogh",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .padding(bottom = 20.dp)
                                .padding(horizontal = 10.dp),
                            textAlign = TextAlign.Center
                        )
                    }
                    Spacer(Modifier.weight(1f))

                    Row() {
                        Button(onClick = { tahap = 5 }) {
                            Text("Previous")
                        }
                        Spacer(Modifier.padding(16.dp))
                        Button(onClick = { tahap = 2 }) {
                            Text("Next")
                        }
                    }
                    Spacer(Modifier.padding(bottom = 32.dp))
                }

                2 -> {
                    Spacer(Modifier.weight(1f))
                    Image(
                        painter = painterResource(R.drawable.garden),
                        contentDescription = "Taman",
                        modifier = Modifier
                            .size(250.dp)
                            .background(Color(0xFFBFC9D1))
                    )

                    Spacer(Modifier.padding(top = 30.dp))

                    Column(
                        modifier = Modifier
                            .background(Color(0xFFC8D1D8))
                    ) {
                        Text(
                            text = "Judul: Jardin de l'artiste à Giverny",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .padding(top = 20.dp)
                                .padding(horizontal = 10.dp),
                            textAlign = TextAlign.Center
                        )

                        Text(
                            text = "Karya: Claude Monet",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .padding(bottom = 20.dp)
                                .padding(horizontal = 10.dp),
                            textAlign = TextAlign.Center
                        )
                    }

                    Spacer(Modifier.weight(1f))

                    Row() {
                        Button(onClick = { tahap = 1 }) {
                            Text("Previous")
                        }
                        Spacer(Modifier.padding(16.dp))
                        Button(onClick = { tahap = 3 }) {
                            Text("Next")
                        }
                    }
                    Spacer(Modifier.padding(bottom = 32.dp))
                }

                3 -> {
                    Spacer(Modifier.weight(1f))
                    Image(
                        painter = painterResource(R.drawable.woman),
                        contentDescription = "Perempuan",
                        modifier = Modifier
                            .size(250.dp)
                            .background(Color(0xFFBFC9D1))
                    )

                    Spacer(Modifier.padding(top = 30.dp))

                    Column(
                        modifier = Modifier
                            .background(Color(0xFFC8D1D8))
                    ) {
                        Text(
                            text = "Judul: Meisje met de parel",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .padding(top = 20.dp)
                                .padding(horizontal = 10.dp),
                            textAlign = TextAlign.Center
                        )

                        Text(
                            text = "Karya: Johannes Vermeer",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .padding(bottom = 20.dp)
                                .padding(horizontal = 10.dp),
                            textAlign = TextAlign.Center
                        )
                    }

                    Spacer(Modifier.weight(1f))

                    Row() {
                        Button(onClick = { tahap = 2 }) {
                            Text("Previous")
                        }
                        Spacer(Modifier.padding(16.dp))
                        Button(onClick = { tahap = 4 }) {
                            Text("Next")
                        }
                    }
                    Spacer(Modifier.padding(bottom = 32.dp))
                }

                4 -> {
                    Spacer(Modifier.weight(1f))
                    Image(
                        painter = painterResource(R.drawable.badai),
                        contentDescription = "badai",
                        modifier = Modifier
                            .size(250.dp)
                            .background(Color(0xFFBFC9D1))
                    )

                    Spacer(Modifier.padding(top = 30.dp))

                    Column(
                        modifier = Modifier
                            .background(Color(0xFFC8D1D8))
                    ) {
                        Text(
                            text = "Judul: Christ in the Storm on the Sea",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .padding(top = 20.dp)
                                .padding(horizontal = 10.dp),
                            textAlign = TextAlign.Center
                        )

                        Text(
                            text = "Karya: embrandt van Rijn",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .padding(bottom = 20.dp)
                                .padding(horizontal = 10.dp),
                            textAlign = TextAlign.Center
                        )
                    }
                    Spacer(Modifier.weight(1f))

                    Row() {
                        Button(onClick = { tahap = 3 }) {
                            Text("Previous")
                        }
                        Spacer(Modifier.padding(16.dp))
                        Button(onClick = { tahap = 5 }) {
                            Text("Next")
                        }
                    }
                    Spacer(Modifier.padding(bottom = 32.dp))
                }

                5 -> {
                    Spacer(Modifier.weight(1f))
                    Image(
                        painter = painterResource(R.drawable.perkumpulan),
                        contentDescription = "Pelayan Perempuan",
                        modifier = Modifier
                            .size(250.dp)
                            .background(Color(0xFFBFC9D1))
                    )
                    Spacer(Modifier.padding(top = 30.dp))

                    Column(
                        modifier = Modifier
                            .background(Color(0xFFC8D1D8))
                    ) {
                        Text(
                            text = "Judul: Las Meninas",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .padding(top = 20.dp)
                                .padding(horizontal = 10.dp),
                            textAlign = TextAlign.Center
                        )

                        Text(
                            text = "Karya: Diego Velázquez",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .padding(bottom = 20.dp)
                                .padding(horizontal = 10.dp),
                            textAlign = TextAlign.Center
                        )
                    }

                    Spacer(Modifier.weight(1f))

                    Row() {
                        Button(onClick = { tahap = 4 }) {
                            Text("Previous")
                        }
                        Spacer(Modifier.padding(16.dp))
                        Button(onClick = { tahap = 1 }) {
                            Text("Next")
                        }
                    }
                    Spacer(Modifier.padding(bottom = 32.dp))
                }
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun AppPreview() {
        Art_MegaTheme {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xFF22396F))
            ) {
                navBar()
                gallery()
            }
        }
    }
}