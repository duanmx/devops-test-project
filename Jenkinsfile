pipeline {
    agent any
    options {
        timestamps()
    }
    stages {

        stage('代码构建') {
            steps {
                cd dmx-user-center
                sh "mvn clean install -U"
                sh "mvn -Dmaven.test.skip=true clean package"
            }
        }

        stage('运行程序') {
            steps {
                echo "run programer"
            }
        }

    }
}
