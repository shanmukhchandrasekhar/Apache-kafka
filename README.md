# Apache-kafka
Apache kafka is a distributed sreaming platform similar to message queue or eterprise message system
![arch](https://user-images.githubusercontent.com/38941778/96096280-499d0f80-0eed-11eb-9aa3-104c97660d58.JPG)

1.cluster is bunch of brockers running in a group of computers. They take bunch of records from producer and store it in kafka log.

2.Consumers read the records from kafka cluster and they will do what ever they want. 

3.Stream processors process the data and store in kafka or they will send to some other systems like spark, strom

4.If we just plugin some stram processinf framework to kafka this will help to create stram processing application.

# Need of kafka

![need](https://user-images.githubusercontent.com/38941778/96377960-9cedb700-11a6-11eb-9ed4-b463e4dd7203.JPG)

* In this scenario all the data pipe line are getting complex with the increase in the number of systems. Adding a new server requires more data pipelines which will make data flow more complicated and managing these data pipelines becomes very difficult.

## Kafka decouples data pipelines:

![need 1JPG](https://user-images.githubusercontent.com/38941778/96378173-dffc5a00-11a7-11eb-8c1a-c5a159e3b561.JPG)

* Kafka decouples all of the data pipelines. Producers which produces all of the messages or generate all of the data is stored in the form of a stream in the kafka cluster. From the kafka cluster consumer consumes all of the data. In this number scenario of pipelines are decreased.

# kafka terminology
## Broker: 
Kafka brokers are the severs that manage nd mediate the conversation between two differemt systems. Brokers are responsible for the delivery of right messages to the right party.

## Message:
Message are simple byte arrays, and any object can be stored in any format bydevelopers. The format can be string, JSON, Avro, etc...

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

# Kafka internal flow

![internal flow arch](https://user-images.githubusercontent.com/38941778/96379108-dc1f0680-11ac-11eb-9444-fd5eeb69434a.png)

## Kafka Producer:
* Producers can send records to topicsa and select teh partition to send the message per topic. They can implement priority systems whcich are based on sending records to certain partitions depending pripority of the record.

* Producers don't wait for acknowledgement from a broker and send messages as fast as the broker can handle.

## Kafka broker:
* A cluster typically consists of multiple brokers to maintain the load balence. A broker on receving messages from the producer assigns offsets to them and commits the messages to the storage on the disk. 

* One broker instance can handle thousands of reads-writes per second and TBs of messages, backups of topic partitions are present in multiple brokers. If a broker goes down, one of the broker partition would be elected as the leader for the respective partitions.

## Kafka Topics and Partitions:
* Messages in kafka are catagorized into topics. These are broken down into number of partitions. Messages are written to it in an appened-only fashion.

* Reading messages an eaither be done in the order from begining to end or skip or rewined to any point in the partition by providing an offset value. An offset value is the sequential ID provided to messages. 

* Partitions provide redundency and scalability. They can be hosted an a different server i.e.; a single topic can be scaled horizantally across multiple servers, thus enhancing performance.

## Kafka Consumer:

* The consumer can subscribe to one or more topics and read messages in the order they were produced. The consumer keeps track of the offset of messages. Consumers work as part of a consumer group i.e.; one or more consumers that work together to consume topic.

# Zookeeper

* Zookeeper comes in whenever we are working with any sory of distributed applications like kafka. With the help of apache zookeeper we can identify which brockers are present in our cluster currently and which producer is sending what messages to broker currently.

* Kafka brokers coordinate with eack other using zookeeper. Producers and consumers are notified by the zookeeper service about the presence of a new broker in the system .

* If the leader node fails, then basis of the currently nodes zookeper will elect the new leader. zookeeper in kafka keeps a set of in-sync replicas.

# Installation of kafka 

https://www.apache.org/dyn/closer.cgi?path=/kafka/2.6.0/kafka_2.13-2.6.0.tgz

## Kafka commands:

 To start zookeeper: .\bin\windoes/zookeeper-server--start.bat .\config\zookeeper.properties

To start kafka: .\bin\windows\kafka-server-start.bat .\config\server.properties

To create a topic: .\bin\windows\kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic <topic name>
  
To see list of topics: .\bin\windows\kafka-topics.bat --list --zookeeper localhost:2181

To send messages: .\bin\windows\kafka-console-producer.bat --broker-list localhost:9092 --topic <topic name>

To receive messages: .\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic <topic name> --from-begining
  
