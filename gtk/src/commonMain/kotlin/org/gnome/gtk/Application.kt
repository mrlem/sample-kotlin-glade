package org.gnome.gtk

import gtk3.*
import kotlinx.cinterop.*
import org.gnome.glib.gio.asObject
import org.gnome.glib.gobject.connect
import org.mrlem.gnome.glib.toKList

public typealias Application = CPointer<GtkApplication>

public val Application.asApplication: org.gnome.glib.gio.Application
  get() = reinterpret()

///////////////////////////////////////////////////////////////////////////
// Public API (not generated)
///////////////////////////////////////////////////////////////////////////

@Suppress("FunctionName")
fun Application(id: String): Application = gtk_application_new(id, G_APPLICATION_FLAGS_NONE)!!

fun Application.initAndRun(args: Array<String>, init: Application.() -> Unit) = run {
  init()
  memScoped {
    g_application_run(this@run.reinterpret(), args.size, args.map { it.cstr.ptr }.toCValues())
  }
  g_object_unref(this)
}

@Suppress("FunctionName")
fun Application(id: String, args: Array<String>, init: Application.() -> Unit) = Application(id).initAndRun(args, init)

fun Application.newWindow() = gtk_application_window_new(this)!!.reinterpret<GtkWindow>()

fun Application.addWindow(window: Window) = gtk_application_add_window(this, window)

val Application.windows: List<Window>
  get() = gtk_application_get_windows(this)
    ?.toKList<GtkWindow>()
    .orEmpty()

///////////////////////////////////////////////////////////////////////////
// Event handlers (not generated)
///////////////////////////////////////////////////////////////////////////

fun Application.onActivate(onActivate: (Application) -> Unit): Application {
  asApplication.asObject.connect("activate") { onActivate(this) }
  return this
}
