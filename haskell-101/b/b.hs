module Test where

-- infix
showValue :: Int
showValue = 7 `mod` 2

-- prefix
showValue2 :: Int
showValue2 = mod 7 2


-- prefix to infix
showValue3 :: Int
showValue3 = (+) 7 2


-- pattern matching
magicPlus :: Int -> Int -> Int
magicPlus 1 b = 1000000 + b
magicPlus a b = a + b

anotherOr :: Bool -> Bool -> Bool
anotherOr False False = False
anotherOr _ _ = True

fact :: Int -> Int
fact 0 = 1
fact n = n * fact (n - 1)

-- original param 
-- progress: i
-- cumulative: sum = 0
-- task: sum += i * i
integerSumSqure :: Int -> Int
integerSumSqure n = innerLoop 1 0
  where
    innerLoop progress cumulative
      | progress > n        = cumulative
      | otherwise           = innerLoop (progress + 1) (cumulative + progress ^ 2)

weirdSum :: Int -> Int -> Int
weirdSum from to = innerLoop from 1 0
  where
    nextC2 c2 c1    = c2 + c1 - 1
    nextC1 c1 c2 p  = c1 + (nextC2 c2 c1) + (mod p 2)
    innerLoop p c1 c2
      | p > to        = c1 + c2
      | otherwise     = innerLoop (p * 2) (nextC1 c1 c2 p) (nextC2 c1 c2)
