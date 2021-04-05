package org.gnome.gtk

import gtk3.GtkListBoxRow
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias ListBoxRow = CPointer<GtkListBoxRow>

public val ListBoxRow.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val ListBoxRow.asWidget: Widget
  get() = reinterpret()

public val ListBoxRow.asContainer: Container
  get() = reinterpret()

public val ListBoxRow.asBin: Bin
  get() = reinterpret()