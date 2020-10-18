# Apache-kafka
Apache kafka is a distributed sreaming platform similar to message queue or eterprise message system
![arch](https://user-images.githubusercontent.com/38941778/96096280-499d0f80-0eed-11eb-9aa3-104c97660d58.JPG)

1.cluster is bunch of brockers running in a group of computers. They take bunch of records from producer and store it in kafka log.

2.Consumers read the records from kafka cluster and they will do what ever they want. 

3.Stream processors process the data and store in kafka or they will send to some other systems like spark, strom

4.if we just plugin some stram processinf framework to kafka this will help to create stram processing application.

# kafka terminology
## Broker: 
Kafka brokers are the severs that manage nd mediate the conversation between two differemt systems. Brokers are responsible for the delivery of right messages to the right party.

## Message:
Message are simple byte arrays, and any object can be stored in any format bydevelopers. The format can be dtring, JSON, Avro, etc...

## Topic:
In apache kafka, all messages are maintained in what we call topics. Messages are stored, published, and organized in kafka topics.

##Cluster:
In kafka more thann one broker i.e.; a set of servers is collectively known as kafka cluster. It is a group of computers, each having one instance of a kafka broker.

