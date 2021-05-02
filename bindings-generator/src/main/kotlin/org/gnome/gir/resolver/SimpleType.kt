package org.gnome.gir.resolver

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.TypeName
import org.gnome.gir.INTEROP_PACKAGE

@Suppress("unused")
enum class SimpleType(
    val value: String,
    val kTypeName: TypeName?,
    val toKTypeConverter: String?,
    val toCTypeConverter: String?
) {

    UTF8(
        "utf8",
        ClassName("kotlin", "String")
            .copy(nullable = true),
        "toKString",
        null
    ),
    Filename(
        "filename",
        ClassName("kotlin", "String")
            .copy(nullable = true),
        "toKString",
        null
    ),
    GChar(
        "gchar",
        ClassName("kotlin", "Char"),
        "toChar",
        "toUInt"
    ),
    GUniChar(
        "gunichar",
        ClassName("kotlin", "Char"),
        "toChar",
        "toUInt"
    ),
    GBoolean(
        "gboolean",
        ClassName("kotlin", "Boolean"),
        "toBoolean",
        "toInt"
    ),
    GInt(
        "gint",
        ClassName("kotlin", "Int"),
        null,
        null
    ),
    GInt8(
        "gint8",
        ClassName("kotlin", "Byte"),
        null,
        null
    ),
    GInt16(
        "gint16",
        ClassName("kotlin", "Short"),
        null,
        null
    ),
    GInt32(
        "gint32",
        ClassName("kotlin", "Int"),
        null,
        null
    ),
    GInt64(
        "gint64",
        ClassName("kotlin", "Long"),
        null,
        null
    ),
    GLong(
        "glong",
        ClassName("kotlin", "Long"),
        null,
        null
    ),
    GUInt(
        "guint",
        ClassName("kotlin", "UInt"),
        null,
        null
    ),
    GUInt8(
        "guint8",
        ClassName("kotlin", "UByte"),
        null,
        null
    ),
    GUInt16(
        "guint16",
        ClassName("kotlin", "UShort"),
        null,
        null
    ),
    GUInt32(
        "guint32",
        ClassName("kotlin", "UInt"),
        null,
        null
    ),
    GUInt64(
        "guint64",
        ClassName("kotlin", "ULong"),
        null,
        null
    ),
    GULong(
        "gulong",
        ClassName("kotlin", "ULong"),
        null,
        null
    ),
    GDouble(
        "gdouble",
        ClassName("kotlin", "Double"),
        null,
        null
    ),
    GFloat(
        "gfloat",
        ClassName("kotlin", "Float"),
        null,
        null
    ),
    Type(
        "GType",
        ClassName(INTEROP_PACKAGE, "GType"),
        null,
        null
    ),
    VAList(
        "va_list",
        // TODO
        null,
        // TODO
        null,
        // TODO
        null
    ),
    // TODO - handler as gpointer
    Any(
        "any",
        null,
        null,
        null
    ),
    // TODO - handle gpointer
    GPointer(
        "gpointer",
        null,
        null,
        null
    ),
    GSize(
        "gsize",
        ClassName("kotlin", "ULong"),
        null,
        null
    ),
    GSSize(
        "gssize",
        ClassName("kotlin", "Long"),
        null,
        null
    )
    ;

    companion object {
        fun fromName(name: String): SimpleType? = values().firstOrNull { name == it.value }
    }

}