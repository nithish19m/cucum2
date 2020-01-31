$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/payment.feature");
formatter.feature({
  "name": "Payment method",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To view chrome browser",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "chrome is being navigated",
  "keyword": "When "
});
formatter.match({
  "location": "payment.chrome_is_being_navigated()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "launching TestMeApp",
  "keyword": "When "
});
formatter.match({
  "location": "payment.launching_TestMeApp()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "SignIn is clicked",
  "keyword": "When "
});
formatter.match({
  "location": "payment.signin_is_clicked()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Username and password is entered",
  "keyword": "When "
});
formatter.match({
  "location": "payment.username_and_password_is_entered()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Login is clicked",
  "keyword": "When "
});
formatter.match({
  "location": "payment.login_is_clicked()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the product is entered and found",
  "keyword": "When "
});
formatter.match({
  "location": "payment.the_product_is_entered_and_found()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "proceed to cart without a product",
  "keyword": "And "
});
formatter.match({
  "location": "payment.proceed_to_cart_without_a_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "TestMeApp wont display cart icon",
  "keyword": "Then "
});
formatter.match({
  "location": "payment.testmeapp_wont_display_cart_icon()"
});
formatter.result({
  "status": "passed"
});
});