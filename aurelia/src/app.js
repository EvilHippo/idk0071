export class App {
  constructor() {
    this.message = 'mingi tekst 123';
  }

  configureRouter(config, router) {
    this.router = router;
    config.title = 'minu app';
    config.map([
      { route: ['', 'home'],       name: 'home',       moduleId: 'home/index' },
      { route: 'people',            name: 'people',      moduleId: 'people/people', nav: true, title: 'Users' },
    ]);
  }
}


