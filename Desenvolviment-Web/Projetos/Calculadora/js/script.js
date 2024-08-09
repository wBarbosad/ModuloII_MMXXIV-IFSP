







//addeventlister ==> formas de interargir com algo através de eventos que são funções
// O evento que é passado através de parâmetros é o que é recebido após ser ativado o 'blur', ou seja, vai enviar o valor digitado no inpu p/
// nós.

/* Maneira diferente de criar um evento com o método addEvento

let botao = document.getElementById('btn-login')
let taxa = document.getElementById('taxa')
let novaTaxa = document.getElementById('novaTaxa')

botao.addEventListener("click", function (){ 
    console.log("Clicou no botão")
})


taxa.addEventListener('blur', (evento) => {
    let taxaBruta = Number(evento.target.value)
    let imposto = 0.05

    novaTaxa.value = taxaBruta+imposto
})


html: 


    <input type="text" placeholder="Taxa" id="taxa">
    <input type="text" placeholder="Taxa com imposto" id="novaTaxa" disabled>
    <button id="btn-login">Login</button>

*/