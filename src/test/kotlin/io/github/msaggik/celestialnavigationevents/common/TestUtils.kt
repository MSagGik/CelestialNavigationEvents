package io.github.msaggik.celestialnavigationevents.common

import io.github.msaggik.celestialnavigationevents.model.measurement.Time
import org.junit.jupiter.api.Assertions.assertTrue
import java.time.ZonedDateTime
import kotlin.math.abs

/*
 * Copyright 2025 Maxim Sagaciyang
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


private const val UI_LOG_MAGENTA = "\u001B[95m"
private const val UI_LOG_BOLD = "\u001B[1m"
private const val UI_LOG_RESET = "\u001B[0m"

internal object TestUtils {

    fun uiTestHeader(nameClass: String?) {
        println("\n${UI_LOG_BOLD}${UI_LOG_MAGENTA}$nameClass${UI_LOG_RESET}")
    }
}