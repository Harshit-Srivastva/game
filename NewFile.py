import random

# Generate a random number between 1 and 100
secret_number = random.randint(1, 100)

# Number of attempts
attempts = 0

print("Welcome to Guess the Number Game!")
print("I'm thinking of a number between 1 and 100.")

while True:
    try:
        # Get the player's guess
        guess = int(input("Take a guess: "))
        attempts += 1

        # Check if the guess is correct
        if guess == secret_number:
            print(f"Congratulations! You guessed the number in {attempts} attempts.")
            break
        elif guess < secret_number:
            print("Try a higher number.")
        else:
            print("Try a lower number.")

    except ValueError:
        print("Please enter a valid number.")

# End of the game
print("Thank you for playing!")
