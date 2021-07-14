import React from "react";
import App from "../App";
import renderer from "react-test-renderer";


/**
 * This is to test the App component
 */
describe("App test", ()=>{
  
  /**
   * Snapshot testing
   */
  it("matches a snapshot", ()=>{
    const tree = renderer.create(<App/>).toJSON();
    expect(tree).toMatchSnapshot();
    
  })
})