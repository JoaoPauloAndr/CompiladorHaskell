-- Exemplo com erro por falta de else em if-then-elses aninhados

f a b c = if a > b
          then if a > c
               then a
               -- falta expressão else
          else if b > c
               then b
               else c
