import React, { Component } from 'react';
import DatePicker from 'react-datepicker';
import "react-datepicker/dist/react-datepicker.css";

/**
 * This component is used to create a input option to enter date of birth
 */
export class DateOfBirth extends Component {

  /**
   * Initializes the props
   * @param {*} props 
   */
  constructor (props) {
    super(props)
    this.state = {
      startDate: new Date()
    };
    this.props.handleChange(this.state.startDate);
    this.handleChange = this.handleChange.bind(this);
  }

  /**
   * This method is used to handle the changes made on the browser
   * @param {*} date 
   */
  handleChange(date) {
    this.setState({
      startDate: date
    });
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
          <label name = "DateOfBirth">Date of Birth</label>
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
