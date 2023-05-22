import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Feedback } from '../feedback';
import { HttpClient } from '@angular/common/http';


@Component({
  selector: 'app-feedback-form',
  templateUrl: './feedback-form.component.html',
  styleUrls: ['./feedback-form.component.css']
})
export class FeedbackFormComponent implements OnInit {
  feedbackForm: FormGroup;
  selectedFile: File | null;

  feedback:Feedback=new Feedback();

  constructor(private formBuilder: FormBuilder,private http:HttpClient) {
    this.feedbackForm = this.formBuilder.group({
      title: ['', Validators.required],
      description: ['', Validators.required],
      likeordislike: ['', Validators.required],
      image: ['', Validators.required],
      name: ['', Validators.required],
      email: ['', [Validators.required, Validators.email]]
    });
    this.selectedFile=null;
   }

  ngOnInit(): void {
    this.feedbackForm = this.formBuilder.group({
      title: ['', Validators.required],
      description: ['', Validators.required],
      likeordislike: ['', Validators.required],
      image: ['', Validators.required],
      name: ['', Validators.required],
      email: ['', [Validators.required, Validators.email]]
    });
  
  }

  onFileChange(event:any): void {
    if (event.target.files && event.target.files.length > 0) {
      this.selectedFile = event.target.files[0];
    }
  }

  submitForm(): void {
  

      this.feedback=this.feedbackForm.value;

      const url = 'http://localhost:2720/add/Feedback';
      
      this.http.post(url,this.feedback).subscribe((response)=>{
        console.log(response);
      },(error)=>{
        console.log("error",error);
      })

      if (this.feedbackForm.invalid) {
        return;

    }

    // Here, you can access the form values using this.feedbackForm.value
    // and perform actions like sending the data to the backend or storing it locally.

    // Reset the form
    this.feedbackForm.reset();
    this.selectedFile = null;
  }
}