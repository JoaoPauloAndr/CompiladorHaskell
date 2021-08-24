-- Exemplo com funções lambda definidas na matéria Topicos Especiais em Programação I 2020/1

fat :: Int -> Int;
fat = \n -> product [1..n];

prod :: Int -> Int -> Int;
prod n = \m -> n * m;

pot :: Int -> Int -> Int;
pot n = \m -> if m == 0 then 1 else n * pot n (m-1);

primeiro :: [a] -> a;
primeiro = \(x:xs) -> x;

resto :: [a] -> [a];
resto = \(h:t) -> t;

pares :: Int -> [Int];
pares n = map (\x -> x*2) [0..n-1];

impares :: [Int] -> [Bool];
impares ns = map (\x -> odd x) ns;

inverso :: Double -> Double;
inverso = (1/);

dobro :: Int -> Int;
dobro = (2*);

metade :: Double -> Double;
metade = (/2);

cubo :: Double -> Double;
cubo = (^3);

quinto :: Double -> Double;
quinto = (/5);

potencia10 :: Int -> Int;
potencia10 = (10^);

antecessor :: Int -> Int;
antecessor n = -1 * ant_aux n;

ant_aux :: Int -> Int;
ant_aux = (1-);

multiplos3 :: Int -> [Int];
multiplos3 n = map (*3) [1..n];
