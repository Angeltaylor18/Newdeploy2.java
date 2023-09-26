#!/bin/bash
echo "Welcome to Zelle"                    = Isaac
    echo "Zelle your payment gateway"          = Ben        
    echo "Zelle is the gateway of the future"  = UnitedCore   
    echo "Zelle is offering 30% discount"      = Emma
    echo "Good deals for returning clients"     = Theo
  

  other DVCs:
SVN --> Sub Version
CVS --> Concurrent Version system
TFS --> Team Foundation Server
Git --> 95% plus of companies are using GIT   

SCM = Source Code management
=======================-====  
SCM service plaforms :
  GitHub - MS
  GitLab
  BitBucket (Stash) - A
  awsCodeCommit 

  IQ: As a DevOps Engineer, what are your roles & responsilities in Versioning with Git?

  Answer:
  1. We ensure that Developers environments are configured and secured 
     We create an enabling environment for Developers to code/Develope
       DevelopmentServers are created in AWS.  
       share login details with Developers/Team [ userName/password ]  
       Ensure that git package/Software is installed 

  2. Project Onboarding: 
       Create organisations where applicable in a SCM  
       Create repositories in SCM [GitHub] 
       Create teams in SCM and assign members[Developers, etc.] 

3. Zelle: 
  1. Create a github account where applicable - 1:200 [0.5%]
        https://github.com/
        Email address: unitedcoresystems@gmail.com  or isaac.ntim@unicoresys.com   
        userName: unitedcore    
        password: Admin123

  2. Create organisation in your GitHub account for the client [Zelle]
        userName: unitedcore    
        password: Admin123    
        organisation url =  https://github.com/UnitedCoreSystems

. Create project TEAM(S) and add members & collaborators and 
         url = https://github.com/orgs/UnitedCoreSystems/teams/Zelle   

  4. assign roles to Team members using 
     security best practices including Least Priviledges  

  4. Create repositories in the GitHub organisation for the client  
       url = https://github.com/UnitedCoreSystems/Zelle     = public 
       url = https://github.com/UnitedCoreSystems/Zelle-be  = private  

  6. Ensure that Git and relevant IDEs are installed by Developers


  United Core Class2023Teams:
Project:
  1a. Create your GitHub account 
  1b. Onboard our new project for unitedtech a FinTech Client

  2. Managers and assistant
       Create a Team in your created organisation for Zelle and add members of your 
       your group with write access 


Git Commands:

Basic git config (~/.gitconfig)
===================================
git config --global user.name "Isaac Ntim"
git config --global user.email "unitedcoresystem@gmail.com"

to check 
git config --list

git config --global core.editor "/urs/bin/nano"

Mkdir {nameofdiretory}
cd [nameofdirectory]

git init
git status
git log
git add
git commits
git push 

 
    create a Local repository [.git]  
git add 
  
Isaac Hologic@Isaac-DevOps MINGW64 ~/united2023 (master)
$ git status
On branch master

No commits yet

nothing to commit (create/copy files and use "git add" to track)

workingArea  stagingArea LocalRepo RemoteRepo

working area        staging     localRepo     RemoteRepo[GitHub]    :
  -----------        -------      ---------     ------------------  
  Untracked files     git add     git commit    git push 
    red                green     


git init          = to initialised a git empty repository
                    create the default branch[master]
git status        = to track files location
git log           = list all commits  
git add .           = move files to staging area from working area
git commit -m     = move files to the local repository FROM STAGING AREA
                    good commit message for tracking changes/authors 
    

20 September 2023:
===================

Deploy.java
    echo "Welcome to Zelle"                    = Isaac
    echo "Zelle your payment gateway"          = Ben        
    echo "Zelle is the gateway of the future"  = UnitedCore   
    echo "Zelle is offering 30% discount"      = Emma
    echo "Good deals for returning clients"     = Theo

Repository:
    https://github.com/UnitedCore-Class2023/Deploy.java.git

creat a directory
git init 
git status
git add . 
git commit -m "comments"
git remote add origin https://github.com/UnitedCore-Class2023/Deploy.java.git
git push -u origin master


Git Branch :
 git branch [name]

 git branch --list

  Master
  stage branches
  development
  main

