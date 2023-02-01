@smoke

Feature:

Scenario: Add product to wishlist and verify success message

When click on the wishlist button for "HTC One M8 Android L 5.0 Lollipop"
Then verify the success message "The product has been added to your wishlist" is displayed with a green background color

Scenario: Verify product added to wishlist

When user click on the wishlist button for "HTC One M8 Android L 5.0 Lollipop"
And wait until the success message disappears
And click on the "Wishlist" tab
Then verify that the Qty value is greater than 0