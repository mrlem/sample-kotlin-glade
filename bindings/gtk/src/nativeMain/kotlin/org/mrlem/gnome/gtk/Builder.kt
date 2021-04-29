@file:Suppress("unused")

package org.mrlem.gnome.gtk

import interop.*
import kotlin.String
import org.gnome.gobject.Object
import org.gnome.gtk.Builder
import org.gnome.gtk.addFromString

@Throws(Error::class)
fun Builder.addFromString(text: String): UInt = addFromString(text, text.length.toULong())

// TODO - why isn't this function mapped or todo?
operator fun Builder.get(id: String): Object = gtk_builder_get_object(this, id)!!
