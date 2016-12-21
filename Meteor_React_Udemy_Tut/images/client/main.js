//import the react library
import React, {Component} from 'react';
import ReactDOM from 'react-dom';
import ImageList from './components/image_list';
import axios from 'axios';

//create a component
class App extends Component {

    //called automatically everytime a react component is created
    constructor(props){
        super(props);
        this.state = {images:[]};
    }

    componentWillMount(){
        // great place to load data as this is called once before that component is rendered
        //console.log('App is about to render!');
        axios
        .get('https://api.imgur.com/3/gallery/hot/viral/0')
        .then(response => this.setState({images: response.data.data}))
        .catch(response => console.log(response));
        // Never do this
        // this.state.images = something;
        //initialize it only in the constructor
        //and use setState to update its value
    }

    //gets rendered everytime when state changes
    render() {
        //console.log(this.state.images);
        return (
            <div>
                <ImageList images={this.state.images}/>
            </div>
        );
    }
}

// Render this component to the screen
Meteor.startup(() => {
 ReactDOM
 .render(<App />, document.querySelector('.container'));
 
});