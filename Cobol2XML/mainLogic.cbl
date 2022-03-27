
main-logic.


    display window erase

    display "Base:  " no
    accept current_base convert
    display "Value: " no
    accept entry_char

    perform base-to-decimal thru base-to-decimal-ex

    display "Decimal  value: " entry_char

    perform decimal-to-base thru decimal-to-base-ex

    display "Base: " current_base " value: " entry_char

    accept omitted

    goback.