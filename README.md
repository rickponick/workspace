# pentaho-di-xpra #

A Docker image with Xpra and Pentaho Data Integration to run Spoon in a remote server and direct the display to your local machine with Xpra.

The local machine needs xpra installed, see http://xpra.org/.

## Usage ##

Run container in your docker host, mapping .kettle folder with kettle configuration, with

    docker run -d --name my-pdi-xpra -p 49100:22 -v /path/to/my/spoon/config/.kettle:/home/user/.kettle enricomariam42/pentaho-di-xpra

Allow ssh connection adding your public key in container's /home/user/.ssh/authorized_keys

    docker exec -i my-pdi-xpra /bin/bash -c 'cat > /home/user/.ssh/authorized_keys' < ~/.ssh/id_rsa.pub

Start test X11 application in container (eg. xeyes)

    ssh -p 49100 user@pdlhsgrendi xeyes &

Start Spoon from xterm in a login shell to read ENV variables and log console

    ssh -p 49100 user@pdlhsgrendi "bash -lc 'xterm -e /opt/pentaho/data-integration/spoon.sh'" &

Display the container-running Spoon from the local machine

    xpra --ssh="ssh -p 49100" attach ssh:user@mydockerhost:100 &

