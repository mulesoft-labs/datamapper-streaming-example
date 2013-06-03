# DataMapper streaming example

A demo app that uses DataMapper in different ways to show how enabling "streaming" can change the way flows behave

## How to run the app

Clone the repo:

    git clone git@github.com:mulesoft/datamapper-streaming-example.git

Prepare Studio project

    mvn studio:studio

Import in studio as "Mule Studio Project from External Location"

## What's with the examples?

There are three flows, with different configurations:

- with-streaming-batch: Processing starts as soon as possible, and when DataMapper maps _batchSize_ elements, the next processor is invoked
- with-streaming: Processing starts as soon as possible, but you have no control over how many elements at a time are sent to the next processor
- without-streaming: Processing starts only when all elements are mapped