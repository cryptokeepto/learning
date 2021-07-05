
module Test where
a :: Float
a = 22 / 7

plus :: Int -> Int
plus x = x + 1

double :: Int -> Int
double x = x * 2

plus2 :: Int -> Int -> Int
plus2 x y = x + y + 2

minValue :: Int -> Int -> Int
minValue a b
    | a < b       = a
    | otherwise   = b

minValue2 :: Int -> Int -> Int
minValue2 a b = if a < b then a else b

minThreeValue :: Int -> Int -> Int -> Int
minThreeValue a b c
    | a < b && b < c    = a
    | b < c             = b
    | otherwise         = c

-- if 3 >= 10 then 1 else 0
