# Trying to setup SSO for a liberty application (from zero)

Links to various resources referred to (try [web archive](https://archive.org/) if down, should work for most):

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
##### [#localization](https://kerberos.mit.narkive.com/DYakl8d9/permission-denied-while-initializing-kadmin-local-interface)
##### [#open_your_heart](https://openliberty.io/docs/22.0.0.2/kerberos-authentication.html)
##### [#ibm_no_redemption](https://www.ibm.com/docs/en/was-liberty/base?topic=management-liberty-features)
##### [#im_the_captain_now](https://linuxize.com/post/linux-chown-command/)
##### [#ibm_security](https://www.ibm.com/docs/en/was-liberty/base?topic=features-application-security-20)
##### [#holy_trinity](https://en.wikipedia.org/wiki/Active_Directory)
##### [#mandela_effect](https://www.quora.com/Is-there-an-Active-Directory-equivalent-for-Linux-system)
##### [#slapped](https://web.mit.edu/rhel-doc/5/RHEL-5-manual/Deployment_Guide-en-US/s1-ldap-quickstart.html)
##### [#slapped_8](https://www.openldap.org/doc/admin26/quickstart.html)
##### [#not_so_apt](https://www.openldap.org/software/download/)
##### [#dummy_slap](https://linuxhint.com/openldap-beginner-guide/)
##### [#slut_network](https://www.youtube.com/watch?v=04pAiANkr_s)
##### [#old_but_bold](https://www.tecmint.com/network-between-guest-vm-and-host-virtualbox/)
##### [#wrong_linux](https://marcus.4christies.com/2019/01/how-to-create-a-virtualbox-vm-with-a-static-ip-and-internet-access/)
##### [#the_batman](http://manpages.ubuntu.com/manpages/jammy/en/man5/interfaces.5.html)
##### [#because_of_course](https://superuser.com/questions/1423959/ubuntu-server-fail-to-restart-networking-service-unit-network-service-not-foun)
##### [#ask_the_manager](https://askubuntu.com/questions/196640/how-to-change-ip-when-etc-network-interface-file-is-missing)
##### [#its_servers_fault](https://serverfault.com/questions/225155/virtualbox-how-to-set-up-networking-so-both-host-and-guest-can-access-internet)
##### [#open_your_slap](https://openliberty.io/docs/latest/reference/feature/ldapRegistry-3.0.html)
##### [#not_getting_started](https://spring.io/guides/gs/authenticating-ldap/)
##### [#slap_intro](https://www.openldap.org/doc/admin26/intro.html)
##### [#slap_account](https://www.thegeekstuff.com/2015/02/openldap-add-users-groups/)
##### [#table_of_death](https://docs.oracle.com/cd/E21043_01/oid.1111/e10035/schema_objclass.htm)
##### [#reading_a_book_he_says](https://stackoverflow.com/questions/15573108/ldap-bind-invalid-credentials-49)
##### [#aneurysm_overload](https://stackoverflow.com/questions/15768473/ldap-bind-invalid-credentials-49-again)
##### [#i_found_ramesh_guys](https://www.thegeekstuff.com/2015/01/openldap-linux/)
##### [#a_real_man](https://manpages.ubuntu.com/manpages/xenial/man5/slapd-config.5.html)

## Contents

### [1. Setting up a liberty server that works](#setting-up-a-liberty-server-that-works)
#### [1.1. Dear diary,](#dear-diary)
##### [1.1.1. Liberty in summary](#liberty-in-summary)
### [2. The journey to hell](#the-journey-to-authentication-hell)
#### [2.1. If it ain't broke, then how do you know you can fix it?](#if-it-aint-broke-then-how-do-you-know-you-can-fix-it)
#### [2.2. Virtual Machine Arc](#virtual-machine-arc)
##### [2.2.1. VM in summary](#vm-in-summary)
#### [2.3. Ubuntu Online](#ubuntu-online)
#### [2.4. Side story to share](#side-story-to-share)
##### [2.4.1. Shared folder in summary](#shared-folder-in-summary)
##### [2.4.2. HDD addendum](#hdd-addendum)
#### [2.5. Rising of the Gibberish README](#rising-of-the-gibberish-readme)
#### [2.6. Enter the slap](#enter-the-slap)
#### [2.7. Depression](#depression)
#### [2.8. Fire in the hole](#fire-in-the-hole)
#### [2.9. Test your slap](#test-your-slap)

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

I try all other commands listed with similar results. I think my user is not a principal
at all. Which begs the question, why is it even trying to pretend it is instead of,
dunno, giving me an error about it. Whatever. I'm so tired of this shit I take a nap.

I find another [page](https://stackoverflow.com/questions/60273441/kerberos-service-started-with-error-cannot-open-db2-database-on-ubuntu-18)
with some commands, but they don't seem to be related. I don't need a new realm,
I already got one. I just can't do anything with it. Restarting the service doesn't
do anything.

In an act of sheer madness I prefix sudo with all the commands and we finally get somewhere.
'sudo kadmin' doesn't work because it can't find root/admin (wait who the hell is root?)
'sudo kadmin.local' just works. Because of course it does. The command I tried was
the most inconsequential one (as far as I thought) - list_principles. But instead I'm
greeter with a list of 4 principals. None of which were my user or root. So how on earth
is this working???

Alright, so one of the principals is 'kadmin/admin'. So I try to use 'kadmin/admin' with
'sudo kadmin', but now it doesn't find the principal.

If I pass this into 'sudo kadmin.local' instead, and misspell it, it still works.
I don't get it. So anything and everything works if I use .local regardless of principal.
Nothing works without .local regardless of principal. Also I hate them for using that
word because I keep misspelling it as 'princip**le**'.

I read about it in [#localization](#localization), but it doesn't give much explanation.
It seems like 'kadmin' is intended for modification of the database file, which I assume
contains information about principals. 'kadmin.local' is some sort bypass for that which
just allows you to do whatever you want. As long as you run it with 'sudo' and that works.

Fine. Let's not get ahead of ourselves. We figured out how to make it work.
Let's return to [#ubuntu_kerberos](#ubuntu_kerberos) and proceed onwards.

So I use 'kadmin.local' to hack straight into the database and add the 'goodlike' principal.
But wait. I have to set the password? What? Why would the person on the server set the
password for the user? How does that make any sense? I mean, luckily, I'm both the server
and the client, so it works, but how is this supposed to work normally? Is the practice
something like "generate random password and give it to the user so they can change it later"?
I would assume you'd automate that away if that was the case... Well, whatever. Let's go.

For the sake of security (lol) I use the same password as for everything else in this project.
Principal. Created! Cool, can I, uh, do anything with it? Probably nothing in 'kadmin'.
Let's continue.

'sudo kinit goodlike' almost sounds like a spell to banish the Necronomicon. I almost missed
sudo again, because, like I said, this guide was written by geniuses who think replacing
'sudo' with '#' in their notes is a good idea. Anyway, I enter the password and nothing happens,
which I think means something happened, and it just didn't tell me. Well, one way to find out.

'sudo klist' actually lists my ticket, nice. I'll note that if you inspect the guide extremely
carefully, there's blocks of text that actually technically tell you how to do everything in
detail. And by detail I mean you can't tell that's what they do at a glance, which makes them
pretty bad. And they **still** replace 'sudo' with '#' in those. Only by collecting the
puzzle pieces from everywhere else do I now understand that's their purpose. Still, now
that we made it so far, surely we can blitz through the rest of it, right? Right?

'sudo kadmin.local -q "getprinc goodlike"' works too. Looking good.

The next section seems to deal with keytab creation. This piques interest, as keytab seemed to be
a key configuration in whatever the hell those other projects did to make this shit work.
It's a file that's supposed to be under 'kerberos' folder in the config. So encountering it here
makes sense.

It seems that it's a sort of a database containing username-password pairs in whatever weird
format Kerberos does things in. Or something. So given this knowledge, let's try to guess.
If I create this file and put it into a system that knows what Kerberos is, it will automatically
take these pairs and forward them to Kerberos for authentication, maybe? Something? Wishful
thinking probably. But let's try to make one and see what we can make from one.

One more note that disturbs me though: changing keytab file when passwords change. That doesn't
seem very configuration-like. Oh well. Maybe if you do something you don't have to change it.
Whatever.

We're using 'sudo ktutil' which seems to rob the terminal of its control, somehow. Anyway, I almost
forget 'sudo' *again*. Thanks guide. I enter these commands:

'add_entry -password -p goodlike@GOODLIKE.EU -k 1 -e aes256-cts-hmac-sha1-96'

'add_entry -password -p goodlike@GOODLIKE.EU -k 1 -e aes128-cts-hmac-sha1-96'

They might seem like they're exactly the same, but actually one of them is 'aes256' and the other
is 'aes128'. They seem to relate to the keys printed by 'getprinc goodlike' earlier. Some kind
of encrypted shenanigans.

I think it's safe to say that 'ktutil' is a builder. We called #addEntry twice and now we need
to call #build. Like this: 'wkt goodlike.keytab'. This build the file in working directory,
I guess. Then we enter 'q' to escape ktutil's grasp.

Hey guess what! I forgot 'sudo' on the next command again! 'sudo klist -kte goodlike.keytab' prints
the shizz. As expected.

'sudo kinit -k -t goodlike.keytab goodlike' also works, although prints nothing.
'sudo klist' shows information. What the guide people didn't expect is that I would run it *before*
'sudo kinit' as well as *after*. Thus being able to see the difference and determining that
calling 'sudo kinit' also refreshes the ticket. Using the keytab file instead meant I didn't
have to use the password. Which makes perfect sense. So if somebody is calling 'sudo kinit' logic,
but like a client, they can use the keytab file instead of a password. I wonder if we can hook
this damn file to Liberty somehow, that'd be amazing.

Things have started to calm down, so I reviewed some of the process so far. Turns out that
I had misspelled 'kadmin/admin' as 'kadmin/kadmin' (can you blame me) when running the 'sudo kadmin'
program too. This explains why it didn't work. It doesn't explain how it's supposed to work, because
I tried the **ONLY** password I used in **EVERY** circumstance and it still was wrong. Fuck it.
I'll just hack away with 'sudo kadmin.local' like a pleb. If I even need to do anything else anymore.

Now, before we return to [#spnego_sad](#spnego_sad) or any similar resource, let's try to just
hook normal authentication through Kerberos. That seems like a logical idea.
Particularly with our track record, if something doesn't work, I'd like to flush it out now
rather than getting distracted for a week again.

First non-IBM page I encounter is [#open_your_heart](#open_your_heart). It seems to relate specifically
to some sort of *open* implementation of liberty. It can't be something all that different, because
it seems to use the familiar format in configuration. That being said, there's no knowing if
this will work or not with what I'm doing. It does give some hints, like features being able to use
Kerberos credentials. In their example, a database connection is configured that way (I think).

That's not quite what I need, but we can try to investigate all possible features we could
add to server.xml. Maybe one of them will be so obviously related to authentication, we will
be able to use Kerberos with it. Plus, I can compare this to existing working configuration
in other projects.

IBM seems to have a list, but that's it. It's literally a list: [#ibm_no_redemption](#ibm_no_redemption).
It fails to elucidate anyone to anything about any of the features. Great.

Clicking on random features I notice that they link to config elements, such as [kerberos](https://www.ibm.com/docs/en/was-liberty/base?topic=configuration-kerberos).
I guess this means that configuration for kerberos once will work for everything.
I'll note that this config is usually attached to SPNEGO in working examples that I do have,
so adding this element won't be the end of it by far, but it's a good start :D

We could try adding this element, even if it would be ignored due to lack of a specific
feature which uses it, but we need a .conf file first. From my examples it seems like
a client version of the .conf file we saw back when setting up a server. But of course,
none of the properties are explained. So I won't be able to confirm or verify if I got it
right or not. Not unless we find a feature that uses Kerberos first.

From working examples, 'appSecurity-2.0' seems like it could work. Let's go with that.

But not so fast! Ubuntu is not quite ready to give up yet. The keytab file was created
by root, so I have no rights to it, because of course. I guess I have to take ownership of it
somehow first.

Looks like [#im_the_captain_now](#im_the_captain_now). Simply 'sudo chown {user} goodlike.keytab' works.

My shared folder now comes in handy. I can move the file through it. Fun fact: the link
on explorer now just works, so I don't have to go all the way around through 'other locations'.

So, I run the application, it installs the mother of all features first, creates a keystone,
LTPA.keys and an SSL certificate. All under 'defaultServer/resources/security/'. Nothing about
Kerberos though. And clicking the link for my application does not ask me for a password.
Well, that was a bit much to expect, I suppose.

In a twist of fate, [#ibm_security](#ibm_security) actually does contain some info.
I need to setup a user registry of some kind. I assume in my examples the LDAP takes care of that,
and we don't have nothin' here.

I can't seem to find any resources online that would help. The impression I get is that
far from being anywhere near done, we need to setup a bunch of framework shenanigans.
It might be time to shelve Kerberos progress for now and proceed onto Active Directory/LDAP.

### Enter the slap

The network on my PC continues to deteriorate. Long loading times.
Multiple DHCP problems. Just a random network death.
But! I did get a message from my network provider that they will be doing some maintenance!
So who knows. Maybe there's still some hope.
Remind me to reset my hardware come tomorrow morning.

[#holy_trinity](#holy_trinity) tells us all about Active Directory.
The first thing that immediately pops out is the extreme focus on Windows.
That's strange. After all, when I was installing Ubuntu it offered to install
something or other called "Active Directory". If it was something exclusively
related to Windows, surely that would not be possible. Surely the installation
would just offer me some other equally bizarrely named linux alternative.
Is this a case for the Mobius chair to explain how there are actually two
active directories all along?

At least we can see the familiar faces like LDAP and Kerberos mentioned here.
Although I'm not very happy when it says "Microsoft's version of Kerberos".
I'd be pretty mad if my linux setup was all a wild goose chase.

At first I thought my problem was that I was reading wikipedia.
Or that I had just recently waken up from a headache induced nap.
But it seems that everyone agrees on AD being a Windows thing.
This is some serious [#mandela_effect](#mandela_effect) bullshit.

Fuck it! We will trust this random person on the internet and put AD aside.
Let's focus on setting up LDAP. Whatever that looks like.

According to [#slapped](#slapped) I need to start off by installing OpenLDAP.
That's the key to LDAP in linux. They even provide links for more details
if things go south. Let's get started!

I just gotta do that 'sudo apt install openldap' and... it doesn't work.
Admittedly, that is not a command that I've been tasked to run, so I can't
exactly blame them. On the other hand, if the command that I should have to run
is so specific, it baffles me why it was not provided explicitly...

So, 'openldap' package does not exist. I guess it's time to consult the
[#slapped_8](#slapped_8).

"If you intend to run OpenLDAP Software seriously,
you should review all of this document before attempting to install the software."
Why so serious? I'll just ignore that.

Immediately we're sent to [#not_so_apt](#not_so_apt) to download things.
Normally, I'd love this shit, but I'm trying to get this done on a linux VM here.
What happened to all the slick one liner programs that just magically install shit?
Wasn't that part of the appeal? I feel like my illusion has been shattered.

In my stupor, I click on the first download link which is in USA, but it downloads
very fast anyways. It's kinda small, actually.

I continue following the advice from [#slapped_8](#slapped_8).
I extract the archive, then start reviewing the text files.
The license seems OK. But I still don't understand a lot of the things mentioned
there. Maybe I need a quick "openLDAP for dummies" first.

This search leads me to [#dummy_slap](#dummy_slap) which does contain apt commands.
Well, why didn't you say so in the first place? Let's follow this instead.

I think it's the first guide that I don't have many problems with as it actually
tries to go through things step-by-step instead of making massive leaps of logic.
The only complaint I could give is lack of a general explanation what am I looking
at, ideally at every step. Still, a massive improvement over, uh, literally everything.
Especially IBM. Like, is there some sort of admin mafia, who, if you make a good guide,
roll up to your front porch at night and dump some dead hard drives on your lawn?

I perform the 'apt update' and 'apt upgrade' as asked. This downloads a bunch of stuff
which then prompts the computer for restart. Let's do that and proceed.

'sudo apt-get install slapd ldap-utils -y' runs successfully. It asks me to enter
the password twice, and we continue to use the same password just in case.
And no, it's not 'password'.

Now 'sudo systemctl status slapd.service' on the other hand prints a bunch of gibberish.
It also locks me from the terminal. I had to escape using the CTRL+C trick.
In any case, it seems that this gibberish means things work.
I test the same command by appending 'z' to the end, which prints rightfully that
no such servicez could be found.

'sudo dpkg-reconfigure slapd' part goes almost as described.
I choose 'goodlike.eu.local' for my domain name. Yikes.
For the organization I went with 'goodlike_incorporated'. Big yikes.
Then all proceeded as expected, but I never got to choose a database backend.
I would just follow the instructions anyway, so that's fine by me.

'sudo slapcat' prints a lot less than expected, but I suppose that's fine too.
Seems like just generic info about what was just configured.

'sudo systemctl status slapd' does indeed report an active status.

'sudo nano /etc/ldap/ldap.conf' opens what passes for a text editor in linux. Eew.
No thanks. I'll just find the file in a directory and edit it with notepad equivalent.
At least I can escape by using CTRL+X.

Uh oh. The file refuses to be saved because I don't have permissions. Lovely.
Don't you just love when you can't do basic things like editing text files on your computer?
And, of course, if you use some arcane and decrepit way of editing via console
it will definitely work. Just add sudo and it'll work. Why can't it "just work"
normally then? Rubbish. I'm deleting this VM as soon as I am done.

I change the ownership of the file and then edit it again from scratch.
I'll note that both the default file and the example use port '666' to illustrate.
But the instructions tells me to use port '389'. We'll stick to instructions, I guess.

And finally, the last step 'ldapsearch -x'... doesn't work. Predictable.
I tried to change back the ownership of the config file to root just in case,
but it doesn't seem to be the problem.

The problem is that the LDAP server cannot be contacted. Which, I suppose, makes sense.
I've been entering all kinds of URLs that don't exist anywhere.
Maybe I should try using exact IP address or localhost in config.

Good news! Localhost works! So we have successfully identified the problem.
I suppose instead of using localhost it would be prudent for me to find the IP
address so I can connect to this thing from outside the VM. I assume that localhost
will not, in-fact work for connecting to the VM from outside. But maybe it would.
There might be additional problems down the line, but let's hope not.

I found the IP address by calling 'ifconfig -a'. I had to install it first by calling
'sudo apt install net-tools'. Using this exact IP also works instead of localhost.
Hurray!

This does bring up a prudent question. Can I even connect to the VM from my PC?
Uh oh. Ping definitely doesn't work, although it might be [fixable](https://stackoverflow.com/questions/18278409/cant-ping-a-local-vm-from-the-host).
Then again, ping might be too "outside network" specific, for all I know.
Then there's also stuff like firewalls to consider... ugh...
This hydra sure feels like it'll never run out of heads.

### Depression

I've started feeling physically sick from all the bullshit that I have to deal with here.
And that's after having some days off recently.

It seems that the default configuration for the network in VirtualBox is 'NAT'.
Haha, so funny, it's almost "NOT", which is quite an apt comparison.
Sure, it'll get you connected to the internet. But you can probably already do that.
On your host machine. The connection between the VM and host is much more interesting.

I've looked over a few videos and other resources. I'll link relevant ones promptly.
The impression I get is that there's all kinds of different ways to set things up
depending on your situation. For example, this here [video](https://www.youtube.com/watch?v=jdOHJ0NZ47M)
uses a bridged adapter instead of NAT. This seems to make the VM a full fledged entity
on the network, perhaps even getting its own IP address from DHCP out there, or something.
Which is crippling enough to make the guy in the video have to use his personal router
configuration to set a static IP address, or something. I dunno, I was feeling too sick
to continue watching.

The [#slut_network](#slut_network) video uses 'internal network', which I don't know
what or how it does, but it magically works. Neat, right? Except it's a video on Windows
VMs, so I've no idea how to put it to use or if it would magically work on Linux.
At least I'll keep the IP address scheme as a memo. It's easy to remember, because it
has 168 in it. And 168 is easy to remember because that's how many primes there are
less than 1000. Commonly known, I know, but I thought I'd mention it anyways.

[#old_but_bold](#old_but_bold) features a guide on setting up exactly what we need.
The problem is, it's using a completely different, possibly outdated version of VirtualBox.
None of the windows in their screenshots seem to exist anymore.
All I learned from that is to put the non-NAT network adapter first.
And that's not even right, as all that achieved is fuck my NAT adapter IP, causing all
the existing config I had done to break. Thankfully, it's as easy as setting it back
to its original place and it works again.

[#wrong_linux](#wrong_linux) gives another glimpse into possible convoluted GUI options
for VirtualBox. This one seems more up to date, as it refers me to 'Global tools'.
No such thing I'm afraid, but 'Tools' does exist, and one of the options there is
in fact 'Network'. Due to previously messing around, an adapter already exists,
although I can't seem to change its name. I disable DHCP and enter the magic IP
'192.168.1.1' as well as mask '255.255.255.0'. Don't forget to apply changes!

Unfortunately the rest of the guide is for CentOS 7, which is apparently a different
Linux version. So different, in fact, that they put their configurations in different
places in different ways. Great. Excited to be working with you guys.

So Fedora-like Linuxes use '/etc/sysconfig/network-scripts/'. What does Ubuntu use?
Apparently it depends on who you ask. There's [this](https://ubuntuforums.org/showthread.php?t=783101)
and [this](https://askubuntu.com/questions/320537/where-is-the-equivalent-of-etc-sysconfig-networking-devices-directory-in-ubunt)
and also just [#the_batman](#the_batman).

But wait! [#old_but_bold](#old_but_bold) part 2 seems to have some similar configuration
in one of those places! Eh, what the hell, let's give it a shot.

To start off, we must edit '/etc/network/interfaces' which notably does not exist.
Since it doesn't exist, I can't give ownership to myself of it. Leaving me with no choice.
I foolishly decide to try out using Vim! Kill me now. Please. Just end this misery.
Can you guess, can you just imagine the procedure you must follow to save a file with Vim?
Oh, it's no big deal. Just press escape, then type ':w', then Enter. Obviously.
What else could it possibly be? That just makes sense. Everyone knows that.
Did you know that adjoining the fifth root of unity to the field of rational numbers
also automatically adjoins the square root of 5? Yeah, it's basically the same type of
knowledge, I know.

So anyway, I manage to save the file '/etc/network/interfaces' with random inputs in it.
Then I change the ownership of the file so I can edit it with a sane program.
Then I copy paste and adjust the file contents as instructed. They end up like this:

     auto  enp0s8
     iface enp0s8 inet static
     address  192.168.1.2
     network  192.168.1.0
     netmask  255.255.255.0
     gateway  192.168.1.1
     dns-nameservers  8.8.8.8  192.168.1.1

Notably, I use 'enp0s8', as 'enp0s3' is the first network adapter which I left as NAT
for internet access. Then the IP is just the next available IP address after the one
I entered in the VirtualBox settings. Network could anything, so I left its suffix as 0.
Gateway and netmask are just the VirtualBox settings. Dns-nameservers is whatever the
hell it is, but I changed the one IP address to match the gateway as in the example.
Oh, and 8.8.8.8 is the public google DNS service. No idea why that pops up here out
of nowhere. But it may as well stay.

Surprise! 'sudo systemctl restart networking' doesn't work! Networking.service not found!
That's great news. I'll just restart the VM and pretend I didn't see that.

And if we call 'ip add' after restart... it doesn't work. Well, 'ip add' works.
But the IP address is nowhere to be found. I'm guessing something to do with the
networking.service not being found.

And before you even ask, no, changing the owner to 'root' does nothing.

Turns out the service has changed its name in newer Ubuntu versions [#because_of_course](#because_of_course).
'systemctl list-unit-files | grep -i network' reveals that I had to use
'sudo systemctl restart NetworkManager' after all.

Of course, that does nothing. The IP address is still nowhere to be found.

The next day I am greeted with a question. Is my network home or public?
That's the usual windows crap. It is quite a random timing.
Could this be a portent of something else? Who knows.

First and foremost I try setting the 'host-only' connection as the first one
and 'NAT' as the second one. It doesn't work - same as before.

My biggest suspicion about the whole process so far has been
the lack of existence of the 'interfaces' file to begin with.
[Something](https://askubuntu.com/questions/1276847/looking-for-etc-network-interfaces-is-missing)
has changed when Ubuntu updated to version 20 or something.
And no, moving the file to 'netplan' directory doesn't work.

The answer seems to be [#ask_the_manager](#ask_the_manager). By running the command
'nm-connection-editor' we get a 'Network connections' window with both connections.

They are numbered according to the VirtualBox settings, so I edit the appropriate
one's settings. In the settings there is a 'IPv4 Settings', which allows me to choose
'Manual' method for IP address. Then I add the IP settings that I had previously
configured in the 'interfaces' file here. Notably, I didn't have to add network mask.

After I save the settings, the network automatically 'connects', whatever that means.
You can see it in the top right network icon, actually.
I close the settings windows and now 'ip add' correctly prints the IP address.

However, if I ping from the host machine, it's still unreachable. Same the other way around.
I guess firewall is next?

### [Fire](https://www.youtube.com/watch?v=r32LcBqiv7I) in the hole

It asked me about my network being public or private again! Jesus! Get a clue!

[#its_servers_fault](#its_servers_fault) gives some insight on how to setup the firewall.
The issue is that it thinks only VM to host connections would have the firewall problem
in the first place. But I obviously have issues with it both ways.

Well, I setup the exception exactly as explained, putting in the IP addresses that I used
instead of the example ones. It doesn't achieve anything.

I decide to investigate 'ipconfig /all' to see if everything is OK on this side, and it
sure seems so. Except that my DHCP lease had been acquired mere 20 mins ago and is to
expire in 10. This might explain the random questions about the network type.
Clearly DHCP was not co-operating as usual, so I perform my usual 'reset' procedure:

    netsh winsock reset catalog
    netsh int ipv4 reset reset.log
    ipconfig /flushdns

I restart the computer and check ipconfig again... to see it has gone completely mad.
VirtualBox confirms this. The IP mask changed to 255.255.0.0 and the IP address is
completely random. Yet it is statically set in VirtualBox. WTF? DHCP still disabled btw.
I guess I'll reset it to original values and run the VM again.

OK... so... it works now. Pings go both ways. No idea which part, if any, of this actually
fixed this LOL.

With that in mind we have our new 'IP' address, so we better update Kerberos and LDAP
to actually use it.

Changing '/etc/ldap/ldap.conf' is easy enough. Finding where the place where Kerberos
put my 'localhost' inputs is a bit harder. I think it would probably work anyways, but
using localhost just doesn't sit right with me. Anyway, this [page](https://social.technet.microsoft.com/Forums/ie/en-US/26823611-786b-4ec8-bdaf-1f565dd7d68a/how-do-i-change-the-realm-name-used-during-kerberos-authentication?forum=winserver8gen)
here tells me there might be a 'krb5.conf' file out there somewhere. And it is.
'/etc/krb5.conf' to be precise. I update the IPs to '192.168.1.2' and hope it works.
'sudo kinit goodlike' and 'sudo klist' seem to still work, so we'll proceed.

Of course, changing the 'goodlike.conf' file in this project still achieves nothing.
But hey, it's progress!

### Test your [slap](https://www.youtube.com/watch?v=juaunbIGCcw)

During my lunch break, an e-mail arrived, oddly addressed to nobody.
"I have detected security problems with your computer.
Please tell me when you're at the office so I can come to your computer and fix this.
I will only take 5 minutes." Oh yeah? You think you got me fooled?
I see right through your indian scammer ways! Reported for phishing.
Let the company figure that one out.

So next I'm gonna try to either hook up LDAP to liberty, or at least test that it works
somehow. All I have to go with for configuration is [#open_your_slap](#open_your_slap),
which admittedly uses very similar XML to what I can see in working projects.
The problem is, half of the things don't really make sense to me, which makes sense
in of itself, since we've just setup LDAP and didn't actually learn anything about it
or do anything with it.

Like, what are baseDN & bindDN? Whose password is bound? There are different LDAP types?
The last one seems to be just fine as 'Microsoft Active Directory'. I base this entirely
on this [example](https://github.com/Azure-Samples/open-liberty-on-aro/blob/master/3-integration/aad-ldap/src/main/liberty/config/server.xml),
as it's for openLDAP.

There's a Spring guide on [#not_getting_started](#not_getting_started). Unfortunately
it's a guide for situations where you already know everything about LDAP, so it's
useless to me. Kinda hard to find an actual raw example, to be honest. Everyone kinda
insists on hooking on their own technology for demonstration, making things even
more cryptic than they were originally.

I mean look at [this guy](https://www.youtube.com/watch?v=0FwOcZNjjQA) trying to explain
this shit. Doesn't event take 3 minutes to devolve into some kind of weird ApacheDS
server bullshit. I don't even think it's the guy's fault, this shit is just that
convoluted you can't explain it otherwise. String theory was easier to understand than this.

Also, as an aside, this is but one of [many](https://www.youtube.com/watch?v=QyhNaY5O468)
attempts by the same guy to explain it. It really is that ridiculous, isn't it.

Let's start off by creating "an account" in LDAP, whatever that means.
[#slap_account](#slap_account) seems like a guide, but immediately it asks me to create
gibberish-ridden files. If I create an account, but have no idea if I did it properly,
that's useless. I'll have to use [#slap_intro](#slap_intro) to try to decode what in the
fuck is going on here.

Now, let's set aside 'LDIF', as I cannot see any mention of it in the intro.
I can however decode this: 'dn: uid=adam,ou=users,dc=tgs,dc=com'
Supposedly that's what passes for a username in LDAP system. Gloriously fucked.
Well, this 'adam' is kind of the real username, and the rest of the values
are something like an inverted directory? Soooo '/com/tgs/users/adam' is a good approximation.
Of course, they're using something more like a "readable" URL format, so maybe
'adam.users.tgs.com' is closer to what they were going for. But nobody (sane) would
create APIs like that either. 'tgs.com/users/adam' is the sane(r) version of such an idea.

Give the examples that [#slap_intro](#slap_intro) provides, I think it's safe to assume
that the 'dc=', 'ou=' and 'uid=' are just made up. Well, they *do* stand for something
specific, but I have to assume they are just 'conventions' decided by some grand long
forgotten architect of this system.

On the other hand, looking at the [RFC](https://www.rfc-editor.org/rfc/rfc4514.txt),
it says these are X.500 attribute types. That still doesn't necessarily mean that they
aren't "made up", just that perhaps they were "made up" at the X.500 level.

For reference, when I say "made up", I mean that I could replace references to them
in all configurations and everything would continue working. I would consider this to be
**CRITICAL INFORMATION** that **SHOULD BE INCLUDED UP FRONT AND CENTER** but alas,
unless I'm willing to dig through cryptic RFC bullshit, I won't know. And at this
point the only interaction I want to have with RFC is through my shotgun, which I
do not yet have. It's a blocker, so no can do. Let's wait for the next release.

So how in the bloody hell should I know how to adapt this username idiom to my LDAP
case? Looking back, we already have a user 'dc=goodlike,dc=eu,dc=local', so perhaps
we can prefix some random bullshit and it would work. Let's go with this:
'uid=eve,ou=users,dc=goodlike,dc=eu,dc=local'

Next we have a list of 'objectClass'. According to the [#slap_intro](#slap_intro),
it defines what attributes are required for the entry. So basically it's like a JAVA
interface. Nice. This gives a little more insight on what exactly we're doing here.

It seems like LDAP is just a weird and convoluted database along the lines of [elasticsearch](https://www.elastic.co/).
I use this as an example because I have (some minor) experience with it.
All that is associated with the 'username' is a map of keys & values, which can be
explicitly defined by this 'objectClass', of which there can be multiple.
The obvious followup question is, what the hell does this have to do with authentication???
Usually data (such as pairs or keys & values) is something you authenticate *for*, not *with*.
Either some shit is seriously fucked, or we're off to one of the greatest tangents YET.

Behold, the [#table_of_death](#table_of_death). It lists a bunch of these classes,
naturally, all defined in some RFC or another. In any case, we can try and glimpse
into what the suggested object classes do.

'top' seems to be something like a JAVA equivalent of Object. The "top" class.
I know it's not in the table, but you can find it hidden at the bottom of the page itself.
Now, the page we're referencing **is** using Oracle specific bullshit, but I think
at least to some degree they have to be adhering to the things defined in RFCs, so
maybe we can glean some kind of minor understanding.

For example, because these classes are defined as part of Oracle Identity Management system,
the "top" class seems to have a lot to do with passwords'n'shit. So irrespective of whether
this is Oracle using the concept of these classes to satisfy their insanity, at least we can
say with certainty that it is possible to define a set of keys for objects such as those in
LDAP that could be used to store information in some way related to authentication such that
it can then be used as part of some identity management system. I would be much happier
knowing, for example, that this **is** the intended purpose and doing anything else with
this system is purely dumb, unsupported and liable to get you slapped across the face by
any and all senior administrators in 500 yard radius. I would be even more happier if some
sorry person would, you know, write that shit down in a bloody guide about LDAP for
beginners. So either it is **NOT** the case, and this LDAP thing **CAN** and **HAS BEEN**
used in whatever way whoever decided at whatever juncture, or everyone just sucks at
explaining shit properly. You know what's the worst? Given the state of various "documentation"
I've read over my relatively short carrier, it's a bloody coin-flip on which it is.

It's like the Schrodinger's cat. Every single thing I read about this stuff only continues
to propagate the bloody wave function instead of collapsing it, making it ever more increasingly
confusing as to what the actual state of the thing I'm trying to understand actually is.
At some point the cat will have hypothetical babies and I still won't know if it died or not.

The next object class is 'account'. Sounds reasonable enough, what it do? According to [RFC](https://datatracker.ietf.org/doc/html/rfc1274#section-8.3.3),
it seems to basically add a user id and some metadata. But we have a problem here.
You see, there is no 'userid' key in the [#slap_account](#slap_account) example.
I mean, sure, there's 'uid' which OBVIOUSLY is supposed to refer to the user id.
But the RFC clearly says 'userid'. So, on one hand you could say that the name of the
attribute is probably "made up" by everyone who ends up using it. On the other hand,
if that's the case, then how on earth would you ensure the attribute exists if you want
to follow the RFC requirements? Does each LDAP implementation provide their own attribute
names for compliance with RFC? Do they just not comply with RFC? Does some future RFC
I don't know of expand the definition and this is just an outdated version? Is RFC even
important??? The ~~dream~~ world is collapsing. Great.

Let's investigate the next one, 'posixAccount'. This leads us to a different RFC that is
somehow also rebelling against itself in [this example](https://datatracker.ietf.org/doc/html/rfc2307#appendix-A).
Clearly the example shows "uid" instead of "userid", so I guess we can just trash the
previous RFC because it was drunk.

Actually it seems that "uid" is pulled in as required by 'posixAccount' itself.
So technically it could be entirely unrelated to "userid". Because of course.

One thing that seems prudent to note is the requirement for a 'home directory'.
This seems to be equivalent to the "user home folder" in the OS. Makes me wonder,
if I had installed "Active Directory" when I installed Ubuntu, would that have created
this "database" somewhere with an entry which would have my username and this property
which would be set to my home directory which would then be used by OS somehow.
Since I'm not at all familiar with the internals of any OS, this isn't so much helpful
as stalling for time daydreaming so the day ends sooner, but still nice to think about.

It does seem like I have to make a revision on LDAP being a database, as this whole
Active Directory thing seems like the actual database. The line between the two is
so blurry to me, I may as well be watching Japanese porn. And I'm a practitioner of OOP
anyways, so "the way to use something" to me is the same as "something" anyways.
So I guess I'll continue calling LDAP something it probably isn't when I mean AD.
If I even understand anything at all, LOL.

Looking back to [#slap_account](#slap_account), even they use "LDAP directory".
So I'm totally not alone on this. Hurray! What's 'shadowAccount' btw? Uh... no idea.
It looks like an account... with 'shadow' prefix to everything. Given how 'posixAccount'
seems like a "real" thing, not "made up", I guess this is also a thing? Whatever.

My point is, what the hell are we doing here? How on earth am I supposed to set this up?
So I need to have an account on the linux VM? And then use the information from there?
Or am I supposed to use the LDAP system as my account management system, and then set this up?
Which comes first? Chicken? Egg? Ham? Cranberry juice? Fuck it. I'll just use my existing
account and see what happens. What's the worst that could happen, amirite?

We need to adjust our previous approach and change the username to
'uid=mumkashi,ou=users,dc=goodlike,dc=eu,dc=local'.

What the hell is a [mumkashi](https://www.youtube.com/playlist?list=PLh0Ul3zO7LAhPnJh-SF59Le5Ui1NDEXU1),
you ask? It's become my standard go-to nickname when 'goodlike' is taken. Yes, indeed.
It is at this point that I reveal that I am, in fact, an esteemed video game developer
whose game even has been played on youtube once! Amazing. If my game needed LDAP, I'd
have just ended myself then and there.

So let's see, we should be able to fill the file this far:

    dn: uid=mumkashi,ou=users,dc=goodlike,dc=eu,dc=local
    objectClass: top
    objectClass: account
    objectClass: posixAccount
    objectClass: shadowAccount
    cn: mumkashi
    uid: mumkashi
    uidNumber: ???
    gidNumber: ???
    homeDirectory: /home/mumkashi

The rest of the attributes seem to be optional according to RFC, so we'll go with that.
The issue is that we need two random numbers to fill. I wonder what they're supposed to be.

'uidNumber' is "An integer uniquely identifying a user in an administrative domain".
'gidNumber' is "An integer uniquely identifying a group in an administrative domain".

Cool, so I guess I can just enter whatever number I want? How about 13? and 37? Let's go
with those. Respectively.

So now that I have 'mumkashi.lfid' file, I should add it to LDAP somehow. But we have
a problem immediately. The suggested command is weird:
'ldapadd -x -W -D "cn=ramesh,dc=tgs,dc=com" -f adam.ldif'

Let's ignore the fact it also starts with '#' which I assume means I need sudo.
Let's also ignore the single char options, I'm sure they're important.
Replacing 'adam' with 'mumkashi' is easy enough.
But who the fuck is ramesh?????

'cn' can be seen in [#slap_intro](#slap_intro) using an entirely different structure.
Where the hell did it suddenly pop in from? Can I just ignore it? I'm gonna ignore it.

So I enter 'sudo ldapadd -x -W -D "dc=goodlike,dc=eu,dc=local" -f mumkashi.ldif'
and it asks me for LDAP password. No idea which password is that supposed to be, but
luckily I used the same password FOR EVERYTHING just in case this would happen, so
we should be fine. Except we're not fine because it gives an error.
'ldap_bind: Invalid credentials (49)'. OK then.

Bruh, the first google search is [#reading_a_book_he_says](#reading_a_book_he_says).
Do we really need a book for this? Jesus Christ... Nothing in the response makes much sense
to me, but I tried out the "debug" command! It did print a lot more gibberish this time.
I could even see that it connected to LDAP server, AND sent the password in plaintext!
Hurray! Still doesn't work.

Look, irrespective of this being the right thing to do or not, or even relevant or not,
I still want to at least be able to do it, such that I could at least attempt to verify
the relevancy of it all. And, as it stands, I can't, because it doesn't fucking work :D

New week, new [#aneurysm_overload](#aneurysm_overload). The last answer in particular
is just *beyond* horrifying. "It may be the configured password, but not the loaded one!"
That is not a sentence that should exist in this universe as a result of any system.

In any case, I notice a trend of having some file being configured. 'slapd.conf' they call it.
I don't recall adding anything specifically like that to any configuration, but honestly
at this point my memory might just be failing me to protect my mind from the horrors
I had to experience. Either way, if we configure this file with "credentials" like
the "username" we use in our ldapadd query, things might start working. Might.

Looking through the comments in the [#slap_account](#slap_account) page, it seems that
this guide is part 2 of another guide. I start looking for it by entering 'LDAP' into
the search bar. This produces a few pages with incomprehensible gibberish, and one page
with gibberish that looks familiar! That's right, [#i_found_ramesh_guys](#i_found_ramesh_guys)!
It seems that there is a link to this article in [#slap_account](#slap_account) too,
but it's misleadingly titled "install LDAP", when clearly you're going to both install
AND configure it in this article. Well, at least we found it, eventually.

So, since we've already installed LDAP, we can skip to the configuration!
Except we can't. Because it doesn't work.

We're supposed to edit file '/etc/openldap/slapd.d/cn=config/olcDatabase={2}bdb.ldif',
but no such file exists. To be precise, '/etc/openldap/' directory doesn't exist.
Which, I suppose, implies the installation is not complete, at least not as far as
this guide is considered.

The installation command 'sudo yum install -y openldap openldap-clients openldap-servers'
doesn't work either. Command 'yum' not found. But not so fast!
By sheer coincidence during the last few days I stumbled upon [this video](https://odysee.com/@SomeOrdinaryGamers:a/please-stop-using-windows...:f)
which gives a bit of an explanation. As we've seen before, there are different
distributions (a weird word for 'types' or 'kinds') of linux. But it wasn't enough
for them to make the linuxes different, they also made the installation programs
different. Gotta style on those other tribes somehow, you know.

In other words, as long as I replace 'yum' with the equivalent of whatever the hell
installs things into Ubuntu, I should be fine. And we've had some things installed
using apt, so surely that should work. Except it doesn't, because it can't find any
of the packages. Great.

We've actually run into this exact issue before, so I consult the archives (by the
archives I mean this README). Yes, right, [#dummy_slap](#dummy_slap) told me to install
using 'apt-get'... but it used completely different package names ('slapd' for example).
Using the ones from the 'yum' command just doesn't work. They just don't exist. They're
gone. They're not present. Their presence cannot be detected. Looking for them is a waste
of time. The configuration of particles in this universe fails to include the pattern
which would allow them to exist.

After a short break to snack and slack, I decided to search for the file manually.
This did not function as an activity. The 'olcDatabase' just can't be found.
This is where [#a_real_man](#a_real_man) comes in. I couldn't install 'slapd-config'
using 'apt-get' either, but the folder the page references exist already, so maybe
I already did it somehow. Let's hope that's the case.

'/etc/ldap/slapd.d/cn=config/' actually exists too, and it even contains 'olcDatabase'
files! Oddly enough, though, then aren't 'olcDatabase{2}' files. There's 'olcDatabase{0}',
'olcDatabase{1}' and even 'olcDatabase{-1}'. They all have suffixes different than
what's expected too. So I guess I'll just have to create a new file myself.

So I create '/etc/ldap/slapd.d/cn=config/olcDatabase{2}bdb.ldif' and put this line in:

    olcRootDN: cn=ramuh,dc=goodlike,dc=eu,dc=local

Ramesh just wasn't doing it for me, so we went full final fantasy instead.

Next, I call 'sudo slappasswd', which unexpectedly does not open [this page](https://www.pornhub.com/video?c=4).
Instead we have to enter the password twice, which then prints us the following hash:

    {SSHA}mcGzfWeCOIwPVFHRUvu7lQJGKPZ2mHpv

For the record, the password I've been using is 'uzakashi', which is fairly obvious pair
keyword to 'mumkashi'. Just thought I'd save you the effort of trying to crack this thing.
I also assume 'sudo' was not really needed, as this doesn't seem to actually change anything,
but the instructions included '#' and who am I to disagree. I'm just trying to make sense here.

Next I edit '/etc/ldap/slapd.d/cn=config.ldif' and append this line to the end:

    olcRootPW: {SSHA}mcGzfWeCOIwPVFHRUvu7lQJGKPZ2mHpv

Next step... let's see... back to the 'bdb.ldif' file. Ugh, why not just fill it out at once?
Every time I have to go into the '/cn=config/' folder it asks me to enter the damn password
over and over again. And this is even after I gave the folder to myself via 'chown'! Blasphemy!
Anyway, I add the following line, which seems to be the last change for now:

    olcSuffix: dc=goodlike,dc=eu,dc=local

And what's this? Next we must run 'sudo slaptest -u'! Have we finally reached the part where
the title of the chapter makes sense? My God...

Anyway, it doesn't work. Checksum error. Then the explanation of the error has nothing to do
with any checksum as far as I can tell. Great start.

Oh! Well, I've figured out the 'checksum' error. In '/etc/ldap/slapd.d/cn=config.ldif',
the first few lines are dedicated to something of a warning message:

    # AUTO-GENERATED FILE - DO NOT EDIT!! Use ldapmodify.

Followed by what I assume is the checksum of the file itself stored in itself. But wait.
Wouldn't storing the checksum inside the file... change the file? I'm not even gonna try
to figure this one out. Maybe they take checksum of everything AFTER these lines. Whatever.
This definitely isn't enough to distract me from the fact I was just following a guide
that told me to do something I shouldn't. AGAIN.

I return the file to its original form and attempt to use the confounding 'ldapmodify'
command. It asks me to enter the password. I enter the password. I get invalid credentials error.
You know, the same error for which we embarked on this journey for in the first place.

Riddle me this, Batman.
1. I want to add an LDAP account.
2. But I can't, because I don't have an administrative account to use 'ldapadd'.
3. In order to create such an account I need to modify 'cn=config.ldif' file.
4. But I can't just manually modify the file, because that breaks the CRC32 checksum.
5. I have to use 'ldapmodify'.
6. But I can't, because I don't have an administrative account.

THEN WHAT THE HELL AM I SUPPOSED TO FUCKING DO????? Who made this garbage ass system?
Why doesn't it come pre-configured with some basic bullshit you could change later?
What is wrong with these people???
