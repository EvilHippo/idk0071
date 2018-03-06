
export class home {

  constructor() {
    this.message = 'NEW GAME!';

  }
  gameOver()
  {
    this.message = 'Game over!';
  }

  playGame() {
  var time = 60;
    this.play = true;
    window.setTimeout(() => this.play = false, 2000);
    /*
      Listens to key input for movement
       */
      activate() {
        window.addEventListener('keypress', this.handleKeyInput, false);
      }

      deactivate() {
        window.removeEventListener('keypress', this.handleKeyInput);
      }


      /**
       * Implement jump
       */
      handleJump() {
        console.log("i should jump..")
      }

      /**
       *
       * @param worldJson
       * @returns {boolean}
       */
      playerOnGround(worldJson) {

        var box = document.getElementById("testbox");
        var pos = document.getElementById('testbox').getBoundingClientRect();

        for (var i = 0; i < worldJson.platforms.length; i++) {
          var ruut = worldJson.platforms[i];
          if(ruut.x < box.style.left && box.style.left < ruut.x + 25 &&
              ruut.y < box.style.top && box.style.top < ruut.y + 25) {
            return true;
          }
        }

        return false;
      }

      refreshPos(playerOnGround, worldJson) {
        var box = document.getElementById("testbox");
        var pos = document.getElementById('testbox').getBoundingClientRect();

        var y = pos.top;


        if(!playerOnGround(worldJson)) {
          var newPos = parseInt(y) + 2;
          //box.style.top = newPos +'px';
        } else {

        }
      }


      /**
       * Movement
       * @param event Key input
       */

      handleKeyInput = (event) => {
        console.log(event.key);
        var box = document.getElementById("testbox");
        box.style.position = 'absolute';

        var pos = document.getElementById('testbox').getBoundingClientRect();
        var y = pos.top;
        var x = pos.left;

        console.log(box.style.left);
        console.log(box.style.top);

        if(event.key == "d") {
          if(parseInt(box.style.left) < 890) {
            console.log("right");
            box.style.left = x + 20+'px';
          }
        }
        if(event.key == "a") {
          if(parseInt(box.style.left) > 30) {
            console.log("left");
            box.style.left = x - 20+'px';
          }
        }

        if(event.key == "w") {
          this.handleJump(x, y, box);
        }

        //box.style.top = y + 20+'px';
      }
  }


}
