import React from 'react';
import ImageScore from './image_score';

const ImageDetail = (props)=>{
    
    return(
        <li className="media list-group-item">
        <div className="media-left">
        <img src={props.link} />
        </div>
        <div className="media-body">
            <h4 className="media-heading">
            {props.title}
            </h4>
            <p>{props.description}</p>
            <ImageScore ups={props.ups} downs={props.downs}/>
        </div>
        </li>        
    )
};

export default ImageDetail;