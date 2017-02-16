safeHead::[a] -> Maybe a
safeHead [] = Nothing
safeHead xs = Just (head xs)

splitWith::(a -> Bool) -> [a] -> [[a]]
splitWith _ [] = []
-- splitWith pred xs = 
--     let (pre, sub) = break pred (dropWhile pred xs)
--     in pre : (splitWith pred (dropWhile pred sub))
splitWith pred xs = inSplitWith [] pred xs
    where 
        inSplitWith::[a] -> (a -> Bool) -> [a] -> [[a]]
        inSplitWith _ _ [] = []
        inSplitWith rest pred (x:xs)
            | pred x && not (null rest) = rest : inSplitWith [] pred xs
            | pred x && null rest = inSplitWith [] pred xs
            | otherwise = inSplitWith (rest ++ [x]) pred xs
