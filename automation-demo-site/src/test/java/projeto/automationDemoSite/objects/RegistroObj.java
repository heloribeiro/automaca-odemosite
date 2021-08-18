package projeto.automationDemoSite.objects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistroObj {

	private WebDriver driver;

	@FindBy(xpath = "/html/body/section/div/div/div[2]/form/div[1]/div[1]/input")
	private WebElement firstName;

	@FindBy(xpath = "/html/body/section/div/div/div[2]/form/div[1]/div[2]/input")
	private WebElement lastName;

	@FindBy(xpath = "//div/textarea[@rows='3']")
	private WebElement adrress;

	@FindBy(xpath = "//div/input[@type='email']")
	private WebElement email;

	@FindBy(xpath = "//div/input[@type='tel']")
	private WebElement phone;

	@FindBy(css = "input[value='FeMale']")
	private WebElement female;

	@FindBy(id = "checkbox3")
	private WebElement hockey;

	// clica em language
	@FindBy(id = "msdd")
	private WebElement language;
	// seleciona a language
	@FindBy(linkText = "English")
	private WebElement selectlanguage;

	@FindBy(id = "Skills")
	private WebElement skills;

	@FindBy(id = "countries")
	private WebElement countries;

	// Clicar em Select Country
	@FindBy(xpath = "//span/span[@role='combobox']")
	private WebElement selectCountry;
	// Escolher o país
	@FindBy(xpath = "//span/input[@class='select2-search__field']")
	private WebElement selectpais;

	@FindBy(id = "yearbox")
	private WebElement year;

	@FindBy(xpath = "//div/select[@ng-model='monthbox']")
	private WebElement month;

	@FindBy(id = "daybox")
	private WebElement day;

	@FindBy(id = "firstpassword")
	private WebElement password;

	@FindBy(id = "secondpassword")
	private WebElement confirmPassword;

	//@FindBy(xpath = "//div/input[@type='file']")
	//private WebElement foto;
	
	@FindBy(xpath = "//div/button[@id='Button1']")
	private WebElement refresh;

	public RegistroObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public void setFirstName(WebElement firstName) {
		this.firstName = firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public void setLastName(WebElement lastName) {
		this.lastName = lastName;
	}

	public WebElement getAdrress() {
		return adrress;
	}

	public void setAdrress(WebElement adrress) {
		this.adrress = adrress;
	}

	public WebElement getEmail() {
		return email;
	}

	public void setEmail(WebElement email) {
		this.email = email;
	}

	public WebElement getPhone() {
		return phone;
	}

	public void setPhone(WebElement phone) {
		this.phone = phone;
	}

	public WebElement getFemale() {
		return female;
	}

	public void setFemale(WebElement female) {
		this.female = female;
	}

	public WebElement getHockey() {
		return hockey;
	}

	public void setHockey(WebElement hockey) {
		this.hockey = hockey;
	}

	public WebElement getLanguage() {

		return language;
	}

	public void setLanguage(WebElement language) {

		this.language = language;
	}

	public WebElement getSelectlanguage() {

		return selectlanguage;
	}

	public void setSelectlanguage(WebElement selectlanguage) {
		this.selectlanguage = selectlanguage;
	}

	public WebElement getSkills() {

		Select selectSkills = new Select(skills);
		selectSkills.selectByValue("Certifications");
		return skills;
	}

	public void setSkills(WebElement skills) {
		this.skills = skills;
	}

	public WebElement getCountries() {

		Select pais = new Select(countries);
		pais.selectByValue("Australia");
		return countries;
	}

	public void setCountries(WebElement countries) {
		this.countries = countries;
	}

	public WebElement getSelectCountry() {

		return selectCountry;
	}

	public void setSelectCountry(WebElement selectCountry) {
		this.selectCountry = selectCountry;
	}

	public WebElement getSelectpais() {

		return selectpais;
	}

	public void setSelectpais(WebElement selectpais) {
		this.selectpais = selectpais;
	}

	public WebElement getYear() {

		Select ano = new Select(year);
		ano.selectByValue("1985");
		return year;
	}

	public void setYear(WebElement year) {
		this.year = year;
	}

	public WebElement getMonth() {

		Select mes = new Select(month);
		mes.selectByValue("February");

		return month;
	}

	public void setMonth(WebElement month) {
		this.month = month;
	}

	public WebElement getDay() {
		Select dia = new Select(day);
		dia.selectByValue("27");
		return day;
	}

	public void setDay(WebElement day) {
		this.day = day;
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}

	public WebElement getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(WebElement confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	
	/*public WebElement getFoto() {

		WebElement uploadFoto = driver.findElement(By.xpath("//div/input[@type='file']"));
		uploadFoto.sendKeys("C:/Users/Heloísa/Desktop/foto/flor.jpg");

		return foto;
	}

	public void setFoto(WebElement foto) {
		this.foto = foto;
	}*/


	public WebElement getRefresh() {
		return refresh;
	}

	public void setRefresh(WebElement refresh) {
		this.refresh = refresh;
	}

}
