import React from "react";
import './style.css';
import { Sidebar } from "./Sidebar";
import  { Redirect } from 'react-router-dom';

/**
 * This component renders the homepage of the webpage
 */
export class Homepage extends React.Component{

  /**
   * Initializes the props
   * @param {*} props 
   */
  constructor(props) {
      super(props);
  
      this.state = {
        input: {},
        errors: {}
      };
  
    }

       /**
  * This is used to render the component to the webpage
  * @returns a html code 
  */
  render(){
      let isAuthenticated = sessionStorage.getItem("isAuthenticated")
      if(isAuthenticated)
      {
        return(
          <div>
              <div className="heading">
                  <h1>Patient Registration</h1>
              </div >
              <Sidebar />
          </div>
        );
      }
      else{
        return <Redirect to='/'/>
      }
      
  }
}