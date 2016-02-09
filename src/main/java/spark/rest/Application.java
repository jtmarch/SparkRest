package spark.rest;

import spark.rest.controller.UserController;
import spark.rest.service.UserService;

public class Application {
    public static void main(String[] args) {
        new UserController(new UserService());
    }
}
