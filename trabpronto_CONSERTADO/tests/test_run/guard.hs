-- Exemplo com guards definidas na matéria Topicos Especiais em Programação I 2020/1

sinal :: (Num a, Ord a) => a -> a;
sinal n | n < 0  = -1
        | n > 0  = 1
        | True = 0;


triangulo :: Double -> Double -> Double -> String;
triangulo n m k | not (ehTriangulo)          = "Não forma triangulo"
                | n == m && m == k           = "Equilatero"
                | n == m || m == k || n == k = "Isoceles"
                | otherwise                  = "Escaleno"
    where {
        ehTriangulo = n > abs (m-k) && n < m+k &&
                      m > abs (n-k) && n < n+k &&
                      k > abs (m-n) && n < m+n;
    };
