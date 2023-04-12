job('job dsl')
{
    description('this is our first job dsl using apache groovy')
    scm
    {
        git("https://github.com/chiragawasthi17/cv.git", 'master')
    }
    triggers
    {
        scm('* * * * *')
    }
    steps
    {
        shell('docker build -t cv-app1 .')
    }
}
