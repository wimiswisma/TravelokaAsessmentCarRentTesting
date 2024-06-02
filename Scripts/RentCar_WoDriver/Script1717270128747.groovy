import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.delay(2)

// Navigate to the website
WebUI.navigateToUrl('https://www.traveloka.com/en-id')

WebUI.delay(5)
WebUI.takeScreenshot()

// Page Car Search
// Navigate to Rent Car menu
WebUI.click(findTestObject('Object Repository/HomePage/CarRental'))

WebUI.delay(5)
WebUI.takeScreenshot()

//Select Button 'without driver'
WebUI.click(findTestObject('Object Repository/SearchCar/WithoutDriver'))

WebUI.delay(5)
WebUI.takeScreenshot()

// Select Pick-up Location (e.g.: Jakarta)
WebUI.setText(findTestObject('Object Repository/SearchCar/Pick-upLocation'), 'Jakarta')
// Wait for the suggestion dropdown to appear
WebUI.waitForElementVisible(findTestObject('Object Repository/SearchCar/Pick-upLocationSuggestion'), 10)
// Select the first suggestion in the dropdown
WebUI.click(findTestObject('Object Repository/SearchCar/Pick-upLocationSuggestion'))

// Define variables for dates and times
String pickUpDate = '5'
String dropOffDate = '8'
String pickUpMonthYear = 'June 2024'
String dropOffMonthYear = 'June 2024'
String pickUpTimeHour = '09'
String pickUpTimeMinute = '00'
String dropOffTimeHour = '11'
String dropOffTimeMinute = '00'

// Select Pick-up Date
WebUI.click(findTestObject('Object Repository/SearchCar/Pick-upDate'))
WebUI.waitForElementVisible(findTestObject('Object Repository/SearchCar/Pick-upCalender', [('date') : pickUpDate, ('monthYear') : pickUpMonthYear]), 10)
WebUI.click(findTestObject('Object Repository/SearchCar/Pick-upCalender', [('date') : pickUpDate, ('monthYear') : pickUpMonthYear]))

// Select Pick-up Time
WebUI.click(findTestObject('Object Repository/SearchCar/Pick-upTime'))
WebUI.waitForElementVisible(findTestObject('Object Repository/SearchCar/Pick-upTimeDropdown'), 10)
WebUI.click(findTestObject('Object Repository/SearchCar/Pick-upTimeHour', [('hour') : pickUpTimeHour]))
WebUI.click(findTestObject('Object Repository/SearchCar/Pick-upTimeMinute', [('minute') : pickUpTimeMinute]))
WebUI.click(findTestObject('Object Repository/SearchCar/Pick-upTimeDone'))

// Select Drop-off Date
WebUI.click(findTestObject('Object Repository/SearchCar/Drop-offDate'))
WebUI.waitForElementVisible(findTestObject('Object Repository/SearchCar/Drop-offCalender'),[('date') : dropOffDate, ('monthYear') : dropOffMonthYear], 10)
WebUI.click(findTestObject('Object Repository/SearchCar/Drop-offCalender', [('date') : dropOffDate, ('monthYear') : dropOffMonthYear]))

// Select Drop-off Time
WebUI.click(findTestObject('Object Repository/SearchCar/Drop-offTime'))
WebUI.waitForElementVisible(findTestObject('Object Repository/SearchCar/Drop-offTimeDropdown'), 10)
WebUI.click(findTestObject('Object Repository/SearchCar/Drop-offTimeDropdown', [('hour') : dropOffTimeHour]))
WebUI.click(findTestObject('Object Repository/SearchCar/Drop-offTimeMinute', [('minute') : dropOffTimeMinute]))
WebUI.click(findTestObject('Object Repository/SearchCar/Drop-offTimeDone'))

WebUI.delay(5)
WebUI.takeScreenshot()

// Click button Search Car
WebUI.click(findTestObject('Object Repository/SearchCar/SearchButton'))

// Page Car Results
// Wait for the car results page to load and select the specified car
WebUI.waitForElementVisible(findTestObject('Object Repository/SelectCar/TypeCar'), 10)
WebUI.click(findTestObject('Object Repository/SelectCar/TypeCar'))

WebUI.delay(5)
WebUI.takeScreenshot()

// Click continue
WebUI.click(findTestObject('Object Repository/SelectCar/ContinueSelectProvider'))

// Page Select Provider
// Wait for the results page for the provider to load
WebUI.waitForElementVisible(findTestObject('Object Repository/SelectProvider/SortButton'), 10)

// Click sort, wait for the dropdown, and click "lowest price"
WebUI.click(findTestObject('Object Repository/SelectProvider/SortButton'))
WebUI.waitForElementVisible(findTestObject('Object Repository/SelectProvider/SortLowestPrice'), 10)
WebUI.click(findTestObject('Object Repository/SelectProvider/SortLowestPrice'))
WebUI.click(findTestObject('Object Repository/SelectProvider/SortButton'))

WebUI.delay(5)
WebUI.takeScreenshot()

// Select the first column of the result and click continue
WebUI.waitForElementVisible(findTestObject('Object Repository/SelectProvider/ContinueSelectProvider'), 10)
WebUI.click(findTestObject('Object Repository/SelectProvider/ContinueSelectProvider'))

WebUI.delay(5)
WebUI.takeScreenshot()

// Load Pick-up & Drop-off Option
// Scroll the page until the pick-up location column is visible
WebUI.scrollToElement(findTestObject('Object Repository/PickUp-DropOffLocation/PickupLocationColoumn'), 10)

WebUI.delay(5)
WebUI.takeScreenshot()

// Click the "rental office" checkbox
WebUI.click(findTestObject('Object Repository/PickUp-DropOffLocation/PickupRentalOffice'))
WebUI.waitForElementVisible(findTestObject('Object Repository/PickUp-DropOffLocation/PickupRentalOfficeSuggestion'), 10)

// Click the expand button to show the pick-up location suggestion
WebUI.click(findTestObject('Object Repository/PickUp-DropOffLocation/PickupRentalOfficeSuggestion'))
WebUI.waitForElementVisible(findTestObject('Object Repository/PickUp-DropOffLocation/PickupRentalOfficeSuggetSelect'), 10)

// Click the "pool rental" suggestion checkbox
WebUI.click(findTestObject('Object Repository/PickUp-DropOffLocation/PickupRentalOfficeSuggetSelect'))

WebUI.delay(5)
WebUI.takeScreenshot()

// Wait for the drop-off location to load
WebUI.waitForElementVisible(findTestObject('Object Repository/PickUp-DropOffLocation/DropoffOtherLoc'), 10)

// Click the "other location" checkbox
WebUI.click(findTestObject('Object Repository/PickUp-DropOffLocation/DropoffOtherLoc'))

// Input "Blok M plaza" in the search location field
WebUI.setText(findTestObject('Object Repository/PickUp-DropOffLocation/DropoffOtherLocSearch'), 'Blok M plaza')

// Wait for the suggestion to appear and click the first suggestion
WebUI.waitForElementVisible(findTestObject('Object Repository/PickUp-DropOffLocation/DropoffotherLocSearchSuggest'), 10)
WebUI.click(findTestObject('Object Repository/PickUp-DropOffLocation/DropoffotherLocSearchSuggest'))

// Wait for the 'Note' field to appear and input the note "drop off lobby"
WebUI.waitForElementVisible(findTestObject('Object Repository/PickUp-DropOffLocation/DropoffOtherLocNote'), 10)
WebUI.setText(findTestObject('Object Repository/PickUp-DropOffLocation/DropoffOtherLocNote'), 'drop off lobby')

// Click the expand button for Total price and wait for it to load
WebUI.click(findTestObject('Object Repository/PickUp-DropOffLocation/ExpandTotalPrice'))
WebUI.waitForElementVisible(findTestObject('Object Repository/PickUp-DropOffLocation/ExpandTotalPriceLoaded'), 10)

WebUI.delay(5)
WebUI.takeScreenshot()

// Click the Continue button
WebUI.click(findTestObject('Object Repository/PickUp-DropOffLocation/ContinueToBook'))

// Page Contact Details
// Fill Contact Details
WebUI.setText(findTestObject('Object Repository/ContactDetail/ContactFullName'), 'Wim Wisma')

// Click dropdown phone area and select Indonesia (+62)
WebUI.click(findTestObject('Object Repository/ContactDetail/ContactPhoneArea'))
WebUI.click(findTestObject('Object Repository/ContactDetail/ContactPhoneAreaSelect'))

// Input Mobile Number
WebUI.setText(findTestObject('Object Repository/ContactDetail/ContactPhoneNumber'), '81234567890')

// Input Email
WebUI.setText(findTestObject('Object Repository/ContactDetail/ContactEmail'), 'wim@mail.com')

WebUI.delay(5)
WebUI.takeScreenshot()

// Click Save Contact
WebUI.click(findTestObject('Object Repository/ContactDetail/ContactSave'))

// Fill Driver Details
// Click dropdown Title
WebUI.click(findTestObject('Object Repository/ContactDetail/DriverTitleDropdown'))
WebUI.click(findTestObject('Object Repository/ContactDetail/DriverTitleSelect')) 

// Input Full Name
WebUI.setText(findTestObject('Object Repository/ContactDetail/DriverFullName'), 'Wim Driver')

// Click dropdown phone area and select Indonesia (+62)
WebUI.click(findTestObject('Object Repository/ContactDetail/DriverPhoneArea'))
WebUI.click(findTestObject('Object Repository/ContactDetail/DriverPhoneAreaSelect'))

// Input Mobile Number
WebUI.setText(findTestObject('Object Repository/ContactDetail/DriverPhoneNumber'), '8209876543')

WebUI.delay(5)
WebUI.takeScreenshot()

// Click Save Driver
WebUI.click(findTestObject('Object Repository/ContactDetail/DriverSave'))

WebUI.delay(5)
WebUI.takeScreenshot()

// Click Continue
WebUI.click(findTestObject('Object Repository/ContactDetail/ContinueToBook'))

WebUI.waitForElementVisible(findTestObject('Object Repository/BookDetail/SpecialRequest'), 10)


// Page Booking
// Add a special request is optional
WebUI.setText(findTestObject('Object Repository/BookDetail/SpecialRequest'), 'Provide the car photo condition')

WebUI.delay(5)
WebUI.takeScreenshot()

// Click the requirement button and wait for the requirement Tab to appear
WebUI.click(findTestObject('Object Repository/BookDetail/RequirementTab'))
WebUI.waitForElementVisible(findTestObject('Object Repository/BookDetail/RequirementCheckAll'), 10)

// Click the 'Check All' checkbox and save
WebUI.click(findTestObject('Object Repository/BookDetail/RequirementCheckAll'))
WebUI.click(findTestObject('Object Repository/BookDetail/RequirementSave'))

WebUI.delay(5)
WebUI.takeScreenshot()

// Click the 'Insurance' checkbox
WebUI.click(findTestObject('Object Repository/BookDetail/AddInsurance'))

// Verify insurance price in 'insurance column' matches the insurance price in 'Price detail'
String insurancePriceColumn = WebUI.getText(findTestObject('Object Repository/BookDetail/InsurancePriceColoumn'))
String insurancePriceDetail = WebUI.getText(findTestObject('Object Repository/BookDetail/InsurancePriceTotal'))
WebUI.verifyMatch(insurancePriceColumn, insurancePriceDetail, false)

WebUI.delay(5)
WebUI.takeScreenshot()

// Click the continue button
WebUI.click(findTestObject('Object Repository/BookDetail/ContinuePayment'))

// Wait for the dialogue box 'sure to proceed' to appear
WebUI.waitForElementVisible(findTestObject('Object Repository/BookDetail/DialogueBox'), 10)

WebUI.delay(5)
WebUI.takeScreenshot()

// Click 'check again' button
WebUI.click(findTestObject('Object Repository/BookDetail/DialogueCheckAgain'))

// Scroll until the continue button is visible again and click continue
WebUI.scrollToElement(findTestObject('Object Repository/BookDetail/ContinuePayment'), 10)
WebUI.click(findTestObject('Object Repository/BookDetail/ContinuePayment'))

// Wait for the dialogue box 'sure to proceed' to appear again
WebUI.waitForElementVisible(findTestObject('Object Repository/BookDetail/DialogueBox'), 10)

// Click 'Continue' button
WebUI.click(findTestObject('Object Repository/BookDetail/DialogueContinue'))

WebUI.delay(5)
WebUI.takeScreenshot()

// Wait for the page to load
WebUI.waitForPageLoad(10)


//Page Payment
//SelectPayment Option
// Click payment option 'Credit/Debit Card'
WebUI.click(findTestObject('Object Repository/Payment/CardOption'))

WebUI.delay(5)
WebUI.takeScreenshot()

// Input Card number
WebUI.setText(findTestObject('Object Repository/Payment/CardNumber'), '55543678912340001')

// Input Valid Thru
WebUI.setText(findTestObject('Object Repository/Payment/CardValidThru'), '08/07')

// Input CVV
WebUI.setText(findTestObject('Object Repository/Payment/CardCVV'), '344')

// Input Name
WebUI.setText(findTestObject('Object Repository/Payment/CardName'), 'Wim Wisma')

WebUI.delay(5)
WebUI.takeScreenshot()

// Click Payment- Assuming we proceed the payment
//WebUI.click(findTestObject('Object Repository/Payment/Payment'))

// Close browser
WebUI.closeBrowser()
