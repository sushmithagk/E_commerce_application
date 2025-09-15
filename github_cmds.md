## Github Commands

# To initialize the git in the local repo:

    * git init 
    * git config --global user.email"user@gmail.com"
    * git config --global user.name"username"

# to clone the repo

    * git clone repourl
    
# go to cloned folder -- cd foldername 

    # to create the branch

        * git branch -- shows the number of branches 
        * git branch master -- master branch is created 
        * git checkout master -- switched to the master bracnch

# github commands used when files changed 

    * git status -- gives the files modified,added or changed
    * git add . -- adds the changed files 
    * git commit -m "sample message" -- the changed files are added to the local repo
    * git push -u origin master -- pushes the commit made in the local repo to the githu
    * git log -- gives the history of commit

# to connect the local and github repo

    * git remote add origin repourl -- connects the local repo and the github repo
