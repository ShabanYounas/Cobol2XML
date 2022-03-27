decimal-to-base.
***=--- asaas
    move entry_number  to w_number
    move spaces        to entry_char
    move 16    to ind
    perform until w_number < current_base
       divide current_base into w_number giving w_number
              remainder rest_divide
       end-divide

       search all hex_table
          at end
               continue
          when dec_value( hex_idx ) is = rest_divide
               move hex_value( hex_idx) to entry_char(ind:1)

       end_search

       subtract 1 from ind
    end-perform.
    if w_number not = 0

       search all hex_table
          at end
               continue
          when dec_value( hex_idx ) is = w_number
               move hex_value( hex_idx) to entry_char(ind:1)

       end_search

    end-if.
decimal-to-base-ex.