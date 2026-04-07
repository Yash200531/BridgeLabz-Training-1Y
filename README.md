# BridgeLabz-Training-1Y

## Project Overview
This repository contains Java training exercises organized by topic (basics, exception handling, OOP, arrays, methods, strings, and multithreading).

This branch was synchronized against `origin/exception-handling`, source files were restored for exception handling, local build artifacts were cleaned, and unsynced files were documented.

## Folder Structure
- `exception-handling/`: exception handling exercises synced from GitHub (`.java` source of the branch)
- `multithreading/`: multithreading exercises and demos
- `basic-programs/`: foundational Java programs
- `workshop/`: workshop examples (arrays, control flow, OOP, strings, threads, generics)
- `classes-objects/`, `encapsulation/`, `inheritance-polymorphism/`, `interfaces-abstraction/`, `java-arrays/`, `methods/`, `string-api/`, `projects/`: module-wise training work
- `SYNC_REPORT.md`: full list of unsynced files compared to `origin/exception-handling`

## Files Synced With GitHub (origin/exception-handling)
- `.gitignore`
- `README.md`
- `exception-handling/src/com/gla/BankTransactionSystem.java`
- `exception-handling/src/com/gla/CheckedExceptionFileRead.java`
- `exception-handling/src/com/gla/CustomExceptionAgeValidation.java`
- `exception-handling/src/com/gla/ExceptionPropagationInMethods.java`
- `exception-handling/src/com/gla/FinallyBlockExecutionDemo.java`
- `exception-handling/src/com/gla/MultipleCatchArrayOperations.java`
- `exception-handling/src/com/gla/NestedTryCatchArrayDivision.java`
- `exception-handling/src/com/gla/ThrowVsThrowsInterestCalculator.java`
- `exception-handling/src/com/gla/TryWithResourcesFileRead.java`
- `exception-handling/src/com/gla/UncheckedExceptionDivision.java`

## Newly Added/Refactored (Previously Unsynced)
- Renamed folder:
  - `basic-programs/` retained as the canonical folder name
- Cleaned compiled artifacts:
  - removed local `*.class` files under `exception-handling/src/com/gla/`
- Refactored unsynced generics files for naming and readability:
  - `workshop/Generics/fibancci.java` -> `workshop/Generics/FibonacciDemo.java`
  - `workshop/Generics/one.java` -> `workshop/Generics/StudentDemo.java`
  - `workshop/Generics/two.java` -> `workshop/Generics/NumberBoxDemo.java`
  - `workshop/Generics/practice.java` -> `workshop/Generics/SwapDemo.java`
  - removed `workshop/Generics/tempCodeRunnerFile.java`

## Unsynced Files
See `SYNC_REPORT.md` for the complete local-vs-GitHub comparison.

## How to Run
1. Compile exception handling programs:
   ```bash
   javac -d exception-handling/out exception-handling/src/com/gla/*.java
   ```
2. Run an example:
   ```bash
   java -cp exception-handling/out com.gla.UncheckedExceptionDivision
   ```
3. Compile workshop generics demos:
   ```bash
   javac -d workshop/out workshop/Generics/*.java
   ```

## Assumptions and Fixes Made
- Sync comparison baseline is `origin/exception-handling` branch because this task targets exception-handling synchronization.
- Existing synchronized GitHub source files were kept unchanged.
- Refactoring was applied only to clearly unsynced files and local artifacts.
