let baseUrl = "http://localhost:8080";
let acerca_de = [];
let colaboradores = [];
let info_extra = [];


/* Acerca de */
function ObtenerAcercade() {
  fetch(baseUrl + '/acerca_de/all').then(res => {
    res.json().then(json => {
      acerca_de = json;
      ImprimirAcercade();
    });
  });
}

function ImprimirAcercade() {
  let container = document.getElementById("Info1");
  container.innerHTML = "";

  acerca_de.forEach(contenido => {
    container.innerHTML += MapearAcercade(contenido);
  });
}

function MapearAcercade(contenido) {
  return `
  <section class="Cont">
    <div class="c-1">
        <h1>${contenido.titulo}</h1>
    </div>
    <div class="c-2">
        <h3>
            ${contenido.contenido}
        </h3>
    </div>
  </section>
`
}

/* Colaboradores */
function ObtenerColaboradores() {
  fetch(baseUrl + '/colaboradores/all').then(res => {
    res.json().then(json => {
      colaboradores = json;
      ImprimirColaboradores();
    });
  });
}

function ImprimirColaboradores() {
  let container = document.getElementById("Info2");
  container.innerHTML = "";

  colaboradores.forEach(contenido => {
    container.innerHTML += MapearColaboradores(contenido);
  });
}

function MapearColaboradores(contenido) {
  return `
  <div class="box" id="${contenido.id_col}">
    <p>${contenido.contenido}
    </p>
    <div class="user">
      <img src="${contenido.imagen}" alt="">
      <div class="user-info">
        <h3>${contenido.colaborador}</h3>
      </div>
    </div>
  </div>
`
}

/* Info Extra */
function ObtenerInfoextra() {
  fetch(baseUrl + '/info_extra/all').then(res => {
    res.json().then(json => {
      info_extra = json;
      ImprimirInfoextra();
    });
  });
}

function ImprimirInfoextra() {
  let container = document.getElementById("Info3");
  container.innerHTML = "";

  info_extra.forEach(contenido => {
    container.innerHTML += MapearInfoextra(contenido);
  });
}

function MapearInfoextra(contenido) {
  return `
  <h1 id="Col">${contenido.titulo}</h1>
  <div class="Container">
    <div class="Container2" id="C-3">
      <h3>${contenido.sub_titulo}</h3>
      <button>COMPRAR</button>
    </div>
    <div class="Container2" id="C-3">
      <h3>${contenido.sub_titulo2}</h3>
      <button>CONTACTOS</button>
    </div>
  </div>
`
}

function CargarFunciones() {
  ObtenerAcercade();
  ObtenerColaboradores();
  ObtenerInfoextra();
}