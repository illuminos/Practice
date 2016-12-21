import React from 'react';

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
        </div>
        </li>        
    )
};

export default ImageDetail;