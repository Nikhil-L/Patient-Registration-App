import React from "react";
import {RegistrationDate} from "../components/registrationDate/RegistrationDate"
import renderer from "react-test-renderer"
import {shallow} from "enzyme"

/**
 * This is to test the RegistrationDate component
 */
describe("RegistrationDate test", ()=>{

  /**
   * Snapshot testing
   */
  it("matches a snapshot", ()=>{
    const tree = renderer.create(<RegistrationDate handleChange={jest.fn()}/>).toJSON();
    expect(tree).toMatchSnapshot();
  })

  /**
   * event testing
   */
  it('event testing', ()=>{
    let wrapper = shallow(<RegistrationDate handleChange={jest.fn()}/>);
    wrapper.find({name:'startDate'}).simulate('change', {target:
      {name:'startDate', value:'07/03/2021'}})
  })
})