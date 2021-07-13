factorial' 0 product' = product'
factorial' n product' = factorial' (n - 1) (n * product')
factorial n = factorial' n 1

main = do
  print $ factorial 5 -- $ is waiting for function factorial or print(factorial 5)

