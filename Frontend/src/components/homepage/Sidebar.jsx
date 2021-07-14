import React from "react";
import { SidebarData } from "./sidebarData";
import { Register } from "../register/Register";
import { Details } from "../details/Details";


/**
 * This component is used to render the sidebar to select options of either getting
 * patient details, registering a user or loging out
 */
export class Sidebar extends React.Component{

    /**
    * Initializes the props
    * @param {*} props 
    */
    constructor(props) {
        super(props);
    
        this.state = {
          title:"Patient Details",
          clicked:false,
          data: SidebarData
        };

        this.handleClick = this.handleClick.bind(this);
    
    }

    /**
     * This is to handle the logic to perform on click of buttons
     * @param {*} title 
     */
    handleClick(title)
    {
        
        if(title === "Register")
        {    this.setState({clicked:true});
            this.setState({title:"Register"});
        }
        else{
            this.setState({clicked:false});
            this.setState({title:"Patient Details"});
        }
        if(title === "Logout")
        {
            window.location = "/";
            sessionStorage.clear();
        }
        
    }

     /**
     * This is used to render the component to the webpage
     * @returns a html code 
     */
    render(){
        return(
            <div>
                {this.state.clicked?<Register/>:<Details/>}
                <div className="Sidebar">
                    <div className="welcome">Welcome</div>
                    <ul className="SidebarList">
                        {this.state.data.map((val, key) => {
                            return(     
                                <li 
                                    className="row"
                                    name={val.title}
                                    key={key} 
                                    onClick={()=>this.handleClick(val.title)}>
                                    <div id="title"
                                        className={this.state.title === val.title?"active":""}>{val.title}</div>
                                </li>
                            );
                        })}
                    </ul>
                    
                </div>
            </div>
        );
    }
}

