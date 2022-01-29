#### LL1 grammar Kotlin Parser Generator

Terminals starts with a capital letter, non-terminals start with a small letter

To build own grammar specify 4 parameters:

- Grammar name\
```grammar Calculator;```


- Start node:\
```start: expression;```


- List or terminals:
    ```aidl
    terminals:
        NUM : "[0-9]+";
        MUL : "\\*";
        PLUS : "\\+";
        DIV : "/";
        ...
    ```

- List or rules:
    ```aidl
        expr -> nonE | _
        nonE -> NUM cont | LParen nonE RParen cont
    ```
  
Each non-terminal can appear on the left side of only one rule

You can specify the passed and returned value in the rule\
`expression [Grammar g] returns [res: Int] -> term expression`

There may be Kotlin code blocks on the right side of the rule. Arguments are consecutively numbered starting from 0. You can refer to the argument field `_1.field`. To refer to the return value, precede its name with `$`
```aidl
    tc [x: Int] returns [res: Int]
        -> MUL f {val y = x * _1.res} tc[y] {$res = _2.res}
        | DIV f {val y = x / _1.res} tc[y] {$res = _2.res}
        | _ {$res = x}
```