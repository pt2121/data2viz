package io.data2viz.examples.chord

import io.data2viz.examples.lineOfSight.height
import io.data2viz.examples.lineOfSight.lineOfSightViz
import io.data2viz.examples.lineOfSight.width
import io.data2viz.viz.selectOrCreateSvg
import io.data2viz.viz.viz


@Suppress("unused")

fun main(args: Array<String>) {

    val root = selectOrCreateSvg().apply {
        setAttribute("width", "$width")
        setAttribute("height", "$height")
    }

    root.viz {
        lineOfSightViz()
    }

}
