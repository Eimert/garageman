# GarageMan

Spring back-end for Frank's garage. Full-stack challenge showcase project.

Created in July 2020.

## Technology
- NoSQL: free db hosted at [MongoDB Atlas](https://cloud.mongodb.com).



## Getting started
- `git clone` this project, import into IDE, let maven install all the dependencies.
- Ask Eimert for the db connection string, and configure it in the JVM_OPTS.
- Make sure the application has [status "UP"](http://localhost:8080/actuator/health).

Optional:
- Provide your google e-mail address to Eimert to get access to the [MongoDB cloud console](https://cloud.mongodb.com).
- Install mongodb client for your OS.
- Connect to the db console: `mongo "mongodb+srv://cluster0.ofdij.azure.mongodb.net/garageman" --username dbUser`.
Where 'garageman' is the db name. Ask Eimert for the password.