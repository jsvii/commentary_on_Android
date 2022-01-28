# Jetpack

Jetpack 是一个由多个库组成的套件，可帮助开发者遵循最佳做法，减少样板代码并编写可在各种 Android 版本和设备中一致运行的代码，让开发者精力集中编写重要的代码。

Jetpack 包含一系列 Android 库，它们都采用最佳做法并在 Android 应用中提供向后兼容性。

```groovy
dependencies {
    def lifecycle_version = "2.2.0"
    implementation "androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version"
    implementation "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version"
    ...
}
```

## ref

- [JetPack应用架构指南](https://developer.android.com/jetpack/guide?hl=zh-cn)
