import React from "react";

/**
 * This component display no result found message 
 * on to the screen when there aren't any search results.
 */
export class NoEntries extends React.Component{

    /**
     * This method
     * @returns html code for displaying the error message.
     */
     render()
     {
         return(<h2>No result found for your search</h2>);
     }
}