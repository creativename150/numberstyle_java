numberstyle_java
================

Class for converting numbers to Roman numeral format, as well as English and data sizes. This class can be used for page numbers, or for an outline.

For example, you can convert 6 to 'F' the sixth letter, or to 'vi' the lower case roman equivalent, or to 'six' the English equivalent. There is a hard limit of 4000 for Roman numerals. Conversions for numbers over 26 result in two letter combinations, so 27 is converted to 'AA' or 'aa'.

Below are a few examples of various formats.

> value - TEXT - text - ROMAN - roman - english

> 6 - F - f - VI - vi - six

> 78 - BZ - bz - LXXVIII - lxxviii - seventy eight

> 350 - ML - ml - CCCL - cccl - three hundred fifty

> 1,564 - BHD - bhd - MDLXIV - mdlxiv - one thousand, five hundred sixty four

The class can also be used to compute numbers as sizes. For example:

> 33,051,900 - 31.521MB

> 1,310,861,241 - 1.221GB