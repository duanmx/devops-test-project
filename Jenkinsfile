pipeline {
    agent any
    options {
        timestamps()
    }
    parameters {
        string(description: '开发环境:dev/测试环境:test/正式环境:prod', name: 'env',defaultValue: params.env)
    }
    stages {

        stage('代码构建') {
            steps {
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
