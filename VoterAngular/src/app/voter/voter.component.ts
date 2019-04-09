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
  private name: string;
  private newName: string;
  constructor(private httpClient: HttpClient, private cs: CookieService) {
    this.votes = 0;
    this.name = 'Loading...';
    this.newName = '';
  }

  ngOnInit() {
    
    setTimeout((function (scope) {
        return function () {
          scope.httpClient.get('/vote/name', {responseType: 'text'}).toPromise()
            .then(value => scope.name = value)
            .then(value => scope.newName = value);
          console.log('Timeout change')
        }})(this)
      ,1000);

    setInterval((function (scope) {
      return function () {
        scope.httpClient.get('/vote/name', {responseType: 'text'}).toPromise().then(value => scope.newName = value);
        if(scope.name != scope.newName) {
          scope.name = scope.newName;
          localStorage.removeItem('vote');
          console.log('Changed voting')
        }
      }})(this)
    ,2000);

  }

  selectYes() {
    if(localStorage.getItem('vote')==null){
      console.log('YES');
      this.httpClient.get('/vote/yes').toPromise();
      localStorage.setItem('vote', 'voted');
      voteYesCount++;
      this.votes++;
    }else{
      console.log('Already voted')
    }

  }

  selectNo() {
    if(localStorage.getItem('vote')==null){
      console.log('NO');
      this.httpClient.get('/vote/no').toPromise();
      localStorage.setItem('vote', 'voted');
      voteNoCount++;
      this.votes++;
    }else{
      console.log('Already voted')
    }

  }

}
