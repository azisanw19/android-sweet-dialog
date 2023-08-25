# Sweet Dialog

An android lib that provide dialog

<img alt="Logo" src="image/Dialog.png" />

# Getting Started

### Add the JitPack repository to your build file

For Gradle with the Groovy language

```groovy
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

For Gradle with the Kotlin DSL language

```kotlin
dependencyResolutionManagement {
    ...
    repositories {
        ...
        maven { url = URI.create("https://jitpack.io") }
    }
}
```

# Add the dependency

For Gradle with the Groovy language

```groovy
	dependencies {
	        implementation 'com.github.azisanw19:android-sweet-dialog:Tag'
	}
```

For Gradle with the Kotlin DSL language

```kotlin
    dependencies {
        implementation("com.github.azisanw19:android-sweet-dialog:Tag")
    }
```

# Documentation

See the [documentation](https://github.com/azisanw19/android-sweet-dialog/wiki) for examples and general use of Sweet Dialog.

# Contributing

Please open an issue first before making a pull request. Pull requests should be accompanied by tests if possible.

# License

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

> http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.