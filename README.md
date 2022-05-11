# Trying to setup SSO for a liberty application (from zero)

Links to various links referred to (try [web archive](https://archive.org/) if down):

##### [#ibm_basic](https://www.ibm.com/support/pages/websphere-liberty-developers)
##### [#ibm_gradle](https://www.ibm.com/docs/en/wasdtfe?topic=projects-developing-liberty-gradle-plug-in)
##### [#gradle_plugin](https://github.com/OpenLiberty/ci.gradle)
##### [#gradle_plugin_deeper](https://github.com/OpenLiberty/ci.gradle/blob/main/docs/libertyExtensions.md)
##### [#how_to_deploy](https://riptutorial.com/websphere-liberty/example/25243/deploying-a-simple-application-on-the-command-line)
##### [#mr_baeldung](https://www.baeldung.com/intro-to-servlets)
##### [#spnego_sad](https://www.ibm.com/docs/en/was-liberty/base?topic=liberty-configuring-spnego-authentication-in)
##### [#mad_dog](https://www.techtarget.com/searchsecurity/definition/Kerberos)
##### [#not_on_windows](https://www2.microstrategy.com/producthelp/Current/InstallConfig/en-us/Content/installing_kerberos_authentication_service.htm)
##### [#i_dont_wanna_go_back_to_university](https://uit.stanford.edu/service/ess/pc/docs/kerberos)
##### [#ibm_kerberos](https://www.ibm.com/docs/en/sgklm/4.1.1?topic=server-configuring-kerberos-stand-alone-windows)
##### [#the_void](https://serverfault.com/questions/561536/setup-kerberos-on-windows-7)
##### [#ubuntu_tryhard](https://ubuntu.com/blog/how-to-upgrade-from-windows-7-to-ubuntu-installation)
##### [#black_ubuntu](https://forums.virtualbox.org/viewtopic.php?t=98281)
##### [#vm_list](https://www.parallels.com/tips/virtualbox/alternative/)
##### [#vm_ubuntus](https://www.blackdown.org/best-linux-distros-for-virtualbox/)
##### [#dynasty_warriors](https://lubuntu.net/)
##### [#it_was_aliens](http://manpages.ubuntu.com/manpages/bionic/man1/alien.1p.html)
##### [#ubuntu_kerberos](https://linuxconfig.org/how-to-install-kerberos-kdc-server-and-client-on-ubuntu-18-04)
##### [#entirely_unrelated_but_fun](https://www.youtube.com/watch?v=PwY-jVSM-f0)
##### [#sharing_is_caring](https://helpdeskgeek.com/virtualization/virtualbox-share-folder-host-guest/)
##### [#i_cant_believe_youve_done_this](https://superuser.com/questions/1319503/shared-folders-not-appearing-in-media-in-ubuntu-guest-on-oracle-virtual-box)
##### [#who_needs_gui_anyway](https://www.techrepublic.com/article/how-to-install-virtualbox-guest-additions-on-a-gui-less-ubuntu-server-host/)
##### [#thats_kinda_small](https://www.howtogeek.com/124622/how-to-enlarge-a-virtual-machines-disk-in-virtualbox-or-vmware/)
##### [#join_the_partitions](https://fedingo.com/how-to-resize-partition-in-ubuntu/)
##### [#bad_faith](https://stackoverflow.com/questions/35333503/client-not-found-in-kerberos-database-while-initializing-kadmin-interface)

## Setting up a liberty server that works

### Dear diary,

I didn't know shit, so I google'd some stuff and found some of the links above.
Others, well, I found them along the way.
Before getting started, I copied over a gradle setup from a different personal project
and cleaned it up. This took some effort because things never quite work out of the box
with old software, but with some finessing, I was able to get gradle 6.9.2 to work.

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
What can I say. Software engineering works in mysterious ways.

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
What doesn't make sense is why does the port of the URL which points to my servlet
ignores this configuration. What's it even for then???

I remove it completely with no consequence. Next you'll tell me I didn't need JSP either???
Thanks a lot, [#ibm_gradle](#ibm_gradle). Useless.
I suspect that if we didn't have a servlet it might have had some use, but we do, so fuck it.
I'll add it if I need it later.

It is getting a bit tiring to type all those 'gradlew' commands though. Batch files go!
That's much simpler. Also, Main class is overrated.

But wait! There's more! You can even remove the liberty runtime from dependencies!
It still works! God IBM tutorial sucks :D

I tried to remove even more configuration. However, if I touch the location of
the application, I can get it to run, but it produces a massive NullPointerException.
I'd say that's not good.

#### Liberty in summary

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
7. 'gradlew libertyRun' or 'gradlew libertyStart' ('start' runs in background).

## The journey to ~~authentication~~ hell

### If it ain't broke, then how do you know you can fix it?

Let us begin with a quote from [#spnego_sad](#spnego_sad):
"Liberty **supports** SPNEGO for IWA but **not Kerberos** and NT LAN Manager (NTLM)."
Emphasis mine.
Setting aside the fact that half of the words in it are made up or make no sense,
I have it on good authority that SPNEGO and Kerberos works with Liberty.
Where, do you ask, have I procured such divine knowledge? Oh, it's just **the task that
was assigned to me**. Because **some other projects did it**.

Look, it's entirely possible I've been bamboozled by my colleagues who know even less
than I do about the subject. But regardless, that's not what you want to see when you
open the first page about the thing you're gonna do. I'll just pretend it's a figment
of my imagination for now, and go forward, recklessly. You know, even more recklessly
than following IBM tutorials *apparently* is.

It doesn't help that there are not one, but **TWO** bloody links that say "Kerberos"
under the "SPNEGO" subsection, on the left. This is just a gift that keeps on giving,
isn't it.

The first step asks us to create a *Kerberos* service principal name, SPN for short.
Normally I don't like acronyms, but in this case I don't understand the meaning of
the full words anyway, so I guess it doesn't really matter, does it.
In any case, this means we need Kerberos next! Let's step away from IBM for a moment, then.

Well, well, well! Turns out Kerberos isn't a *thing*, it's a protocol! In other words,
it's a bunch of things. Each with their own acronym and stuff. If you do not value your life
you are free to go read up on it at [#mad_dog](#mad_dog).

If I understand correctly, and I don't, we need a couple things running on this here machine.
Like, a ticketing service and authentication service. Which may come bundled, honestly.
That only makes sense. But let's not get ahead of ourselves. Look! A guide how to install
Kerberos server [#not_on_windows](#not_on_windows). I hate my life.

Here's the thing. It feels like Kerberos is often mentioned with Windows in the same sentence.
Well, it really isn't, but nonetheless, windows uses Kerberos somehow. Maybe I don't need
to install it. Or maybe windows can install it for me. Let's just hope that won't be
a broken ass installation that will not be configurable or something. Regardless, I will
pursue this quest tomorrow.

I start the next day by shaving my massive beard and busting out some fried bread.
Now you know it's serious, you know it's personal.

On the installation front, we have [#i_dont_wanna_go_back_to_university](#i_dont_wanna_go_back_to_university)
which, with my admittedly limited knowledge, looks like a package installation for
specifically that university's version of Kerberos. Whatever that even means.

It looks like it has nothing to do with the server side of things, instead it's
somehow the client side of things. Usually when you have a protocol, you don't NEED
a client. Like, imagine needing a client to send HTTP requests. And I know, I know,
everyone uses a browser, which technically is a client, but that's for convenience.
All I'm asking here for is some honesty about what exactly is it that you're asking
me or any other poor person to install.

What if we look for specifically server installation? Uh oh. [#ibm_kerberos](#ibm_kerberos)
pops up. Just to give you some perspective on what we're dealing with here. Other pages
when sent to [web archive](https://archive.org/) just say they take a snapshot.
Every single IBM page has never ever been snapshot. That should tell you everything
you need to know about the travesties we're about to face here.

Looking over the steps, they first ask to create an Active Directory setup.
But just to be sure, I check further in. And of course, it's some IBM specific thing.
"IBM Security Guardium Key Lifecycle Manager server" they call it. Well, I don't have that.
Probably. I just have a computor. With windows. 7. NEXT!

Hey! It's my long lost brother speaking to [#the_void](#the_void)!
Excellent to see how many resources are out there!
There's so many it's hard to choose one from them :D

Well, if we're gonna need a virtual machine, it may as well be linux.
I can't imagine the configuration on the liberty side would be any different
because of the OS of the machine the Kerberos server is running on.
And ultimately, that's the goal of this whole shebang.
I do hope we can get away with not running multiple VMs though...

### Virtual Machine Arc

*cue the music, you know the one*

Last time, Goodlike finally succeeded in defeating Libertto in the grand martial tournament.
But before he could receive his award, a three-headed dog alien snatched it from right
under his nose.
To defeat this new menace, Goodlike will have to train in the Virtual Machine Chamber,
which eats away at all the time that it takes to get inside it before you even notice.
Let us begin this episode of Dragon Ball VM with a flashback.

I vaguely recall having no luck whatsoever with running a VM on this computor over here.
And when I don't have luck with something, I purge it from existence.
Therefore we must start from the beginning. Again. I found this website:
[#ubuntu_tryhard](#ubuntu_tryhard).
They are just obsessed with people migrating from windows 7, but they do reluctantly
offer advice on how to run it on a VM. That sounds good enough.

As an aside, my download hard-drive (so, the hard-drive where downloads go by default)
is getting quite full. All those videos downloaded with [youtube-dl](https://github.com/yt-dlp/yt-dlp)
are starting to take a toll, if you catch my meaning. Thankfully it's just about enough to
fit the latest Ubuntu ISO. Hurray!

[VirtualBox](https://www.virtualbox.org/wiki/Downloads) is the next step.
Their website says something or other about only older versions supporting certain
features. Well, I haven't been told anything about which features I would need or not,
so latest version it is.

Uh oh. There's some network feature that we probably need if we are to have any hope
of using our VM as a Kerberos server. I've actually had a lot of problems with my
network connection. From time to time it just refuses to consume DHCP responses.
DHCP is, uh, I guess since it ends with 'P', a protocol? Uh, it's how your computer
gets its IP address. You send out a DHCP message (of some kind) into the world.
The DHCP server, I guess? It, uh, sends back a message with an IP address you can use.
But then you have to respond with an acknowledgement that you're gonna use the IP address.
It's something like that.

This process is considered 'leasing' the IP address for a little while, so you kinda
have to keep pinging the server every now and then for an extension. If you don't,
you lose your IP & the network connection drops until the process is restarted from
beginning.

Well my stupid network adapter tries to renew the bloody thing... but when it gets
the response, it pretends it didn't. So it just spams the server a few times and
gives up for a while. It repeats this procedure at intervals until the lease expires.
Then it has to restart the process from the beginning, and now that it's not an extension
of the lease, correctly handles it and restores the connection.
Doesn't sound that bad, right?

Well, setting aside spontaneous disconnections from *everything*, at some point
the DHCP server has had enough of my adapter's shit and just stops responding altogether.
Then the connection disappears until that server has calmed down.

My process of fixing this has been along the lines of 'delete or disable everything
related to networking that you don't need' and 'do not install anything that touches it
or anything related to it whatsoever' and finally 'if all else fails, reset IP stack
and restart the computer'. The first 2 steps seem to have significantly reduced the
rate of these events. From sporadic to barely once a month, if that. The last step
has successfully prevented any issues in the few remaining cases.

The point of this aside is, great, now something might fuck up my network.
I just love installing shit that can fuck up my network. Lovely.

Installation has succeeded, so far. I'm following the steps. Unfortunately they are not
specific enough. For example, when creating a virtual hard drive, you actually have
3 options. VDI, VHD and VMDK. I guess I'll just stick to defaults and see what happens.

Dynamically allocated! 10 GB! 1GB RAM! Let's go!

It seems that the optical drive was already created by default. Huh.
I can't seem to find a way to select the Ubuntu ISO, so I just start the machine.

Immediately it tells me to select the thing to put into a drive. Good boy!
Now that's more like it! I keep clicking add buttons until I can select it in files.

Aaaand it crashes. Immediately. VT-x is disabled in the BIOS for all CPU modes.
Sounds pretty familiar, probably the thing that prevented me from doing the VM
thing before. But let's keep going.

[Stackoverflow](https://stackoverflow.com/questions/33304393/vt-x-is-disabled-in-the-bios-for-both-all-cpu-modes-verr-vmx-msr-all-vmx-disabl)
graciously provides an answer that actually works too this time!
Suspicious... if it's as easy as enabling some option in BIOS that has "virtualization"
written next to it, sounds like a lot less than it would take to stop me from
trying it... hmm...

This time the virtual machine launches successfully. BUT! Not so fast! It asks me
to select a boot option, and I select "Try or install Ubuntu". Then it leaves me with
a black console screen. I know it's linux, but surely it can't be THAT bad? Ugh.

Time to try some of the things suggest by [#black_ubuntu](#black_ubuntu)!
Setting the OS to 64-bit and giving it 128 MB VRAM? No dice.

What if we raise the RAM to 8GB and give it an extra processor? That's illegal!
Or at least invalid. Some other option has to be enabled, a notification says.
I/O APIC. Not quite epic, I see. Well, does it work? No.

Turn ON accelerate 3D graphics, despite the comment saying "no, don't!" No effect.

Logs just kinda stop after I get the install selection. Nothing happens, until I shut it down.

I try every option under the sun. No effect. Time to change the approach. If everything is
failing, then maybe the option I am choosing is wrong!

Ubuntu (safe graphics) does not work.
OEM install (for manufacturers) does not work.
Test memory... uh... well it gives me something. It starts running something that looks like...
like a... like a... test! Imagine that.

I ran memtest86 for 20 minutes. Nothing.

There's some hint that some windows feature might be enabled, called Hyper-V that's
stealing the glory of VM. I can't find anything in the logs to indicate that, but hey,
might as well grasp at straws.

And straws they are, as I can't even SEE the features as expected in control panel.
I get a blank box. The fix from [windows tips](https://www.wintips.org/fix-windows-features-list-blank-or-empty-windows-7/)
doesn't work. Well, the first one. I suppose there's 2 more?

SFC /SCANNOW found no problems in safe mode! Woweeeeeee!

What about KB947821 update? Bupkis. All 1GB of useless junk that gets stuck in
"initializing" stage. With no good way to fix it. Nothing I'm about to bother doing, anyway.

I can't be the only person thinking this now: we really need a second opinion.
That's right! Let's try a different VM software and see if we get similar results!

First on the [#vm_list](#vm_list) is VMware Workstation Player. Latest version doesn't work.
Well, it might work somewhere, but this is Windows 7. It needs Windows 8.
Why would you need something that's consigned to forgotten history? Nobody knows.

How about a previous version? Well, the earliest they offer is 16.0.0, and it also
requires Windows 8. Hurray.

Any older versions? Definitely doesn't seem like it. But I did stumble upon this
[page](https://docs.vmware.com/en/VMware-Workstation-Player/15/rn/player-15-release-notes.html).
It's an old feature page which had an uncanny part referring to, and I quote,
"New Guest operating systems support" followed by a list containing "Ubuntu 18.04".
It strikes me that I've been trying to get the LATEST Ubuntu to launch as VM, but
what if some weird shenanigan is preventing that from working? I mean, at some point
I would've gone and tried a different version of linux anyway, so I guess this is as good
an excuse as any.

On a whim I decided to try googling for "best ubuntu for VM", which led me to
[#vm_ubuntus](#vm_ubuntus) and the glorious top leader [#dynasty_warriors](#dynasty_warriors)
Ubuntu version. What could possibly go more wrong than it already has?

Well, for starters, the link to the download of the latest version juuuuuust might
respond with HTTP404. For no reason. Great start! Is there anything in this world left
that just works, for goodness sake???

Their older versions seem to not work either. But there's torrent links, that could work!
But then... it doesn't! Well, technically, it did open just like the normal Ubuntu.
But it also gave me a message! "This kernel requires an x86-64 CPU, but only detected
an i686 CPU." So it's unable to boot and tells me to use the correct kernel.
Which is what I thought I did. But apparently, I have i686 CPU. Whatever the fuck
that is.

I don't think that's the problem. There's some weirdness with how this is going.
Some random google search suggests that's a 32-bit architecture. I picked a 32-bit
architecture at start, because I couldn't find 64-bit, but changed it later.
Perhaps that change was invalid or ignored somehow? Hmm...

Remarkably, restarting the process and picking 64-bit from the beginning
this time has allowed me to run Lubuntu without error (so far)!
Following this great success I use the same exact procedure to run the newest Ubuntu
as well. Seriously? That's all I had to do to fix it? Give me a break...

Looks like stars are starting to align. Installation is proceeding smoothly, and one of
the options even says "Use Active Directory". While I assume that's what we need for
Kerberos, I'm also gonna assume that's not what we mean by "we need it" and this is
just some extra stuff. In any case, it's a VM, I can just make another one if I have to.
So no Active Directory. Not yet.

While it's installing I'll clean up the other VM which had half started Lubuntu.
The truth is, I got an error half way through the installation, something about
hard drive being too small or whatever, and I thought, maybe Ubuntu won't do this to me.
And it didn't! Don't worry guys, I'll still seed the Lubuntu ISO. For a bit.

Looks like we have a working Ubuntu. Wow. Never thought I'd see the day!
Now the next question is, will it work enough to get Kerberos on it?
Find out tomorrow on the next episode of Dragon Ball VM!

*cue the music, you know, the other one*

#### VM in summary

 1. Before beginning, restart your PC and go into BIOS. BIOS is different for everyone.
 2. In BIOS, find the 'virtualization/VT-x' setting for CPU and enable it.
 3. Save the changes and restart your PC normally.
 4. Download an image of your favorite linux (.iso file), like [Ubuntu 22.04 LTS](https://ubuntu.com/download/desktop) or something.
 5. Download and install and run [VirtualBox](https://www.virtualbox.org/wiki/Downloads). I chose latest version at the time: 6.1.34 r 150626 (Qt5.6.2).
 6. Create a new VM config. 
 7. **Make sure you select the correct version in the first window (linux 64-bit in my case).**
 8. The other settings are probably fine, but you can also increase them. 10GB HDD in particular was pushing it in my case.
 9. Run the VM & make sure to select the downloaded .iso file to be inserted into the drive.
10. Install & enjoy.

### Ubuntu Online

Now that I'm in this whole new world of ~~fantasy~~ linux, I can start my life anew!
A brand new day marks a brand new adventure! That being said, the guide for [#not_on_windows](#not_on_windows)
seemed to be quite reasonable. At a glance. Perhaps all will be well.

*Morgan Freeman voice*: It was not all well.

By the way, on the network front, we only have minor signs of impending disaster.
Like, websites randomly broke twice yesterday. But let's not jump to conclusions.
That could've been anything.

Well, our first hurdle is to actually open the command line on ~~linux~~ Ubuntu.
You'd think linux would be like "here! open this! it's the thing!", but no,
I find no reference to it on the Ubuntu start screen.
Quick google search tells me it's CTRL + ALT + T.

I'm perplexed by the first command on [#not_on_windows](#not_on_windows) because
it seems to have very specific version information. But you know what, I've had
enough fiddling with things along the way, I'm following this bitch to the letter.

First hurdle: how to copy the damn command? It doesn't work between my PC and VM
out of the box. Looks like some [plugin](https://superuser.com/questions/42134/how-do-i-enable-the-shared-clipboard-in-virtualbox)
might be required. What if I just open the page in a browser inside a VM though?

Success! It took a little effort to find the page, as they also have their product
specific pages online, but I can copy the command now! Hurray! Except it doesn't work.

The command uses rpm, which I assume is a client for some place that you can download from.
Well, this fresh Ubuntu ain't got that. But at least it tells me this! And even tells me
how to install it! 'sudo apt install rpm'. It installs without a hitch.
So how about running the command now? It doesn't work.

First thing that rpm does is immediately reprimand me for doing something I don't know what it is.
'You should use Alien instead!' Oh yeah, I'll just take it up with the guys who wrote
the guide. I'm sure they can point me to an alien or two.

While at it, turns out there is no file named 'krb5-server-1.10.3-10.el6_4.6.x86_64.rpm'.
What a surprise, using exact version number in your guide, then removing that version,
breaks the guide.

Let's leverage our options here. Number one, I continue trying to follow a guide that
the very thing they suggest me I use warns me against doing. Number two, I try to follow
the instructions of my new polite AI companion/overlord. I'm leaning towards number two,
and it's because it has an Alien in it. At least it'll be, dunno, interesting or funny.

The first page I find on [#it_was_aliens](#it_was_aliens) seems to imply its some kind of
converter between types of packages, which I assume refers to the format in which
applications are stored so they can be installed into linux, particularly via command line.

Well, why don't we try running 'alien --to-rpm {that thing with the version and stuff}'.
Well, I'd love to, but my Ubuntu has locked the screen. Now, I remember the password,
but it would be really annoying to constantly get locked because I tab out to check
something elsewhere. It's a VM, who cares.

[Stackoverflow](https://superuser.com/questions/155881/how-do-i-prevent-ubuntu-from-putting-my-monitor-to-sleep)
suggests looking at the 'preferences'. What I found instead was 'settings'. Except they
don't fit all in the screen. You see, the VM by default is in a tiny screen.
Something like 640x480 or whatever. I guess we should at least make it widescreen before
we continue.

I right click the desktop and select display settings, which includes resolution.
It was actually 800x600. And the lowest widescreen is... 1280x720. Quite the jump. Oh well.
Somehow the 'x' which closes the windows is still partially offscreen, but I guess
that's not a big issue.

Interestingly enough, the screen options for locking are under the 'privacy' tab in settings.
I suppose it makes sense, as privacy would be one, if not primary reason to lock the screen,
but somehow I didn't make that connection logically as I was just browsing randomly.
Anyhow, we've got ourselves a lock-less screen! Success!

Unsurprisingly, our alien command doesn't work. Because alien was not installed either.
More 'sudo apt'! But, of course, it still doesn't work.

It complains about not running as 'root' and that the ownership of files might be wrong?
I guess that's just because I didn't prefix it with sudo. You know what, I'll just
prefix everything with sudo from now on. I'm sure that's a good and helpful idea and
doesn't break the security model that was intended whatsoever. Well, they should've
thought of it sooner.

But the fundamental problem is the same. There is no 'krb5-server-1.10.3-10.el6_4.6.x86_64.rpm'.
Therefore I assume we must find a new version. Maybe if I remove the version it will
figure it out by itself? Nope. That was admittedly probably too much to ask :D

Looking for something like a version, I find [#ubuntu_kerberos](#ubuntu_kerberos) instead.
This guide seems a lot more well intentioned than the previous one AND it doesn't have
random versions in it! Let's play along for now!

I'll note that they make a really poor decision when it comes to their approach.
If the command can be run either with administrative privilege or with 'sudo',
why not just 'sudo' prefix all commands that need the privilege anyway?
If you don't need 'sudo', you can just copy the command *after* sudo.
Right now, I'm copying commands after '#'. Whether it was '#' or 'sudo' would make
no difference to me, but it would probably be much easier to explain than a random
symbol. Just saying.

Running the install command succeeds, but we're met with an installation dialogue.
This is somewhat different than the previous guide, which explains the difference in
approach. I guess if you installed the package with 'rpm', you'd be manually configuring it.
Now that I installed it via 'apt', I have to deal with whatever somebody thought
would be a good wizard implementation for installation. At least the guide knows this
and gives us help, even with screenshots! Very nice!

I'm going to try to explain every step the way I understood it (oh boy).
This is in the interest of perspective. And maybe even learning something!

To begin, I assume that at the end of this wizard we should have a working
Kerberos server installed. It may or may not run, but it definitely can be started.

First we are asked for the default realm. Now what exactly is a realm?
Let us speculate based on an entirely surface understanding of the question :D

It seems like it's something like a common name for a grouping of services
that run under the same authentication setup. So, like, if I had REALM1 and
REALM2, APP1 could perhaps only be accessed under REALM1 and APP2 only under
REALM2. And any particular user, perhaps, would only have access to REALM1 or
REALM2. There seems to be a hierarchy for realms, along the lines of the
hierarchy of a hostname in a URL, but who knows what that implies.

The above is just a possible example of what could happen, I'm sure you can
configure it whatever which way. If I am correct, then you have to specify
which realm is the relevant one for the process of a specific instance of authentication.
Then the default realm would just be a stand-in for cases where users don't
specify one.

Sounds logical enough. In our case, we will have exactly one application, exactly
one setup for it and attempt to connect to it from exactly one client in exactly
one particular way. Which means we can probably always use this default realm.
That being said, it's probably not the case in actual production systems that
there's only one realm (or maybe it is, who knows?) In any case, I will adopt
a policy of at least trying to avoid 'default' value approach when configuring this
just in case.

For now, let's call this 'GOODLIKE.EU' by mimicking the guide. I hope I don't
*actually* need to own a domain to make this work...

Next up is the Kerberos server hostname. Well hold on just a cotton-pickin' minute!
I thought we're setting up the server right now. So the hostname would just be...
the localhost? Is it needed for someone else to be able to refer to it? It would
really help if I'd know what was the purpose for which I'm specifying the thing
you are asking me to specify.

Well, this is just a VM. We can always start fresh again. Or, hopefully, change things
if we get it wrong! So let's start with localhost, or maybe the IP address?
Eh, localhost will do for now.

Next is the administrative (password changing) server. I didn't even know Kerberos had that.
I thought it has the basic server and the ticker server. Which one is the administrative then?
Which one did we provide in the previous step then? Oh boy... well, in any case, the example
uses the same hostname, and it's not like I'll have multiple places to put this anyway.
Localhost again.

The next thing is just an info box which informs me that this only installs the tools
to run the server. Which is referred to as the master server. How does this fit in with
the other servers, e.g. ticket, administrative, etc.? Who knows.

It tells me that I'll need to setup a new realm later. Then why did you need the default
one? Just in case, I guess? The command to setup is 'krb5_newrealm'.

It finally tells me to read the fucking documentation in a README file found in
'usr/share/doc/krb5-kdc/' and the administration guide in the 'krb5-doc' package
which I guess just floats somewhere in the aether. Well, OK then, I will read those.
Maybe they will answer my questions! I will press OK for now though.

Installation succeeds! Does it work? I suppose we'll have to find out next time :D

### Side story to share

Before anything else, let me say, yes, network issues continue to occur.
Another page or two broke randomly. Only once though.
I even encountered the DHCP issue I described before once.
But it is still too soon to panic. Could be a coincidence.
Could be.

At work, I've been distracted by other matters and the fact we're moving office.
Just to a nearby building, but it's still something to consider and take time with.

But life finds a way. For my personal reasons, I needed to connect a shared
folder to the VM. Mostly to try something in linux.

You can probably guess how this goes. Yes, more pages to the web archive.

First I try to follow the guide [#sharing_is_caring](#sharing_is_caring).
Emphasis on try, as I am mostly skimming through it. This does not bode well.
For example, I immediately skip the part where they tell me to install
the guest additions CD. Who needs that, amirite?

Well, unsurprisingly, nothing works. I added the folder I wanted to share
to shared folders, and it is not shared. But, there's a problem even greater.
You see, far from being shared, I don't even know if it's shared or not.
Because the guide at [#sharing_is_caring](#sharing_is_caring) fails to inform
in any way, shape or form what the successful result of their process would
look like.

One might say, perhaps in their hubris they believe that their guide is so
flawless as to be impossible to not follow through successfully, after which
the fact of the matter of shared folder would be apparent.

One might also say, that is bullshit. You see, after I noticed this obvious
issue (not without going through every other folder in the VM first, sadly),
I consulted two [youtube](https://www.youtube.com/watch?v=KPtcGHDdcTk)
[videos](https://www.youtube.com/watch?v=9-teQnZ8LEY), second in particular
displaying how a successful shared folder should look like.
Now, I can't archive these (as far as I know), but the gist of it is,
you need to insert the guest additions CD and then **install** these additions.

While it is true that [#sharing_is_caring](#sharing_is_caring) mentions this
fact, they gloss over it by saying, "ah, autorun will take care of it".
Autorun did not, in fact, take care of it. I had to run it manually.

What to run manually, you say? Well, lets just consult the videos again...
Uh oh. The first video shows the person running a windows file.
Because their VM is Windows. Can't do that.

The second video... doesn't do that, because presumably they already did.
Or their version of VirtualBox is different and does not come with this
crippling limitation.

Well, maybe I can take a guess. How about 'VBoxLinuxAdditions.run'?
Sounds about right. It succeeds. I restart. I don't have a shared folder. Yay.

[#i_cant_believe_youve_done_this](#i_cant_believe_youve_done_this) is another
resource which mentions that I should expect the shared folder under /media.
It's not under /media. But the question is about fixing it, so I guess if I
follow the instructions, I should be good to go!

First, I need to install the additions. Already done that. Next step.

Second, I need to run the command 'sudo adduser {username} vboxsf'.
I run this command. It doesn't work. "The group 'vboxsf' does not exist."
Maybe I didn't install the additions after all :(

Upon further inspection, the answer contains a link to [#who_needs_gui_anyway](#who_needs_gui_anyway)
which reveals a secret additional step of running
'sudo apt-get install -y dkms build-essential linux-headers-generic linux-headers-$(uname -r)'
which supposedly will install the pre-requisites for running the actual .run file.
Either I'm being hard trolled right now, or some dummy really fucked up by
**not** adding that command to the run file. Or this is just stupid for some
other stupid reason.

I run the command. It doesn't work. "Bad substitution". Fine then. I'll just
type out the outcome of what I assume to be another command myself.

Finally the command succeeds, I proceed to run the .run file. I had to run it
with 'sudo', because it required admin privileges. Maybe that's why it failed
to achieve anything before. I think I would've noticed that, but at this point the only
thing preventing my rage from manifesting is the typing of the very sentence you are reading
right now, so maybe that has something to do with it. Maybe.

Looks like it is successful. It does tell me that I might need to run
'/sbin/rcvboxadd quicksetup all' to build some kind of modules for kernels.
No idea what's that about. I'll run it if things don't work.

Oh, a new problem. Low Disk Space! On filesystem root! Whatever. You're a VM.
Deal with it.

I restart Ubuntu. It restarts in the wrong resolution. That's a good sign :D
And still no shared folder on desktop. How about /media?

Before I even get there, the file explorer shows me "sf_shared", which is my
shared folder. But I can't access it because I don't have rights.
Wait. I remember something like that... wasn't there 'vboxsf' group?
Let's try that.

I added myself to the group! Yes! Finally! I can see the fo... it doesn't work.
Still does not give me access. Well, shit.

In frustration, I click the 'other locations' button where I can also see the
shared folder. But this time when I try to enter it, I am greeted with a password
prompt. So I enter the password and press enter... and nothing happens.
So I enter the password and manually click the button which is not 'cancel'
with my mouse... and it works! I can see inside the folder! Ye gods!

#### Shared folder in summary

 1. Run your VM, let it load.
 2. Select Devices -> Insert guest additions CD image...
 3. Even though it has '...', it will not open a menu, it will just insert the drive.
 4. Run console command 'sudo apt-get install -y dkms build-essential linux-headers-generic linux-headers-$(uname -r)'.
 5. If it fails, replace the $(uname -r) part with output from running 'uname -r' manually.
 6. Run 'sudo /media/{your username}/{Virtual Box CD name}/VBoxLinuxAdditions.run'.
 7. Restart your VM.
 8. Run 'sudo adduser {your username} vboxsf'.
 9. Open the file explorer, select 'Other locations'
10. Click on your shared folder, enter your password and enjoy.

#### HDD addendum

Because of the above, the HDD started running out of space.
Foolishly I pushed it to the absolute limit and the OS did NOT like that :D
It bricked, and upon restart would give me '/dev/sda3: recovering journal' error.
This was not ideal, so I set out to increase the HDD size.

First on the list is [#thats_kinda_small](#thats_kinda_small).
Thankfully the Virtual Media Manager allows me to adjust the HDD size under properties.
Problem solved!

Except it doesn't work. Because while the HDD is bigger, the partition which is used
by the OS is not. So nothing has changed.

Thankfully the process for increasing the partition is pretty straightforward.
I'm ready to [#join_the_partitions](#join_the_partitions) together.

I insert the Ubuntu .iso file into the VM. This causes it to be used instead of the
installation. I choose to try Ubuntu instead of installing it. That boots me right up.

I search for and launch GParted. It gives me some error about 'sda3' not using all
the space that it could. I agree to fix the issue which does nothing, as far as I can tell.

I right click on '/dev/sda3', which now I can see is the primary partition for
non-system files. 'sda1' and 'sda2' are reserved for that shit.
I choose the option to 'Resize/Move'. This presents me with a very neat UI element
which I can use to drag or adjust the size of the partition. I maximize it.

For some reason 1MB is still not allocated, even if I repeat the process. Oh well.
I apply the operation, which had remained pending. I am warned about possible data loss.
I proceed forward recklessly. Success? Let's find out.
I shut off the VM and restart. At some point the .iso was ejected automatically.

It works! And it even booted in the correct resolution again! Hurray!

### Rising of the Gibberish README

Early morning start today, trying to get something done for a change. *yaaaaaawn*

If I recall correctly, last time we installed Kerberos server by pressing random buttons.
More or less. Well, let's continue with [#ubuntu_kerberos](#ubuntu_kerberos).

Next step appears to be the new realm setup. I thought we had a default realm already.
Well, whatever. I enter the command and it outputs cryptic gibberish to me.

"It's much more important that your password is secure than that you remember it.
But if you forget it, you can no longer use the database or something."
That's some hardcode mixed messaging. Thankfully, we don't actually need our password
to be secure, since, you know, we're only setting up a toy here. I'll make it the same
as the 'sudo' password for simplicity.

"It is important that you NOT FORGET this password." Yeah, yeah. Whatever you say,
Mr. President. I enter the password, twice. More cryptic gibberish.

"You may want to create an administrative principal using the addprinc subcommand
of the kadmin.local program. Then, this principal can be added to /etc/krb56kdc/kadm5.acl ..."
You know, I vaguely recall being asked to read the fucking manual last time, maybe
I should spend some time on that. One last note before I go: it asks me to setup DNS
information. Yeah, right, I'll definitely do that with all those domains I don't have.

Well, I find the README file and... it doesn't work. It opens in some weird program
which just says that "resource is missing" or something. I forcibly open it with
a text editor. That works.

The first few paragraphs harp on about master and slave servers, so they are completely
irrelevant. There will be only one server. One.

For some inexplicable reason the README explains how to make your server less secure.
Because people have always suffered from that particular level of lessened security.
Bold move, but your problem is, this is planet Earth. No, seriously, how about explaining
more what the hell are you talking about???

My overall impression of the README is, this guy has no idea how to write a README.
Compared to my prowess, as displayed by this gigantic never ending wall of text, this
person has years of training to yet undergo. Pathetic.

All I've learned is that there's some config files that I might wanna "adjust appropriately".
Well, let's take a look at them.

The folder and even the file are protected by password (similar to shared folder).
I don't get the obsession with asking me to enter the password twice, though.
I don't mean, once for folder, then another time for the file, although that's a bit
of a bitch too. No, I mean, I literally have to enter it twice to enter the folder.
Come on. Give me a break. I'm so glad my password is weak, or else I'd be stuck entering
it for half a year here.

The config itself looks normal. By that I mean I cannot see any immediate shenanigans
that would make me cringe, and the rest of it looks like any other random config file
for random application you don't understand. I suppose a few of these properties are
somewhat parsable. But if I had to guess what the hell any of them do, I'd start commenting
them out and see what breaks. And I don't even know how to check if something is broken
yet. So I think I'll leave it alone for now.

Notably, I can't see any 'localhost' in here. That does not bode well :D

Next up, I edit the kadm5.acl file as described in [#ubuntu_kerberos](#ubuntu_kerberos).
That's just removing one '#', so pretty easy. I guess this is the list of usernames,
which they insist calling principals for some reason, which have admin access. Whatever
that give them. I'll keep it in mind. Goodlike/admin sounds pretty good :D

And of course, the next step is the setup for Kerberos client. I'm gonna go ahead and
try to setup it on the **same** machine as the server. What could possibly go wrong? :D

Uh oh. It says it is set to manually installed. What? I didn't get no prompts.
Now the prompts I'm supposed to expect are the same as the server ones. Maybe at the time
I was actually installing the client besides the server? That would be funny.
Let's pretend that's what happened.

With that step skipped, we go back to the server. Time to add a ~~username~~ principal!
There's just a small tiny issue. 'addprinc' is not found. Great.

Well, well, well, looks like my issue was that I was following the guide in good faith.
Should've gone with [#bad_faith](#bad_faith) instead. Apparently some commands have to
be executed under 'kadmin' command. Glad I've been informed of this. By someone else!@!

Ah, except the 'kadmin.local' command doesn't work. It authenticated me as my user/admin,
you know, the one I used as username when installing the Ubuntu itself. But then that
user gets denied access to the DB2 database. So what is happening? Do I already have
a {user}/admin principal? Or do I not have it, and that's why I'm denied permission?
