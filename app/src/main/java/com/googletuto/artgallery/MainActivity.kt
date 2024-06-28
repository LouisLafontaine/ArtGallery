package com.googletuto.artgallery

import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectHorizontalDragGestures
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableLongStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.googletuto.artgallery.ui.theme.ArtGalleryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val paintings = Data().initializePaintings()
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
        enableEdgeToEdge()
        setContent {
            ArtGalleryTheme {
                Surface (
                    modifier = Modifier.fillMaxSize()
                ) {
                    ArtGalleryLayout(modifier = Modifier, paintings = paintings)
                }
            }
        }
    }
}

@Composable
fun ArtGalleryLayout(modifier: Modifier = Modifier, paintings: List<Painting>) {

    var currentArtwork by remember { mutableIntStateOf(0) }
    currentArtwork = inBounds(currentArtwork, paintings)

    var accumulatedDrag by remember { mutableFloatStateOf(0f) }
    var lastSwipeTime by remember { mutableLongStateOf(0L) }
    val swipeDistance = 100f
    val minSwipeInterval = 100L


    var scrollState by remember { mutableIntStateOf(0) }
    val backgroundColor = MaterialTheme.colorScheme.background

    Column (
        modifier = modifier
            .fillMaxSize()
            .statusBarsPadding()
            .padding(25.dp)
            .pointerInput(Unit) {
                detectHorizontalDragGestures(onDragEnd = {
                    val currentTime = System.currentTimeMillis()
                    if (currentTime - lastSwipeTime >= minSwipeInterval) {
                        lastSwipeTime = currentTime
                        when {
                            accumulatedDrag > swipeDistance -> {currentArtwork++; scrollState = 0}
                            accumulatedDrag < swipeDistance -> {currentArtwork--; scrollState = 0}
                        }
                        accumulatedDrag = 0f
                    }
                }) { change, dragAmount ->
                    accumulatedDrag += dragAmount
                    change.consume()
                }
            },
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom
    ) {
        Column (
            modifier = Modifier.weight(9f),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            Surface (
                modifier = Modifier
                    .fillMaxWidth(),
                shape = RoundedCornerShape(10.dp),
                shadowElevation = 10.dp
            ) {
                Surface (
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.White)
                        .padding(10.dp),
                    shape = RoundedCornerShape(8.dp),
                ) {
                    Image(
                        modifier = Modifier.heightIn(max = 600.dp),
                        painter = painterResource(paintings[currentArtwork].id),
                        contentDescription = null,
                        contentScale = ContentScale.Crop
                    )
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
            ) {
                Text(
                    text = paintings[currentArtwork].title,
                    style = MaterialTheme.typography.displaySmall,
                    textAlign = TextAlign.Center
                )
                Box (
                    modifier = Modifier.padding(bottom = 20.dp)
                ) {
                    Text(
                        text = paintings[currentArtwork].description,
                        style = MaterialTheme.typography.labelMedium,
                        textAlign = TextAlign.Justify,
                        modifier = Modifier
                            .verticalScroll(ScrollState(scrollState))
                    )

//                    if (scrollState.value == 0) {
//                        FadeBox(Modifier.align(alignment = Alignment.BottomCenter).height(50.dp), backgroundColor, true)
//                    } else if (scrollState.value < scrollState.maxValue) {
//                        FadeBox(Modifier.align(alignment = Alignment.BottomCenter).height(15.dp), backgroundColor, true)
//                        FadeBox(Modifier.align(alignment = Alignment.TopCenter).height(15.dp), backgroundColor, false)
//                    } else {
//                        FadeBox(Modifier.align(alignment = Alignment.TopCenter).height(15.dp), backgroundColor, false)
//                    }
                }
            }
        }

        Row (
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Button(
                onClick = {
                    currentArtwork++
                    scrollState = 0
                          },
                Modifier
                    .width(120.dp)
                    .height(50.dp)
            ) {
                Text(text = "Previous")
            }
            Button(
                onClick = {
                    currentArtwork--
                    scrollState = 0
                          },
                Modifier
                    .width(120.dp)
                    .height(50.dp)
            ) {
                Text(text = "Next")
            }
        }

    }
}

@Composable
private fun FadeBox(
    modifier: Modifier = Modifier.height(30.dp),
    backgroundColor: Color,
    bottomFade: Boolean
) {
    if (bottomFade) {
        Box(
            modifier = modifier
                .fillMaxWidth()
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(Color.Transparent, backgroundColor)
                    )
                )
        )
    } else {
        Box(
            modifier = modifier
                .fillMaxWidth()
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(backgroundColor, Color.Transparent)
                    )
                )
        )
    }
}

private fun inBounds(
    currentArtwork: Int,
    paintings: List<Painting>
): Int {
    var currentArtwork1 = currentArtwork
    val lastArtwork: Int = paintings.size - 1

    if (currentArtwork1 < 0) {
        currentArtwork1 = lastArtwork
    } else if (currentArtwork1 > lastArtwork) {
        currentArtwork1 = 0
    }
    return currentArtwork1
}

class Painting(@DrawableRes val id: Int, val title: String, val description: String)

@Preview(showBackground = true)
@Composable
fun ArtGalleryPreview() {
    val paintings = Data().initializePaintings()
    ArtGalleryTheme {
        ArtGalleryLayout(modifier = Modifier, paintings = paintings)
    }
}