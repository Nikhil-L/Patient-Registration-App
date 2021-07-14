import React from "react";
import '@testing-library/jest-dom'
import {Details} from "../components/details/Details"
import renderer from "react-test-renderer"
import {shallow} from "enzyme"


/**
 * This is to test the Details component
 */
describe("Details test", ()=>{

  /**
   * Snapshot testing
   */
  it("matches a snapshot", ()=>{
    const tree = renderer.create(<Details/>).toJSON();
    expect(tree).toMatchSnapshot();
  })

  /**
   * search event testing
   */
  it('search testing', ()=>{
    let wrapper = shallow(<Details/>);
    wrapper.find('input[type="text"]').simulate('change', 
    {target: {name: 'search', value: 'r'}});
    wrapper.find('button').simulate('click',{
        preventDefault: () => {
         }});
  })

  /**
   * This is to test no entries found 
   */
  it('search no entries testing', ()=>{
    let wrapper = shallow(<Details/>);
    wrapper.find('input[type="text"]').simulate('change', 
    {target: {name: 'search', value: 'Hello'}});
    wrapper.find('button').simulate('click',{
        preventDefault: () => {
         }});
  })
})