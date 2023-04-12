job('job dsl')
{
    description('this is our first job dsl using apache groovy')
    scm
    {
        git("https://github.com/chiragawasthi17/cv.git", 'main')
    }
    triggers
    {
        scm('* * * * *')
    }
    steps
    {
        shell('docker build -t cv-app5 . && docker run -itd --name cv-app5 -p 8003:80 cv-app5 && lynx localhost:8002')
    }
}
