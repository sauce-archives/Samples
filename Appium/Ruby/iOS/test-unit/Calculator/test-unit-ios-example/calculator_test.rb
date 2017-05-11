require 'appium_lib'
require 'test/unit'



# Simple test on iOS device using sample calculator application. Capacities and URL must be adapted:
# see README.md to find out where to find the specific values for your test on your dashboard.
# If you want to refer to specific elements of the app (like "button1" in this example),
# # you need to install Appium-Desktop (https://github.com/appium/appium-desktop)
# and use the Appium inspector to find the element id. The parameters to specify on the Appium-Desktop are the same
# than those you specify here.
#
class CalculatorTest < Test::Unit::TestCase

  def setup
    desired_capabilities = {
        # These are the capabilities we must provide to run our test on TestObject
        caps: {
            testobject_api_key: 'PASTE_API_KEY',
            deviceName: 'PASTE_DEVICE_NAME'
        },

        # Check your Basic Setup page to find the URL that corresponds to your device
        appium_lib: {
            server_url: 'PASTE_URL'
        }
    }

    # Starts the driver
    @driver = Appium::Driver.new(desired_capabilities).start_driver

  end

  # test method names must start with "test_" to be recognized by the test-unit framework
  def test_button
    # Use the Appium Inspector to find the resource id of the element
    @button1 = @driver.find_element(id:'PASTE_ELEMENT_ID')

    # In this test, we simply press the button "1"
    Appium::TouchAction.new.press(element: @button1).perform
  end

  # We disable the driver after EACH test has been executed.
  def teardown
    @driver.quit
  end

end