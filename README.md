# BEST-state-Insurance-Portal
This is a  Java web application developed for the BEST undertaking For the Employee State Portal. In order to understand the use of this portal there is a need to understand the working of the system. The Brihanmumbai Electricity Supply and Transport (BEST) (also known as the Bombay Electric Supply & Transport, the official name until 1995) is a civic transport and electricity provider public body based in Mumbai, Maharashtra, India. It has nearly 50,000 permanent Employees along with considerable amount of Daily Wage workers under Contract.
Under the state government of Maharashtra, Workers below the min wage are provided subsidized Health Insurance. This Employee State Insurance Portal is aimed at providing a digital database to not only store Employee Details,Contractor information but also automate the subsidy amount based on the wage of the Daily worker. The Portal also generates numerous reports for the statiscal analysis.

That's it friends for the background details. Lets move on on how to run this project.

### INSTALLATION

1. git clone the project
```console
foo@bar :~$ git clone https://github.com/Naeempatel010/BEST-state-Insurance-Portal.git
```

2. After cloning enter the source directory
```console
foo@bar :~$ cd BEST-state-Insurance-Portal.git
```
3. As this application is made using Netbeans, it is pretty much necessary to run it in Netbeans(I am sorry I had no choice! It is government organisation with it's own standard, Deep Down I am Eclipse Enthusiast too). After creating the netbeans project you need to simply run the Server! In my case it was GlassFish Server :'( . 

4. Boom! you have created the copy of my project, But wait there are still a few bottlenecks! First would be well, you need to use Microsoft SQL server and make sure you download the correct versions of JDBC Drivers.Once you have successfully managed to connect your SQL server to Netbeans, you will need the schema. I got you covered! Just copy all the dump files in the sql folder and you are good to go.

### SCREENSHOTS
## Login Page
![Login Page](https://github.com/Naeempatel010/BEST-state-Insurance-Portal/blob/master/website_images/index.jpeg)

## Employee Registration
![Employee Registration](https://github.com/Naeempatel010/BEST-state-Insurance-Portal/blob/master/website_images/main.jpg)


## Report Lookup
![Report Lookup](https://github.com/Naeempatel010/BEST-state-Insurance-Portal/blob/master/website_images/reportshow.jpg)


## Contractor Registration
![Contractor Registration](https://github.com/Naeempatel010/BEST-state-Insurance-Portal/blob/master/website_images/contractor.jpg)


## Employee-Contractor Registration
![Employee-Contractor Registration](https://github.com/Naeempatel010/BEST-state-Insurance-Portal/blob/master/website_images/form.jpeg)


## Blank Report View
![Blank Report View](https://github.com/Naeempatel010/BEST-state-Insurance-Portal/blob/master/website_images/report1.jpg)
