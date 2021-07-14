import './App.css';
import { Login } from "./components/login/Login";
import { Homepage } from "./components/homepage/Homepage";
import { DbError } from "./components/dbError/DbError";
import { NoEntries } from './components/noEntries/NoEntries';
import React, {Component} from 'react';
import { Redirect } from 'react-router-dom';
import {
  BrowserRouter as Router,
  Switch,
  Route
} from "react-router-dom";


export default class App extends Component{
  
  render(){
    return (
      <Router>
          <div className="App">
            <Switch>
              <Route exact path="/home">
                <Homepage />
              </Route>
              <Route exact path="/">
                <Login />
              </Route>
              <Route exact path="/dberror">
                <DbError/>
              </Route>
              <Route exact path="/no-entries">
                <NoEntries/>
              </Route>
              <Route render={() => <Redirect to={{pathname: "/"}} />} />
            </Switch>
          </div>
      </Router>
    );
  }
}



