## Android - Test example with Calculator App using Ruby

This sample provides a test-unit based test that can be imported in any Ruby IDE such as RubyMine.
Below are listed the steps to go through to run your first test.


### 1) Download the calculator App from GitHub

Download the Calculator App from the Sample-Apps repository: https://github.com/testobject/Sample-Apps/tree/master/Android

### 2) Upload the app on your TestObject dashboard

- log in to the TestObject platform on https://app.testobject.com
- click on the Android/iOS App button
- upload the apk file you have just downloaded
- you can set the name and the version of your app in the next dialog box
- keep the default settings for now
- choose the options "Automated Testing" and "Appium" to access the page "Basic Setup" that will tell you which parameters to use for the test.

### 3) Install gems

To run this test, you must have a recent version of Ruby installed as well as RubyGems and Bundler (see http://appium.io/slate/en/tutorial/ios.html?ruby#install-ruby for installation instructions)

The test-unit gem must be installed:

            gem install test-unit

As well as the latest appium_lib gem release:

            gem uninstall -aIx appium_lib ;\
            gem install --no-rdoc --no-ri appium_lib

### 4) Download the project:

Download the project "test-unit-android-example" from this repository and open it in your IDE.



### 5) Modify parameters in class CalculatorTest

In the class CalculatorTest, you will see a set of capabilities whose values must be filled in.

            testobject_api_key: 'PASTE_API_KEY'
            deviceName: 'PASTE_DEVICE_NAME'
                
You will also see an URL that depends on the location of the device in use for the test
        
            server_url: 'PASTE_URL'

The capabilities corresponding to your test can be found on the "Basic Setup" page : 

#### testobject_api_key

testobject_api_key is specified at the top of the page

#### deviceName

To select a device or change a selected one, click on the button "Change devices" on the top of the page, on the right-hand side. Select a device.
You have here the option to filter the devices according to their location (Europe or United States).

When you click on "Save", the testobject_device  will appear on the "Basic Setup" page. The deviceName is the value specified as testobject_device
under "Devices in Europe" or "Devices in the United State".

#### URL

The correct URL to use for your test is indicated above the testobject_device on the "Basic Setup" page.


### 4) Run the test 

Run the test in your IDE and you will see its success both in your IDE and on the TestObject platform on the "Test Results" page.



