import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'ambiente-angular';
  count = 0;
  nome = 'Thiago Honorato da Silva';
  text: string = '';

  pessoas = [
    {
      nome: "Thiago",
      sobrenome: "Honorato"
    },
    {
      nome: "Tatiana",
      sobrenome: "Carneiro"
    },
    {
      nome: "Vanessa",
      sobrenome: "Carneiro"
    },
    {
      nome: "João",
      sobrenome: "Sobral"
    }
  ];

  constructor() {

  }

  ngOnInit() {
    console.log(this.pessoas)
    let interval = setInterval(() => {
      this.count++;
      if(this.count === 10) {
        clearInterval(interval)
      }
    }, 1000)
    
  }

  clicou(nome: string): void {
    console.log('Clicou em mim ', nome)
  }

}
