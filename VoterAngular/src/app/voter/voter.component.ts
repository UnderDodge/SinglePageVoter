import { Injectable} from '@angular/core';
import { Component, OnInit } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {CookieService} from "ngx-cookie-service";

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
  constructor(private httpClient: HttpClient, private cs: CookieService) {
    this.votes = 0;
  }

  ngOnInit() {
  }

  selectYes() {
    if(!this.cs.check('vote')){
      console.log('YES');
      this.httpClient.get('/vote/yes').toPromise();
      this.cs.set('vote', 'voted', 1)
      voteYesCount++;
      this.votes++;
    }else{
      console.log('Already voted')
    }

  }

  selectNo() {
    if(!this.cs.check('vote')){
      console.log('NO');
      this.httpClient.get('/vote/no').toPromise();
      this.cs.set('vote', 'voted')
      voteNoCount++;
      this.votes++;
    }else{
      console.log('Already voted')
    }

  }

}
