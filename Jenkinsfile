// // This is the Jenkins Groovy Script that is to be written in the Configure Part of the Pipeline...
//
// pipeline {
//     environment{
//         dockerimg = ''
//     }
//     agent any
//
//     stages {
//         stage('Git Pull') {
//             steps {
//                 git 'https://github.com/sbrc1996/SPE_Calculator.git'
//             }
//         }
//         stage('Maven Build + JUint Test Cases') {
//             steps {
//                 sh 'mvn clean install'
//             }
//         }
//         stage('Docker Build Image') {
//             steps {
//                 script{
//                     dockerimg=docker.build("sbrc1996/speminiproject:latest")
//                 }
//             }
//         }
//         stage('Push Docker Image') {
//             steps {
//                 script{
//                     docker.withRegistry('','dockerhub'){
//                     dockerimg.push()
//                     }
//                 }
//             }
//         }
//         stage('Delete Docker Image') {
//             steps {
//                 script{
//                     // sh 'docker image rm -f sbrc1996/speminiproject'
//                     sh '''
//                         # Remove all images with the tag <none>
//                         docker rmi --force $(docker images | grep "<none>" | awk '{print $3}')
//                         '''
//                 }
//             }
//         }
//         stage('Ansible deploy') {
//             steps {
//                 //Ansible Deploy to remote server
//                 ansiblePlaybook becomeUser: null, colorized: true, disableHostKeyChecking: true, inventory: 'inventory', playbook: 'deployEnvironment.yml', sudoUser: null
//             }
//         }
//
//     }
// }
