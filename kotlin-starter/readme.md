## When face error like this again, here is the solution

vannyezha@uwu:~/project/android/kotlin-starter$ gradle run

FAILURE: Build failed with an exception.

* Where:
Build file '/home/vannyezha/project/android/kotlin-starter/app/build.gradle.kts' line: 9

* What went wrong:
Plugin [id: 'org.jetbrains.kotlin.jvm', version: '1.5.0'] was not found in any of the following sources:

- Gradle Core Plugins (plugin is not in 'org.gradle' namespace)
- Plugin Repositories (could not resolve plugin artifact 'org.jetbrains.kotlin.jvm:org.jetbrains.kotlin.jvm.gradle.plugin:1.5.0')
  Searched in the following repositories:
    Gradle Central Plugin Repository

* Try:
Run with --stacktrace option to get the stack trace. Run with --info or --debug option to get more log output. Run with --scan to get full insights.

* Get more help at https://help.gradle.org

## Solution
bash gradlew run