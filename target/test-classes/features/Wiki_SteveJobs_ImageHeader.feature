Feature: Wikipedia Search Functionality Image Header Verification

  @wip
  Scenario: Searching Steve Jobs on the search box
Given User is on Wikipedia home page
When User types Steve Jobs in the wiki search box
And User clicks wiki search button
Then User sees Steve Jobs is in the image header
