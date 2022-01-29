grammar UserGrammar;

@header {
import entities.*;
}

buildGrammar returns [Grammar grammar] locals [ArrayList<NonTerminal> nonterms]
    @init{
        $nonterms = new ArrayList<NonTerminal>();
    }:
    grammarName
    grammarStart
    grammarTerminals
    grammarRules[$nonterms]
    {$grammar = new Grammar(
        $grammarName.name,
        $grammarStart.start,
        $grammarTerminals.terminals,
        $nonterms,
        $grammarRules.rules
    );};

grammarName returns [String name]:
    'grammar' Capitalized {$name = $Capitalized.text; } Semi;

grammarStart returns [String start]:
    'start' Colon Lower {$start = $Lower.text;} Semi;

grammarTerminals returns [ArrayList<Terminal> terminals]
    @init{
        $terminals = new ArrayList<Terminal>();
    }:
    'terminals' Colon
    (grammarTerminal {$terminals.add($grammarTerminal.terminal); })*;

grammarTerminal returns [Terminal terminal]:
    Capitalized Colon Regex {$terminal = new Terminal($Capitalized.text, $Regex.text);} Semi;

grammarRules[ArrayList<NonTerminal> nonterms] returns [ArrayList<Rule> rules]
    @init{
        $rules = new ArrayList<Rule>();
    }:
    'rules' Colon
    (grammarRule[nonterms] {$rules.addAll($grammarRule.rules); })*;

grammarRule[ArrayList<NonTerminal> nonterms] returns [ArrayList<Rule> rules]
    @init{
        $rules = new ArrayList<Rule>();
    }:
    l=Lower
        p=Params?
        ('returns' r=Params)? {$nonterms.add(new NonTerminal($l.text, $p.text, $r.text)); }
        '->' ruleArgs {$rules.add(new Rule($l.text, $ruleArgs.right)); }
        ('|' ruleArgs {$rules.add(new Rule($l.text, $ruleArgs.right)); }) * ;

//ruleReturns returns [String ret]:
//    'returns' Params {$ret = $Params.text; };

ruleArgs returns [ArrayList<Argument> right]
    @init{
        $right = new ArrayList<Argument>();
    }:
    (Lower Params? {$right.add(new Argument($Lower.text, $Params.text));}   |
     Capitalized {$right.add(new Argument($Capitalized.text));}             |
     Eps {$right.add(new Argument($Eps.text));}                             |
     Code {$right.add(new Argument($Code.text));}                           )+;

Integer : [0-9]+;
WS: [ \t\r\n]+ -> skip;
Lower : [a-z][A-Za-z]*;
Capitalized : [A-Z][A-Za-z]*;
Eps : '_';
Colon: ':';
Semi: ';';
Quote : '\'';
Regex: '"' (~('"'))* '"';
Params : '[' (~(']'))* ']';
Code : '{' (~('}'))* '}';