package com.example.meritmatch



import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import java.time.LocalDate
import java.time.LocalTime

@RequiresApi(Build.VERSION_CODES.O)
@Composable

fun Transaction(navigate:()->Unit){
    val date =LocalDate.now()
    val time=LocalTime.now()
    Column {
        Card( colors = CardDefaults.cardColors(containerColor = Color(53, 0, 107, 255)),
            shape = RoundedCornerShape(0.dp, 0.dp, 40.dp, 30.dp),
            modifier = Modifier.size(500.dp)
        ) {
            if(time.hour in 6..12){
                Text("Good Morning")
            }
            else if (time.hour in 12..20){
                Text("Good Afternoon")
            }
            else{
                Text("Good Evening")
            }
            Text(text = date.dayOfMonth.toString() +" "+ date.month.toString() + " " + date.year.toString(),
                modifier = Modifier.offset(50.dp,100.dp))

        }
        Card( colors = CardDefaults.cardColors(containerColor = Color(254,255,254,255)),
            shape = RoundedCornerShape(50.dp, 50.dp, 40.dp, 30.dp),
            modifier = Modifier
                .size(500.dp)
                .offset(y = -155.dp)
        ) {
        }
    }


}