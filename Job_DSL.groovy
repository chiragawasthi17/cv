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
        shell('docker build -t cv-app6 . && docker run -itd --name cv-app6 -p 8004:80 cv-app6 && lynx localhost:8002')
    }
}
