import React from 'react';

const ImageDetail = (props)=>{
    
    return(
        <li>
        <img width="20%" src={props.link} />
        {props.title}
        </li>        
    )
};

export default ImageDetail;