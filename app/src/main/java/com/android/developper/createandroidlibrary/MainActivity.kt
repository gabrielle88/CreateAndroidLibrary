package com.android.developper.createandroidlibrary

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.android.developper.createandroidlibrary.ui.theme.CreateAndroidLibraryTheme
import com.android.developper.image_preview.ImagePreview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CreateAndroidLibraryTheme {
                Box(modifier = Modifier.fillMaxSize()) {
                    ImagePreview(painterResource(R.drawable.image_lbrary ))
                }
            }
        }
    }
}

