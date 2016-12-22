//gets executed on the server
import _ from 'lodash';
import {Meteor} from 'meteor/meteor';
import {Employees} from '../imports/collections/employees';
import {image, helpers} from 'faker';

Meteor.startup(()=>{
    // great place to generate some data

    // check to see if data already exists in the collection
    // see if the collection has any records
    const numberOfRecords = Employees.find({}).count();
    console.log(numberOfRecords);
    if (!numberOfRecords){
        // Generate some data
        _.times(5000,()=>{
            const {name, email, phone} = helpers.createCard();
            Employees.insert({
                name, email, phone,
                avatar: image.avatar()
            });
        });
    }
});