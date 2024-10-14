/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.juicetracker.data

import android.graphics.Color
import androidx.annotation.StringRes
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.juicetracker.R
import com.example.juicetracker.ui.theme.Orange

@Entity
data class Juice(
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    val name: String,
    val description: String = "",
    val color: String,
    val rating: Int
)

enum class JuiceColor(val color: androidx.compose.ui.graphics.Color, @StringRes val label: Int) {
    Red(androidx.compose.ui.graphics.Color.Red, R.string.red),
    Blue(androidx.compose.ui.graphics.Color.Blue, R.string.blue),
    Green(androidx.compose.ui.graphics.Color.Green, R.string.green),
    Cyan(androidx.compose.ui.graphics.Color.Cyan, R.string.cyan),
    Yellow(androidx.compose.ui.graphics.Color.Yellow, R.string.yellow),
    Magenta(androidx.compose.ui.graphics.Color.Magenta, R.string.magenta),
    Orange(com.example.juicetracker.ui.theme.Orange, R.string.orange)
}
