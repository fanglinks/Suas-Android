![Screenshot](/misc/Logo.png?raw=true)

`Suas` is a library that does stuff.

Suas is a [Unidirectional Data Flow architecture](doc:why-unidirectional-architectures) implementation for iOS/MacOS/TvOS/WatchOs and Android heavily inspired by [Redux](http://redux.js.org). It provides an easy to use library that helps to create applications that are consistent, deterministic and scalable.

Suas has frameworks for iOS, Android, and MacOS. And it aims to have good developer tooling such as customizable logging and state transition monitoring.

Suas is a pragmatic framework, it is designed to work nicely with Cocoa/CocoaTouch and Android/Java/Kotlin. 

# Why Suas
Suas aims to be used to build highly-dynamic, consistent mobile apps:

- Small code base with very low operational footprint (268 methods).
- Static typing and type information is conserved in the Store, Reducers, and Listeners.
- Cross platform; Suas-iOS works on the iOS, MacOS, TvOS and watchOS. And Suas-Android works on all API levels and provides a Kotlin friendly interface. 
- Fast out of the box and can be customized by developers to be even faster [StateConverter]()
- Focuses on developer experience with tools like [LoggerMiddleware]() and [MonitorMiddleware]() 


# Installation

Add Suas as a dependency to your build file:

Gradle:
```
# For Android Plugin 3.x and up
implementation 'com.zendesk.suas:suas:1.0.0'

# For Android Plugin 2.x and blow
compile 'com.zendesk.suas:suas:1.0.0'
```

Maven:
```
<dependency>
  <groupId>com.zendesk.suas</groupId>
  <artifactId>suas</artifactId>
  <version>1.0.0</version>
</dependency>
```