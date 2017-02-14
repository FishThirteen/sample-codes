type CustomerID = Int
type Address = [String]

data BookInfo = Book Int String [String]
                deriving (Show)

myInfo = Book 9780135072455 "Algebra of Programming"
         ["Richard Bird", "Oege de Moor"]

data Customer = Customer {
        customerId :: CustomerID,
        customerName :: String,
        customerAddress :: Address
    } deriving (Show)


