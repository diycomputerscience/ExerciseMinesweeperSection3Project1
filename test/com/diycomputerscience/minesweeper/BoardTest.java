package com.diycomputerscience.minesweeper;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BoardTest {

	private Board board;
	
	@Before
	public void setUp() throws Exception {
		this.board = new Board();
	}

	@After
	public void tearDown() throws Exception {
		this.board = null;
	}

	@Test
	public void testSquaresGridSize() throws Exception {
		Square squares[][] = this.board.getSquares();
		assertEquals(Board.MAX_ROWS, squares.length);
		for(Square squareRow[] : squares) {
			assertEquals(Board.MAX_COLS, squareRow.length);			
		}
	}
	
	@Test
	public void testSquaresNotNull() throws Exception {
		Square squares[][] = this.board.getSquares();		
		for(Square squareRow[] : squares) {			
			for(Square aSquare : squareRow) {
				assertNotNull(aSquare);
			}
		}
	}

}
