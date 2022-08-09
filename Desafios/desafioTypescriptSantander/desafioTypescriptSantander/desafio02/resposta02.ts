enum Trabalho {
    Atriz,
    Padeiro
}

type Humano = {
    nome: string,
    idade: number,
    profissao: Trabalho
}

let NovaPessoa1: Humano = {
    nome: 'Maria',
    idade: 29,
    profissao: Trabalho.Atriz
};

let NovaPessoa2: Humano = {
    nome: 'Roberto',
    idade: 19,
    profissao: Trabalho.Padeiro
};

let NovaPessoa3: Humano = {
    nome: 'Laura',
    idade: 32,
    profissao: Trabalho.Atriz
};

let NovaPessoa4: Humano = {
    nome: "Carlos",
    idade: 19,
    profissao: Trabalho.Padeiro
}