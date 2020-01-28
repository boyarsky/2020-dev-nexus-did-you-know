# 2020-dev-nexus-did-you-know

Thank you to Janeice DelVecchio, Elena Felder and Scott Selikoff for ideas. (oh and myself)

The following ideas were proposed and didn't make it. Maybe in a future edition of this talk
* http://java.net.URI is not able to decode hostnames with underscores (getHost() == null). http://java.net.URL can parse these but comes with a different set of drawbacks - https://twitter.com/mp911de/status/1221802801497628677
* String and equals() are always fertile topics.. like (new String("x") != "x"), although this topic is often covered to death in some cert books :P
* System.gc() isn't required to do anything.
* you can define two abstract methods in interface (even using the explicit word abstract) and it can still be interpreted as a FI with a single abstract method absolutely bothers me.  I don't care that one is a public method in Object... it shouldn't be allowed.  Also, there's no reason you should be overriding with an abstract method that exists in Object anyway! (protected)
* If you have two jars on the cp that inadvertently have the same class name in it, you get indeterminate behavior. This happens all the time to me when maven jars change location or libraries get updated to split certain packages out.
* private String lock = "lock"; ....... synchronized(lock){ ...}
* overriding equals and not hashcode causes weird behavior when using set/map
* something weird with DecimalFormat that I can reproduce where it output 1000 as something like 1,1,1,1,1,
