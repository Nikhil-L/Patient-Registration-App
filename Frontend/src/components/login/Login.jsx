import React from "react";
import "./style.scss"
import loginImg from "../../logo.png";

/**
 * This component is used to handle all the login and its events
 */
export class Login extends React.Component {

  /**
    * Initializes the props
    * @param {*} props 
    */
  constructor(props) {
    super(props);

    this.state = {
      input: {},
      errors: {},
    };
     
    this.handleChange = this.handleChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);

  }

  /**
     * This method is used to handle the changes made on the webpage
     * @param {*} event 
     */
  handleChange(event) {
    let input = this.state.input;
    input[event.target.name] = event.target.value;
  
    this.setState({
      input
    });
  }

  /**
     * This method is used to handle the submissions
     * @param {*} event 
     */
  handleSubmit(event) {
    event.preventDefault();
    this.validate();
  }

  /**
     * This is to validate the authenticity of the user
     *
     */
  validate(){
    let url = 'http://localhost:8082/patient_registration_war/webapi/login';
    let postData = {
        "username":this.state.input["username"],
        "password":this.state.input["password"]
      };
    const axios = require('axios');
    axios.post(url, postData)
    .then((response)=>{ 
      console.log(response)
      sessionStorage.setItem("username", this.state.input["username"])
      sessionStorage.setItem("isAuthenticated", true)
      response.data?window.location="/home":this.setState(
      {errors:{"errormsg":"Invalid username or password"}})
    }).catch(error => {
      if(!error.response)
        window.location = "/dberror"
    });
}

 /**
  * This is used to render the component to the webpage
  * @returns a html code 
  */
  render() {
    
    return (
      <div className="login">
      <div className="base-container" ref={this.props.containerRef}>
        <form onSubmit={this.handleSubmit}>
          <div className="content">
            <div className="image">
              <img src={loginImg} />
            </div>
            <div className="form">
              <div className="form-group">
              <div className="text-error">{this.state.errors.errormsg}</div>
                <input 
                  data-testid="test-input"
                  type="text"
                  name="username"
                  value={this.state.input.username}
                  onChange={this.handleChange}
                  placeholder="username" />
                
              </div>
              <div className="form-group">
                <input
                  data-testid="test-input1"
                  type="password"
                  name="password"
                  value={this.state.input.password}
                  onChange={this.handleChange}
                  placeholder="password" />
              
              </div>
            </div>
          </div>
          <div className="footer">
            <button type="submit" value="submit" className="btn">
             <b>Login</b> 
            </button>
          </div>
        </form>
      </div>
      </div>
    );

  }
}
