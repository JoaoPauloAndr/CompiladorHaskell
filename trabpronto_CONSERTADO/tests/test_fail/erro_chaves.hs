-- Exemplo com erro por omissão de }

foo = do {
        x <- 3;
        x + 3;
                -- faltando } no final