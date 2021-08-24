-- Algumas funções basicas definidas na matéria Topicos Especiais em Programação I 2020/1

dobro x = 2 * x;

quadruplo x = dobro (dobro x);

fatorial x = product [1..x];

n = a `div` length xs
    where {
        a = 10;
        xs = [1,2,3,4,5];
    };

ultimo x = x !! (length x -1);

ultimo2 x = head (reverse x);

removeult x = take (length x -1) x;

removeult2 x = reverse (tail (reverse x));