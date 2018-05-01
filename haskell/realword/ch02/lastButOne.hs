lastButOne xs = if null xs
                then error "empty list"
                else if (length xs) < 2
                then error "single element"
                else if (length xs) == 2
                then head xs
                else lastButOne (drop 1 xs)
