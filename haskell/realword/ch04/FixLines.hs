import System.Environment (getArgs)

interactWith function inputFile outputFile = do
    input <- readFile inputFile
    writeFile outputFile (function input)

main = mainWith myFunction
    where mainWith function = do
            args <- getArgs
            case args of
              [input, output] -> interactWith function input output
              _ -> putStrLn "error: exactly tow arguments needed"
          myFunction = fixLines

spliteLines [] = []
spliteLines cs = 
    let (pre, sub) = break isLineTerminator cs
    in pre : case sub of
        ('\r':'\n':rest) -> spliteLines rest
        ('\r':rest) -> spliteLines rest
        ('\n':rest) -> spliteLines rest
        [] -> []

isLineTerminator c = c == '\r' || c == '\n'

fixLines::String->String
fixLines input = unlines(spliteLines input)
