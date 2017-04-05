package com.riotgames.sample;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;


public boolean isAnOperator(Object s) {
		if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/"))
			return true;
		return false;
	}




/**
 * Calculator application
 */
public class CalcApp {
    public double calc(String[] tokens) {
        final double firstOperand;
        final double secondOperand;
        firstOperand = Double.parseDouble(tokens[0]);
        if (tokens.length > 2) {
            secondOperand = Double.parseDouble(tokens[2]);
        } else {
            secondOperand = Double.parseDouble(tokens[1]);
        }
        final Operator operator = Operator.findOperator(tokens[1]);

        return operator.evaluate(firstOperand, secondOperand);

    }

    public static void main( String[] args ) {
        final CalcApp app = new CalcApp();
        final StringBuilder outputs = new StringBuilder();
        Arrays.asList(args).forEach(value -> outputs.append(value + " "));
        System.out.print( "Addition of values: " + outputs + " = ");
        System.out.println(app.calc(args));
    }
}
