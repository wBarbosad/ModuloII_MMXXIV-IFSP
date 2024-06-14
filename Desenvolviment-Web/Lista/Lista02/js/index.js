var produtos = [
    {
        nome: "Batata",
        descricao: "Amarela",
        imagem: "https://fakeimg.pl/150x150?text=A",
        valor: 4
    },
    {
        nome: "Limao",
        descricao: "Verde",
        imagem: "https://fakeimg.pl/150x150?text=A",
        valor: 2
    },
    {
        nome: "Maracuja",
        descricao: "Verde",
        imagem: "https://fakeimg.pl/150x150?text=A",
        valor: 2
    }
]




var conteudoPrincipal = document.getElementById('conteudo-principal');

for(produto of produtos){
    var conteudoProduto = document.createElement('div');
    conteudoProduto.className = "conteudo-produto";
    conteudoPrincipal.appendChild(conteudoProduto);
    
    var nome = document.createElement('h2');
    nome.textContent = produto.nome;  //Incluir o texto dentro da tag H2 >TEXTO< 
    conteudoProduto.appendChild(nome);
    
    var descricao = document.createElement('h2');
    descricao.textContent = produto.descricao
    conteudoProduto.appendChild(descricao);
    
    var imagem = document.createElement('img');
    imagem.src = produto.imagem;
    conteudoProduto.appendChild(imagem);

    var valor = document.createElement('h2');
    valor.textContent = produto.preco   
    conteudoProduto.appendChild(valor);

    var botoes = document.createElement('div')
    botoes.className = "btn"
    conteudoProduto.appendChild(botoes)

    var botaoVender = document.createElement('button')
    botaoVender.textContent = "Comprar";
    botoes.appendChild(botaoVender)

    var botaoComprar = document.createElement('button')
    botaoComprar.textContent = "Vender";
    botoes.appendChild(botaoComprar)
    
    


}
