@echo off
:: stops any running server and starts it again (in the background)
:: you will not see all the output in the console - have to check logs
gradlew libertyStop libertyStart
