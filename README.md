<h1>Section 3 Project 1</h1>

<h2>Overview</h2>

In the previous project, we added functionality to the ```Square``` class. If you think of it, a ```Square``` is a rather low level object. As we see in Figure 1 below, a Minesweeper game, a board is made up of several squares. 

![Minesweeper Game Image](https://raw.github.com/diycomputerscience/MinesweeperImages/master/images/BasicDesktopGame.jpg)

_**Figure 1**_


Just like we have a ```Square``` class which is a back-end class that represents the user interface square, we should also have a back-end ```Board``` class which represents the user interface Board.

We will work on building the Board class in this project. Just like we did in the case of Square, we should ask ourselves to determine the functionality of Board. 

Here's a conversation which you might have with a senior developer while trying to determine the functionality of a ```Board``` object.

 - _**(you)**_ What are the responsibilities of a board ?
 - _**(senior developer)** The main responsibility would be as a container of square objects_
 - _**(you)** If a board is to contain a grid of squares, the first question that comes to mind is - What kind of a data structure should we use, to represent a grid of Squares ?_
 - _**(senior developer)** Two options come to mind right away. We can either represent the grid as a 2 dimensional array of Square objects, or we can represent the grid as a List of Lists. I think representing the grid of squares as a two dimensional array seems like a reasonable choice_
 - _**(you)**_ Should the ```Board``` class have any methods ?
 - _**(senior developer)** Great question. But instead of answering your question directly, let me ask you a question first. Who do you think would be the client of the ```Board``` class ? By client, I mean, which class would use (invoke method of) the ```Board``` class ?_
 - _**(you)** Ummm, I think the UI class(es) would invoke methods on the ```Board``` class._
 - _**(senior developer)** That's right. What do you think the UI class(es) would want to do with the Board ?_
 - _**(you)** When a user performs an action on the UI, to mark a square or uncover it, the UI class would need to reflect that action on the square objects. Since the Board is a container of square objects, it would need to perform such operations on the Board._
 - _**(senior developer)** That's great. So which methods do you think the ```Board``` class should have ?_
 - _**(you)** Methods for manipulating ```Square``` objects ? Like ```uncover```  and ```mark``` ?_
 - _**(senior developer)** Yes that's a good start. Eventually you might add a few more methods to it, but you don't need to worry about it right now. However, do remember that you will have to identify the square in the method in Board._
 - _**(you)** Thanks for your time. Can I ask you just one more question ?_
 - _**(senior developer)** Sure!_
 - _**(you)** Should the size of the board be configurable ?_
 - _**(senior developer)** Eventually yes, but for now you can define constants in the Board class, and use a hardcoded size._


We have given you the two constants shown below in Board.java.

        public static final int MAX_ROWS = 6;
        public static final int MAX_COLS = 6;

_**Code Snippet 3.1**_

If you do not know why we have made these constants static and final, you should check out these references [1](http://diycomputerscience.com/competencies/topic/core-java/competency/understands-when-we-should-make-a-member-static) [2](http://diycomputerscience.com/competencies/topic/core-java/competency/undertands-what-the-final-keyword-means).

<h2>Steps For This Activity</h2>

 1. Import this project into Eclipse
 1. Run ```SquareTest``` as a unit test and ensure that all the tests pass
 1. Run ```BoardTest``` as a unit test. You will see 2 of 2 tests have failed. You have to implement methods in the ```Board``` class to get the tests to pass
 1. In the ```Board``` class, create the two constants shown above
 1. In the ```Board``` class, declare an instance attribute which is a 2 dimensional array of ```Square``` objects, called 'squares'
 1. In the constructor of the ```Board``` class instantiate the 2 dimensional array and give it a size, such that the numbers of rows are ```MAX_ROWS``` and the number of columns are ```MAX_COLS```
 1. Run ```BoardTest```. Now you should have 1 success ```testSquaresGridSize``` and 1 failure ```testSquaresNotNull``` .
 1. Think why the other test case is failing. Can you figure out how to get it to pass ? Take some time and think about it.
 1. Instantiate ```squares``` in the constructor of ```Board``` and ensure that every element in the grid has a valid ```Square``` object. For now we do not have to do anything special with the squares.
 1. Run the unit tests in ```BoardTest```. Both tests will pass if your code is correct.

<h2>Learning Outcomes</h2>

1. How to declare and instantiate a 2 dimensional array
2. How to initialize an object in it's constructor
3. How to define a constant 
4. How to instantiate a class
5. How to make design decisions

