package com.mikeapp.android_version_check

import android.os.Build
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun AndroidVersionInfoScreen(innerPadding: PaddingValues) {
    val version = Build.VERSION.RELEASE
    val apiLevel = Build.VERSION.SDK_INT
    val codename = Build.VERSION_CODES::class.java.fields
        .firstOrNull { it.getInt(null) == apiLevel }
        ?.name ?: "Unknown"

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Android Version", style = MaterialTheme.typography.headlineSmall)
        Spacer(Modifier.height(8.dp))
        Text("Version: $version")
        Text("API Level: $apiLevel")
        Text("Codename: $codename")
    }
}
