
export class home {

  constructor() {
    this.htmlText = "";
    this.message = 'NEW GAME!';

  }
  fetchTest() {
      return `{"width":900,"height":650,"platformSize":25,"platforms":[{"x":230.0,"y":650.0,"picture":"platform.png"},{"x":155.0,"y":550.0,"picture":"platform.png"},{"x":180.0,"y":550.0,"picture":"platform.png"},{"x":205.0,"y":550.0,"picture":"platform.png"},{"x":230.0,"y":550.0,"picture":"platform.png"},{"x":155.0,"y":400.0,"picture":"platform.png"},{"x":180.0,"y":400.0,"picture":"platform.png"},{"x":205.0,"y":400.0,"picture":"platform.png"},{"x":280.0,"y":250.0,"picture":"platform.png"},{"x":305.0,"y":250.0,"picture":"platform.png"},{"x":130.0,"y":175.0,"picture":"platform.png"},{"x":155.0,"y":175.0,"picture":"platform.png"},{"x":180.0,"y":175.0,"picture":"platform.png"},{"x":205.0,"y":175.0,"picture":"platform.png"},{"x":630.0,"y":650.0,"picture":"platform.png"},{"x":680.0,"y":475.0,"picture":"platform.png"},{"x":705.0,"y":475.0,"picture":"platform.png"},{"x":555.0,"y":400.0,"picture":"platform.png"},{"x":580.0,"y":400.0,"picture":"platform.png"},{"x":605.0,"y":400.0,"picture":"platform.png"},{"x":630.0,"y":400.0,"picture":"platform.png"},{"x":755.0,"y":325.0,"picture":"platform.png"},{"x":780.0,"y":325.0,"picture":"platform.png"},{"x":805.0,"y":325.0,"picture":"platform.png"},{"x":830.0,"y":325.0,"picture":"platform.png"},{"x":755.0,"y":150.0,"picture":"platform.png"},{"x":780.0,"y":150.0,"picture":"platform.png"},{"x":805.0,"y":150.0,"picture":"platform.png"},{"x":680.0,"y":575.0,"picture":"platform.png"},{"x":730.0,"y":450.0,"picture":"platform.png"},{"x":755.0,"y":450.0,"picture":"platform.png"},{"x":580.0,"y":325.0,"picture":"platform.png"},{"x":605.0,"y":325.0,"picture":"platform.png"},{"x":580.0,"y":175.0,"picture":"platform.png"},{"x":605.0,"y":175.0,"picture":"platform.png"},{"x":630.0,"y":175.0,"picture":"platform.png"},{"x":755.0,"y":75.0,"picture":"platform.png"},{"x":780.0,"y":75.0,"picture":"platform.png"},{"x":805.0,"y":75.0,"picture":"platform.png"},{"x":505.0,"y":575.0,"picture":"platform.png"},{"x":380.0,"y":500.0,"picture":"platform.png"},{"x":405.0,"y":500.0,"picture":"platform.png"},{"x":430.0,"y":500.0,"picture":"platform.png"},{"x":455.0,"y":500.0,"picture":"platform.png"},{"x":630.0,"y":400.0,"picture":"platform.png"},{"x":655.0,"y":400.0,"picture":"platform.png"},{"x":680.0,"y":400.0,"picture":"platform.png"},{"x":705.0,"y":400.0,"picture":"platform.png"},{"x":530.0,"y":325.0,"picture":"platform.png"},{"x":555.0,"y":325.0,"picture":"platform.png"},{"x":480.0,"y":225.0,"picture":"platform.png"},{"x":505.0,"y":225.0,"picture":"platform.png"},{"x":530.0,"y":225.0,"picture":"platform.png"},{"x":305.0,"y":625.0,"picture":"platform.png"},{"x":330.0,"y":475.0,"picture":"platform.png"},{"x":355.0,"y":475.0,"picture":"platform.png"},{"x":305.0,"y":325.0,"picture":"platform.png"},{"x":330.0,"y":325.0,"picture":"platform.png"},{"x":205.0,"y":150.0,"picture":"platform.png"},{"x":230.0,"y":150.0,"picture":"platform.png"},{"x":105.0,"y":0.0,"picture":"platform.png"},{"x":130.0,"y":0.0,"picture":"platform.png"},{"x":205.0,"y":650.0,"picture":"platform.png"},{"x":330.0,"y":575.0,"picture":"platform.png"},{"x":355.0,"y":575.0,"picture":"platform.png"},{"x":380.0,"y":575.0,"picture":"platform.png"},{"x":630.0,"y":500.0,"picture":"platform.png"},{"x":655.0,"y":500.0,"picture":"platform.png"},{"x":680.0,"y":500.0,"picture":"platform.png"},{"x":780.0,"y":425.0,"picture":"platform.png"},{"x":805.0,"y":425.0,"picture":"platform.png"},{"x":555.0,"y":275.0,"picture":"platform.png"},{"x":580.0,"y":275.0,"picture":"platform.png"},{"x":605.0,"y":275.0,"picture":"platform.png"},{"x":630.0,"y":275.0,"picture":"platform.png"},{"x":0.0,"y":0.0,"picture":"side.png"},{"x":25.0,"y":0.0,"picture":"ground.png"},{"x":50.0,"y":0.0,"picture":"ground.png"},{"x":75.0,"y":0.0,"picture":"ground.png"},{"x":100.0,"y":0.0,"picture":"ground.png"},{"x":125.0,"y":0.0,"picture":"ground.png"},{"x":150.0,"y":0.0,"picture":"ground.png"},{"x":175.0,"y":0.0,"picture":"ground.png"},{"x":200.0,"y":0.0,"picture":"ground.png"},{"x":225.0,"y":0.0,"picture":"ground.png"},{"x":250.0,"y":0.0,"picture":"ground.png"},{"x":275.0,"y":0.0,"picture":"ground.png"},{"x":300.0,"y":0.0,"picture":"ground.png"},{"x":325.0,"y":0.0,"picture":"ground.png"},{"x":350.0,"y":0.0,"picture":"ground.png"},{"x":375.0,"y":0.0,"picture":"ground.png"},{"x":400.0,"y":0.0,"picture":"ground.png"},{"x":425.0,"y":0.0,"picture":"ground.png"},{"x":450.0,"y":0.0,"picture":"ground.png"},{"x":475.0,"y":0.0,"picture":"ground.png"},{"x":500.0,"y":0.0,"picture":"ground.png"},{"x":525.0,"y":0.0,"picture":"ground.png"},{"x":550.0,"y":0.0,"picture":"ground.png"},{"x":575.0,"y":0.0,"picture":"ground.png"},{"x":600.0,"y":0.0,"picture":"ground.png"},{"x":625.0,"y":0.0,"picture":"ground.png"},{"x":650.0,"y":0.0,"picture":"ground.png"},{"x":675.0,"y":0.0,"picture":"ground.png"},{"x":700.0,"y":0.0,"picture":"ground.png"},{"x":725.0,"y":0.0,"picture":"ground.png"},{"x":750.0,"y":0.0,"picture":"ground.png"},{"x":775.0,"y":0.0,"picture":"ground.png"},{"x":800.0,"y":0.0,"picture":"ground.png"},{"x":825.0,"y":0.0,"picture":"ground.png"},{"x":850.0,"y":0.0,"picture":"ground.png"},{"x":875.0,"y":0.0,"picture":"ground.png"},{"x":900.0,"y":0.0,"picture":"side.png"},{"x":0.0,"y":25.0,"picture":"side.png"},{"x":900.0,"y":25.0,"picture":"side.png"},{"x":0.0,"y":50.0,"picture":"side.png"},{"x":900.0,"y":50.0,"picture":"side.png"},{"x":0.0,"y":75.0,"picture":"side.png"},{"x":900.0,"y":75.0,"picture":"side.png"},{"x":0.0,"y":100.0,"picture":"side.png"},{"x":900.0,"y":100.0,"picture":"side.png"},{"x":0.0,"y":125.0,"picture":"side.png"},{"x":900.0,"y":125.0,"picture":"side.png"},{"x":0.0,"y":150.0,"picture":"side.png"},{"x":900.0,"y":150.0,"picture":"side.png"},{"x":0.0,"y":175.0,"picture":"side.png"},{"x":900.0,"y":175.0,"picture":"side.png"},{"x":0.0,"y":200.0,"picture":"side.png"},{"x":900.0,"y":200.0,"picture":"side.png"},{"x":0.0,"y":225.0,"picture":"side.png"},{"x":900.0,"y":225.0,"picture":"side.png"},{"x":0.0,"y":250.0,"picture":"side.png"},{"x":900.0,"y":250.0,"picture":"side.png"},{"x":0.0,"y":275.0,"picture":"side.png"},{"x":900.0,"y":275.0,"picture":"side.png"},{"x":0.0,"y":300.0,"picture":"side.png"},{"x":900.0,"y":300.0,"picture":"side.png"},{"x":0.0,"y":325.0,"picture":"side.png"},{"x":900.0,"y":325.0,"picture":"side.png"},{"x":0.0,"y":350.0,"picture":"side.png"},{"x":900.0,"y":350.0,"picture":"side.png"},{"x":0.0,"y":375.0,"picture":"side.png"},{"x":900.0,"y":375.0,"picture":"side.png"},{"x":0.0,"y":400.0,"picture":"side.png"},{"x":900.0,"y":400.0,"picture":"side.png"},{"x":0.0,"y":425.0,"picture":"side.png"},{"x":900.0,"y":425.0,"picture":"side.png"},{"x":0.0,"y":450.0,"picture":"side.png"},{"x":900.0,"y":450.0,"picture":"side.png"},{"x":0.0,"y":475.0,"picture":"side.png"},{"x":900.0,"y":475.0,"picture":"side.png"},{"x":0.0,"y":500.0,"picture":"side.png"},{"x":900.0,"y":500.0,"picture":"side.png"},{"x":0.0,"y":525.0,"picture":"side.png"},{"x":900.0,"y":525.0,"picture":"side.png"},{"x":0.0,"y":550.0,"picture":"side.png"},{"x":900.0,"y":550.0,"picture":"side.png"},{"x":0.0,"y":575.0,"picture":"side.png"},{"x":900.0,"y":575.0,"picture":"side.png"},{"x":0.0,"y":600.0,"picture":"side.png"},{"x":900.0,"y":600.0,"picture":"side.png"},{"x":0.0,"y":625.0,"picture":"side.png"},{"x":900.0,"y":625.0,"picture":"side.png"},{"x":0.0,"y":650.0,"picture":"side.png"},{"x":25.0,"y":650.0,"picture":"ground.png"},{"x":50.0,"y":650.0,"picture":"ground.png"},{"x":75.0,"y":650.0,"picture":"ground.png"},{"x":100.0,"y":650.0,"picture":"ground.png"},{"x":125.0,"y":650.0,"picture":"ground.png"},{"x":150.0,"y":650.0,"picture":"ground.png"},{"x":175.0,"y":650.0,"picture":"ground.png"},{"x":200.0,"y":650.0,"picture":"ground.png"},{"x":225.0,"y":650.0,"picture":"ground.png"},{"x":250.0,"y":650.0,"picture":"ground.png"},{"x":275.0,"y":650.0,"picture":"ground.png"},{"x":300.0,"y":650.0,"picture":"ground.png"},{"x":325.0,"y":650.0,"picture":"ground.png"},{"x":350.0,"y":650.0,"picture":"ground.png"},{"x":375.0,"y":650.0,"picture":"ground.png"},{"x":400.0,"y":650.0,"picture":"ground.png"},{"x":425.0,"y":650.0,"picture":"ground.png"},{"x":450.0,"y":650.0,"picture":"ground.png"},{"x":475.0,"y":650.0,"picture":"ground.png"},{"x":500.0,"y":650.0,"picture":"ground.png"},{"x":525.0,"y":650.0,"picture":"ground.png"},{"x":550.0,"y":650.0,"picture":"ground.png"},{"x":575.0,"y":650.0,"picture":"ground.png"},{"x":600.0,"y":650.0,"picture":"ground.png"},{"x":625.0,"y":650.0,"picture":"ground.png"},{"x":650.0,"y":650.0,"picture":"ground.png"},{"x":675.0,"y":650.0,"picture":"ground.png"},{"x":700.0,"y":650.0,"picture":"ground.png"},{"x":725.0,"y":650.0,"picture":"ground.png"},{"x":750.0,"y":650.0,"picture":"ground.png"},{"x":775.0,"y":650.0,"picture":"ground.png"},{"x":800.0,"y":650.0,"picture":"ground.png"},{"x":825.0,"y":650.0,"picture":"ground.png"},{"x":850.0,"y":650.0,"picture":"ground.png"},{"x":875.0,"y":650.0,"picture":"ground.png"},{"x":900.0,"y":650.0,"picture":"side.png"}]}`;
    }

    /**
     * Ruutude lisamine maailmasse
     * @param x
     * @param y
     * @param pic
     * @returns {string}
     */
    getSquareAtCords(x, y, pic) {

      var result = '<div style=" width: 25px; height: 25px; position: absolute; overflow:auto;);';
      result += 'background-image: url(\'src/' + pic + '\');';
      result += 'top: ' + y + 'px;';
      result += 'left: ' + x + 'px;';
      result += '">';
      result += '</div>';

      return result
    }


    /**
     * Maailma lugemine JSONI-st
     * @returns {string}
     */
    readWorld() {
      var worldJson = JSON.parse(this.fetchTest());
      console.log(worldJson.width);
      console.log(worldJson.height);
      console.log(worldJson);


      var result = "";
      //result += '<div id="wholeGame" style="background-color: blue;position: relative;overflow:hidden; width: '+ 850 +'px; height: '+ 2650 +'px">';
      //result += '<div id="wholeGame" style="background-color: blue;position: relative;overflow:hidden; width: '+ (worldJson.width + 50) +'px; height: '+ (worldJson.height + 50) +'px">';
      result +=`<div id="wholeGame" style =
      "background-image: url('src/resources/temp/Layer_0000_9.png'), url('src/resources/temp/Layer_0001_8.png'), url('src/resources/temp/Layer_0002_7.png'), url('src/resources/temp/Layer_0003_6.png'), url('src/resources/temp/Layer_0004_Lights.png'), url('src/resources/temp/Layer_0005_5.png'), url('src/resources/temp/Layer_0006_4.png'), url('src/resources/temp/Layer_0007_Lights.png'), url('src/resources/temp/Layer_0008_3.png'), url('src/resources/temp/Layer_0009_2.png'), url('src/resources/temp/layer_0010_1_oige.png');
      `;

      result += 'position: relative;overflow:hidden; width: '+ (worldJson.width + 25) +'px; height: '+ (worldJson.height + 25) +'px">';

      for (var i = 0; i < worldJson.platforms.length; i++) {
        var ruut = worldJson.platforms[i];
        result += this.getSquareAtCords(ruut.x, ruut.y, ruut.picture);
      }

      result += '</div>';
      //console.log(result);
      return result
    }

    /**
     * Paneb playeri kaardile
     */
    placePlayer() {
      var box = document.getElementById("testbox");

      box.style.top = 625 + 'px';
      box.style.left = 50 + 'px';
    }

    /**
     * Maailma genereerimine
     */
    generateTemp() {
      this.htmlText = this.readWorld();
      this.placePlayer();

      var worldJson = JSON.parse(this.fetchTest());
      var refreshpos = setInterval(this.refreshPos, 1000, this.playerOnGround, worldJson);

    }
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
        box.style.right = x + 20+'px';
      }
    }

    if(event.key == "w") {
      this.handleJump(x, y, box);
    }

    //box.style.top = y + 20+'px';
  }
  gameOver()
  {
    this.message = 'Game over!';
  }


  playGame() {
    this.message = '';
    this.play = false;
    window.setTimeout(() => this.play = true, 5000);

    this.generateTemp();}


}
