package org.gnome.gtk

import gtk3.GtkIconViewAccessible
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias IconViewAccessible = CPointer<GtkIconViewAccessible>

public val IconViewAccessible.asObject: Object
  get() = reinterpret()

public val IconViewAccessible.asAtkObject: org.gnome.atk.Object
  get() = reinterpret()

public val IconViewAccessible.asAccessible: Accessible
  get() = reinterpret()

public val IconViewAccessible.asWidgetAccessible: WidgetAccessible
  get() = reinterpret()

public val IconViewAccessible.asContainerAccessible: ContainerAccessible
  get() = reinterpret()
