package com.nalepsky.kyu4.rankingPokerHands;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PokerHand {
    //TODO finish that
    //https://www.codewars.com/kata/5739174624fc28e188000465
    public enum Result { TIE, WIN, LOSS }
    private enum Figure {
        HIGH_CARD,
        PAIR,
        TWO_PAIRS,
        THREE_OF_A_KIND,
        STRAIGHT,
        FLUSH,
        FULL_HOUSE,
        FOUR_OF_A_KIND,
        STRAIGHT_FLUSH,
        ROYAL_FLUSH
    }

    private static class Card{
        private final int value;
        private final Character suit;

        Card(String card){
            this.value = card.charAt(0);
            this.suit = card.charAt(1);
        }

        public int getValue() {
            return value;
        }

        public Character getSuit() {
            return suit;
        }
    }

    private final List<Card> cards;
    //private final Figure figure;

    PokerHand(String hand)
    {
        cards = Arrays.stream(hand.split(" "))
                .map(Card::new)
                .collect(Collectors.toList());
    }

    private Figure setFigure(){
        return null;
    }

    public Result compareWith(PokerHand hand) {
        return Result.TIE;
    }
}
