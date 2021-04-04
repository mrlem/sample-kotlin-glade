package org.gnome.gtk

import gtk3.*
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret

///////////////////////////////////////////////////////////////////////////
// Type
///////////////////////////////////////////////////////////////////////////

typealias ButtonBox = CPointer<GtkButtonBox>

///////////////////////////////////////////////////////////////////////////
// Conversion
///////////////////////////////////////////////////////////////////////////

val ButtonBox.asBox: Box
    get() = reinterpret()

val ButtonBox.asContainer: Container
    get() = reinterpret()

val ButtonBox.asWidget: Widget
    get() = reinterpret()

val ButtonBox.asObject: Object
    get() = reinterpret()

///////////////////////////////////////////////////////////////////////////
// Public API
///////////////////////////////////////////////////////////////////////////

@Suppress("FunctionName")
fun ButtonBox(orientation: GtkOrientation) = gtk_button_box_new(orientation)!!.reinterpret<GtkButtonBox>()

fun ButtonBox.add(widget: Widget) = asContainer.add(widget)
