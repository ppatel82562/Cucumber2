@checkout

  Feature:Check out successfully

    Scenario:User should be able to buy product successfully

      Given user is on home page
      When click on books page
      And click on book name is Fahrenhit 451
      And click on add to cart
      And click on shopping cart
      And click on terms and condition
      And click on check out
      And click on check out as Guest
      And fill the all requirment details
      And click on continue for shipping method
      And again click on continue for payment
      And click on credit card
      And click on continue for credit card details
      And enter credit card details
      And click on continue for confirm order
      And click on confirm
      Then User able to see successfully message which 'Your order has been successfylly processed'


