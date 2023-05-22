export class Feedback {
    title:string='';
    description:string='';
    likeordislike:boolean=true;
    image:File;
    name:string='';
    email:string='';

    
constructor() {
    const dummyImageData = new Uint8Array(); // Replace with actual dummy image data
    this.image = new File([dummyImageData], 'dummy-image.jpg', { type: 'image/jpeg' });
  }
}
