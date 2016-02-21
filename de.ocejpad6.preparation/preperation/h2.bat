@java -cp "%M2_REPO%\com\h2database\h2\1.4.191\h2-1.4.191.jar;%H2DRIVERS%;%CLASSPATH%" org.h2.tools.Server %*
@if errorlevel 1 pause