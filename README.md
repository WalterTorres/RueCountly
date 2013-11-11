RueCountly
==========


RueCountly seeks to allow you use the CountlySDK in haxe/OpenFL.

Android
-------

To connect to your Countly account you need to set the env variables in your project.xml:

```java
<setenv name="ServerID" value="The http:// address to your server" if="android" />

<setenv name="AppKey" value="The app key provided by Countly" if="android" />
```


iOS
---

To use Countly in your ios application you need to manually set it up by calling init:

```java

RueCountly.InitCountly("The http:// address to your server", "The app key provided by Countly");

```

Do this in your main if possible.

There is one extra step to make it work in ios, upon building your project xCode file, you will be required to go into the project and add the folder "Countly.xcdatamodeld" manually into the resource folder. This is because OpenFL does not have a way to add files directly to that yet.




Question? Email me at: walter@arcticempire.ca 