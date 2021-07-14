import React from "react";
import {Homepage} from "../components/homepage/Homepage"
import renderer from "react-test-renderer"

/**
 * This is to test the Homepage component
 */
describe("Homepage test", ()=>{

  /**
   * Snapshot testing
   */
  it("matches a snapshot", ()=>{
    const tree = renderer.create(<Homepage/>).toJSON();
    expect(tree).toMatchSnapshot();
  })
})