package com.baz.simaht.network.data

/**
 * Clase que proporciona un modelo para el Login.
 * @constructor Establece todas las propiedades de la publicación.
 * @property userEmp el identificador único para iniciar sesión
 * @property id el identificador único de la publicación
 * @property title el título del post
 * @property body del contenido del post.
 */
data class LogginEntity(val userEmp: String, val conEmp: String, val title: String, val body: String)

