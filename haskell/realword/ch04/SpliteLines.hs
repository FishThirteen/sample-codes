spliteLines [] = []
spliteLines cs = 
    let (pre, sub) = break isLineTerminator cs
    in pre : case sub of
        ('\r':'\n':rest) -> spliteLines rest
        ('\r':rest) -> spliteLines rest
        ('\n':rest) -> spliteLines rest
        [] -> []

isLineTerminator c = c == '\r' || c == '\n'
