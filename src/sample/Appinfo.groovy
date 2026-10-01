package com.sample

class AppInfo {

    def steps
    String appName
    int port
    String environment

    AppInfo(steps, String appName, int port, String environment) {
        this.steps = steps
        this.appName = appName
        this.port = port
        this.environment = environment
    }

    void printInfo() {
        steps.echo "Application Name: ${appName}"
        steps.echo "Port: ${port}"
        steps.echo "Environment: ${environment}"
    }
}