# Number Analysis
# Caique Pereira
# 12/03/2023

KEY = 20

def main():
    special_series = []
    answer = input('Press 20 to get data from a series of 20 numbers or anything else to get out of the program: ')

    for sequence in range(KEY):
        print('Enter here the the data number', sequence +1, ':', sep=' ', end=' ')
        series = float(input())

        special_series.append(series)
    total = sum(special_series)    
    highest = max(special_series)
    lowest = min(special_series)
    average = total / KEY
    
    print('The lowest number from the series is', lowest)
    print('The highest number from the series is', highest)
    print('The total number from the series is', total)
    print('The average number from the series is', average)

main()
