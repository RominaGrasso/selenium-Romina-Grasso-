package clase1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class practico1 {

    //FUNCIONES BÁSICAS

    WebDriver driver;

    @Test
    //EJERCICIO 1
    //Crear un método que abra el browser y muestre el explorador de google con chrome
    public WebDriver getDriver(String url) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        return driver;
    }

    //EJERCICIO 1
    //Crear un método que abra el browser y muestre el explorador de google con chrome
    @Test
    public void abrirGoogleConChrome() {
        WebDriver driver = getDriver("https://www.google.com");
    }


    //EJERCICIO 2
    //Crear un método llamado mostrarTituloTest, que muestre el título del sitio web.
    @Test
    public void mostrarTituloTest() {
        WebDriver driver = getDriver("https://www.google.com/");
        System.out.println("El título de la página es: " + driver.getTitle());
    }

    //EJERCICIO 3
    //Crear un método llamado bbcMundTest
    //Ingresar al sitio https://www.bbc.com/mundo
    //Mostrar la cantidad de <h1>
    //Imprimir títulos h1
    //Mostrar la cantidad de <h2>
    //Imprimir títulos h2

    @Test
    public void bbcMundTest() {
        WebDriver driver = getDriver("https://www.bbc.com/mundo");

        List<WebElement> listaH1 = driver.findElements(By.tagName("h1"));
        System.out.println("La cantidad de h1 es de: " + listaH1.size());

        for (WebElement elementoH1 : listaH1) {
            System.out.println(elementoH1.getText());
        }

        List<WebElement> listaH2 = driver.findElements(By.tagName("h2"));
        System.out.println("La cantidad de h2 es de: " + listaH2.size());

        for (WebElement elementoH2 : listaH2) {
            System.out.println(elementoH2.getText());
        }
    }

    //EJERCICIO 4
    //Crear un método llamado bbcMundoLinks
    //Ingresar al sitio https://www.bbc.com/mundo
    //Mostrar el texto de todos los links
    @Test
    public void bbcMundoLinks() {
        WebDriver driver = getDriver("https://www.bbc.com/mundo");

        List<WebElement> listaLinks = driver.findElements(By.tagName("a"));
        System.out.println("El total de links es de: " + listaLinks.size());

        for (WebElement elementoLink : listaLinks) {
            System.out.println("Los links son: " + elementoLink.getText());
        }
    }

    //EJERCICIO 5
    //Crear un método llamado bbcMundoListas
    //Ingresar al sitio https://www.bbc.com/mundo
    //Mostrar todos los elementos li y su texto
    @Test
    public void bbcMundoListas() {
        WebDriver driver = getDriver("https://www.bbc.com/mundo");

        List<WebElement> listaLi = driver.findElements(By.tagName("li"));
        System.out.println("El total de elementos li es de: " + listaLi.size());

        for (WebElement elementoLi : listaLi) {
            System.out.println("Los elementos li son: " + elementoLi.getText());
        }
    }

    //EJERCICIO 6
    //Crear un método llamado spotifyTitleTest
    //Debe inicializar https://www.spotify.com
    //Validar que el título del sitio sea Escuchar es todo - Spotify. Si lo es, debe indicar “Test
    //Passed!!” sino, debe mostrar “Test failed”.
    @Test
    public void spotifyTitleTest() {
        WebDriver driver = getDriver("https://www.spotify.com");

        String titulo = driver.getTitle();
        System.out.println("El título actual es: " + driver.getTitle());

        if (titulo.equals("Escuchar es todo - Spotify")) {
            System.out.println("Test passed.");
        } else {
            System.out.println("Test failed.");

        }

    }

    //EJERCICIO 7
    //Ejercicio 7
    //Crear un método llamado getWindowsSizeTest
    //Abrir el explorador con google.com
    //Obtener y mostrar el ancho y alto de la página
    //Setear un nuevo tamaño de pantalla 1024x768
    @Test
    public void getWindowsSizeTest() throws InterruptedException {
        WebDriver driver = getDriver("https://www.google.com");

        int height = driver.manage().window().getSize().height;
        int width = driver.manage().window().getSize().width;

        System.out.println("The height of the scrren is: " + height);
        System.out.println("The weight of the screen is: " + width);

        Thread.sleep(2000);

        Dimension dimension = new Dimension(1024, 768);
        driver.manage().window().setSize(dimension);
        System.out.println("Los cambios se están guardando. Espere por favor.");

        Thread.sleep(2000);

        height = driver.manage().window().getSize().height;
        width = driver.manage().window().getSize().width;

        System.out.println("The new height of the screen is: " + height);
        System.out.println("The new weight of the screen is: " + width);
    }


    //EJERCICIO 8
    //Crear un método llamado getGoogleDriver que inicialice un sitio web www.google.com. Debe
    //retornar un objeto de tipo Webdriver
    /*@Test
    public getGoogleDriver(){

        WebDriver driver = getDriver("https://www.google.com");

        return driver;
    }

    //EJERCICIO 9
    //Crear un método llamado getDriver que inicialice un sitio web que recibe por parámetro. Debe
    //retornar un objeto de tipo Webdriver
    @Test
    public getDriver(String URL){

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(URL);

        return driver;
    }*/

    //EJERCICIO 10
    //Crear un método llamado searchInGoogle
    //Acceder a google.com
    //Ingresar en el buscador, la palabra “WebElement” y presionar enter
    @Test
    public void searchInGoogle() {

        WebDriver driver = getDriver("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("WebElement" + Keys.ENTER);

    }

    //EJERCICIO 11
    //Crear un método llamado searchInGoogleAndGoBack
    //Acceder a google.com
    //Imprimir el título del sitio
    //Buscar: WebElement y presionar ENTER
    //Volver atras
    //Refrescar la página
    //Ir hacia adelante
    @Test
    public void searchInGoogleAndGoBack() {

        WebDriver driver = getDriver("https://www.google.com");
        System.out.println("El título del sitio es: " + driver.getTitle());
        driver.findElement(By.name("q")).sendKeys("WebElement" + Keys.ENTER);

        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
    }

    //EJERCICIO 12
    //Crear un método llamado facebookPageTest
    //Abrir un navegador con facebook: https://www.facebook.com/
    //Mostrar la cantidad de div que existen (utilizando tagname)
    //Mostrar el texto de todos los tipos a (hipervínculos)
    //Mostrar la cantidad de botones que tiene la página
    //Mostrar los textos de los botones que se encuentran en la página
    @Test
    public void facebookPageTest() {
        WebDriver driver = getDriver("https://www.facebook.com/");

        List<WebElement> listaDiv = driver.findElements(By.tagName("div"));
        System.out.println("La cantidad de divs en la página es: " + listaDiv.size());

        List<WebElement> listaLinks = driver.findElements(By.tagName("a"));
        System.out.println("El total de links es de: " + listaLinks.size());

        for (WebElement elementoLink : listaLinks) {
            System.out.println("Los links son: " + elementoLink.getText());
        }

        List<WebElement> listaButtons = driver.findElements(By.tagName("button"));
        System.out.println("La página tiene un total de " + listaButtons.size() + " botones.");

        for (WebElement elementoBotones : listaButtons) {
            System.out.println("Los botones son: " + elementoBotones.getText());
        }
    }

    //EJERCICIO 13
    //Crear un método de test llamado sendKeysToFacebook
    //Ir a Facebook https://www.facebook.com/
    //Completar el email y contraseña con los datos: test@test.com y holamundo
    //respectivamente
    //Hacer click en login
    @Test
    public void sendKeysToFacebook() {
        WebDriver driver = getDriver("https://www.facebook.com/");
        driver.findElement(By.name("email")).sendKeys("test@test.com");
        driver.findElement(By.name("pass")).sendKeys("holamundo");
        driver.findElement(By.tagName("login")).click();
    }

    //EJERCICIO 14
    //Subir este ejercicio en a github en una rama nueva llamada selenium/ejercicio1.
    //Crear una pull request y agregar a seleniumcurso como revisor.

    //Crear un método con un nombre a seleccionar
    //Acceder a Netflix: https://www.netflix.com/uy/
    //Mostrar los elementos h1 y h2 que hay en el sitio
    //Refrescar la página
    //Mostrar el texto de los botones que se encuentran en la página
    //Mostrar la cantidad de elementos div que contiene el sitio
    //Obtener y mostrar el título de la página
    //Mostrar la cantidad de elementos de tipos link

    @Test
    public void ultimoEjercicio() {
        WebDriver driver = getDriver("https://www.netflix.com/uy/");

        List<WebElement> listaH1 = driver.findElements(By.tagName("h1"));
        List<WebElement> listaH2 = driver.findElements(By.tagName("h2"));

        System.out.println("Los elementos h1 son " + listaH1.size() + " y los h2: " + listaH2.size());

        driver.navigate().refresh();

        List<WebElement> listaButtons = driver.findElements(By.tagName("button"));
        for (WebElement elementoBotones : listaButtons) {
            System.out.println("El texto de los botones es: " + elementoBotones.getText());
        }

        List<WebElement> listaDiv = driver.findElements(By.tagName("div"));
        System.out.println("La cantidad de divs en la página es: " + listaDiv.size());

        System.out.println("El título de la página es: " + driver.getTitle());

        List<WebElement> listaLinks = driver.findElements(By.tagName("a"));
        System.out.println("La cantidad de links de la página es de: " +listaLinks.size());
    }
}


















