type CustomerID = Int
type CardHolder = String
type CardNumber = String
type Address = [String]

data BillingInfo = CreditCard CardHolder CardNumber Address
                 | CashOnDelivery
                 | Invoice CustomerID
                   deriving (Show)
