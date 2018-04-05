@register
  Feature: register successfully

    Scenario: User able to register successfully
      Given User on home page
      When User enter valid credentials
#      And User enter "<Last Name>" in box
#      And User enter "<Email>" in box
#      And User enter "<Password>" in box
#      And User enter "<Confirm Password>" in box
      Then User able to do succefully registration