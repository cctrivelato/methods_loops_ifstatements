# Total Sales
# Caique Pereira
# 12/01/2023

WEEK = 7

def main():
    amount = [0] * WEEK
    total_sales = 0
    
    for index in range(WEEK):
        print('Enter the amount of sales made in day', index + 1, ':', sep=' ', end=' ')
        amount [index] = float(input())

        total_sales += amount [index]

    print('The total sales for the week is:', '$', format(total_sales, ',.2f'), sep=' ')

main()
