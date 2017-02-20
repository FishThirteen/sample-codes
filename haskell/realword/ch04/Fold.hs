foldL:: (a -> b -> a) -> a -> [b] -> a
foldL step zero (x:xs) = foldL step (step zero x) xs
foldL _ zero [] = zero


foldR::(a -> b -> b) -> b -> [a] -> b
foldR setp zero (x:xs) = setp x (foldR setp zero xs)
flodR _ zero [] = zero


myFilter pred xs = foldr step [] xs
    where step x ys 
            | pred x    = x : ys
            | otherwise = ys


myFoldl::(a -> b -> a) -> a -> [b] -> a
myFoldl f z xs = foldr step id xs z
    where step x g a = g (f a x)
