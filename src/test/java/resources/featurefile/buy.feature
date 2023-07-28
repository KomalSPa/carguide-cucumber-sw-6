@regretion
Feature: Search Test
  As User I want to Search and verify functionality

  @smoke

  Scenario Outline: Search the buy car with model
    Given I am on homepage
    When I mouse hover on “buy+sell” tab
    And I click 'Search Cars' link
    Then I navigate to ‘new and used car search’ page
    And I select make "<make>"
    And I select model "<model>"
    And I select location "<location>"
    And I select price "<price>"
    And I click on Find My Next Car tab
    Then I should see the make "<Result>"
    Examples:

      | make       | model   | location            | price  | Result     |
      | Toyota     | Camry   | NT-South            | $20000 | Toyota     |
      | Alfa Romeo | 147     | NSW - Central Coast | $15000 | Alfa Romeo |
      | Audi       | A1      | NSW - Central West  | $20000 | Audi       |
      | BMW        | 120d    | NSW - Illawarra     | $25000 | BMW        |
      | Ford       | Capri   | NSW - Hunter        | $30000 | Ford       |
      | Yamaha     | Mt-09   | NT - South          | $35000 | Yamaha     |
      | Wolseley   | 4/44    | WA - All            | $40000 | Wolseley   |
      | Smart      | Forfour | TAS - North         | $45000 | Smart      |
      | Ram        | 1500    | SA - South          | $35000 | Ram        |

  @smoke
  Scenario Outline: Search the used car with model
    Given I am on homepage
    When I mouse hover on “buy+sell” tab
    And I click ‘Used’ link
    Then I navigate to ‘Used Cars For Sale’ page
    And I select make "<make>"
    And I select model "<model>"
    And I select location "<location>"
    And I select price "<price>"
    And I click on Find My Next Car tab
    Then I should see the make "<Result>"


    Examples:
      | make       | model   | location            | price  | Result     |
      | Toyota     | Camry   | NT-South            | $20000 | Toyota     |
      | Alfa Romeo | 147     | NSW - Central Coast | $15000 | Alfa Romeo |
      | Audi       | A1      | NSW - Central West  | $20000 | Audi       |
      | BMW        | 120d    | NSW - Illawarra     | $25000 | BMW        |
      | Ford       | Capri   | NSW - Hunter        | $30000 | Ford       |
      | Yamaha     | Mt-09   | NT - South          | $35000 | Yamaha     |
      | Wolseley   | 4/44    | WA - All            | $40000 | Wolseley   |
      | Smart      | Forfour | TAS - North         | $45000 | Smart      |
      | Ram        | 1500    | SA - South          | $35000 | Ram        |

