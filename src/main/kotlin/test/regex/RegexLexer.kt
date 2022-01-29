package test.regex
import java.text.ParseException
import java.util.regex.Matcher
import java.util.regex.Pattern
           
class RegexLexer(str: String) {
    private var input: StringBuilder = StringBuilder(str)
    private var matcher: Matcher = Pattern.compile("").matcher(input);
    private val ignore: Pattern = Pattern.compile("([ \t\n\r]+)")
    lateinit var curToken: RegexToken
        private set
    val tokens = mapOf(
		RegexToken.C to Pattern.compile("[a-z]"),
		RegexToken.LParen to Pattern.compile("\\("),
		RegexToken.RParen to Pattern.compile("\\)"),
		RegexToken.AST to Pattern.compile("\\*"),
		RegexToken.VERT to Pattern.compile("\\|")
    )
        
    private fun skipWhiteSpace() {
        matcher.usePattern(ignore);
        while (matcher.lookingAt()) {
            input = input.delete(0, matcher.end());
            matcher.reset(input);
        }
    }

    fun nextToken() {
        skipWhiteSpace()

        if (input.isEmpty()) {
            curToken = RegexToken.END
            return
        }

        tokens.forEach { (token, pattern) ->
            matcher.usePattern(pattern)
            matcher.reset(input)
            if (matcher.lookingAt()) {
                val parsed = matcher.group()
                curToken = token
                curToken.value = parsed
                input.delete(0, matcher.end())
                matcher.reset(input)
                return
            }
        }

        throw ParseException("Illegal character" + input[0], 0)
    }    
}
