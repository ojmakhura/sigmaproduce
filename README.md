# Sigma Produce

# Dependencies
## Doctor Jim
The project relies on Doctor Jim which should be cloned from https://github.com/ojmakhura/doctor-jim

## AndroMDA
The project relies on the AndroMDA framework to generate code from the UML diagram. Therefore, you should clone and compile the AndroMDA project located at https://github.com/ojmakhura/andromda

### Andromda Branch
Currently the branch that works with this project is the 5.0-SNAPSHOT branch.
`git checkout 5.0-SNAPSHOT` then `./builder.sh`

## Docker
Make sure you have docker installed on your system.

## Make
The build process for this application uses the make command. Make sure it has been installed on your system.

# Running the application locally (from scratch)
## Build the application
1. Run 'make clean_build'
2. If building for the first time, you may need to cd into the bocraportal directory and run 'mvn install -Dmaven.test.skip=true'

## Database
Install and run a postgres databaser

## Bring up keycloak server
Install and run keycloak

## Bring up the pgadmin
Optionally you can install and run pgadmin

## Run the API locally
1. Run the API locally using 'make env=LOCAL run_api_local'

## Run the frontend locally
1. Run the command 'make local_web_deps'
2. Run the command 'make run_web_local'
