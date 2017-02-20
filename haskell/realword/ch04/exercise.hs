
import Data.Char

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


asInt_fold:: String -> Int
asInt_fold (x:xs)
    | x == '-' = -1 * asInt_fold xs
    | otherwise = asInt_fold' (x:xs)

asInt_fold' xs = fst (foldr step (0,0) xs)
    where step x (acc, dep) = ((digitToInt x) * 10 ^ dep + acc, dep + 1)

concate_fold::[[a]] -> [a]
concate_fold xs = foldr step [] xs
    where step x y = x ++ y
