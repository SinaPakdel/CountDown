package ir.sina.designesystem

import android.content.res.Configuration
import androidx.compose.ui.tooling.preview.Preview


@Preview(name = "Light", showBackground = true, backgroundColor = 0xFFFFFF,)
@Preview(name = "Dark", showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
annotation class ThemePreview


@Preview(name = "Phone", device = "spec:width=411dp,height=891dp")
@Preview(name = "Foldable", device = "spec:width=673dp,height=841dp")
@Preview(name = "Tablet", device = "spec:width=1280dp,height=800dp,dpi=240")
@Preview("Desktop", device = "spec:width=1920dp,height=1080dp,dpi=160")
annotation class DevicesPreview