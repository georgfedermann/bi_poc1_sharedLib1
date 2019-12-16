
def printLifeSign(){
    sh label: '', script: 'echo "This comes from sharedLib 1"'
    myFunctions2.printLifeSign()
}
