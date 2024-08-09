
let inputValorBruto = document.getElementById('valor-bruto')
let inputValorLiquido = document.getElementById('valor-liquido')
let botao = document.getElementById('btn-calcular')
let taxa = 200


botao.addEventListener('click', () => { 
    let valorBruto = inputValorBruto.value //value é o valor digitado no input; 
    inputValorLiquido.value = valorBruto - taxa;
})
