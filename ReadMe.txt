As a biker I would like to know the exact location of city bikes around the world in a given application.
•             Endpoint: http://api.citybik.es/v2/networks
•             Auth: No
•             HTTPS: No
•             Understands how the API works.
•             Create some BDD scenarios and automate them using Java to test the API
•             Test this particular scenario: “As a user I want to verify that the city Frankfurt is in Germany and return their corresponded latitude and longitude”



•	My framework is Cucumber (BDD).
•	I built my framework using Java Programming Language.
•	I used maven as a build automation tool for my java project.
•	I used cucumber-junit as maven dependency.
•	I also used cukes runner in this project.
•	I have utilities package, which contains utility classes such as Configuration Reader.
•	I am using Cucumber and Gherkin language in order non-technical people to understand what is going on in testing.
•	I have created my test cases in the feature files as is.
•	In Feature folder I store my feature files separately, it helps in usability of the codes.
•	I use Hooks as pre- and post-test implementations.
•	Step Definitions folder is the place where my actual test scripts are.
•	For assertions / verifications, to compare expected and actual results I utilize Junit.
•	I also used cukes runner to orchestrate test running.
o	Inside the cukes runner, I used glues in order to connect feature files to step definitions.
o	I also use tags for tests that I want to run in bulk.
•	My framework is completely easy to maintain. Since I have elements stored in one centralized place. If any changes happen on the application about the elements, I know where to go and how to fix it in order to run test scripts correctly.
