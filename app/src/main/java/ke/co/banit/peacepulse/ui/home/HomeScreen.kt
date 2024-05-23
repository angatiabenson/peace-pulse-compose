package ke.co.banit.peacepulse.ui.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import ke.co.banit.peacepulse.ui.home.components.AlignBodyItem
import ke.co.banit.peacepulse.ui.home.components.FavoriteItem
import ke.co.banit.peacepulse.ui.home.components.SearchBar
import ke.co.banit.peacepulse.ui.home.data.AlignBodyModel
import ke.co.banit.peacepulse.ui.home.data.DataSource

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    val scrollState = rememberScrollState()
    Column(
        modifier = modifier
            .padding(12.dp)
            .verticalScroll(scrollState)
    ) {
        SearchBar()
        Spacer(modifier = Modifier.height(16.dp))
        AlignBodySection()
        FavoriteSection()
    }
}

@Composable
fun FavoriteSection(modifier: Modifier = Modifier) {
    Column {
        Text(
            text = "FAVORITE SECTION",
            style = MaterialTheme.typography.titleMedium,
            modifier = modifier.paddingFromBaseline(top = 40.dp, bottom = 8.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))
        LazyHorizontalGrid(
            rows = GridCells.Fixed(2),
            modifier = modifier.height(120.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(DataSource.favoriteItems.size) {
                FavoriteItem(data = DataSource.favoriteItems[it])
            }
        }
    }
}

@Composable
fun AlignBodySection(
    modifier: Modifier = Modifier,
    alignBodyData: List<AlignBodyModel> = DataSource.alignBodyItems
) {
    Column {
        Text(
            text = "ALIGN YOUR BODY",
            style = MaterialTheme.typography.titleMedium,
            modifier = modifier.paddingFromBaseline(top = 40.dp, bottom = 8.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))
        LazyRow(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            items(alignBodyData.size) {
                AlignBodyItem(data = alignBodyData[it])
            }
        }
    }
}