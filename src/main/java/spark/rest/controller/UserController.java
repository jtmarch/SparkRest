package spark.rest.controller;

import spark.rest.service.UserService;
import spark.rest.util.JsonUtil;

import static spark.Spark.get;

public class UserController {

    public UserController(final UserService userService) {
        get("/users", (req, res) -> userService.getAllUsers(), JsonUtil.json());
    }
}