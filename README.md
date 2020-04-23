# Then
[ ![Download](https://api.bintray.com/packages/bitsecho/maven/then/images/download.svg?version=1.0.2) ](https://bintray.com/bitsecho/maven/then/1.0.2/link)

Sweet tiny syntactic sugar for Kotlin initializers.

Kotlin implementation of [devxoul/Then](https://github.com/devxoul/Then)

## Usage

Initialize TextView **then** set its properties.

```kotlin
val textView = TextView(ctx).then {
    text = "Hello"
    textSize = 16f
    setTextColor("#000000".toColorInt())
}
```

This is equivalent to:

```kotlin
val textView = TextView(ctx)
textView.text = "Hello"
textView.textSize = 16f
textView.setTextColor("#000000".toColorInt())
```

## Installation
```gradle
implementation 'com.bitsecho.util:then:1.0.2'
```

## License

**Then** is under MIT license. See the [LICENSE](LICENSE) file for more info.