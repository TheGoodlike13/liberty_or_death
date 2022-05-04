# Trying to setup SSO for a liberty application (from zero)

Links to tutorials and information used:

##### [#ibm_basic](https://www.ibm.com/support/pages/websphere-liberty-developers)
##### [#ibm_gradle](https://www.ibm.com/docs/en/wasdtfe?topic=projects-developing-liberty-gradle-plug-in)
##### [#gradle_plugin](https://github.com/OpenLiberty/ci.gradle)
##### [#gradle_plugin_deeper](https://github.com/OpenLiberty/ci.gradle/blob/main/docs/libertyExtensions.md)
##### [#how_to_deploy](https://riptutorial.com/websphere-liberty/example/25243/deploying-a-simple-application-on-the-command-line)
##### [#mr_baeldung](https://www.baeldung.com/intro-to-servlets)

## Dear diary,

I started off by adding the gradle dependency from [#ibm_basic](#ibm_basic).
Well, too bad, it doesn't work. You also have to add the 'liberty' gradle plugin.
Thankfully, at least the instructions in [#gradle_plugin](#gradle_plugin) work.
Do keep in mind, you have to choose whether you go with "apply plugin" or "plugin id"
approach, and use what they prescribe exactly, or it won't work.
The most I got away with is removing parentheses and "mavenLocal".

Now I had a project that wasn't exploding. I start following [#how_to_deploy](#how_to_deploy).
Immediately none of the classes they use in their example are present.
Thankfully, [#mr_baeldung](#mr_baeldung) comes to the rescue!
After adding the 'javax.servlet-api' dependency, it compiles.
For the record, I coped the maven XML into the gradle file, and it was automatically formatted!
I did have to set 'implementation' instead of 'compile' myself, but still, that's pretty neat.
 
However, the follow-up step asks me to package things into a 'war'.
Yeah, like I remember how to do that!
I decided to go with [#ibm_gradle](#ibm_gradle) next.
I created the server.xml file and dumped it to /src like a pleb.
I made minor modifications, hopefully nothing breaks.
Then I started adding the 'liberty' block as instructed.
Project broke. For some reason I could not set 'configFile'.
The internet was useless, as the only [stackoverflow answer](https://stackoverflow.com/questions/52099824/could-not-set-unknown-property-configfile-for-object-of-type-net-corda-plugins)
tells you to remove '='. That didn't work and just made things worse.
I turned to the plugin documentation next, finding [#gradle_plugin_deeper](#gradle_plugin_deeper).
Looks like configFile is gone and configDirectory is used instead.
With that change... we get a different error about 'war' not existing.
At least that makes sense, because I never did any war to begin with.
[#gradle_plugin_deeper](#gradle_plugin_deeper) suggests the property
is not needed when using 'war' plugin.
Turns out to be true and all is well in the project again!
