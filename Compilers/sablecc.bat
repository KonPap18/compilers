cd C:\Users\kwnstantinos\git\Compilers\Compilers
java -jar lib\sablecc.jar minipythonOPA.grammar %2 %3 %4 %5 %6 %7 %8 %9
move "minipython" "src"
rmdir /Q /S  minipython
pause