<h1 align="center">
  <br>
  CircularProgressBar
</h1>

<h4 align="center">Another circular ProgressBar attempt :bowtie:</h4>

![screenshot](https://raw.githubusercontent.com/amitmerchant1990/electron-markdownify/master/img/markdownify.gif)

## Summary

* LivePreview - Make changes, See changes
  - Instantly see what your Markdown documents look like in HTML as you create them.

## How To Use

To get a Git project into your build:

* Step 1. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

* Step 2. Add the dependency

```
dependencies {
   implementation 'com.github.brkckr:CircularProgressBar:1.0.1'
}
```

## Attributes
By default, release-it is interactive and allows you to confirm each task before execution:

On a Continuous Integration (CI) environment, or by using the `-n` option, this is fully automated. No prompts are shown and the configured tasks will be executed. This is demonstrated in the first animation above. An overview of the default tasks:
  <attr name="cpbState" format="enum" >
            <enum name="clockwise" value="0"/>
            <enum name="counterClockwise" value="1"/>
        </attr>
        <attr name="cpbProgressValue" format="integer" />
        <attr name="cpbProgressColor" format="color" />
        <attr name="cpbProgressWidth" format="dimension" />
        <attr name="cpbBackgroundColor" format="color" />
        <attr name="cpbBackgroundWidth" format="dimension" />

Name | Description | Type | Default | Range
:--|:--|:-:|:--|:-:
cpbState | - | - | - | -
cpbProgressValue | Progress's Value | integer | 0 | 0 to 100
cpbProgressColor | Color of the Progress Bar | Color | - | -
cpbProgressWidth | - | - | - | -
cpbBackgroundColor | - | - | - | -
cpbBackgroundWidth | - | - | - | -

## License

MIT
