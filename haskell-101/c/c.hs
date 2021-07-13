list = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
oneToTen = [1..10]
-- [2, 4 .. 100]
-- [10, 10 - 2 .. 0]
-- [1 ..] // loop 1 to infinty

double = [x * 2 | x <- [1..5]] -- [expresion and new item list | init variable and condition]
double2 = [x | x <- [1..5], even x]
tuple = [(a, b) | a <- [1..2], b <- [7..9]]

-- concat
concat' = [1, 2, 3] ++ [4, 5, 6]

-- cons
cons' = 9 : [1, 2, 3]

list' = [1,2,3,4,5,6,7,8]
head list'
tail list'
init list'
last list'

-- check item is exist in list 
isTrue = elem 3 list'
3 `elem` list'

lengthOfList = length list'

-- filter
filter even list'

-- map
map (^ 2) [1..4]
