# Then
Sweet tiny syntactic sugar for Kotlin initializers.

Kotlin implementation of [devxoul/Then](https://github.com/devxoul/Then)

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

## License

**Then** is under MIT license. 