import React from "react";
import ReactDOM from 'react-dom'
import {Sidebar} from "../components/homepage/Sidebar"
import renderer from "react-test-renderer"
import {shallow} from "enzyme"

/**
 * This is to test the Sidebar component
 */
describe("Sidebar test", ()=>{

  /**
   * Snapshot testing
   */
  it("matches a snapshot", ()=>{
    const tree = renderer.create(<Sidebar/>).toJSON();
    expect(tree).toMatchSnapshot();
  })
  
  /**
   * event testing
   */
  it("renders without crashing", ()=>{
    const div = document.createElement('div');
    ReactDOM.render(<Sidebar/>, div);
  })
  
  /**
   * event testing
   */
  it('event testing', ()=>{
    let wrapper = shallow(<Sidebar/>);
    wrapper.find({name:"Register"}).simulate('click')
    wrapper.find({name:"Patient Details"}).simulate('click')
    wrapper.find({name:"Logout"}).simulate('click')
  })
})


