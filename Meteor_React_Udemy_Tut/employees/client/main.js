import React from 'react';
import ReactDOM from 'react-dom';

//After meteor loads in the browser, render my app to the dom


const App = ()=>{
    return(
        <div>Hello there!</div>
    );
};

Meteor.startup(()=>{
    //React render call
    ReactDOM.render(<App/>,document.querySelector('.container'));
});
