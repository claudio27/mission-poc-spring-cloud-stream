# Spring Cloud Stream Mission

### Kafka commands

Start the ZooKeeper service

	bin/zookeeper-server-start.sh config/zookeeper.properties

Start the Kafka broker service

	bin/kafka-server-start.sh config/server.properties


Topic creation

	bin/kafka-topics.sh --create --partitions 1 --replication-factor 1 --topic quickstart-events --bootstrap-server localhost:9092

Show topic

	bin/kafka-topics.sh --describe --topic quickstart-events --bootstrap-server localhost:9092

Produce 

	bin/kafka-console-producer.sh --topic quickstart-events --bootstrap-server localhost:9092

Consume 

	bin/kafka-console-consumer.sh --topic quickstart-events --from-beginning --bootstrap-server localhost:9092








