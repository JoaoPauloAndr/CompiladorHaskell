-- Exemplo com reconhecimento de padrões em funções definidas na matéria Topicos Especiais em Programação I 2020/1

fat :: Int -> Int;
fat 0 = 1;
fat 1 = 1;
fat n = n * fat (n-1);

prod :: Int -> Int -> Int;
prod 0 _ = 0;
prod _ 0 = 0;
prod n m = sum (prod1 n m);

prod1 :: Int -> Int -> [Int];
prod1 n 1 = [n];
prod1 n m = [n] ++ prod1 n (m-1);

pot :: Int -> Int -> Int;
pot 0 _ = 0;
pot _ 0 = 1;
pot n m = product (prod1 n m);

fib :: Int -> Int;
fib 0 = 1;
fib 1 = 1;
fib n = fib (n-1) + fib (n-2);

primeiro :: [a] -> a;
primeiro [n] = n;
primeiro (n:_) = n;

resto :: [a] -> [a];
resto (_:l) = l;

ultimo :: [a] -> a;
ultimo [n] = n;
ultimo (_:t) = ultimo t;

inicio :: [a] -> [a];
inicio [_] = [];
inicio (h:t) = h : inicio t;