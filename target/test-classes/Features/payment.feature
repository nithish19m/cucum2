Feature: Payment method

Scenario: To view chrome browser
When chrome is being navigated
When launching TestMeApp
When SignIn is clicked
When Username and password is entered
When Login is clicked
When the product is entered and found
And proceed to cart without a product
Then TestMeApp wont display cart icon