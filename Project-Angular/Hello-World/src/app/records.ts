import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class Records {
  info1: String[] = ['Nette', 'E234', 'ne@abc.net'];
  info1: String[] = ['Anto', 'E235', 'an@abc.net'];
  info1: String[] = ['Pana', 'E236', 'pa@abc.net'];

  getinfo1(): string[] {
    return this.info1;
  }

  getinfo2(): string[] {
    return this.info2;
  }

  getinfo3(): string[] {
    return this.info3;
  }
}
