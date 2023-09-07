package ir.sina.countdown

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import ir.sina.countdown.component.Counter
import ir.sina.designesystem.theme.BreakTheme


@Composable
fun CountDownRoute(
    viewModel: CountDownViewModel,
) {
    CountDownScreen("", "")
}


@Composable
fun CountDownScreen(minute: String, second: String) {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Counter(minute = minute, second = second)
    }
}

@Preview(showBackground = true)
@Composable
private fun CountDownScreenPreview() {
    BreakTheme {
        Surface {
            CountDownScreen("19", "20")
        }
    }
}