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
        shell('docker build -t cv-app4 . && docker run -itd --name cv-app4 -p8002:80 cv-app4 && firefox localhost:8002')
    }
}
