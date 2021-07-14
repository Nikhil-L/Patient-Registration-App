import React, { Component } from 'react';
import DatePicker from 'react-datepicker';
import "react-datepicker/dist/react-datepicker.css";

/**
 * This component renders a date picker to select registration date
 */
export class RegistrationDate extends Component {

  /**
    * Initializes the props
    * @param {*} props 
    */
  constructor (props) {
    super(props)
    this.state = {
      startDate: new Date()
    };
    this.props.handleChange(this.state.startDate)
    this.handleChange = this.handleChange.bind(this);
  }


  /**
   * This method is used to handle the changes made on the browser
   * @param {*} date 
   */
  handleChange(date) {
    this.setState({
      startDate: date
    })
    this.props.handleChange(date);
  }

 
  /**
  * This is used to render the component to the webpage
  * @returns a html code 
  */
  render() {
    return (
      <div className="form-group">
        <div>
          <label name = "Registration Date">Registration Date</label>
        </div>
        <DatePicker
            selected={ this.state.startDate }
            onChange={ this.handleChange }
            name="startDate"
            maxDate = {new Date()}
            dateFormat="MM/dd/yyyy"
        />
      </div>
    );
  }
  
}
