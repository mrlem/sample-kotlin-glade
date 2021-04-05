package org.gnome.gtk

import gtk3.GtkCellRendererToggle
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias CellRendererToggle = CPointer<GtkCellRendererToggle>

public val CellRendererToggle.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val CellRendererToggle.asCellRenderer: CellRenderer
  get() = reinterpret()
