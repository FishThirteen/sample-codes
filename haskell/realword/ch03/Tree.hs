data Tree a = Node a (Tree a) (Tree a)
            | Empty
            deriving (Show)


simpTree = Node "Parent" (Node "Left Node" Empty Empty)
                         (Node "Right Node" Empty Empty)
