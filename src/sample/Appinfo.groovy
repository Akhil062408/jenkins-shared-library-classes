package com.sample

class Appinfo {
    String name
    int port
    String environment

    Appinfo(String name, int port, String environment) {
        this.name = name
        this.port = port
        this.environment = environment
    }

    void displayInfo() {
        println "Application Name: ${name}"
        println "Port: ${port}"
        println "Environment: ${environment}"
    }
}