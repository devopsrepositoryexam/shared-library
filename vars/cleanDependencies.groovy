def call() {
    if (isUnix()) {
        sh "rm -rf ~/.m2/repository/com/skfai"
    }
    else {
        bat "rmdir /s /q C:\\Users\\Administrator\\.m2\\repository\\com\\skfai"
    }
}
