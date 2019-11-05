/*
 * Copyright (c) 2018-2019. data2viz sàrl.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package io.data2viz.viz

import org.w3c.dom.HTMLCanvasElement
import kotlin.browser.document


@JsName("renderImages")
fun renderImages() {
    val tests = allRenderingTests

    tests.forEach {
        val canvas = document.createElement("canvas") as HTMLCanvasElement
        document.body?.appendChild(canvas)
        canvas.id = it.name
        it.viz.bindRendererOn(canvas)
    }

    //spans is only here to make puppeteer wait for all test renderings
    val span = document.createElement("span")
    document.body?.appendChild(span)

}



