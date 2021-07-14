import React from "react";
import {Register} from "../components/register/Register"
import renderer from "react-test-renderer"
import {shallow} from "enzyme"

/**
 * This is to test the Register component
 */
describe("Register test", ()=>{

  /**
   * Snapshot testing
   */
  it("matches a snapshot", ()=>{
    const tree = renderer.create(<Register/>).toJSON();
    expect(tree).toMatchSnapshot();
  })

  /**
   * register event testing
   */
  it('event testing', ()=>{
    let wrapper = shallow(<Register/>);
    wrapper.find('form').props().onSubmit({preventDefault: jest.fn()});
    wrapper.find({name:'firstName'}).simulate('change', {target:
      {name:'firstName', value:'Arun'}})
    wrapper.find({name:'lastName'}).simulate('change', {target:
      {name:'lastName', value:'Kumar'}})
    wrapper.find({name:'gender'}).simulate('change', {target:
      {name:'gender', value:'Male'}})
    wrapper.find("RegistrationDate").props().handleChange('03/07/2000');
    wrapper.find("DateOfBirth").props().handleChange('03/07/2000');
    wrapper.find('form').props().onSubmit({preventDefault: jest.fn()});
  })
})