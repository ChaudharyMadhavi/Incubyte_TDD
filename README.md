# String Calculator - Incubyte TDD Kata

This project is an implementation of the **String Calculator Kata** using **Test-Driven Development (TDD)**.  
It is designed to showcase incremental feature development, unit testing, and clean code practices.

---

## ✨ Features Implemented

✅ **Empty Input Returns Zero**
> An empty string returns 0.  
Example: `"" => 0`

✅ **Single Number Returns That Number**
> A string containing a single number returns that number itself.  
Example: `"101" => 101`

✅ **Two Numbers, Comma-Delimited**
> Two comma-separated numbers return their sum.  
Example: `"100,202" => 302`

✅ **Multiple Numbers, Comma-Delimited**
> Multiple comma-separated numbers are summed correctly.  
Example: `"100000,200000,300000,400000" => 1,000,000`

✅ **Newline as Delimiter**
> Newline characters can be used as delimiters together with commas.  
Example: `"100\n200,3" => 303`

✅ **Custom Single-Character Delimiter**
> The delimiter can be specified as a single character.  
Example: `"//;\n100;201" => 301`

✅ **Custom Delimiter of Any Length**
> Delimiters of any length are supported in square brackets.  
Example: `"//[***]\n10***40***1" => 51`

✅ **Trailing Delimiters Ignored**
> Trailing delimiters are safely ignored without error.  
Example: `"1,2,3," => 6`

✅ **Whitespace Handling**
> Spaces around numbers and delimiters are ignored.  
Example: `" 1 , 2 , 3 ,, " => 6`

✅ **Negative Number Validation**
> Negative numbers are not allowed. If found, an exception is thrown listing all negative values.  
Example:
- Input: `"1,-2"`  
  Exception: `negative numbers not allowed: -2`
- Input: `"-19,-20,3"`  
  Exception: `negative numbers not allowed: -19,-20`

✅ **Large Input Performance**
> Efficient summation of 1000+ numbers.  
Example: Sum of 1 to 1000 returns `500500`.

✅ **(Partial) Multiple Custom Delimiter Parsing**
> Some support for multiple delimiters (`//[*][%]\n`), though not fully implemented in splitting logic yet (you may extend this).

---

## 🧪 Running Tests

This project uses **JUnit 5**.


