import {inject} from 'aurelia-framework';
import {ViewFactory} from './view-factory';

export class platformer {

  constructor() {
    this.message = "lambi asi"
  }

  firstName = 'John';
  lastName = 'Doe';

  activate() {
    window.addEventListener('keypress', this.handleKeyInput, false);
  }

  deactivate() {
    window.removeEventListener('keypress', this.handleKeyInput);
  }

  handleJump() {
    console.log("i should jump..")
  }


  handleKeyInput = (event) => {
    console.log(event);
    console.log(event.key);
    console.log(document.getElementById("testbox").innerHTML);
    var box = document.getElementById("testbox");
    box.style.position = 'absolute';

    var pos = document.getElementById('testbox').getBoundingClientRect();
    var y = pos.top;
    var x = pos.left;

    if(event.key == "d") {
      box.style.left = x + 20+'px';
    }
    if(event.key == "a") {
      box.style.left = x - 20 +'px';
    }

    if(event.key == "w") {
      handleJump(x, y, box);
    }

    //box.style.top = y + 20+'px';
  }

}
