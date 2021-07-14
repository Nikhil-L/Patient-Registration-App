import React from "react";

/**
 * This component renders the error message on to the screen
 * whenever the server is out of service.
 */
export class DbError extends React.Component{

    /**
     * This returns the html content
     * @returns Html for displaying error message
     */
     render()
     {
         return(<h2>Oops! Server seems to be down try again after some time</h2>);
     }
}