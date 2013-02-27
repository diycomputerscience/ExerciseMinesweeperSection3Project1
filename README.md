<h1>Section 3 Project 1</h1>

<h2>Overview</h2>

In the previous project, we added functionality to the ```Square``` class. Figure 1 below shows a Minesweeper game. As you can see a square is really a constituent of board. In other words a board is composed of many squares.

![Minesweeper Game Image](https://raw.github.com/diycomputerscience/MinesweeperImages/master/images/BasicDesktopGame.jpg)

_**Figure 1**_


Just like we have a ```Square``` class which is a back-end class that represents the user interface square, we should also have a back-end ```Board``` class which represents the user interface Board.

We will work on building the ```Board``` class in this project. Just like we did in the case of ```Square```, we should ask ourselves to determine the functionality of ```Board```. 

Here's a conversation which you might have with a senior developer while trying to determine the functionality of a ```Board``` object.

 - _**(developer)**_ What are the responsibilities of a board ?
 - _**(team lead)** The main responsibility is to be a container of square objects_
 - _**(developer)** If a board is to contain a grid of squares, the first question that comes to mind is - What kind of a data structure should we use, to represent a grid of Squares ?_
 - _**(team lead)** Two options come to mind right away. We can either represent the grid as a 2 dimensional array of Square objects, or we can represent the grid as a ```List``` of ```List```s. I think representing the grid of squares as a two dimensional array seems like a reasonable choice_
 - _**(developer)** Should the size of the board be configurable ?_
 - _**(team lead)** Eventually yes, but for now I suggest you start with the simplest thing which works. At the moment I suggest you define constants in the ```Board``` class to define the size, as shown in Code Snippet 3.1_

We have already provided you with the two constants shown below, in ```Board.java```.

        public static final int MAX_ROWS = 6;
        public static final int MAX_COLS = 6;

_**Code Snippet 3.1**_

If you do not know why we have made these constants static and final, you should check out these references [1](http://diycomputerscience.com/competencies/topic/core-java/competency/understands-when-we-should-make-a-member-static) [2](http://diycomputerscience.com/competencies/topic/core-java/competency/undertands-what-the-final-keyword-means).

<h2>Steps For This Activity</h2>

 1. Import this project into Eclipse
 1. Run ```SquareTest``` as a unit test and ensure that all the tests pass
 1. Run ```BoardTest``` as a unit test. You will see 2 of 2 tests have failed. You have to implement methods in the ```Board``` class to get the tests to pass
 1. In the ```Board``` class, declare an instance attribute called ```squares```, which is a 2 dimensional array of ```Square``` objects.
 1. In the constructor of the ```Board``` class, instantiate the 2 dimensional array and give it a size, such that the numbers of rows are ```MAX_ROWS``` and the number of columns are ```MAX_COLS```
 1. Run ```BoardTest```. Now you should have 1 success ```testSquaresGridSize``` and 1 failure ```testSquaresNotNull``` .
 1. Think why the other test case is failing. Can you figure out how to get it to pass ? Take some time and think about it.
 1. Instantiate ```squares``` in the constructor of ```Board``` and ensure that every element in the grid has a valid ```Square``` object. For now we do not have to do anything special with the squares.
 1. Run the unit tests in ```BoardTest```. Both tests will pass if your code is correct.

<h2>Questions To Ponder</h2>

 1. What are the pros and cons of representing the grid of squares as a two dimensional array as compared to a list of ```List``` objects ?

<h2>Learning Outcomes</h2>

1. How to declare and instantiate a 2 dimensional array
2. How to initialize an object in it's constructor
3. How to define a constant 
4. How to instantiate a class
5. How to make design decisions

