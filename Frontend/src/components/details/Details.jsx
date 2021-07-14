import React from "react";
import "./style.css";
import { PatientDetails } from "./patientDetails";
import { NoEntries } from "../noEntries/NoEntries";
import {Keys} from "./Key";
import  { Redirect } from 'react-router-dom'

/**
 * This component is for displaying the details of the user to the webpage and also 
 * provides the option for searching particular patient details
 */
export class Details extends React.Component{

    /**
     * Initializes the props
     * @param {*} props 
    */
    constructor(props){
        super(props);

        this.state = {
            data:PatientDetails,
            search:""
        };
        this.getHeader = this.getHeader.bind(this);
        this.getRowsData = this.getRowsData.bind(this);
        this.getKeys = this.getKeys.bind(this);
        this.getKey = this.getKey.bind(this);
        this.handleChange = this.handleChange.bind(this);
        this.handleSearch = this.handleSearch.bind(this);
    }

    /**
     * This method takes the event and sets the state value on 
     * any change in the state of the event in webbrowser
     * @param {*} event 
     */
    handleChange(event)
    {
        this.setState({search:event.target.value})
    }

    /**
     * This methods handles the component state when any person details is 
     * search based on the first name
     * @param {*} event 
     */
    handleSearch(event)
    {
        event.preventDefault();
        var searchList = [];
        var searchword = this.state.search;
        var data = this.state.data;
        for(var val in data)
        {
            let firstName = data[val]['firstName'];
            if((firstName.toLowerCase()).includes(searchword.toLowerCase()))
            {
                searchList.push(data[val]);
            }
        }

        console.log(searchList.length);
        if(searchList.length > 0)
        {
            this.setState({data:searchList});
        }
        else{
            window.location = "/no-entries"
        }
    }

    /**
     * This method renders the details of the patients whenever the component 
     * gets mounted on to the webpage
     */
    componentDidMount() {
        const apiUrl = 'http://localhost:8082/patient_registration_war/webapi/details';
        fetch(apiUrl).then(response => response.json()).then((response) => 
            {this.setState({ data: response})
        }).catch(error => {
            if(!error.response)
                window.location = "/dberror"
        });
    }
        
    /**
     * This method
     * @returns the keys of the json object stored in state
     */
    getKeys = function(){
        return Object.keys(Keys);
    }

    getKey = function(){
        return Object.keys(this.state.data[0])
    }
    
    /**
     * This method
     * @returns the headers or the column names of the patient details table
     */
    getHeader = function(){
        var keys = this.getKeys();
        return keys.map((key, index)=>{
            return <th key={key}>{key.toUpperCase()}</th>
        })
    }
    
    /**
     * This method
     * @returns a list of rows of the patient details table
     */
    getRowsData = function(){
        var items = this.state.data;
        var keys = this.getKey();
        return items.map((row, index)=>{
            return <tr key={index}><RenderRow key={index} data={row} keys={keys}/></tr>
        })
    }

    /**
     * This method
     * @returns the component to be rendered to the webpage
     */
    render() {
        return (
            <div>
                <div className="search">
                    <input type="text" placeholder="Search..." 
                    name="search"
                    onChange={this.handleChange}/>
                    <button type="submit" value="submit"
                    className="btn"
                    onClick={this.handleSearch}>
                        Search
                    </button>
                </div>
                <div className="details">
                    <table className="tbody">
                        <thead>
                            <tr>{this.getHeader()}</tr>
                        </thead>
                        <tbody>
                        {this.getRowsData()}
                        </tbody>
                    </table>
                </div>
            </div>
        );
    }
    
}

/**
 * This renders the list of patient details in the form of rows
 * @param {*} props 
 * @returns 
 */
const RenderRow = (props) =>{
    return props.keys.map((key, index)=>{
        return <td key={props.data[key]}>{props.data[key]}</td>
    })
}