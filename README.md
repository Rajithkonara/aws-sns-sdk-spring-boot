# AWS SNS with Spring-Boot 

This is a sample spring-boot project to demonstrate to send SMS using aws sns and sdk

Blog post - https://www.rajith.me/2020/03/send-sms-using-aws-simple-notification.html

## Requirements
* Java 8
* Apache Maven 3.5.0 or higher

## How to Run

- Clone the project
- Build the project  
```
mvn clean install
```
- Run the application
```
java -jar target/sns-1.0.0-SNAPSHOT.jar
```

- Send Request

```sh
POST  http://localhost:8080/api/v1/sms
{
  "mobileNo": "+94123123123",
  "body": "hello from aws sns"
}
```

### Reference Documentation
For further reference, please consider the following sections:

(Aws SNS developer guide) https://docs.aws.amazon.com/sns/latest/dg/sms_publish-to-phone.html#sms_publish_sdk

(Using aws credentials) https://docs.aws.amazon.com/sdk-for-java/v2/developer-guide/credentials.html
