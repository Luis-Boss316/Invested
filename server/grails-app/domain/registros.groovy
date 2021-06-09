package mx.saccsa.invested

class registros {
    String nombre
    String apellido
    String email
    String contraseña

    static constraints = {
        nombre nullable: false, blank: false
        apellido nullable: false, blank: false
        email nullable: false, blank: false
        contraseña nullable: false, blank: false
    }

    static mapping = {
        version false
        table('ACTIVOFIJOBAJA')
        id generator:'identity'
        nombre name:"nombre", column: "nombre"
        apellido name:"apellido", column: "apellido"
        email name:"email", column: "email"
        contraseña name:"contraseña", column: "contraseña"
    }
    String getDescLabel(){
        return descripcionCorta
    }
}
