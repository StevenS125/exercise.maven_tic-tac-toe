package com.github.perscholas;

import java.util.ArrayList;
import java.util.*;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    public Board(Character[][] matrix) {
//        Make matrix Array into flat one dimensional array
//        Define clear advantages for X and O characters
//        Define winner advantages for each character

        List<Character> moves = new ArrayList<Character>();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <3 ; j++) {
                moves.add(matrix[i][j]);
            }
        }
        System.out.println(moves);
    }

    public Boolean isInFavorOfX() {
        return null;
    }

    public Boolean isInFavorOfO() {
        return null;
    }

    public Boolean isTie() {
        return null;
    }

    public String getWinner() {
        return null;
    }

}
