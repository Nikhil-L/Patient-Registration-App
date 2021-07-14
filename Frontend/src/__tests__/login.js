import React from "react";
import '@testing-library/jest-dom'
import {Login} from "../components/login/Login"
import renderer from "react-test-renderer"
import {shallow}  from "enzyme"


/**
 * This is to test the Login component
 */
describe("Login test", ()=>{

  /**
   * Snapshot testing
   */
  it("matches a snapshot", ()=>{
    const tree = renderer.create(<Login/>).toJSON();
    expect(tree).toMatchSnapshot();
  })

/**
   * login event testing
   */
it('login check', ()=>{
  let wrapper = shallow(<Login/>);
  wrapper.find('input[type="text"]').simulate('change', {target: {name: 'username', value: 'krishankantsinghal'}});
  wrapper.update();
  expect(wrapper.find('input[type="text"]').props().value).toEqual('krishankantsinghal');
})

it('login end to end testing', ()=>{
  let wrapper = shallow(<Login/>);
  wrapper.find('form').props().onSubmit({preventDefault: jest.fn()});
  wrapper.find('input[type="text"]').simulate('change', {target:
    {name:'username', value:'Arun_kumar'}})
    wrapper.find('input[type="password"]').simulate('change', {target:
      {name:'password', value:'Ark@234'}})
    wrapper.find('form').props().onSubmit({preventDefault: jest.fn()});
})

})

