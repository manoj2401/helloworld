$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/manoj/eclipse-workspace/HackHireHomeLoanEligibility/src/test/java/features/homeloan.feature");
formatter.feature({
  "line": 1,
  "name": "Home loan application validation",
  "description": "",
  "id": "home-loan-application-validation",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "User logs into home loan application",
  "description": "",
  "id": "home-loan-application-validation;user-logs-into-home-loan-application",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user is on bank Login Page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "home-loan-application-validation;user-logs-into-home-loan-application;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 11,
      "id": "home-loan-application-validation;user-logs-into-home-loan-application;;1"
    },
    {
      "cells": [
        "naveenk",
        "Test@123"
      ],
      "line": 12,
      "id": "home-loan-application-validation;user-logs-into-home-loan-application;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "User logs into home loan application",
  "description": "",
  "id": "home-loan-application-validation;user-logs-into-home-loan-application;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user is on bank Login Page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user enters \"naveenk\" and \"Test@123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "HomeLoanDef.user_opens_browser()"
});
formatter.result({
  "duration": 16243519257,
  "status": "passed"
});
formatter.match({
  "location": "HomeLoanDef.user_is_on_bank_Login_Page()"
});
formatter.result({
  "duration": 98100710,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "naveenk",
      "offset": 13
    },
    {
      "val": "Test@123",
      "offset": 27
    }
  ],
  "location": "HomeLoanDef.user_enters_username_and_password(String,String)"
});
formatter.result({
  "duration": 616537488,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Validate account holder details to notify customer eligible for pre approved home loan",
  "description": "",
  "id": "home-loan-application-validation;validate-account-holder-details-to-notify-customer-eligible-for-pre-approved-home-loan",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "user is on bank home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "user enters bank details",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "user validate account holder details",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "notify customer eligible for pre approved loan",
  "keyword": "Then "
});
formatter.match({
  "location": "HomeLoanDef.user_is_on_bank_home_Page()"
});
formatter.result({
  "duration": 130438036,
  "status": "passed"
});
formatter.match({
  "location": "HomeLoanDef.user_enters_bank_details()"
});
formatter.result({
  "duration": 161191807159,
  "status": "passed"
});
formatter.match({
  "location": "HomeLoanDef.user_validate_account_holder_details()"
});
formatter.result({
  "duration": 1438954,
  "error_message": "junit.framework.AssertionFailedError: expected:\u003cfalse\u003e but was:\u003ctrue\u003e\r\n\tat junit.framework.Assert.fail(Assert.java:57)\r\n\tat junit.framework.Assert.failNotEquals(Assert.java:329)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:78)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:174)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:181)\r\n\tat homeloanpage.CustomerInformation.validateAccountHolderDetails(CustomerInformation.java:35)\r\n\tat stepDefinition.HomeLoanDef.user_validate_account_holder_details(HomeLoanDef.java:77)\r\n\tat ✽.Then user validate account holder details(/Users/manoj/eclipse-workspace/HackHireHomeLoanEligibility/src/test/java/features/homeloan.feature:19)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "HomeLoanDef.notify_customer_eligible_for_pre_approved_loan()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 23,
  "name": "Evaluate customer info to determine emi",
  "description": "",
  "id": "home-loan-application-validation;evaluate-customer-info-to-determine-emi",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 22,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "user is on bank customer info Page",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "user fetch customer details",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "validate customer eligible for how much emi",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "bank process emi",
  "keyword": "Then "
});
formatter.match({
  "location": "HomeLoanDef.user_is_on_bank_customer_info_Page()"
});
formatter.result({
  "duration": 1196426777,
  "error_message": "junit.framework.ComparisonFailure: expected:\u003c[CustomerInfo]\u003e but was:\u003c[DBS Bank Home Loan]\u003e\r\n\tat junit.framework.Assert.assertEquals(Assert.java:100)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:107)\r\n\tat homeloanpage.CustomerInformation.userOnCustomerInfoPage(CustomerInformation.java:63)\r\n\tat stepDefinition.HomeLoanDef.user_is_on_bank_customer_info_Page(HomeLoanDef.java:92)\r\n\tat ✽.Given user is on bank customer info Page(/Users/manoj/eclipse-workspace/HackHireHomeLoanEligibility/src/test/java/features/homeloan.feature:25)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "HomeLoanDef.user_fetch_customer_details()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HomeLoanDef.validate_customer_eligible_for_how_much_emi()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HomeLoanDef.bank_process_emi()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 31,
  "name": "Verify Bank loan criteria and home loan tenure and percentage",
  "description": "",
  "id": "home-loan-application-validation;verify-bank-loan-criteria-and-home-loan-tenure-and-percentage",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 30,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 33,
  "name": "user is on bank loan page",
  "keyword": "Given "
});
formatter.step({
  "line": 34,
  "name": "user fetches property price",
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "validate home loan percentage",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "validate home loan tenure",
  "keyword": "Then "
});
formatter.match({
  "location": "HomeLoanDef.user_is_on_bank_loan_page()"
});
formatter.result({
  "duration": 1996575,
  "error_message": "junit.framework.AssertionFailedError: expected:\u003cfalse\u003e but was:\u003ctrue\u003e\r\n\tat junit.framework.Assert.fail(Assert.java:57)\r\n\tat junit.framework.Assert.failNotEquals(Assert.java:329)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:78)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:174)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:181)\r\n\tat homeloanpage.CustomerInformation.userOnBankLoanPage(CustomerInformation.java:113)\r\n\tat stepDefinition.HomeLoanDef.user_is_on_bank_loan_page(HomeLoanDef.java:112)\r\n\tat ✽.Given user is on bank loan page(/Users/manoj/eclipse-workspace/HackHireHomeLoanEligibility/src/test/java/features/homeloan.feature:33)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "HomeLoanDef.user_fetches_property_price()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HomeLoanDef.validate_home_loan_percentage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HomeLoanDef.validate_home_loan_tenure()"
});
formatter.result({
  "status": "skipped"
});
});