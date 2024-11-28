package com.ayush.book.book_pedia.presentation.book_list

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import org.koin.compose.viewmodel.koinViewModel


@Composable
fun BookListScreenRoot(
    viewmodel: BookListViewmodel = koinViewModel(),
    onBookClick : () -> Unit,
    modifier : Modifier = Modifier,
) {
    val state by viewmodel.state.collectAsStateWithLifecycle()
    BookListScreen(
        state = state,
        onAction = { action ->
            when(action) {
                is BookListAction.OnBookClick -> onBookClick()
                else -> viewmodel.onAction(action)
            }
        }
    )
}
@Composable
fun BookListScreen(
    state: BookListState,
    onAction: (BookListAction) -> Unit
){

}