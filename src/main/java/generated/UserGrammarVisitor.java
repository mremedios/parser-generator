// Generated from C:/Users/Mary/Documents/edu3/mt/generator/src/main/java\UserGrammar.g4 by ANTLR 4.9.2
package generated;

import entities.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link UserGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface UserGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link UserGrammarParser#buildGrammar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuildGrammar(UserGrammarParser.BuildGrammarContext ctx);
	/**
	 * Visit a parse tree produced by {@link UserGrammarParser#grammarName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrammarName(UserGrammarParser.GrammarNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link UserGrammarParser#grammarStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrammarStart(UserGrammarParser.GrammarStartContext ctx);
	/**
	 * Visit a parse tree produced by {@link UserGrammarParser#grammarTerminals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrammarTerminals(UserGrammarParser.GrammarTerminalsContext ctx);
	/**
	 * Visit a parse tree produced by {@link UserGrammarParser#grammarTerminal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrammarTerminal(UserGrammarParser.GrammarTerminalContext ctx);
	/**
	 * Visit a parse tree produced by {@link UserGrammarParser#grammarRules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrammarRules(UserGrammarParser.GrammarRulesContext ctx);
	/**
	 * Visit a parse tree produced by {@link UserGrammarParser#grammarRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrammarRule(UserGrammarParser.GrammarRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link UserGrammarParser#ruleArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleArgs(UserGrammarParser.RuleArgsContext ctx);
}