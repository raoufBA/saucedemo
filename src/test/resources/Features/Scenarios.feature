@Scenarios
Feature: tester le site Swag Labs

  Background: tester les fonctionnalités Login et ajout d'un produit
    Given je suis dans le site saucedemo
    When Je saisie userName "standard_user"
    And Je saisie password "secret_sauce"
    And je clique sur le bouton Login
    Then redirection vers la page Home
    When  je clique add to card pour Sauce Labs Onesie
    And je clique add to card pour Sauce Labs Bolt T-Shirt
    Then les produits sajoutent dans le panier

  @Checkout
  Scenario: tester la fonctionnalité Checkout
    When je clique sur le panier
    And je clique sur Chekout
    And je saisie mon First name "Amel"
    And je saisie mon postal code "5040"
    And je saisie mon Last name "Ben Anes"
    And je clique sur continue
    Then une page overview s affiche
    And je clique sur Finish
    Then une redirection vers une autre page

  @SuppressionProduct
  Scenario: tester la fonctionnalité supprimer un produit
    When je clique sur supprimer
    Then les produits se sont supprimes


  @Logout
  Scenario: tester la fonctionnalité Logout
    When je clique sur menu
    And je clique sur Logout
    Then une redirection vers la page d'acceuil


