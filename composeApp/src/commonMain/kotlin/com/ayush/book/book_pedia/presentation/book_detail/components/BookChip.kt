package com.ayush.book.book_pedia.presentation.book_detail.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.ayush.book.core.presentation.LightBlue

enum class ChipSize {
    SMALL,
    REGULAR
}

@Composable
fun BookChip(
    modifier: Modifier = Modifier,
    isSmall: ChipSize = ChipSize.REGULAR,
    chipContent: @Composable () -> Unit
) {
    Box(
        modifier = modifier
            .widthIn(
                min = when (isSmall) {
                    ChipSize.SMALL -> 0.dp
                    ChipSize.REGULAR -> 80.dp
                }
            )
            .clip(RoundedCornerShape(16.dp))
            .background(LightBlue)
            .padding(horizontal = 12.dp, vertical = 8.dp),
        contentAlignment = Alignment.Center
    ) {

    }
}