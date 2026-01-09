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
  infoReceived2 = string[]=[];
  infoReceived3 = string[]=[];

  getInfoFromServiceClass

  constructor(private rservice: RecordsService): { }

  ngOnInit(): void {
  }
}
