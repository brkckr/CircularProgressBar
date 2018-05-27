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

	dependencies{
	        compile 'com.github.brkckr:CircularProgressBar:1.0.0'
	}


## Attributes
By default, release-it is interactive and allows you to confirm each task before execution:

On a Continuous Integration (CI) environment, or by using the `-n` option, this is fully automated. No prompts are shown and the configured tasks will be executed. This is demonstrated in the first animation above. An overview of the default tasks:

Name | Description | Type | Default | Range
:--|:--|:-:|:--|:-:
Ready (confirm version) | N/A | N/A | - | `Y`
Show staged files | N/A | N/A | `prompt.src.status` | `N`
Git commit | `src.commit` | `true` | `prompt.src.commit` | `Y`
Git push | `src.push` | `true` | `prompt.src.push` | `Y`
Git tag | `src.tag` | `true` | `prompt.src.tag` | `Y`
GitHub release | `github.release` | `false` | `prompt.src.release` | `Y`
npm publish | `npm.publish` | `true` | `prompt.src.publish` | `Y`

## License

MIT
