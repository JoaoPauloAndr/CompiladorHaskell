-- Exemplo com list comprehensions em funções definidas na matéria Topicos Especiais em Programação I 2020/1

multiplos7 :: Int -> [Int];
multiplos7 n = [ x | x <- [7,14..n*7]];

cubos :: Int -> [Int];
cubos n = [ x^3 | x <- [1..n] ];

tuplasCubos :: [Int] -> [(Int,Int)];
tuplasCubos ns = [ (x,x^3) | x <- ns];

tabuada :: Int -> [(Int,Int,Int)];
tabuada n = [ (x,n,x*n) | x <- [0..9] ];

matLin :: Int -> Int -> [(Int,Int)];
matLin m n = [ (x,y) | x <- [0..m-1], y <- [0..n-1] ];

matCol :: Int -> Int -> [(Int,Int)];
matCol m n = [ (x,y) | y <- [0..n-1], x <- [0..m-1] ];

indmat3D :: Int -> Int -> Int -> [(Int,Int,Int)];
indmat3D m n k = [ (x,y,z) |  x <- [0..m-1], y <- [0..n-1], z <- [0..k-1]];

-- prof fez essa com [0..n]. provavelmente errado
tabuadas :: Int -> [(Int,Int,Int)];
tabuadas n = concat [tabuada x | x <- [0..n-1]];

tabuadasLL :: Int -> [[(Int,Int,Int)]];
tabuadasLL n = [tabuada x | x <- [0..n-1]];

tabuadasCL :: [Int] -> [Int] -> [(Int,Int,Int)];
tabuadasCL ns ms = [ (n,m,m*n) | n <- ns, m <- ms ];

indTriSup :: Int -> Int -> [(Int,Int)];
indTriSup n m = [ (x,y) | x <- [0..n-1], y <- [x..m-1]];

indTriInf :: Int -> Int -> [(Int,Int)];
indTriInf n m = [ (x,y) | x <- [0..n-1], y <- [0..x]];

concatena :: [[a]] -> [a];
concatena xss = [x | xs <- xss, x <- xs];
