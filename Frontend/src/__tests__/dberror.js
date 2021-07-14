import React from "react";
import '@testing-library/jest-dom'
import {DbError} from "../components/dbError/DbError"
import renderer from "react-test-renderer"


/**
 * This is to test the DbError component
 */
describe("Details test", ()=>{

  /**
   * Snapshot testing
   */
  it("matches a snapshot", ()=>{
    const tree = renderer.create(<DbError/>).toJSON();
    expect(tree).toMatchSnapshot();
  })

})