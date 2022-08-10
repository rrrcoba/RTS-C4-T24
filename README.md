# RTS-C4-T24
Task 24 of the T-Systems BootCamp from Reus by Roger Rubio Rufaste
This readme contains a guide of the URL of the API and the expected results for each one.

## GET localhost:8181/workers
This URL returns a complete list of all workers inside the table with all the attributes.

## GET localhost:8181/workers/name/{name}
This URL returns a complete list of all workers inside the table with the same name as the one given.

## GET localhost:8181/workers/{id}
This URL returns the worker inside the table with the same ID as the one given.

## POST localhost:8181/workers/saveWorker
This URL saves the worker given as a body JSON text inside the table of the database. It returns the worker saved.

## PUT localhost:8181/workers/{id}
This URL takes the user of the ID given and updates the attributes with the ones given in the body JSON text. It returns the worker updated.

## DELETE localhost:8181/workers/{id}
This URL deletes from the table the user of the ID given.
