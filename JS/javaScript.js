function Login() {
  var done = 0;
  var usuario = document.getElementsByName('usuario')[0].value;
  usuario = usuario.toLowerCase();
  var senha = document.getElementsByName('senha')[0].value;
  seha = senha.toLowerCase();

  if (usuario == "carol" && senha == "123") {
    window.location = "paginaPrincipal.html";
    done = 1;
  }
  if (done == 0) {
    alert("Dados incorretos, tente novamente");

  }
}

function mudaPaginaInicio(){
  var done = 0;
  window.location = "paginaPrincipal.html"
}

function mudaPaginaComunidade(){
  var done = 0;
  window.location = "comunidade.html"
}

function mudaPaginaBuscar(){
  var done = 0;
  window.location = "buscar.html"
}

function video1(){
  window.location = "Mídia/Como ir do mil ao milhão.mp4"
}

function video2(){
  window.location = "Mídia/Como mudar hábitos e deixar de adiar obrigações.mp4"
}

function video3(){
  window.location = "Mídia/Quem se ofende fácil é burro.mp4"
}

function carregando() {
    window.location = "loading.html"
}


function temporizador(){
    var contador = 0;

      for (contador = 0; contador < 280000; contador++) {
        console.log(contador);
      }
      window.location = "comunidade.html"
}
