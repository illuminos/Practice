import React from 'react';

const ImageScore = (props) => {
    // Props.ups is the number of upvotes
    // Props.downs is the number of downvotes
    // const ups = props.ups;
    // const downs = props.downs;

    const {ups, downs} = props;
    const upsPercent = `${100 * (ups / (ups + downs))}%`;
    const downsPercent = `${100 * (downs / (ups + downs))}%`;

    return(
        <div>
        Ups/Downs
        <div className="progress">
            <div style={{ width: upsPercent}} className="progress-bar progress-bar-success progress-bar-striped"/>                            
            <div style={{ width: downsPercent}} className="progress-bar progress-bar-danger progress-bar-striped"/>
        </div>
        </div>
    );
};

export default ImageScore;