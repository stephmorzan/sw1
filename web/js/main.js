/**
 * Created by Ricardo on 14/06/2015.
 * :D
 */
$(document).foundation();

function guardar() {
    localStorage.clear();
    localStorage.seleccion = document.getElementById("seleccion").value;
    localStorage.nombAcceso = document.getElementById("nombAcceso").value;
}

function guardar2() {
    localStorage.organizacion = document.getElementById("organizacion").value;
    localStorage.derivar = document.getElementById("derivar").value;
}

function guardar3() {
    localStorage.actividades = document.getElementById("actividades").value;
}


function leer() {
    document.getElementById("accesstext").innerHTML = "Acceso a: " + localStorage.seleccion;
}
function leer2() {
    document.getElementById("accesstext2").innerHTML = localStorage.seleccion;
    document.getElementById("nombAcceso").innerHTML = localStorage.nombAcceso;
}
function leer3() {
    document.getElementById("organizacion2").value = localStorage.organizacion;
    document.getElementById("seleccion").value = localStorage.derivar;
}
function leer4() {
    document.getElementById("actividades2").value = localStorage.actividades;
}

function preguntardatos() {
    swal({
        title: "Enviar respuesta al usuario",
        text: "Comentario adicional:",
        type: "input",
        showCancelButton: true,
        closeOnConfirm: true,
        animation: "slide-from-top",
        inputPlaceholder: "Detalles opcionales"
    }, function (inputValue) {
        if (inputValue === false) return false;
        if (inputValue === "") {
            swal.showInputError("You need to write something!");
            return false
        }
        window.location.href = 'accesoEjecutado.html';
    });
}


window.onload = function () {
    if (document.getElementById("accesstext") !== null) {
        leer();
    }
    if (document.getElementById("accesstext2") !== null) {
        leer2();
    }
    if (document.getElementById("organizacion2") !== null) {
        leer3();
    }
    if (document.getElementById("actividades2") !== null) {
        leer4();
    }
};