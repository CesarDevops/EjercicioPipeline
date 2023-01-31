// Call the dataTables jQuery plugin
$(document).ready(function() {

     cargarUsuarios();

  $('#usuarios').DataTable();
});


  async function cargarUsuarios() {
       const request = await fetch('usuarios', {
        method: 'GET',
        headers: {
         'Accept': 'application/json',
         'Content-Type': 'application/json'
        }
       });


       const usuarios = await request.json();
       let listadoHtml = '';
       for ( let usuario of usuarios){

           let usuarioHtml =   '<tr>><td>'+usuario.id+'</td><td>'+usuario.nombre+'</td><td>'+usuario.email+'</td><td>'+usuario.telefono+'</td><td>'+usuario.fecha+'</td><td><a href="#" class="btn btn-danger btn-circle btn-sm">\n' +
               '                                                <i class="fas fa-trash"></i>\n' +
               '                                                </a>\n' +
               '                                            </td></tr>'

           listadoHtml+=usuarioHtml;
       }



       document.querySelector('#usuarios tbody').outerHTML = listadoHtml;

  }

