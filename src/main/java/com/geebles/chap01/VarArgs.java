package com.geebles.chap01;public class VarArgs {	public void variableArgumentList(int...  x) {	}		public void callVariableArgumentList() {		// No arguments? No problem.		variableArgumentList();		// One argument? Also no problem.		variableArgumentList(1);		// Mulitple arugments? Awesome.		variableArgumentList(1, 2);		variableArgumentList(1, 2, 3);		variableArgumentList(1, 2, 3, 4);		// Arguments that aren't ints? No dice.		//variableArgumentList("1");		//variableArgumentList(1, 2, "3");	}}