### ``` Distributed-Tic-Tac-Toe```

FEATURES:

• This Project makes use of the Java Remote Method Invocation API. With
the help of RMI we can allow an object to invoke methods on an object
running in another JVM. It is provided in the package java.rmi

• It uses one Remote Interface and two implementation classes, one each for
Server and Client

• The server will always be up and running

• The server can handle multiple clients

• The game begins after at least 2 clients have joined, and each client will
either be assigned an ’x’ or an ’o’

• When a user wants to play a game and no other user has joined yet, ”Wait”
is printed on the client’s terminal

• Players are teamed in the order which they join and the player connected
first will be asked to make the first move

• The Board will be a 3x3 square, and during your turn, you
will be required to enter an integer between 1 and 9, and the corresponding
block will be marked with your marker(x or o)

• The Board will be printed on the screen at all times, and will be updated
after each and every turn

• If an illegal move is made i.e. user enter an integer outside [1,9] then the
user will lose their chance

• After the match has ended, the respective Win/Lose/Draw message would
be printed on the screen of both the users

• The Players have the option to restart the match after it has ended

EXECUTION:

In the Project Directory,
1. In a new terminal, Run ./make.sh
2. In a new terminal, Run java Server
3. In a new terminal, Run java Client - This will be Player 1
4. In a new terminal, Run java Client - This will be Player 2
