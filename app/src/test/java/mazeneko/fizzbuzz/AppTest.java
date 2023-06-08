package mazeneko.fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

class AppTest {
  @Test
  void appCanInstantiate() {
    final var app = new App();
    assertNotNull(app, "app should can instantiate");
  }
}
