# 2020-ITCS473-KobTarDum

# ITCS473 Project Assignment 1 Unit Test for Open Source Software Projects

**Sippapak Utumpa 5988051<br/>
**Thanaphoo Liadprathom 5988150<br/>
**Sarun Makarabhiromya 5988218<br/>
**Napadol Bangjing 6088003<br/>
**Patakorn Jearat 6088065


#README.MD
# 1. SquareMono

**Interfaced-based and Functionality-based Test**

**Goal: To get the square of number.**

**1. Identify testable functions:** Calculator calculator = new Calculator();

**2. Identify parameters, return types, return values, and exceptional behavior**

○ **Parameters** : mode, number

○ **Return type:** enum BiOperatorModes, Double

○ **Return value** : Double

○ **Exceptional behavior:** -

**3. Model the input domain**

○ **Develop characteristics**

- C1 = mode is empty
- C2 = number is empty
- C3 = value of number
- C4 = value of output

○ **Partition characteristics**

| Characteristic | b1 | b2 | b3 |
| --- | --- | --- | --- |
| C1 = mode is empty | True | False |
 |
| C2 = number is empty | True | False |
 |
| C3 = value of number | Negative | Zero | Positive |
| C4 = value of output | Zero | Positive |
 |

○ **Identify (possible) values**

| Characteristic | b1 | b2 | b3 |
| --- | --- | --- | --- |
| C1 = mode is empty | null | square |
 |
| C2 = number is empty | &quot;&quot; | 10 |

 |
| C3 = value of number | -30 | 0 | 30 |
| C4 = value of output | 0 | 900 |
 |

**4. Combine partitions into tests**

○ **Assumption:** ACoC

○ **Test requirements -- the number of tests (upper bound)** = 2\*2\*3\*2 = 24

(True, True, Negative, Zero), (True, True, Negative, Positive),

(True, True, Zero, Zero), (True, True, Zero, Positive),

(True, True, Positive, Zero), (True, True, Positive, Positive),

(True, False, Negative, Zero), (True, False, Negative, Positive),

(True, False, Zero, Zero), (True, False, False, Positive),

(True, False, Positive, Zero), (True, False, Positive, Positive),

(False, True, Negative, Zero), (False, True, Negative, Positive),

(False, True, Zero, Zero), (False, True, Zero, Positive),

(False, True, Positive, Zero), (False, True, Positive, Positive),

(False, False, Negative, Zero), (False, False, Negative, Positive),

(False, False, Zero, Zero), (False, False, Zero, Positive),

(False, False, Positive, Zero), (False, False, Positive, Positive)

○ **Testable Cases**

(False, False, Negative, Positive),

(False, False, Zero, Zero),

(False, False, Positive, Positive)

**5. Derive test values**

| **Test** | **Add Input** | **Expected result** |
| --- | --- | --- |
| **T1** (False, False, Negative, Positive) | square, -10 | 100 |
| **T2** (False, False, Zero, Zero) | square, 0 | 0 |
| **T3** (False, False, Positive, Positive) | square, 10 | 100 |

# 2. SquareRootMono

**Goal: To get the square root of number.**

**Interfaced-based and Functionality-based Test**

**1. Identify testable functions:** Calculator calculator = new Calculator();

**2. Identify parameters, return types, return values, and exceptional behavior**

○ **Parameters** : mode, number

○ **Return type:** enum BiOperatorModes, Double

○ **Return value** : Double

○ **Exceptional behavior:** -

**3. Model the input domain**

○ **Develop characteristics**

- C1 = mode is empty
- C2 = number is empty
- C3 = value of number
- C4 = value of output

○ **Partition characteristics**

| Characteristic | b1 | b2 |
| --- | --- | --- |
| C1 = mode is empty | True | False |
| C2 = number is empty | True | False |
| C3 = value of number | Zero | Positive |
| C4 = value of output | Zero | Positive |

○ **Identify (possible) values**

| Characteristic | b1 | b2 |
| --- | --- | --- |
| C1 = mode is empty | null | squareRoot |
| C2 = number is empty | &quot;&quot; | 10 |
| C3 = value of number | 0 | 100 |
| C4 = value of output | 0 | 10 |

**4. Combine partitions into tests**

○ **Assumption:** ACoC

○ **Test requirements -- the number of tests (upper bound)** = 2\*2\*2\*2 = 16

(True, True, Zero, Zero),(True, True, Zero, Positive),

(True, True, Positive, Zero),(True, True, Positive, Positive),

(True, False, Zero, Zero),(True, False, Zero, Positive),

(True, False, Positive, Zero),(True, False, Positive, Positive),

(False, True, Zero, Zero),( False, True, Zero, Positive),

(False, True, Positive, Zero),( False, True, Positive, Positive),

(False, False, Zero, Zero),( False, False, Zero, Positive),

(False, False, Positive, Zero),( False, False, Positive, Positive),

○ **Testable Cases**

(False, False, Zero, Zero)

(False, False, Positive, Positive)

**5. Derive test values**

| **Test** | **Add Input** | **Expected result** |
| --- | --- | --- |
| **T1** (False, False, Zero, Zero) | squareRoot, 0 | 0 |
| **T2** (False, False, Positive, Positive) | squareRoot,100 | 10
 |

# 3. MonoDividedByNum

**Goal: To get the value of 1 divided by number.**

**Interfaced-based and Functionality-based Test**

**1. Identify testable functions:** Calculator calculator = new Calculator();

**2. Identify parameters, return types, return values, and exceptional behavior**

○ **Parameters** : mode, number

○ **Return type:** enum BiOperatorModes, Double

○ **Return value** : Double

○ **Exceptional behavior:** -

**3. Model the input domain**

○ **Develop characteristics**

- C1 = mode is empty
- C2 = number is empty
- C3 = value of number
- C4 = value of output

○ **Partition characteristics**

| Characteristic | b1 | b2 |
| --- | --- | --- |
| C1 = mode is empty | True | False |
| C2 = number is empty | True | False |
| C3 = value of number | Negative | Positive |
| C4 = value of output | Negative | Positive |

○ **Identify (possible) values**

| Characteristic | b1 | b2 |
| --- | --- | --- |
| C1 = mode is empty | null | oneDividedBy |
| C2 = number is empty | &quot;&quot; | 10 |
| C3 = value of number | -100 | 100 |
| C4 = value of output | -10 | 10 |

**4. Combine partitions into tests**

○ **Assumption:** MBBC (False, False, Negative, Negative) (False, False, Positive, Negative)

○ **Test requirements -- the number of tests (upper bound)** = 8

(False, False, Negative, Negative) (True, False, Negative, Negative),

(False, True, Negative, Negative), (False, False, Negative, Positive),

(False, False, Positive, Negative), (True, False, Positive, Negative),

(False, True, Positive, Negative), (False, False, Positive, Positive)

○ **Testable Cases**

(False, False, Negative, Negative)

(False, False, Positive, Positive)

**5. Derive test values**

| **Test** | **Input** | **Expected result** |
| --- | --- | --- |
| **T1** (False, False, Negative, Negative) | oneDividedBy, -100 | -0.01 |
| **T2** (False, False, Positive, Positive) | oneDividedBy, 10 | 0.1 |

# 4. MonoLog

**Goal: To get the log10 of number.**

**Interfaced-based and Functionality-based Test**

**1. Identify testable functions:** Calculator calculator = new Calculator();

**2. Identify parameters, return types, return values, and exceptional behavior**

○ **Parameters** : mode, number

○ **Return type:** enum BiOperatorModes, Double

○ **Return value** : Double

○ **Exceptional behavior:** input of number can be only positive number

**3. Model the input domain**

○ **Develop characteristics**

- C1 = mode is empty
- C2 = number is empty
- C3 = value of output

○ **Partition characteristics**

| Characteristic | b1 | b2 |
| --- | --- | --- |
| C1 = mode is empty | True | False |
| C2 = number is empty | True | False |
| C3 = value of output | Negative | Positive |

○ **Identify (possible) values**

| Characteristic | b1 | b2 |
| --- | --- | --- |
| C1 = mode is empty | null | log |
| C2 = number is empty | &quot;&quot; | 10 |
| C3 = value of output | -5 | 1 |

**4. Combine partitions into tests**

○ **Assumption:** MBBC (False, False, Negative), (False, False, Positive)

○ **Test requirements -- the number of tests (upper bound)** = 6

(False, False, Negative), (False, True, Negative), (True, False, Negative),

(False, False, Positive), (False, True, Positive), (True, False, Positive)

○ **Testable Cases**

(False, False, Negative),

(False, False, Positive)

**5. Derive test values**

| **Test** | **Input** | **Expected result** |
| --- | --- | --- |
| **T1** (False, False, Negative) | log, 0.125 | -0.90308 |
| **T2** (False, False, Positive) | log, 10 | 1 |

# 5. MonoRate

**Interfaced-based and Functionality-based Test**

**Goal:** To divide input 1 by 100

**1. Identify testable functions: Calculator** calculator = new Calculator();

**2. Identify parameters, return types, return values, and exceptional behavior**

○ **Parameters** : Input, Scope

○ **Return type:** Double

○ **Return value** : sign of number

○ **Exceptional behavior:** -

**3. Model the input domain**

○ **Develop characteristics**

- C1 = Mode is empty
- C2 = Input is empty
- C3 = Value of input
- C4 = Value of output

○ **Partition characteristics**

| Characteristic | b1 | b2 | b3 |
| --- | --- | --- | --- |
| C1 = Mode is empty | True | False |
 |
| C2 = Input is empty | True | False |
 |
| C3 = Value of input | Negative | Zero | Positive |
| C4 = Value of Output | Negative | Zero | Positive |

○ **Identify (possible) values**

| Characteristic | b1 | b2 | b3 |
| --- | --- | --- | --- |
| C1 = Mode is empty | null | rate |
 |
| C2 = Input is empty | &quot;&quot; | -80.0 |

 |
| C3 = Value of input | -80.0 | 0 | 80.0 |
| C4 = Value of Output | -0.80 | 0 | 0.80 |

**4. Combine partitions into tests**

○ **Assumption:** ECC

○ **Test requirements -- the number of tests (upper bound)** = 3

(False, False, Positive, Positive), (False, False, Negative, Negative), (True, True, Zero, Zero)

○ **Testable Cases**

(False, False, Positive, Positive), (False, False, Negative, Negative)

**5. Derive test values**

| **Test** | **Input** | **Expected result** |
| --- | --- | --- |
| **T1** (False, False, Positive, Positive) | rate, 80 | 0.8 |
| **T2** (False, False, Negative, Negative) | rate, -30 | -0.3 |

# 6. BiAdd

**Interfaced-based and Functionality-based Test**

**Goal:** To fine the input number 1 that add by input number 2

**1. Identify testable functions:** Calculator.calculateBi (add)

**2. Identify parameters, return types, return values, and exceptional behavior**

○ **Parameters** : mode, input

○ **Return type:** double

○ **Return value** : double

○ **Exceptional behavior:** -

**3. Model the input domain**

○ **Develop characteristics**

- C1 = mode is empty
- C2 = Input1 is empty
- C3 = Input2 is empty
- C4 = Value of input 1
- C5 = Value of input 2
- C6 = Value of Output

○ **Partition characteristics**

| Characteristic | b1 | b2 | b3 |
| --- | --- | --- | --- |
| C1 = Input is empty | True | False |
 |
| C2 = Input 1 is empty | True | False |
 |
| C3 = Input 2 is empty | True | False |
 |
| C4 = Value of input 1 | Negative | Zero | Positive |
| C5 = Value of input 2 | Negative | Zero | Positive |
| C6 = Value of output | Negative | Zero | Positive |

○ **Identify (possible) values**

| Characteristic | b1 | b2 | b3 |
| --- | --- | --- | --- |
| C1 = Input is empty | null | add |
 |
| C2 = Input 1 is empty | &quot;&quot; | 3.0 |
 |
| C3 = Input 2 is empty | &quot;&quot; | 4.0 |
 |
| C4 = Value of input 1 | -9.0 | 0 | 9.0 |
| C5 = Value of input 2 | -1.0 | 0 | 1.0 |
| C6 = Value of output | -10.0 | 0 | 10.0 |

**4. Combine partitions into tests**

○ **Assumption:** ECC

○ **Test requirements -- the number of tests (upper bound)** = 3

(False, False, False, Positive, Positive, Positive),

(False, False, False, Negative, Negative, Negative),

(True, True, True, Zero, Zero, Zero)

○ **Testable Cases**

(False, False, False, Positive, Positive, Positive),

(False, False, False, Negative, Negative, Negative)

**5. Derive test values**

| **Test** | **Input** | **Expected result** |
| --- | --- | --- |
| **T1** (False, False, False, Positive, Positive, Positive) | add, 8, 2 | 10 |
| **T2** (False, False, False, Negative, Negative, Negative) | add, -10, -2 | -12 |

# 7. BiMinus

**Interfaced-based and Functionality-based Test**

**Goal:** To fine the input number 1 that minus by input number 2

**1. Identify testable functions:** Calculator.calculateBi (minus)

**2. Identify parameters, return types, return values, and exceptional behavior**

○ **Parameters** : mode, input

○ **Return type:** double

○ **Return value** : double

○ **Exceptional behavior:** -

**3. Model the input domain**

○ **Develop characteristics**

- C1 = mode is empty
- C2 = Input1 is empty
- C3 = Input2 is empty
- C4 = Value of input 1
- C5 = Value of input 2
- C6 = Value of Output

○ **Partition characteristics**

| Characteristic | b1 | b2 | b3 |
| --- | --- | --- | --- |
| C1 = Input is empty | True | False |
 |
| C2 = Input 1 is empty | True | False |
 |
| C3 = Input 2 is empty | True | False |
 |
| C4 = Value of input 1 | Negative | Zero | Positive |
| C5 = Value of input 2 | Negative | Zero | Positive |
| C6 = Value of output | Negative | Zero | Positive |

○ **Identify (possible) values**

| Characteristic | b1 | b2 | b3 |
| --- | --- | --- | --- |
| C1 = Input is empty | null | minus |
 |
| C2 = Input 1 is empty | &quot;&quot; | 3.0 |
 |
| C3 = Input 2 is empty | &quot;&quot; | 4.0 |
 |
| C4 = Value of input 1 | -9.0 | 0 | 9.0 |
| C5 = Value of input 2 | -1.0 | 0 | 1.0 |
| C6 = Value of output | -10.0 | 0 | 10.0 |

**4. Combine partitions into tests**

○ **Assumption:** PWC

○ **Test requirements -- the number of tests (minimum)** = 3 \* 3 = 9

Pair:

C1C2: ~~(True, True)~~,~~(True, False),(False, Ture),(False, False)~~

C2C3: ~~(True, True),(True, False),(False, Ture),(False, False)~~

C3C4: ~~(True, Negative~~),~~(True, Zero),(True, Positive),~~

~~(False, Negative),(False, Zero),(False, Positive)~~

C4C5: ~~(Negative, Negative),(Negative, Zero),(Negative, Positive),~~

~~(Zero, Negative),(Zero, Zero)~~,~~(Zero, Positive),~~

~~(Positive, Negative),(Positive, Zero),(Positive, Positive)~~

C5C6: ~~(Negative, Negative),(Negative, Zero),(Negative, Positive),~~

~~(Zero, Negative),(Zero, Zero),(Zero, Positive),~~

~~(Positive, Negative),(Positive, Zero),(Positive, Positive)~~

C1C3: ~~(True, True),(True, False),(False, Ture),(False, False)~~

C1C4: ~~(True, Negative),(True, Zero),(True, Positive),~~

~~(False, Negative),(False, Zero),(False, Positive)~~

C1C5: ~~(True, Negative),(True, Zero),(True, Positive),~~

~~(False, Negative),(False, Zero),(False, Positive)~~

C1C6: ~~(True, Negative),(True, Zero),(True, Positive),~~

~~(False, Negative),(False, Zero),(False, Positive)~~

C2C4: ~~(True, Negative),(True, Zero),(True, Positive),~~

~~(False, Negative),(False, Zero),(False, Positive)~~

C2C5: ~~(True, Negative),(True, Zero),(True, Positive),~~

~~(False, Negative),(False, Zero),(False, Positive)~~

C2C6: ~~(True, Negative),(True, Zero),(True, Positive),~~

~~(False, Negative),(False, Zero),(False, Positive)~~

C3C5: ~~(True, Negative),(True, Zero),(True, Positive),~~

~~(False, Negative),(False, Zero),(False, Positive)~~

C3C6: ~~(True, Negative~~),(True, Zero~~),(True, Positive),~~

~~(False, Negative),(False, Zero),(False, Positive)~~

C4C6: ~~(Negative, Negative)~~,(Negative, Zero),(Negative, Positive),

(Zero, Negative~~),(Zero, Zero),(~~Zero, Positive),

(Positive, Negative),(Positive, Zero~~),(Positive, Positive)~~

Test requirements:

(True, True, True, Negative, Negative, Negative)

(True, False, True, Zero, Zero, Zero)

(False, True, False, Negative, Zero, Negative)

(False, False, False, Zero, Negative, Zero)

(True, False, False, Positive, Negative, Positive)

(False, True, True, Positive, Zero, Positive)

(True, False, True, Negative, Positive, Negative)

(False, True, False, Zero, Positive, Zero)

(False, False, False, Positive, Positive, Positive)

○ **Eliminate redundant tests and infeasible tests**

(False, False, False, Positive, Positive, Positive)

**5. Derive test values**

| **Test** | **Add Input** | **Expected result** |
| --- | --- | --- |
| **T1** (False, False, False, Positive, Positive, Positive) | minus, 1, 1 | 0 |


# 8. BiMultiply

**Interfaced-based and Functionality-based Test**

**Goal:** To fine the input number 1 that multiply by input number 2

**1. Identify testable functions:** Calculator.calculateBi (multiply)

**2. Identify parameters, return types, return values, and exceptional behavior**

○ **Parameters** : mode, input

○ **Return type:** double

○ **Return value** : double

○ **Exceptional behavior:** -

**3. Model the input domain**

○ **Develop characteristics**

- C1 = mode is empty
- C2 = Input1 is empty
- C3 = Input2 is empty
- C4 = Value of input 1
- C5 = Value of input 2
- C6 = Value of Output

○ **Partition characteristics**

| Characteristic | b1 | b2 | b3 |
| --- | --- | --- | --- |
| C1 = Input is empty | True | False |
 |
| C2 = Input 1 is empty | True | False |
 |
| C3 = Input 2 is empty | True | False |
 |
| C4 = Value of input 1 | Negative | Zero | Positive |
| C5 = Value of input 2 | Negative | Zero | Positive |
| C6 = Value of output | Negative | Zero | Positive |

○ **Identify (possible) values**

| Characteristic | b1 | b2 | b3 |
| --- | --- | --- | --- |
| C1 = Input is empty | null | multiply |
 |
| C2 = Input 1 is empty | &quot;&quot; | 3.0 |
 |
| C3 = Input 2 is empty | &quot;&quot; | 4.0 |
 |
| C4 = Value of input 1 | -5.0 | 0 | 5.0 |
| C5 = Value of input 2 | -2.0 | 0 | 2.0 |
| C6 = Value of output | -10.0 | 0 | 10.0 |

**4. Combine partitions into tests**

○ **Assumption:** PWC

○ **Test requirements -- the number of tests (minimum)** = 3 \* 3 = 9

Pair:

C1C2: ~~(True, True)~~,~~(True, False),(False, Ture),(False, False)~~

C2C3: ~~(True, True),(True, False),(False, Ture),(False, False)~~

C3C4: ~~(True, Negative~~),~~(True, Zero),(True, Positive),~~

~~(False, Negative),(False, Zero),(False, Positive)~~

C4C5: ~~(Negative, Negative),(Negative, Zero),(Negative, Positive),~~

~~(Zero, Negative),(Zero, Zero)~~,~~(Zero, Positive),~~

~~(Positive, Negative),(Positive, Zero),(Positive, Positive)~~

C5C6: ~~(Negative, Negative),(Negative, Zero),(Negative, Positive),~~

~~(Zero, Negative),(Zero, Zero),(Zero, Positive),~~

~~(Positive, Negative),(Positive, Zero),(Positive, Positive)~~

C1C3: ~~(True, True),(True, False),(False, Ture),(False, False)~~

C1C4: ~~(True, Negative),(True, Zero),(True, Positive),~~

~~(False, Negative),(False, Zero),(False, Positive)~~

C1C5: ~~(True, Negative),(True, Zero),(True, Positive),~~

~~(False, Negative),(False, Zero),(False, Positive)~~

C1C6: ~~(True, Negative),(True, Zero),(True, Positive),~~

~~(False, Negative),(False, Zero),(False, Positive)~~

C2C4: ~~(True, Negative),(True, Zero),(True, Positive),~~

~~(False, Negative),(False, Zero),(False, Positive)~~

C2C5: ~~(True, Negative),(True, Zero),(True, Positive),~~

~~(False, Negative),(False, Zero),(False, Positive)~~

C2C6: ~~(True, Negative),(True, Zero),(True, Positive),~~

~~(False, Negative),(False, Zero),(False, Positive)~~

C3C5: ~~(True, Negative),(True, Zero),(True, Positive),~~

~~(False, Negative),(False, Zero),(False, Positive)~~

C3C6: ~~(True, Negative~~),(True, Zero~~),(True, Positive),~~

~~(False, Negative),(False, Zero),(False, Positive)~~

C4C6: ~~(Negative, Negative)~~,(Negative, Zero),(Negative, Positive),

(Zero, Negative~~),(Zero, Zero),(~~Zero, Positive),

(Positive, Negative),(Positive, Zero~~),(Positive, Positive)~~

Test requirements:

(True, True, True, Negative, Negative, Negative)

(True, False, True, Zero, Zero, Zero)

(False, True, False, Negative, Zero, Negative)

(False, False, False, Zero, Negative, Zero)

(True, False, False, Positive, Negative, Positive)

(False, True, True, Positive, Zero, Positive)

(True, False, True, Negative, Positive, Negative)

(False, True, False, Zero, Positive, Zero)

(False, False, False, Positive, Positive, Positive)

○ **Eliminate redundant tests and infeasible tests**

(False, False, False, Zero, Negative, Zero)

(False, False, False, Positive, Positive, Positive)

**5. Derive test values**

| **Test** | **Add Input** | **Expected result** |
| --- | --- | --- |
| **T1** (False, False, False, Zero, Negative, Zero) | multiply, 0, -1 | 0 |
| **T2** (False, False, False, Positive, Positive, Positive) | multiply, 2, 5 | 10 |

# 9. BiDivide

**Interfaced-based and Functionality-based Test**

**Goal:** To fine the input number 1 that divide by input number 2

**1. Identify testable functions:** Calculator.calculateBi (divide)

**2. Identify parameters, return types, return values, and exceptional behavior**

○ **Parameters** : mode, input

○ **Return type:** double

○ **Return value** : double

○ **Exceptional behavior:** -

**3. Model the input domain**

○ **Develop characteristics**

- C1 = mode is empty
- C2 = Input1 is empty
- C3 = Input2 is empty
- C4 = Value of input 1
- C5 = Value of input 2
- C6 = Value of Output

○ **Partition characteristics**

| Characteristic | b1 | b2 | b3 |
| --- | --- | --- | --- |
| C1 = Input is empty | True | False |
 |
| C2 = Input 1 is empty | True | False |
 |
| C3 = Input 2 is empty | True | False |
 |
| C4 = Value of input 1 | Negative | Zero | Positive |
| C5 = Value of input 2 | Negative | Positive |
 |
| C6 = Value of output | Negative | Zero | Positive |

○ **Identify (possible) values**

| Characteristic | b1 | b2 | b3 |
| --- | --- | --- | --- |
| C1 = Input is empty | null | divide |
 |
| C2 = Input 1 is empty | &quot;&quot; | 9.0 |
 |
| C3 = Input 2 is empty | &quot;&quot; | 9.0 |
 |
| C4 = Value of input 1 | -9.0 | 0 | 9.0 |
| C5 = Value of input 2 | -9.0 | 9.0 |
 |
| C6 = Value of output | -1.0 | 0 | 1.0 |

**4. Combine partitions into tests**

○ **Assumption:** BCC

○ **Test requirements -- the number of tests** =1 + (2-1) + (2-1) + (2-1) + (3-1) + (2-1) + (3-1)= 9

Base: (False, False, False, Positive, Positive, Positive)

(True, False, False, Positive, Positive, Positive),

(False, True, False, Positive, Positive, Positive),

(False, False, True, Positive, Positive, Positive),

(False, False, False, Negative, Positive, Positive),

(False, False, False, Zero, Positive, Positive),

(False, False, False, Positive, Negative, Positive),

(False, False, False, Positive, Positive, Negative),

(False, False, False, Positive, Positive, Zero)

○ **Eliminate redundant tests and infeasible tests**

(False, False, False, Positive, Positive, Positive)

**5. Derive test values**

| **Test** | **Add Input** | **Expected result** |
| --- | --- | --- |
| **T1** (False, False, False, Positive, Positive, Positive) | divide, 3, 2 | 1.5 |

# 10. CalculateBiPower

**Interfaced-based and Functionality-based Test**

**Goal:** To fine the input number 1 that power by input number 2

**1. Identify testable functions:** Calculator.calculateBi (xpowerofy)

**2. Identify parameters, return types, return values, and exceptional behavior**

○ **Parameters** : mode, input

○ **Return type:** double

○ **Return value** : double

○ **Exceptional behavior:** -

**3. Model the input domain**

○ **Develop characteristics**

- C1 = mode is empty
- C2 = Input1 is empty
- C3 = Input2 is empty
- C4 = Value of input 1
- C5 = Value of input 2
- C6 = Value of Output

○ **Partition characteristics**

| Characteristic | b1 | b2 | b3 |
| --- | --- | --- | --- |
| C1 = Input is empty | True | False |
 |
| C2 = Input 1 is empty | True | False |
 |
| C3 = Input 2 is empty | True | False |
 |
| C4 = Value of input 1 | Negative | Zero | Positive |
| C5 = Value of input 2 | Negative | Zero | Positive |
| C6 = Value of output | Negative | Zero | Positive |

○ **Identify (possible) values**

| Characteristic | b1 | b2 | b3 |
| --- | --- | --- | --- |
| C1 = Input is empty | &quot;&quot; | xpowerofy |
 |
| C2 = Input 1 is empty | &quot;&quot; | 3.0 |
 |
| C3 = Input 2 is empty | &quot;&quot; | 4.0 |
 |
| C4 = Value of input 1 | -1.0 | 0 | 1.0 |
| C5 = Value of input 2 | -2.0 | 0 | 2.0 |
| C6 = Value of output | -4.0 | 0 | 3.0 |

**4. Combine partitions into tests**

○ **Assumption:** BCC

○ **Test requirements - the number of tests** =1 + (2-1)+(2-1)+(2-1)+(3-1)+(3-1)+(3-1)= 10

Base: (False, False, False, Positive, Positive, Positive)

(True, False, False, Positive, Positive, Positive),

(False, True, False, Positive, Positive, Positive),

(False, False, True, Positive, Positive, Positive),

(False, False, False, Negative, Positive, Positive),

(False, False, False, Zero, Positive, Positive),

(False, False, False, Positive, Negative, Positive),

(False, False, False, Positive, Zero, Positive),

(False, False, False, Positive, Positive, Negative),

(False, False, False, Positive, Positive, Zero)

○ **Eliminate redundant tests and infeasible tests**

(False, False, False, Negative, Positive, Positive),

(False, False, False, Positive, Negative, Positive),

(False, False, False, Positive, Zero, Positive)

**5. Derive test values**

| **Test** | **Add Input** | **Expected result** |
| --- | --- | --- |
| **T1** (False, False, False, Negative, Positive, Positive | xpowerofy, -2, 2 | 4 |
| **T2** (False, False, False, Positive, Negative, Positive), | xpowerofy, 2, -2 | 0.25 |
| **T3** (False, False, False, Positive, Zero, Positive) | xpowerofy, 2, 0 | 1 |
