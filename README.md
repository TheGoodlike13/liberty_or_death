# Trying to setup SSO for a liberty application (from zero)

Links to tutorials and information used (try [web archive](https://archive.org/) if down):

##### [#ibm_basic](https://www.ibm.com/support/pages/websphere-liberty-developers)
##### [#ibm_gradle](https://www.ibm.com/docs/en/wasdtfe?topic=projects-developing-liberty-gradle-plug-in)
##### [#gradle_plugin](https://github.com/OpenLiberty/ci.gradle)
##### [#gradle_plugin_deeper](https://github.com/OpenLiberty/ci.gradle/blob/main/docs/libertyExtensions.md)
##### [#how_to_deploy](https://riptutorial.com/websphere-liberty/example/25243/deploying-a-simple-application-on-the-command-line)
##### [#mr_baeldung](https://www.baeldung.com/intro-to-servlets)

## Setting up a liberty server that works

### Dear diary,

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

The next step seems to be running 'gradlew installApps'. Except that doesn't work.
The task 'installApps' could not be found.
Google results for 'Task "installApps" not found in root project' also could not be found.
Also, 'installApps' could not be found anywhere in [#gradle_plugin](#gradle_plugin) project.
Uh oh.
Well, let's experiment. How about 'gradlew install'?
Ambiguous. Candidates are: 'installFeature', 'installLiberty'.
Wait a minute, one of those is awfully familiar... let's try that.
Well, it runs. Does it do the thing? Nobody knows.

I'm really tired of your shit, [#ibm_gradle](#ibm_gradle).
What do you mean, import your project to eclipse? I'm not using eclipse. Cmon.
Looks like all the rest of the info which I could try to use to verify if the
previous step worked is entirely dependent on an IDE I don't use.
Or the nebulous phrase 'manually create a runtime and server'. OK then.
I'll go and do that. Somehow. Bye.

Let's go back to [#how_to_deploy](#how_to_deploy).
Since we're using 'war' plugin, we can run 'gradlew war'
which will produce a '.war' file in the build directory.
I'd say that qualifies for step 2.

Step 3 - add the application to your server! Aha.
So it's the same type of useless information as the previous one. Good to know.

Regardless, I'm starting to get the impression we're gonna something else installed
or prepared *outside* of the project, like a virtual environment or something.
You know, like that thing python people do. No idea how they put up with that shit.

At this point, I realized that all of this 'documentation' would do anyone no good
if the pages I refer to would stop working.
So I decided to save them to the [web archive](https://archive.org/). Take that!

As I was doing this, I scrolled past some of the documentation in [#gradle_plugin](#gradle_plugin).
I noticed there should be a task called 'libertyCreate' which supposedly creates
a server. It also ran and did something. Could this be the thing I needed? My god...
What can I say. Engineering works in mysterious ways.

Time to proceed onwards with step 4. We're on [#how_to_deploy](#how_to_deploy) if you're lost.
I add the servlet feature to the server.xml file.

Step 5. Start the server. I don't trust this page anymore, so I'll refer to
[#gradle_plugin](#gradle_plugin) instead. That's where all the cool kids look for documentation.
I'm a bit perplexed, as there seems to be a difference between 'running' and 'starting'.
Let's try to use the specific wording from the guide and run 'gradlew libertyStart'.
Looks like it succeeded. But I'm not sure at what.

There's some weirdly formatted text, a message you would typically expect someone to put there,
namely 'The defaultServer server is ready to run a smarter planet.' and that's it.
Notably missing is 'Web application available', as expected by [#how_to_deploy](#how_to_deploy).
Maybe I shouldn't have messed with those files :(

I restore the original httpEndpoint configuration, but that seems to have no effect.
I stop with 'gradlew libertyStop' and start again to no avail.
Looks like its time to run away! Yes, that's right! 'gradlew libertyRun' works!
I think both of the options work, but 'start' just launches it in the background,
whereas 'run' hooks right onto it. It only prints the info into the console if it's hooked.
But that's just a guess. Don't take my word for it.

But what's this? "The class eu.goodlike.TestServlet has a @WebServlet annotation
but does not implement the javax.servlet.http.HttpServlet interface."
Looks like I should've done more copy paste. Again. Be right back.

I just can't stop myself from tinkering with this stuff.
So I keep changing the server.xml file to see if it still works.
Well, turns out it doesn't work if you use a question mark in the ID.
Might have something to do with being part of some URL, which would make sense.
What doesn't make sense is why does the port of the URL which point to my servlet
ignores this configuration. What's it even for then???

I remove it completely with no consequence. Next you'll tell me I didn't need JSP either???
Thanks a lot, [#ibm_gradle](#ibm_gradle). Useless.
I suspect that if we didn't have a servlet it might have had some use, but we do, so fuck it.
I'll add it if I need it later.

It is getting a bit tiring to type all those 'gradlew' commands though. Batch files go!
That's much simpler.

Also, Main class is overrated.

But wait! There's more! You can even remove the liberty runtime from dependencies!
It still works! God IBM tutorial sucks :D

I even tried removing more. If I touch the location of the application, however,
it runs, but it gives massive NullPointerException. I'd say that's not good.

### In summary

1. Create your basic gradle project.
2. Add 'war' plugin.
3. Add 'liberty' plugin as described in [#gradle_plugin](#gradle_plugin).
4. Add 'liberty' task configuration. [#ibm_gradle](#ibm_gradle) has a broken example
   that you can update using [#gradle_plugin_deeper](#gradle_plugin_deeper).
   The only things you need are config directory for server.xml file and bootstrap
   application name property to war.archiveName so you can refer to it in server.xml.
5. Create 'server.xml' in the server config directory. All it needs is 'application' tag.
   This tag should have location attribute set to ${property you bootstrapped}.
6. To have the application do stuff, add features & classes. [#how_to_deploy](#how_to_deploy)
   (server.xml example) and [#mr_baeldung](#mr_baeldung) should have you covered.
7. 'gradlew libertyRun' or 'gradlew libertyStart' (start runs in background).
