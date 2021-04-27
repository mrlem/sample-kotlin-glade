// TODO - method: next
// TODO - method: next_async
// TODO - method: next_finish
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GSocketAddressEnumerator
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias SocketAddressEnumerator = CPointer<GSocketAddressEnumerator>

public val SocketAddressEnumerator.asObject: Object
  get() = reinterpret()
