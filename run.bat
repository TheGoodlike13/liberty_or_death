@echo off
:: stops any running server and runs it again (in console)
:: you will see server launch output in console
gradlew libertyStop libertyRun

:: stops any running server and starts it again (in the background)
:: you will not see all the output in the console - have to check logs
:: gradlew libertyStop libertyStart
