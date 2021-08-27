# 2020-ITCS473-KobTarDum

# ITCS473 Project Assignment 2 Automated Web Testing using Selenium

* Sippapak Utumpa 5988051<br/>
* Thanaphoo Liadprathom 5988150<br/>
* Sarun Makarabhiromya 5988218<br/>
* Napadol Bangjing 6088003<br/>
* Patakorn Jearat 6088065

# Website selection 			
The website that we used is Amazon.com because this website can search by text and using English language that make us create test cases easily and we wrote the test case on Eclipse.

# Test Case 1
Function Cover - Scenario: The user wants to check Today’s Deals that there are any interested products or not.<br/>
## Steps
1. 	Go to https://www.amazon.com/
2. 	Find Element by linkText that name “Today’s Deals”
3. 	Click that button<br/>
## Expected output: <br/>
The Amazon website shows Today’s Deals page.<br/>
## Actual output: <br/> 
The Amazon website shows Today’s Deals page according to what we expect.
 
# Test Case 2
Function Cover – Scenario: The user wants to sign in by phone number but this number does not register as an Amazon account.<br/>
## Steps
1. 	Go to https://www.amazon.com/
2. 	Find Element by linkText that name “Sign in”
3. 	Click that button
4. 	Find Element by id that has id “ap_email”
5. 	Input “0830191871” in “ap_email” box
6. 	Submit it<br/>
## Expected output: <br/>
The page has to be an error because this phone number does not register as an Amazon account.<br/>
## Actual output: <br/>
The page shows an error message “Incorrect phone number - We cannot find an account with that mobile number” as we expect.
 
# Test Case 3
Function Cover – Scenario: The user wants to create an Amazon account. However, user input data which does not pass its criteria of each box.
## Steps
1. 	Go to https://www.amazon.com/
2. 	Find Element by linkText that name “Sign in”
3. 	Click that button
4. 	Find Element by id that has id “createAccountSubmit”
5. 	Click that button
6. 	Find Element by id that has id “ap_customer_name”
7. 	Input “Get” in “ap_customer_name” box
8. 	Find Element by id that has id “ap_email”
9. 	Input “Napadol” in “ap_email” box
10.   Find Element by id that has id “ap_password”
11.   Input “123456” in “ap_password” box
12.   Find Element by id that has id “ap_password_check”
13.   Input “get123” in “ap_password_check” box
14.   Find Element by id that has id “continue”
15.   Click or submit it <br/>
## Expected output: <br/>
The page has to show error on some input box that does not pass its criteria.<br/>
## Actual output: <br/>
The page shows an error message that some input does not pass its criteria.<br/>
(“Enter a valid email address” and “Passwords must match”).
 
# Test Case 4
Function Cover – Scenario: The user wants to search the product by search box.
## Steps
1. 	Go to https://www.amazon.com/
2. 	Find Element by id that has id “twotabsearchtextbox”
3. 	Input “Nike Air Max” in “twotabsearchtextbox” box
4. 	Submit it<br/>
## Expected output: <br/>
The page has to show a product which is related to the keyword that input.<br/>
## Actual output: <br/>
The page shows  a product related to the keyword that input as we expect.<br/>
 
# Test Case 5
Function Cover – Scenario: The user wants to search for a product but only some type (Ex. Books or toys).
## Steps
1. 	Go to https://www.amazon.com/
2. 	Find Element by id that has id “searchDropdownBox”
3. 	Click that button
4. 	Select ByVisibleText name “Books”
5. 	Find Element by id that has id “twotabsearchtextbox”
6. 	Input “car” in “twotabsearchtextbox” box
7. 	Submit it<br/>
## Expected output: <br/>
The page has to show a product which is related to keyword and type that user input and select.<br/>
## Actual output: <br/>
The page shows a product according to the selected type and keyword as we expect.<br/>
 
# Test Case 6
Function Cover – Scenario: The user wants to buy a product which has many colors and the page should show correct information according to the picture.
## Steps
1. 	Go to https://www.amazon.com/
2. 	Find Element by id that has id “twotabsearchtextbox”
3. 	Input “Nintendo Switch Lite” in “twotabsearchtextbox” box
4. 	Submit it
5. 	Find Element by linkText name “Nintendo Switch Lite – Gray”
6. 	Click that button
7. 	Find Element by className name “imgswatch”
8. 	Click that image
9. 	Find Element by className name “selection”
10.   Get text of that element
11.   Check the text that is correct or not
## Expected output:<br/>
The page has to display the value same as the image that the user selected.
## Actual output: <br/>
The page shows the value same as the image and value that gets text is “Coral” which is the same as the condition then the system print “Pass!!” as we expect.
 
# Test Case 7
Function Cover – Scenario: The user wants to search and also using filter function (Ex. Price, Brand). <br/>
## Steps
1. 	Go to https://www.amazon.com/
2. 	Find Element by id that has id “twotabsearchtextbox”
3. 	Input “Smartphone” in “twotabsearchtextbox” box
4. 	Submit it
5. 	Find Element by linkText name “iOS”
6. 	Click that button
7. 	Find Element by linkText name “$250 to $400”
8. 	Click that button <br/>
## Expected output: <br/>
The page has to show a product that is related to keyword and selected filter. <br/>
## Actual output: <br/>
The page shows a product that is related to the keyword and selected filter as we expect.
 
# Test Case 8
Function Cover – Scenario: The user wants to change money currency. <br/>
## Steps
1. 	Go to https://www.amazon.com/
2. 	Find Element by className name “icp-nav-link-inner”
3. 	Click that button
4. 	Find Element by id that has id “a-autoid-0-announc”
5. 	Click that button
6. 	Find Element by if that has id “icp-sc-dropdown_2”
7. 	Click that button
8. 	Find Element by cssSelector “input[class='a-button-input']”
9. 	Submit it
10.   Find Element by id that has id “twotabsearchtextbox”
11.   Input “Nike Air Max” in “twotabsearchtextbox” box
12.   Submit it <br/>
## Expected output: <br/>
The page has to change money currency as selected currency and when search product, it has to display as that selected currency.
## Actual output: <br/>
The page shows that selected currency is applied after select when search product and also displayed with selected currency as we expect.

# Test Case 9
Function Cover – Scenario: Users want to buy CD on Amazon Music which access the page by using Hamburger Menu. <br/>
## Steps
1. 	Go to https://www.amazon.com/
2. 	Find Element by id that has id “nav-hamburger-menu”
3. 	Click that button
4. 	Find Element by linkText name “Amazon Music”
5. 	Click that button
6. 	Find Element by linkText name “CDs & Vinyl”
7. 	Click that button <br/>
## Expected output: <br/>
The page has to go to the page that sells CD and the hamburger menu works correctly.
## Actual output: <br/>
The page show on CD product and the hamburger menu work correctly as we expect.
 
# Test Case 10
Function Cover – Scenario: User want to watch recently live on Amazon Live <br/>
## Steps
1. 	Go to https://www.amazon.com/
2. 	Find Element by id that has id “nav-hamburger-menu”
3. 	Click that button
4. 	Find Element by linkText name “Amazon Live”
5. 	Click that button
6. 	Find Element by linkText name “Recently Live”
7. 	Click that button <br/>
## Expected output: <br/>
The page has to go to recently live on Amazon Live.
## Actual output: <br/>
The page shows recently live of Amazon Live as we expect.
 





