# TailRecursionJava

TailRecursionJava is a Java console application that calculates the Greatest Common Divisor (GCD) of two integers using a recursive algorithm. The project demonstrates recursive method calls and the Euclidean algorithm.

## Overview

The Greatest Common Divisor is the largest positive integer that divides two integers without leaving a remainder.

This project uses the Euclidean algorithm, which repeatedly applies the modulo operation to reduce the numbers until a base case is reached.

Despite the project name, Java does not automatically optimize tail-recursive method calls. This program demonstrates recursion, but it does not implement a separate tail-call optimization mechanism.

## Features

- **GCD Calculation:** Calculates the greatest common divisor of two integers.
- **Recursive Algorithm:** Uses recursive method calls to perform the calculation.
- **Euclidean Algorithm:** Applies modulo operations to reduce the input values.
- **Console Input:** Prompts users to enter two integers.
- **Console Output:** Displays the calculated GCD.

## Requirements

- Java Development Kit (JDK)
- Java-compatible IDE or terminal
- Java Runtime Environment (JRE) to run the compiled program

## Installation

1. Install a compatible JDK.
2. Clone or download this repository:

   ```bash
   git clone https://github.com/ichiroyamazaki/TailRecursionJava.git
   ```

3. Open the project in your Java-compatible IDE.
4. Ensure the source file is located in the `TailRecursion` package directory.

## How to Run

From the project root directory, compile the Java source file:

```bash
javac -d . TailRecursion.java
```

Run the application using its fully qualified class name:

```bash
java TailRecursion.TailRecursion
```

If your IDE already handles package compilation, you can run the `TailRecursion` class directly.

## Example

```text
Enter the first number: 24
Enter the second number: 18

The GCD of 24 and 18 is 6.
```

## How It Works

The application follows these steps:

1. Prompts the user to enter two integers.
2. Calls the recursive `gcd()` method.
3. Checks whether either input is zero.
4. Uses the modulo operator to reduce the numbers through recursive calls.
5. Returns the GCD when a base case is reached.
6. Displays the result.

## Project Structure

```text
TailRecursionJava/
├── README.md
└── TailRecursion.java
```

The Java source declares the `TailRecursion` package.

## Project Information

- **Project Name:** TailRecursionJava
- **Language:** Java
- **Application Type:** Console-based program
- **Algorithm:** Euclidean algorithm
- **Concept:** Recursion
- **Developer:** Ichiro Yamazaki

## Limitations

- Accepts integer input only.
- Non-integer input causes an input error.
- The implementation does not explicitly handle negative values or all edge cases.
- Java does not guarantee tail-call optimization, so recursive calls can consume stack space.

## License

No license has been specified in the repository. All rights remain with the author unless otherwise stated.
