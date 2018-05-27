<h1 align="center">
  <br>
  CircularProgressBar
</h1>

<h4 align="center">Another circular ProgressBar attempt :bowtie:</h4>

![screenshot](https://media.giphy.com/media/kiXrZMOlSBM9GGP1Sv/giphy.gif)![screenshot](https://media.giphy.com/media/2xPJBmvMDLYRmsdt80/giphy.gif)

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
cpbState | State of the Progress Bar | Enum | clockwise | clockwise or counterclockwise
cpbProgressValue | Progress's Value | integer | 0 | 0 to 100
cpbProgressColor | Color of the Progress Bar | Color | Color.BLACK | -
cpbProgressWidth | Width of the Progress Bar | Dimension | 8dp | -
cpbBackgroundColor | Bg Color of the Progress Bar | Color | Color.GRAY | -
cpbBackgroundWidth | Width of the Background | Dimension | 4dp | -

## License

MIT
