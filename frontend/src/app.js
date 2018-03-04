export class App {

  constructor() {
    this.message = 'app.js';
  }

  configureRouter(config, router) {
    this.router = router;
    config.title = 'Platformer';

    config.map([
      { route: ['', 'home'],       name: 'home',       moduleId: 'home/index', title: "Home", nav: true },
      { route: 'movementtest',            name: 'movementtest',      moduleId: 'movementtest/movementtest', nav: true }
    ]);
  }

}

