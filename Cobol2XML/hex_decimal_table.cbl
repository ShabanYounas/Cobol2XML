01  hex_decimal_table redefines hex_dec_data.
    03  hex_table
        occurs 16 times
        ascending key is hex_value, dec_value
        indexed by hex_idx.
        05  hex_value                   pic x.
        05  dec_value                   pic 99.