#include <iostream>
#include <cstdlib>
#include <ctime>

int main() {
    srand(time(0)); // Seed for random number generation
    int lowerBound = 1;
    int upperBound = 100;
    int numberToGuess = rand() % (upperBound - lowerBound + 1) + lowerBound;
    int playerGuess;
    int attempts = 0;

    std::cout << "Welcome to the Guessing Game!\n";
    std::cout << "Try to guess the number between " << lowerBound << " and " << upperBound << ".\n";

    do {
        std::cout << "Enter your guess: ";
        std::cin >> playerGuess;
        attempts++;

        if (playerGuess > numberToGuess) {
            std::cout << "Too high! Try again.\n";
        } else if (playerGuess < numberToGuess) {
            std::cout << "Too low! Try again.\n";
        } else {
            std::cout << "Congratulations! You guessed the number in " << attempts << " attempts.\n";
        }

    } while (playerGuess != numberToGuess);

    return 0;
}
