package com.example.modifiersjetpackcomposephilipplackner

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.modifiersjetpackcomposephilipplackner.ui.theme.ModifiersJetpackComposePhilippLacknerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column (
                modifier= Modifier
                    .background(Color.Green)
                    .fillMaxHeight(0.5f)
                    .width(300.dp)
//                    .padding(top = 50.dp, start = 16.dp)
                    .border(width = 6.dp,color=Color.Black)
                    .padding(7.dp)
                    .border(6.dp, Color.Yellow)
                    .padding(14.dp)
//                    .requiredWidth(600.dp)
                    ){
                Text(text = "Hello", modifier = Modifier.offset(20.dp).clickable {

                })
//                Spacer(modifier = Modifier.height(50.dp))
                Text(text = "World")
            }
        }
    }
}
/*
NOTES:
-> in case of .width(600.dp), as the screen size is not 600 dp, it will instead fill the max width size of the screen
-> in case of .requiredWidth(600.dp), it will exactly fills the 600 dp while making the starting portion away from the screen, thus it is not showing the text

-> in .padding function, one can also set padding even for specific location using top, bottom, start and end
-> one can also set the offset for a particular text field, using Modifier.offset, it works just like margin, but the catch is unlike margin,
it doesnot affect the other elements in the same field.
-> can add Space between fields using SPacer class.
-> can also give border using .border attribute of modifier class.
-> This modifier works as a stack based, as one can add as many attributes, like border and padding and it will stack one to another on top of the
screen just like an stack.
-> There are some other Modifier Actions , such as clickable, draggable, scrollable etc.
For more visit: https://developer.android.com/jetpack/compose/modifiers-list

YT Link: https://www.youtube.com/watch?v=XCuC_p3E0qo&list=PLQkwcJG4YTCSpJ2NLhDTHhi6XBNfk9WiC&index=3&pp=iAQB
 */