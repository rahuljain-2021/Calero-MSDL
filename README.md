# Calero-MSDL

End to End user Journery automated placing couple of devices in the order.  

## Tech Stack
- Java 8 - Used for programming/automating the testcase
- Maven - Build automation tool
- Page Object Model (POM) - Design pattern POM used for the automation, POM is used as it provides easy scalabilty and maintainability.
- Cucmber - Used to support Behaviour Driven Development (BDD)
- Gherkin - Lanuage used to develope tests in Cucumber
-   


## Getting Started

Install [NVM](https://github.com/creationix/nvm). The .nvmrc file in the repo root will automatically switch you to the correct version of Node, if you have your shell set up to do so ([example for ZSH](https://github.com/lukechilds/zsh-nvm)).

Also create or edit your personal ~/.npmrc file to include:
```
//npm.pkg.github.com/:_authToken=TOKEN
```
Where TOKEN is a Github [Personal Access Token](https://help.github.com/en/github/authenticating-to-github/creating-a-personal-access-token-for-the-command-line). The token must have the permission `read:packages`.

To install dependencies:
`npm install`

When pulling the repo for the first time run:
`git submodule update --init`

To run the app locally against development APIs:
`npm run local`

## Branching Naming Convention
* The name of the branch should be simply the JIRA ticket from the BTE board, so a typical branch name will be `<JIRA Ticket ID>_<JIRA Ticket Title in snake case>`. **No branches should be created or work should be undertaken without a corresponding JIRA ticket**. 
If you want to deploy your branch to a feature branch environemnt, you will have to add `-deploy` at the end of the branch name. CircleCI will automatically pick it up and deploy your branch on to k8s. This is so that we can have faster development as well as avoiding to deploy resources that we may not need.
* You should always keep your local branch up to date with `master` and you will be blocked from merging unless it is up to date. 
* Merging into `master` should be done by way of a pull request raised on Github, with at least one peer reviewer required to authorise any request.
* **`master` branch is protected by Github from force pushing and merging without being up to date with base version.**
* All pull requests should be constructively peer reviewed for code quality and adequate test coverage. Merging is blocked without a peer review and passing tests on CircleCI see CI Pipeline.

## Contributing
- [Dependencies](./docs/contributing/dependencies.md)
- [Code Style](./docs/contributing/code-style.md)
- [Working with TypeScript](./docs/contributing/working-with-typescript.md)
- [Unit Testing](./docs/contributing/testing.md)
- [The payment flow widget](./docs/contributing/payment-widget.md)
- [A/B tests and feature flags](./docs/contributing/ab-tests-feature-flags.md)

## Other
- [Querying Database](./docs/database.md)
- [End To End Testing](./docs/end-to-end-tests.md)
- [Deployment, CI Pipeline & Version Control](./docs/deployment-pipeline.md)
- [Page performance](./docs/page-performance.md)
- [Controlling app behaviour with querystrings](./docs/query-strings.md)
- [caching of server HTML in Redis](./docs/redis-cache.md)

## Supporting bookable-app
- [Prerequisites and steps](./docs/support/index.md)
