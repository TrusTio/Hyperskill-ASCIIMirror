###  Java ASCII MIrror project
Simple ASCII Mirror project with Java - https://hyperskill.org/projects/260
Part of Hyperskill's Java Backend Developer (Spring Boot) course.

### Features
1. Asks for text file path input and checks if file is found
2. Stores the String lines in an ArrayList
3. After that mirrors and returns the content in the following format: 
`{modified line} | {reversed modified line}`
It also replaces  the following symbols < to >, [ to ], { to }, ( to ), / to \, and vice versa to truly mirror the text file.
##### Example:
```
Input the file path:
> C:\ASCII_Animals\HumphFolder\Camel.txt
   //            |            \\
 _oo\            |            /oo_
(__/ \  _  _     |     _  _  / \__)
   \  \/ \/ \    |    / \/ \/  /
   (         )\  |  /(         )
    \_______/  \ | /  \_______/
     [[] [[]     |     []] []]
     [[] [[]     |     []] []]     
```
