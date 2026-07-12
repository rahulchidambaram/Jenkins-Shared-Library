def call(String environmentName = "production"){
    echo "Deploying the application to ${environmentName}"

    sh ```
        echo 'Deployment command is running'
        echo "Environment: ${environmentName}"
        echo "Deploment completed"
    ```
}
