# Apache-kafka
Apache kafka is a distributed sreaming platform similar to message queue or eterprise message system
![arch](https://user-images.githubusercontent.com/38941778/96096280-499d0f80-0eed-11eb-9aa3-104c97660d58.JPG)

1.cluster is bunch of brockers running in a group of computers. They take bunch of records from producer and store it in kafka log.

2.Consumers read the records from kafka cluster and they will do what ever they want. 

3.Stream processors process the data and store in kafka or they will send to some other systems like spark, strom

4.If we just plugin some stram processinf framework to kafka this will help to create stram processing application.

# Need of kafka

![need](https://user-images.githubusercontent.com/38941778/96377960-9cedb700-11a6-11eb-9ed4-b463e4dd7203.JPG)

* In the above scenario all the data pipe line are getting complex with the increase in the number of systems. Adding a new server requires more data pipelines which will make data flow more complicated and managing these data pipelines becomes very difficult.

## Kafka decouples data pipelines:

![need 1JPG](https://user-images.githubusercontent.com/38941778/96378173-dffc5a00-11a7-11eb-8c1a-c5a159e3b561.JPG)

* Kafka decouples all of the data pipelines. Producers which produces all of the messages or generate all of the data is stored in the form of a stream in the kafka cluster. From the kafka cluster consumer consumes all of the data. In this number of pipelines are decreased.

# kafka terminology
## Broker: 
Kafka brokers are the severs that manage nd mediate the conversation between two differemt systems. Brokers are responsible for the delivery of right messages to the right party.

## Message:
Message are simple byte arrays, and any object can be stored in any format bydevelopers. The format can be dtring, JSON, Avro, etc...

## Topic:
In apache kafka, all messages are maintained in what we call topics. Messages are stored, published, and organized in kafka topics.

## Cluster:
In kafka more than one broker i.e.; a set of servers is collectively known as kafka cluster. It is a group of computers, each having one instance of a kafka broker.

## Producers:
Producers are the process that publish data or messages to one or more topics. They are basically the source of data stream in kafka

## Consumers:
Consumers are the proces that read and process the data from topics by subscribing to one or more topics in the kafka cluster.

## Partitions:
Every broker holds few partitions can be eaither a leader or a replica for a topic. All writes and reads to a topic go via the leader which is responsible  for the updating replicas with new data. The leader fails, one of the replica takes  voer as the new leader.

## Offset:

![offset1](https://user-images.githubusercontent.com/38941778/96377592-336ca900-11a4-11eb-927a-0a85a5e871cb.JPG)

A sequence id given to messages as they arrive in a partition.







