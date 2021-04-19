// TODO - get_items
// TODO - get_items
// TODO - lookup_item
// TODO - move_item
// TODO - purge_items
// TODO - remove_item
//
package org.gnome.gtk

import gtk3.GtkRecentManager
import gtk3.gtk_recent_manager_add_full
import gtk3.gtk_recent_manager_add_item
import gtk3.gtk_recent_manager_has_item
import kotlin.Boolean
import kotlin.String
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toBoolean

public typealias RecentManager = CPointer<GtkRecentManager>

public val RecentManager.asObject: Object
  get() = reinterpret()

public fun RecentManager.addFull(uri: String?, recentData: RecentData): Boolean =
    gtk_recent_manager_add_full(this, uri, recentData.reinterpret()).toBoolean

public fun RecentManager.addItem(uri: String?): Boolean = gtk_recent_manager_add_item(this,
    uri).toBoolean

public fun RecentManager.hasItem(uri: String?): Boolean = gtk_recent_manager_has_item(this,
    uri).toBoolean
