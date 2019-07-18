# ui-admin

## Cheatsheet

### angular-cli [Angular CLI](https://www.npmjs.com/package/@angular/cli)

- Chechk cli and angular core versions

`ng v`

- Update cli and angular core

````
npm uninstall -g @angular/cli
npm cache verify
npm install -g @angular/cli@latest
````

- Create new angular project

`ng new [NEW-PROJECT-NAME]`

- Install project dependencies

`npm install`

- Run dev server

`ng serve`

- Generate a new component/directive|pipe|service|class|guard|interface|enum|module

`ng generate component [NEW-COMPONENT-NAME]`

You can also use 

`ng generate directive|pipe|service|class|guard|interface|enum|module`

- Build

`ng build`

- Unit test

`ng test`

### Build, tag and push docker image

`docker build -t opp-ui-admin:V4 -t opp-ui-admin --pull --no-cache .`

`docker tag opp-ui-admin:V4 giopeto/opp-ui-admin:V4`

`docker push giopeto/opp-ui-admin:V4`


`docker build -t opp-ui-admin:V4 -t opp-ui-admin --pull --no-cache . && docker tag opp-ui-admin:V4 giopeto/opp-ui-admin:V4 && docker push giopeto/opp-ui-admin:V4`

OR

Linux: `./script.sh`
Windows: `sh script.sh`

````








````
# Cli readme

This project was generated with [Angular CLI](https://github.com/angular/angular-cli) version 8.1.1.

## Development server

Run `ng serve` for a dev server. Navigate to `http://localhost:4200/`. The app will automatically reload if you change any of the source files.

## Code scaffolding

Run `ng generate component component-name` to generate a new component. You can also use `ng generate directive|pipe|service|class|guard|interface|enum|module`.

## Build

Run `ng build` to build the project. The build artifacts will be stored in the `dist/` directory. Use the `--prod` flag for a production build.

## Running unit tests

Run `ng test` to execute the unit tests via [Karma](https://karma-runner.github.io).

## Running end-to-end tests

Run `ng e2e` to execute the end-to-end tests via [Protractor](http://www.protractortest.org/).

## Further help

To get more help on the Angular CLI use `ng help` or go check out the [Angular CLI README](https://github.com/angular/angular-cli/blob/master/README.md).