-- Exemplos com if then else definidas na matéria Topicos Especiais em Programação I 2020/1

maior :: Int -> Int -> Int;
maior n m = if n > m then n else m;

media :: [Double] -> Double;
media ns = if null ns; then 0 else  (sum ns) /fromIntegral(length ns);

aprovacaoB :: [Double] -> Bool;
aprovacaoB ns = media ns >= 7;

aprovacaoS :: [Double] -> String;
aprovacaoS ns = if aprovacaoB ns then "Aprovado"; else "Reprovado";


triangulo :: Double -> Double -> Double -> String;
triangulo n m k = if ehTriangulo
                  then if n == m && m == k 
                       then "Equilatero"
                       else if n == m || m == k || n == k
                            then "Isoceles"
                            else "Escaleno"
                  else "Não forma triangulo"
            where {
                ehTriangulo = n > abs (m-k) && n < m+k &&
                              m > abs (n-k) && n < n+k &&
                              k > abs (m-n) && n < m+n;
            };

fatorial :: Int -> Int;
fatorial n = if n <= 1; then 1; else n * fatorial (n-1);

mdc :: Int -> Int -> Int;
mdc n m = if n > m then mdcCalc n m else mdcCalc m n;

mdcCalc :: Int -> Int -> Int;
mdcCalc n m = if x == 0 then m else mdcCalc m x
            where {
                x = mod n m;
            };

numDig :: Int -> Int;
numDig n = conta n 1;

conta :: Int -> Int -> Int;
conta n m = if x == 0 then m else conta x (m+1)
            where {
                x = div n 10;
            };

palindromo :: Int -> Bool;
palindromo n = numToList n == reverse (numToList n);

numToList :: Int -> [Int];
numToList n = if numDig n == 1 then [n] else numToList (div n 10) ++ [mod n 10];
