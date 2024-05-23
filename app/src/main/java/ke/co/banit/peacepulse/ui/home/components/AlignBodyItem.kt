package ke.co.banit.peacepulse.ui.home.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import ke.co.banit.peacepulse.ui.home.data.AlignBodyModel

@Composable
fun AlignBodyItem(modifier: Modifier = Modifier, data: AlignBodyModel) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = data.image), contentDescription = data.title,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(88.dp)
                .clip(CircleShape)
        )
        Text(
            text = data.title,
            modifier = Modifier.paddingFromBaseline(top = 24.dp, bottom = 8.dp),
            maxLines = 2,
            style = MaterialTheme.typography.labelMedium
        )
    }
}