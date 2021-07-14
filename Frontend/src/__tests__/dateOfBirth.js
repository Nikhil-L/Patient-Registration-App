import React from "react";
import {DateOfBirth} from "../components/dateOfBirth/DateOfBirth"
import renderer from "react-test-renderer"
import {shallow} from "enzyme"

/**
 * This is to test the dateOfBirth Component
 */
describe("DateOfBirth test", ()=>{
  
  /**
   * Snapshot testing
   */
  it("matches a snapshot", ()=>{
    const tree = renderer.create(<DateOfBirth handleChange={jest.fn()}/>).toJSON();
    expect(tree).toMatchSnapshot();
  })

  /**
   * event testing
   */
  it('event testing', ()=>{
    let wrapper = shallow(<DateOfBirth handleChange={jest.fn()}/>);
    wrapper.find({name:'startDate'}).simulate('change', {target:
      {name:'startDate', value:'07/03/2000'}})
  })
})