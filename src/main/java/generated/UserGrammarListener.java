// Generated from C:/Users/Mary/Documents/edu3/mt/generator/src/main/java\UserGrammar.g4 by ANTLR 4.9.2
package generated;

import entities.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link UserGrammarParser}.
 */
public interface UserGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link UserGrammarParser#buildGrammar}.
	 * @param ctx the parse tree
	 */
	void enterBuildGrammar(UserGrammarParser.BuildGrammarContext ctx);
	/**
	 * Exit a parse tree produced by {@link UserGrammarParser#buildGrammar}.
	 * @param ctx the parse tree
	 */
	void exitBuildGrammar(UserGrammarParser.BuildGrammarContext ctx);
	/**
	 * Enter a parse tree produced by {@link UserGrammarParser#grammarName}.
	 * @param ctx the parse tree
	 */
	void enterGrammarName(UserGrammarParser.GrammarNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link UserGrammarParser#grammarName}.
	 * @param ctx the parse tree
	 */
	void exitGrammarName(UserGrammarParser.GrammarNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link UserGrammarParser#grammarStart}.
	 * @param ctx the parse tree
	 */
	void enterGrammarStart(UserGrammarParser.GrammarStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link UserGrammarParser#grammarStart}.
	 * @param ctx the parse tree
	 */
	void exitGrammarStart(UserGrammarParser.GrammarStartContext ctx);
	/**
	 * Enter a parse tree produced by {@link UserGrammarParser#grammarTerminals}.
	 * @param ctx the parse tree
	 */
	void enterGrammarTerminals(UserGrammarParser.GrammarTerminalsContext ctx);
	/**
	 * Exit a parse tree produced by {@link UserGrammarParser#grammarTerminals}.
	 * @param ctx the parse tree
	 */
	void exitGrammarTerminals(UserGrammarParser.GrammarTerminalsContext ctx);
	/**
	 * Enter a parse tree produced by {@link UserGrammarParser#grammarTerminal}.
	 * @param ctx the parse tree
	 */
	void enterGrammarTerminal(UserGrammarParser.GrammarTerminalContext ctx);
	/**
	 * Exit a parse tree produced by {@link UserGrammarParser#grammarTerminal}.
	 * @param ctx the parse tree
	 */
	void exitGrammarTerminal(UserGrammarParser.GrammarTerminalContext ctx);
	/**
	 * Enter a parse tree produced by {@link UserGrammarParser#grammarRules}.
	 * @param ctx the parse tree
	 */
	void enterGrammarRules(UserGrammarParser.GrammarRulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link UserGrammarParser#grammarRules}.
	 * @param ctx the parse tree
	 */
	void exitGrammarRules(UserGrammarParser.GrammarRulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link UserGrammarParser#grammarRule}.
	 * @param ctx the parse tree
	 */
	void enterGrammarRule(UserGrammarParser.GrammarRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link UserGrammarParser#grammarRule}.
	 * @param ctx the parse tree
	 */
	void exitGrammarRule(UserGrammarParser.GrammarRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link UserGrammarParser#ruleArgs}.
	 * @param ctx the parse tree
	 */
	void enterRuleArgs(UserGrammarParser.RuleArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link UserGrammarParser#ruleArgs}.
	 * @param ctx the parse tree
	 */
	void exitRuleArgs(UserGrammarParser.RuleArgsContext ctx);
}