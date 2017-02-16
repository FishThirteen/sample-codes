length2::[b] -> Int
length2 (x:xs) = 1 + length2 xs 
length2 _ = 0


meanOfList::(Fractional a) => [a] -> a 
meanOfList[] = 0
meanOfList a = (sum a) / fromIntegral (length2 a)
    where sum (x:xs) = x + sum xs
          sum [] = 0

-- exercise 4
palin::[a] -> [a]
palin xs = xs ++ rever xs []
    where rever [] rev = rev
          rever (y:ys) rev = rever ys (y:rev)


-- exercise 5
isPalin::(Eq a) => [a] -> Bool
isPalin [] = False
isPalin (x:[]) = True
isPalin (x:y:[]) = x == y
isPalin (x:xs)  = (x == last xs) && isPalin (ltail xs)
    where ltail ys = take (length ys - 1) ys


