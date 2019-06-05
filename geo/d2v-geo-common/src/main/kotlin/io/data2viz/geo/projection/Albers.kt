package io.data2viz.geo.projection

import io.data2viz.math.deg

/**
 * The Albers’ equal area-conic projection.
 * This is a U.S.-centric configuration of [ConicEqualAreaProjector]
 * @see ConicEqualAreaProjector
 */
fun albersProjection() = albersProjection {
}

/**
 * The Albers’ equal area-conic projection.
 * This is a U.S.-centric configuration of [ConicEqualAreaProjector]
 */
fun albersProjection(init: ConicProjection.() -> Unit) = conicEqualAreaProjection {
    parallels(29.5.deg, 45.5.deg)
    scale = 1070.0
    translate(480.0, 250.0)
    rotate(96.0.deg, 0.0.deg)
    center((-0.6).deg, 38.7.deg)
    init()
}
