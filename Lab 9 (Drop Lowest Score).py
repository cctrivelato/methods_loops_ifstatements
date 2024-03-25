# Drop Lowest Score
# Caique Pereira
#11/29/2023

def main():
    scores = get_scores()
    total = get_total(scores)
    lowest = min(scores)

    total -= lowest

    average = total / (len(scores) - 1)

    print('The average, with the lowest score dropped is', average)

def get_scores():
    test_scores = []

    again = 'y'

    while again == 'y':
        value = float(input('Enter a test score: '))
        test_scores.append(value)

        print('Do you want to add another score?')
        again = input('y = yes, anything else = no: ')
        print()

    return test_scores

def get_total(value_list):
    total = 0.0
    for num in value_list:
        total += num

    return total

main()
