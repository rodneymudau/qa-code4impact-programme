# Code4Impact QA Automation Demo

A small Selenium + JUnit 5 project for the Week 5 automation sessions.

## What's in this project

One test, `LoginTest.java`, which:

1. Opens saucedemo.com in Chrome
2. Logs in with `standard_user` / `secret_sauce`
3. Checks that the Products page actually loaded

This is the exact test referenced throughout the Week 5 Student Guides — the
line-by-line code walkthrough in the Day 2 guide, and the "predict, then
modify a variable" exercises in both days' homework, all point at this file.

## How to run it (student steps)

1. Open this folder in IntelliJ IDEA: **File → Open**, then select the
   `qa-automation-demo` folder.
2. Wait for Maven to finish loading — watch the bottom status bar. This
   downloads Selenium, JUnit, and WebDriverManager automatically; it can
   take a few minutes the first time.
3. Open `src/test/java/com/code4impact/tests/LoginTest.java`.
4. Click the green ▶ arrow next to `validLoginSucceeds` (either in the
   gutter or on the method itself) and choose **Run**.
5. Watch Chrome open on its own, log in, and check the result at the
   bottom of the screen — green means Pass.

## Requirements

- Java Development Kit (JDK) 25 — the latest Java LTS release — Eclipse Temurin recommended
  (adoptium.net)
- Google Chrome installed — WebDriverManager downloads the matching
  ChromeDriver automatically, so there's no manual driver setup
- IntelliJ IDEA Community Edition (free)

## Why WebDriverManager is included

Normally, Selenium needs a separate driver file that matches your exact
Chrome version, downloaded and pointed to manually. WebDriverManager
handles all of that in one line (`WebDriverManager.chromedriver().setup();`),
which removes a common beginner stumbling block — one less thing to
explain or debug in a room full of first-time coders.

## Notes for facilitators

- This is the file the Week 5, Day 1 live demo runs, and the file the
  Week 5, Day 2 "annotated test" section walks through line by line.
- If you edit this file (different locators, a different site, extra
  tests), update the Week 5 Day 1 and Day 2 Student Guides, Facilitator
  Guides, and Slides to match — several of them quote this exact code.
- To demo a Fail live without editing the file permanently, change the
  `password` value to something wrong, run it, then change it back.
