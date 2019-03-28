import { Injectable} from '@angular/core';
import { Component, OnInit } from '@angular/core';
import {HttpClient} from '@angular/common/http';

let voteYesCount = 0;
let voteNoCount = 0;

@Component({
  selector: 'app-voter',
  templateUrl: './voter.component.html',
  styleUrls: ['./voter.component.css']
})

@Injectable()
export class VoterComponent implements OnInit {
  private votes: number;
  constructor(private httpClient: HttpClient) {
    this.votes = 0;
  }

  ngOnInit() {
  }

  selectYes() {
    console.log('YES');
    this.httpClient.get('/vote/yes').toPromise();
    voteYesCount++;
    this.votes++;
  }

  selectNo() {
    console.log('NO');
    this.httpClient.get('/vote/no').toPromise();
    voteNoCount++;
    this.votes++;
  }

}
