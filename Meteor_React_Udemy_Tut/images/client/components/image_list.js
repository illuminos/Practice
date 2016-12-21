// create our image list component
// import react
import React from 'react';
import ImageDetail from './image_detail';

// const IMAGES = [
//     { title: 'Pen', link:'https://dummyimage.com/600x400'},
//     { title: 'Pine Tree', link: 'https://dummyimage.com/600x400'},
//     { title: 'Mug', link: 'https://dummyimage.com/600x400'}
// ];

// create our component
const ImageList = (props) => {

    const validImages = props.images.filter(image => !image.is_album);
    const RenderedImages = validImages.map((image)=>        
        <ImageDetail key={image.id} title={image.title} link={image.link} description={image.description}
        ups={image.ups} downs={image.downs}/>
    );
    
    return (
        <ul className="media-list list-group">
            {RenderedImages}
        </ul>
    );
}

// Export our component
export default ImageList;