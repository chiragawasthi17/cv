job('First-seed-CV-pipeline'){
  description("First job dsl job created via groovy syntax on $(new Date()),this project is job dsl")
  scm{git("https://github.com/chiragawasthi17/cv.git",master)}
  triggers{scm('* * * * *')}
  steps{shell('docker build -t cv-app .', 'docker run -itd --name cv-app1 -p 8001:80 cv-app')}
   
