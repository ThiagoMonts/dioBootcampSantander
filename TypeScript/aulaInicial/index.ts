/* Seção 5
interface Cachorro {
    nome: string;
    idade: number;
    parqueFavorito?: string;
}

class MeuCachorro implements Cachorro {
    idade;
    nome;

    constructor(nome, idade) {
        this.nome = nome;
        this.idade = idade;
    }
}

const cao = new MeuCachorro('Apolo', 14);*/


/* Seção 4
interface IUsuario {
    id: string;
    email: string;
}

interface IAdmin extends IUsuario {
    cargo?: 'gerente' | 'coordenador' | 'supervisor';
    // Se eu colocar uma ? depois do item, ele se torna um item opcional
}

function redirecione(usuario: IUsuario | IAdmin) {
    if ('cargo' in usuario) {
        //redirecionar para a área de administração

    }

    //redirecionar para a área de usuário
}*/


/* Seção 3
//Generic types

function adicionaApendiceALista<T>(array, valor) { 
    //Se eu não sei o tipo que vou usar, posso colocar <T>
    return array.map(item => item + valor);
}

adicionaApendiceALista([1, 2, 3], 1);*/


/*const input = document.getElementById('input') as HTMLInputElement;

input.addEventListener('input', (event) => {
    const i = event.currentTarget as HTMLInputElement;
    console.log(i.value)
} )*/


/* Seção 1

function soma(a: number, b: number){
    return a + b;
}

soma(1,2);*/

// types - Para fazer junções e merges de interfaces
// interfaces - Geralmente usada para definir contratos de estruturas de dados e classe

/* Seção 2
interface IAnimal {
    nome: string;
    tipo: 'terrestre' | 'aquático';
    executarRugido(alturaEmDecibeis: number): void;
}

interface IFelino extends IAnimal {
    visaoNoturna: boolean;
}

const animal: IAnimal = {
    nome: 'Elefante',
    tipo: 'terrestre',
    executarRugido(alturaEmDecibeis) {(`${alturaEmDecibeis}dB`)}
}


const felino: IFelino = {
    nome: 'Leão',
    tipo: "terrestre",
    visaoNoturna: true,
    executarRugido(alturaEmDecibeis) {}
}*/

