-- Algumas funções com definição de tipo definidas na matéria Topicos Especiais em Programação I 2020/1

dobro x = 2*x;

triplo :: Int -> Int;
triplo x = 3 * x;

soma1 :: (Int,Int) -> Int;
soma1 (x,y) = x+y;

umA :: Int -> [Int];
umA n = [1..n];

pares :: Int -> [Int];
pares n = filter even (umA n);

impares :: Int -> [Int];
impares n = filter odd (umA n);

multiplos7 :: Int -> [Int];
multiplos7 n = [ x | x <- (umA n), (mod x 7) == 0];

soma2 :: Int -> Int -> Int;
soma2 n k = n + k;

mult :: Int -> Int -> Int -> Int;
mult n k l = n * k * l;

sucessor :: Int -> Int;
sucessor n = soma2 1 n;

media :: Fractional a => [a] -> a;
media xs = sum xs / fromIntegral(length xs);