package ke.co.banit.peacepulse.ui.home.data

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.vector.ImageVector

data class AlignBodyModel(
    @DrawableRes val image: Int,
    val title: String,
)

data class FavoriteModel(
    @DrawableRes val image: Int,
    val title: String,
)

data class BottomNavigationItem(
    val title: String,
    val selectedIcon: ImageVector,
    val unSelectedIcon: ImageVector,
    val hasNews: Boolean
)
