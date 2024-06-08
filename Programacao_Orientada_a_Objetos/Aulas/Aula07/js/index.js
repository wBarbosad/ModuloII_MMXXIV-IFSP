/*

var paragrafo = document.createElement('p');
paragrafo.textContent = "Escada";

var botao = document.createElement('button')
botao.textContent = "Login"; */ 

var bancoDeDados = [
    {
        nome: "Bolo",
        descricao: "Morango",
        preco: 15.00,
        imagem: "https://via.placeholder.com/150"
    },
    {
        nome: "Torta",
        descricao: "Frango",
        preco: 20.00,
        imagem: "https://via.placeholder.com/150"
    },
    {
        nome: "Pão",
        descricao: "Francês",
        preco: 1,
        imagem: "https://via.placeholder.com/150"
    }
]

var conteudoPrincipal = document.getElementById('conteudo-principal');
console.log(conteudoPrincipal)

for(var produto of bancoDeDados){
    var conteudoProduto = document.createElement('div');

    conteudoProduto.className = 'conteudo-produto';
    conteudoPrincipal.appendChild(conteudoProduto)
    
    var imagem = document.createElement('img')
    imagem.src = produto.imagem
    conteudoProduto.appendChild(imagem)

    var nomeProduto = document.createElement('h2')
    nomeProduto.textContent = produto.nome
    conteudoPrincipal.appendChild(nomeProduto)

    var descricaoProduto = document.createElement('p')
    descricaoProduto.textContent = produto.descricao
    conteudoPrincipal.appendChild(descricaoProduto)

    var precoProduto = document.createElement('p')
    precoProduto.textContent = produto.preco
    conteudoPrincipal.appendChild(precoProduto)


    var botoes = document.createElement('div')
    botoes.className = "btn"

    var botaoComprar = document.createElement('button')
    botaoComprar.textContent = "Comprar"
    botoes.appendChild(botaoComprar)




    conteudoProduto.appendChild(botoes)
}