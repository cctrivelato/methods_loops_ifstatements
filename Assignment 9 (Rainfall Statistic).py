# Rainfall Statistics
# Caique Pereira
# 12/01/2023

MONTH = 12

def main():
    rainfall_amount = [] 
    rainfall = 0
    total_rainfall = 0
    
    for times in range(MONTH):
        print('Enter the total rainfall for the month', times + 1, 'here:', sep=' ', end=' ')
        rainfall = float(input())

        total_rainfall += rainfall
    
        rainfall_amount.append(rainfall)    

    average_rainfall = total_rainfall / 12

    print('The total rainfall for the year is', format(total_rainfall,',.2f'), sep=' ')
    print('and the average monthly rainfall is', format(average_rainfall,',.2f'))
    print('The month with lowest rainfall amount is', min(rainfall_amount))
    print('and the month with the highest rainfall amount is', max(rainfall_amount))
    
main()
