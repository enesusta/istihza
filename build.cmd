call "C:\Program Files (x86)\Microsoft Visual Studio\2019\BuildTools\VC\Auxiliary\Build\vcvars64.bat"
call mvn clean package -Pnative
call "C:\Program Files\Git\usr\bin\mintty.exe" -h always /bin/bash -l -e javadoc.sh
REM:-Dnative-image.xmx=32M

