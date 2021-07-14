import React from "react";
import { NoEntries } from "../components/noEntries/NoEntries";
import renderer from "react-test-renderer";

/**
 * This is to test the NoEntries component
 */
describe("App test", ()=>{
  
  /**
   * Snapshot testing
   */
  it("matches a snapshot", ()=>{
    const tree = renderer.create(<NoEntries/>).toJSON();
    expect(tree).toMatchSnapshot();
    
  })
})