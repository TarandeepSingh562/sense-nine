module com.mechanitis.demo.sense.twitter {
    requires java.logging;
    requires com.mechanitis.demo.sense.service;

    requires websocket.servlet;
    requires websocket.server;

    requires jetty.http;
    requires jetty.security;

    exports com.mechanitis.demo.sense.twitter;
}