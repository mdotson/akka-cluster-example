Change hostname to be equal to the ip address of the box running this app

Run this on 192.168.1.7 (backend)

sbt "project backend" "run-main backend.TransformationBackend 2551"  
sbt "project backend" "run-main backend.TransformationBackend 2552"

Then run this on 192.168.1.2 frontend:
sbt "project frontend" run
OR
sbt "project frontend" "run-main frontend.TransformationFrontend 0"