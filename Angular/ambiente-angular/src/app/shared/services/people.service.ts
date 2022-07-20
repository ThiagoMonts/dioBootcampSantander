import { Injectable } from '@angular/core';
import { Observable, of } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PeopleService {

  constructor() { }

  getPeople(): Observable<any> {
    let peopleArray = [
      {
        firstName: 'Thiago',
        lastName: 'Honorato',
        age: 36
      },
      {
        firstName: 'Tatiana',
        lastName: 'Carneiro',
        age: 34},
      {
        firstName: 'Vanessa',
        lastName: 'Carneiro',
        age: 29
      },
      {
        firstName: 'João',
        lastName: 'Sobral',
        age: 35
      },
    ]
    return of (peopleArray)
  }
}
