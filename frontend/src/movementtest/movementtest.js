export class movementtest {

  constructor() {
    this.message = "platformer.js";
    this.message1 = "original msg";
    this.foo;
    this.htmlText = "<h1>it works!</h1> yay!";
  }

  firstName = 'John';
  lastName = 'Doe';




  fun2() {
    console.log("function 2");
  }

  fun1() {
    this.htmlText = "<h1>it changed!</h1> hurray!!"
    console.log("function 1");
    this.fun2();

    for(var i = 0; i < 5; i++) {
      console.log(i);
    }
  }


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


