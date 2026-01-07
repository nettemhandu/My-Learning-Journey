import { Component, OnInit } from '@angular/core';
import { RecordsService } from "../records"

@Component({
  selector: 'app-emp-info',
  imports: [],
  templateUrl: './emp-info.html',
  styleUrl: './emp-info.css',
  providers: [RecordsService]
})

export class EmpInfo implements OnInit {

  infoReceived1 = string[]=[];
  infoReceived1 = string[]=[];
  infoReceived1 = string[]=[];

  constructor(): { }

  ngOnInit(): void {
      
  }
}
