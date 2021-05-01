// TODO - method: add_with_properties
// TODO - method: child_get
// TODO - method: child_get_valist
// TODO - method: child_set
// TODO - method: child_set_valist
// TODO - method: forall
// TODO - method: foreach
// TODO - method: get_children
// TODO - method: get_focus_chain
// TODO - method: get_resize_mode
// TODO - method: propagate_draw
// TODO - method: resize_children
// TODO - method: set_focus_chain
// TODO - method: set_reallocate_redraws
// TODO - method: set_resize_mode
// TODO - method: unset_focus_chain
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GType
import interop.GtkContainer
import interop.gtk_container_add
import interop.gtk_container_check_resize
import interop.gtk_container_child_get_property
import interop.gtk_container_child_notify
import interop.gtk_container_child_notify_by_pspec
import interop.gtk_container_child_set_property
import interop.gtk_container_child_type
import interop.gtk_container_get_border_width
import interop.gtk_container_get_focus_child
import interop.gtk_container_get_focus_hadjustment
import interop.gtk_container_get_focus_vadjustment
import interop.gtk_container_get_path_for_child
import interop.gtk_container_remove
import interop.gtk_container_set_border_width
import interop.gtk_container_set_focus_child
import interop.gtk_container_set_focus_hadjustment
import interop.gtk_container_set_focus_vadjustment
import kotlin.String
import kotlin.UInt
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.gobject.ParamSpec
import org.gnome.gobject.Value
import org.mrlem.gnome.gobject.connect

public typealias Container = CPointer<GtkContainer>

public val Container.asObject: Object
  get() = reinterpret()

public val Container.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Container.asWidget: Widget
  get() = reinterpret()

public val Container.widget: Widget
  get() = pointed.widget.ptr

public var Container.borderWidth: UInt
  get() = gtk_container_get_border_width(this)
  set(`value`) {
    gtk_container_set_border_width(this, value)
  }

public var Container.focusChild: Widget?
  get() = gtk_container_get_focus_child(this)?.reinterpret()
  set(`value`) {
    gtk_container_set_focus_child(this, value)
  }

public var Container.focusHadjustment: Adjustment?
  get() = gtk_container_get_focus_hadjustment(this)?.reinterpret()
  set(`value`) {
    gtk_container_set_focus_hadjustment(this, value)
  }

public var Container.focusVadjustment: Adjustment?
  get() = gtk_container_get_focus_vadjustment(this)?.reinterpret()
  set(`value`) {
    gtk_container_set_focus_vadjustment(this, value)
  }

public fun Container.add(widget: Widget?): Unit {
  gtk_container_add(this, widget?.reinterpret())
}

public fun Container.checkResize(): Unit {
  gtk_container_check_resize(this)
}

public fun Container.childGetProperty(
  child: Widget?,
  propertyName: String,
  `value`: Value?
): Unit {
  gtk_container_child_get_property(this, child?.reinterpret(), propertyName, value?.reinterpret())
}

public fun Container.childNotify(child: Widget?, childProperty: String): Unit {
  gtk_container_child_notify(this, child?.reinterpret(), childProperty)
}

public fun Container.childNotifyByPspec(child: Widget?, pspec: ParamSpec?): Unit {
  gtk_container_child_notify_by_pspec(this, child?.reinterpret(), pspec?.reinterpret())
}

public fun Container.childSetProperty(
  child: Widget?,
  propertyName: String,
  `value`: Value?
): Unit {
  gtk_container_child_set_property(this, child?.reinterpret(), propertyName, value?.reinterpret())
}

public fun Container.childType(): GType = gtk_container_child_type(this)

public fun Container.getPathForChild(child: Widget?): WidgetPath? =
    gtk_container_get_path_for_child(this, child?.reinterpret())?.reinterpret()

public fun Container.remove(widget: Widget?): Unit {
  gtk_container_remove(this, widget?.reinterpret())
}

public fun Container.onAdd(callback: (Container) -> Unit): Container {
  // TODO - handle callback data

  asObject.connect("add") { callback(this) }
  return this
}

public fun Container.onCheckResize(callback: (Container) -> Unit): Container {
  // TODO - handle callback data

  asObject.connect("check-resize") { callback(this) }
  return this
}

public fun Container.onRemove(callback: (Container) -> Unit): Container {
  // TODO - handle callback data

  asObject.connect("remove") { callback(this) }
  return this
}

public fun Container.onSetFocusChild(callback: (Container) -> Unit): Container {
  // TODO - handle callback data

  asObject.connect("set-focus-child") { callback(this) }
  return this
}