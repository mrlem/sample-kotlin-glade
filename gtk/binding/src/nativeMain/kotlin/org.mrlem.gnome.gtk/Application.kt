@file:Suppress("unused")

package org.mrlem.gnome.gtk

import interop.*
import kotlinx.cinterop.*
import kotlin.String
import kotlin.Unit
import org.gnome.gtk.Application
import org.gnome.gtk.ApplicationFactory
import org.gnome.gtk.Window
import org.gnome.toKList

fun ApplicationFactory.new(id: String, args: Array<String>, init: Application.() -> Unit) =
  new(id, G_APPLICATION_FLAGS_NONE)
    .initAndRun(args, init)

fun Application.initAndRun(args: Array<String>, init: Application.() -> Unit) = run {
  init()
  memScoped {
    g_application_run(this@run.reinterpret(), args.size, args.map { it.cstr.ptr }.toCValues())
  }
  g_object_unref(this)
}

val Application.windows: List<Window>
  get() = gtk_application_get_windows(this)
    ?.toKList<GtkWindow>()
    .orEmpty()
