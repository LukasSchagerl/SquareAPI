Software Lifecycle Management
<Scenario> Square API
<Description> We are a small Geo Company in Vienna. A client wants an API which outputs the square of a number
Project
You should implement a REST-based server in Java (use Spring Boot). The service should be able to return the desired information using REST.
Requirements
Use GitHub or Azure DevOps for the project and follow the correct DevOps procedure. Use a Kanban board to manage your User Stories and use a git branching model (preferable gitflow) to manage your code. Track your development process by updating your Kanban board and write at least one unit tests for every requirement. A Continuous Integration pipeline that produces the finished software artifact should be implemented as well. Document
the whole process
the user stories
the repository URL
the usage of the software
in a Readme file with explanatory text. Submit the code (including the .git folder and ALM files) as a zip file (please put the Readme inside the zip file).
You can use external resources as long as you mark them: “ // taken from: <URL> ”
 

Points
Documentation of the process: 15%
Requirement definitions (User Stories): 15%
Correct status / Linking / Branching (Kanban, Git): 15%
Implementation: 15%
Testing: 15%
Pipeline (Continuous Integration and Maven): 15%
Artefacts (Continuous Delivery): 10%
All elements must be present in the documentation.

References
https://github.com/LukasSchagerl/SquareAPI






Documentation of the whole process

- neues java, maven Projekt erstellt mit web spring
- Projekt teilen auf GitHub ( https://github.com/LukasSchagerl/SquareAPI)
- Kanbanboard auf Github erstellt
- Userstroy für die square api erstellt
- develop(from master) und featureSquare(from develop) brunch erstellt in inteliJ und gepushed
- add workflow buildtesting for develop branch, wird in master erstellt und dann nach develop gemerged
- in featureSquare  RestController erstellt, mit @GetMapping für die suarefunktion
- featureSquare  branch gepushed
- featureSquare in develop
- workflow Build Artifact in master erstellt
- merge develop into master

Die Square Api rechnet von einer eingegeben zahl das Quadrat und gibt diese aus

Aufruf per:
im Browser
http://localhost:8080/api/square?a=3.0

Ausgabe im Browser:
9
