:: This will work only for Windows users

:: Grab the IP address as used by the docker machine and assign it to IP_ADDRESS variable.
:: Docker Host has to be running for this to work, of course.
FOR /f %%i in ('docker-machine ip default') DO SET IP_ADDRESS=%%i
SET DOCKER_TLS_VERIFY=1

:: Set the DOCKER_HOST based on the default IP address
SET DOCKER_HOST=tcp://%IP_ADDRESS%:2376

::Set the path based on the username of the logged in user - %USERNAME%.
SET DOCKER_CERT_PATH=C:\Users\%USERNAME%\.docker\machine\machines\default

SET DOCKER_MACHINE_NAME=default