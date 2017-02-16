myDrop x xs = if x <= 0 || null xs
              then xs
              else myDrop (n - 1) (tail xs)

