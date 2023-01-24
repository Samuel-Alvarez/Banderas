package com.example.banderas.ui.Drawer



import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.material.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp



@Composable
fun DominicanRepublicFlag(modifier: Modifier) {
    Column(modifier = Modifier.fillMaxWidth().wrapContentSize(Alignment.Center)) {
        Row(modifier = Modifier.fillMaxWidth().wrapContentSize(Alignment.Center)){
            Box(
                modifier = Modifier
                    .size(170.dp, 110.dp)
                    .background(color = Color.Blue)
            )
            Spacer(modifier = Modifier.padding(30.dp))
            Box(
                modifier = Modifier
                    .size(170.dp, 110.dp)
                    .background(color = Color.Red)
            )
        }
        Row(modifier = Modifier.fillMaxWidth().wrapContentSize(Alignment.Center)
            , horizontalArrangement = Arrangement.Center
        ) {

            Spacer(modifier = Modifier.padding(30.dp))
        }
        Row(modifier = Modifier.fillMaxWidth().wrapContentSize(Alignment.Center)){
            Box(
                modifier = Modifier
                    .size(170.dp, 110.dp)
                    .background(color = Color.Red)
            )
            Spacer(modifier = Modifier.padding(30.dp))
            Box(
                modifier = Modifier
                    .size(170.dp, 110.dp)
                    .background(color = Color.Blue)
            )
        }
    }
}



@Composable
fun FranciaFlag(modifier: Modifier){
    Column(modifier = Modifier.fillMaxWidth().wrapContentSize(Alignment.Center)){
        Row(modifier = Modifier.fillMaxWidth().wrapContentSize(Alignment.Center)){
            Box(
                modifier = Modifier
                    .size(130.dp, 247.dp)
                    .background(color = Color.Blue)
            )
            Box(
                modifier = Modifier
                    .size(130.dp, 247.dp)
                    .background(color = Color.White)
            )
            Box(
                modifier = Modifier
                    .size(140.dp, 247.dp)
                    .background(color = Color.Red)
            )
        }
    }
}
@Composable
fun HolandaFlag(modifier: Modifier){
    Column(modifier = Modifier.fillMaxWidth().wrapContentSize(Alignment.Center)){
        Row(modifier = Modifier.fillMaxWidth().wrapContentSize(Alignment.Center)){
            Box(
                modifier = Modifier
                    .size(400.dp, 80.dp)
                    .background(color = Color.Red)
            )
        }
        Row{
            Box(
                modifier = Modifier
                    .size(400.dp, 80.dp)
                    .background(color = Color.White)
                    .fillMaxSize()
            )
        }
        Row{
            Box(
                modifier = Modifier
                    .size(400.dp, 80.dp)
                    .background(color = Color.Blue)
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun DefaultPreview() {
    LazyColumn(modifier = Modifier.fillMaxSize()){

        item {
            Spacer(modifier = Modifier.padding(20.dp))
            Text(
                text = "Banderas de Paises", fontSize = 25.sp,
                modifier = Modifier.fillMaxWidth().wrapContentSize(Alignment.Center)
            )
            Spacer(modifier = Modifier.padding(30.dp))
            DominicanRepublicFlag(modifier = Modifier.padding(0.dp))
        }

        item {
            Spacer(modifier = Modifier.padding(30.dp))
            FranciaFlag(modifier = Modifier.padding(0.dp))
        }

        item {
            Spacer(modifier = Modifier.padding(30.dp))
            HolandaFlag(modifier = Modifier.padding(0.dp))
            Spacer(modifier = Modifier.padding(30.dp))
        }
    }
}