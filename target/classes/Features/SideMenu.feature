Feature: SideMenu Test

  Scenario: TC-ClickMenu
    Given I click Menu
    Then  contain Home2


  Scenario: TC-ClickInterior
    Given I click text Interior
    Then  contain Interior



  Scenario: TC-ClickAmenties
    Given I click text Amenties
    Then  contain Amenties




  Scenario: TC-ClickRooms
    Given I click text Rooms
    Then  contain Our Rooms



  Scenario: TC-ClickTestimonial
    Given I click text Testimonial
    Then  contain What Our Guest Say



  Scenario: TC-ClickLegalNotice
    Given I click text LegalNotice1
    Then  contain Legal1



  Scenario: TC-ClickAbout
    Given I click text About1
    Then  contain About us1



  Scenario: TC-ClickContact
    Given I click text Contact
    Then  contain Contact Us


