
***--- allineamento a destra della variabile entry_char (ver 2.3.1 o sup)
    call "c$justify" using entry_char "R".

    call "c$toupper" using entry_char, value 16.

    move 0     to w_number rest_divide
    perform test after varying ind from 1 by 1 until ind = 16

       search all hex_table
          at end
               continue
          when hex_value( hex_idx ) is = entry_char(ind:1)
               move dec_value( hex_idx) to rest_divide

       end_search

       compute w_number = w_number + rest_divide * current_base ** (16 - ind)

    end-perform.

    move w_number to entry_number.

base-to-decimal-ex.