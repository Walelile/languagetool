#!/usr/bin/env sh

cd LanguageTool-4.1-stable 

# run server with http
java -cp languagetool-server.jar org.languagetool.server.HTTPServer --port 8081

# run server with https, but need the ceritificate file
#sh install.sh -c server

# query
#http://localhost:8081/v2/check?language=en-US&text=i%20love%20apple

