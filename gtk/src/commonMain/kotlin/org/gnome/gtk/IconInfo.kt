// TODO - implement:
//   get_attach_points
//   get_embedded_rect
//   load_icon
//   load_icon_async
//   load_icon_finish
//   load_surface
//   load_symbolic
//   load_symbolic_async
//   load_symbolic_finish
//   load_symbolic_for_context
//   load_symbolic_for_context_async
//   load_symbolic_for_context_finish
//   load_symbolic_for_style
//   set_raw_coordinates
package org.gnome.gtk

import gtk3.GtkIconInfo
import gtk3.gtk_icon_info_get_base_scale
import gtk3.gtk_icon_info_get_base_size
import gtk3.gtk_icon_info_get_display_name
import gtk3.gtk_icon_info_get_filename
import gtk3.gtk_icon_info_is_symbolic
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object
import org.gnome.glib.toBoolean
import org.gnome.glib.toKString

public typealias IconInfo = CPointer<GtkIconInfo>

public val IconInfo.asObject: Object
  get() = reinterpret()

public fun IconInfo.getFilename(): Unit {
  gtk_icon_info_get_filename(this)
}

public fun IconInfo.isSymbolic(): Boolean = gtk_icon_info_is_symbolic(this).toBoolean

public val IconInfo.baseScale: Int
  get() = gtk_icon_info_get_base_scale(this)

public val IconInfo.baseSize: Int
  get() = gtk_icon_info_get_base_size(this)

public val IconInfo.displayName: String?
  get() = gtk_icon_info_get_display_name(this).toKString
