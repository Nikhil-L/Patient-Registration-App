import axios from "axios";
import React from "react";
import { DateOfBirth }  from "../dateOfBirth/DateOfBirth";
import { RegistrationDate }from "../registrationDate/RegistrationDate";
import "./style.scss";

export class Register extends React.Component{

  /**
    * Initializes the props
    * @param {*} props 
    */
  constructor(props) {
      super(props);
  
      this.state = {
        input: {"firstName":"", "lastName":"", "gender":"Male"},
        errors: {"firstName":""}
      };

      this.handleChange = this.handleChange.bind(this);
      this.handleSubmit = this.handleSubmit.bind(this);
      this.convert = this.convert.bind(this)
  }

  /**
   * This is to handle the changes made on the webbrowser
   * @param {*} event 
   * @param {*} name the event name that triggered 
   * @param {*} istriggered checks whether it was triggered automatically or foced triggered
   */
    handleChange(event, name,  istriggered = true) {
        let input = this.state.input;
        istriggered?input[event.target.name] = event.target.value:input[name] = event;
        this.setState({input:input});
      }

    /**
     * To convert the javascript date into sql date
     * @param {*} dt date
     * @returns 
     */
    convert(dt){
      var date = new Date(dt);
      var month=("0"+(date.getMonth()+1)).slice(-2);
      var day = ("0"+date.getDate()).slice(-2);
      return [date.getFullYear(), month, day].join("-")
    }
  
    /**
     * This method is used to handle the submissions
     * @param {*} event 
     */
    handleSubmit(event) {
      event.preventDefault();
    
      if(this.validate()){

          let input = this.state.input;
          input["registrationDate"] = this.convert(input["registrationDate"]);
          input["dateOfBirth"] = this.convert(input["dateOfBirth"]);
          this.setState({input:input});
          let url = "http://localhost:8082/patient_registration_war/webapi/register";
    
          axios.post(url, input).then((response)=>{window.location.reload()}).catch(error => {
              if(!error.response)
                window.location = "/dberror"
            });
          
      }
    }
  
    /**
     * This is to validate the registration form
     * @returns boolean value
     */
    validate(){
      let input = this.state.input;
      let errors = {};
      let isValid = true;
      
      if (!input["firstName"]) {
        isValid = false;
        errors["firstName"] = "Please enter your First Name.";
      }

      if (!input["lastName"]) {
          isValid = false;
          errors["lastName"] = "Please enter your Last Name.";
      }
    
  
      this.setState({
        errors: errors
      });
  
      return isValid;
    }
  
  /**
  * This is used to render the component to the webpage
  * @returns a html code 
  */
  render=()=>{
      return(
          <div className="base-container" ref={this.props.containerRef}>
              <form onSubmit={this.handleSubmit}>
                  <div className="content">
                      <div className="form">
                          <div className="form-group">
                            <div className="text-error">{this.state.errors.firstName}</div>
                              <label htmlFor="lastName">First Name</label>
                              <input 
                              type="text"
                              name="firstName"
                              value={this.state.input.firstname}
                              onChange={this.handleChange}
                              placeholder="First Name" />
                          </div>
                          <div className="form-group">
                            <div className="text-error">{this.state.errors.lastName}</div>
                              <label htmlFor="lastName">Last Name</label>
                              <input
                              type="text"
                              name="lastName"
                              value={this.state.input.lastname}
                              onChange={this.handleChange}
                              placeholder="Last Name" />
                          </div>
                          <div className="form-group">
                            <div>
                              <label className = "gender" htmlFor="gender">Gender</label>
                              <select
                                className="gender" 
                                name="gender" 
                                value={this.state.input.gender}  
                                onChange={this.handleChange}>
                                  <option value="Male">Male</option>
                                  <option value="Female">Female</option>
                                  <option value="Others">Others</option>
                              </select>
                            </div>
                            <br></br>
                          </div>
                          <RegistrationDate 
                          name="registrationDate" 
                          value={this.state.input.RegistrationDate} 
                          handleChange={(date)=>this.handleChange(date, "registrationDate", false)}/>
                          <DateOfBirth
                          name="dateOfBirth"
                          value = {this.state.input.DateOfBirth} 
                          handleChange={(date)=> this.handleChange(date, "dateOfBirth", false)}/>
                      </div>
                  </div>
                  <button type="submit" value="submit" className="button">
                  Register
                  </button>
              </form>
          </div>
      );
  }
  
}