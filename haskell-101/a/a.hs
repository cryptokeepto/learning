
module Test where
a :: Float
a = 22 / 7

plus :: Int -> Int
plus x = x + 1

double :: Int -> Int
double x = x * 2

plus2 :: Int -> Int -> Int
plus2 x y = x + y + 2

-- Guard condition
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

-- Local Definition
calc :: Float -> Float -> Float -> Float -> Float
calc x1 y1 x2 y2 = sqrt(dxSq + dySq)
    where
      dx = (x2 - x1)
      dy = (y2 - y1)
      dxSq = dx ^ 2
      dySq = dy ^ 2

countEvenNumber :: Int -> Int -> Int -> Int
countEvenNumber a b c
    | (isEven a) && (isEven b) && (isEven c)                                      = 3
    | (isEven a && isEven b) || (isEven a && isEven c) || (isEven b && isEven c)  = 2
    | isEven a || isEven b || isEven c                                            = 1
    | otherwise                                                                   = 0
    where
      isEven x = mod x 2 == 0
