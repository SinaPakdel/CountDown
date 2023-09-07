package ir.sina.countdown.component

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import ir.sina.designesystem.ThemePreview
import ir.sina.designesystem.theme.BreakTheme


@Composable
fun Counter(
    minute: String,
    second: String
) {
    Row (verticalAlignment = Alignment.CenterVertically){
        CounterText(text = minute)
        Text(text = " : ")
        CounterText(text = second)
    }
}

@ThemePreview
@Composable
fun CounterPreview() {
    BreakTheme {
        Surface {
            Counter(minute = "18", second = "20")
        }
    }
}

