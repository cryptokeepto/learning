add a b = a + b
mul a b = a * b
process f a b = f (a * a) (b * b)
-- process add 2 5
-- process (\a b -> a - b) 6 5 // this is lambda function

do_it n = if n < 10 then add else mul
-- do_it 2 5 10

double = mul 2 -- double n = mul 2 n
-- double 5

process2 :: (Int -> Int) -> Int -> Int
process2 f a = f a
-- process2 sqrt 2
-- process (5 + ) 10


intLoop n = n : (intLoop (n + 1)) -- n : List
ints = intLoop 1
-- take 10 ints

inf x = x + inf (x + 1)
f a b = a
-- f 10 (inf 1)
