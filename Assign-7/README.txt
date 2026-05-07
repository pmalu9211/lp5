three files :
1) Service
2)Servlet
3)Client


Open NetBeans - New Project - Java Web & WEb Application 
Next
Project Name
Glassfish server & Java EE 7 Web
No framework to choose
Finish

index.html will open by default
Go to Project Name , right click it and click New - Web Service 

//Web service creation
Name your webservice
name the package section with - com.myservice
Finish

WebService folder will be created 
Inside it Hello String(default method) will already be created

Next Step - Adding Operations

Method : Right Click the webservice name , then go to add operation 
 here name : Addition 
return type : double 
then go to Parameters Section - click add
Once all operations are created , change return from return 0.0 to return num1+num2 for add , and similarly for  other operations.

Now , right click project name and then click build,
once build is success again do same and click deploy
then right click on web-service-name and click test web service 
add two parameters - num1 and num2 , both with return type double 

Similarly do the same for subtraction, multiplication and division 



//Client

similarly create a new project
then once on index.html
int the content section <div> TODO </div> remove it 
go to window in header ribbon - IDE TOOLS - PALETTE 

create a form with NAME - CalculatorServlet
in the form :
<body>
    <form action="CalculatorServlet">
        Enter Number-1: <input type="text" name="number1" value="" /> <br>
        Enter Number-2: <input type="text" name="number2" value="" /> <br>

        <input type="submit" value="Submit" />
    </form>
</body>
</html>


then right click project name and click new then web service client 
browse - select your calculator project that u earlier created and click finish.

Right click project name - click new - click servlet 
class name in servlet should be same as one created in index.html for cliend(eg-CalculatorServlet)

click checkbox for deployment 

once servlet page open, there add all 4 add,subtr,multiply,division operation by drag and drop 

inside CalculatorServlet : 

protected void processRequest(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

    response.setContentType("text/html;charset=UTF-8");

    try (PrintWriter out = response.getWriter()) {

        double num1, num2;

        num1 = Double.parseDouble(request.getParameter("number1"));
        num2 = Double.parseDouble(request.getParameter("number2"));

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet Calculator Servlet Output</title>");
        out.println("</head>");
        out.println("<body>");

        out.println("<h1>Addition Is: " + addition(num1, num2) + "</h1>");
        out.println("<h1>Subtraction Is: " + subtraction(num1, num2) + "</h1>");
        out.println("<h1>Multiplication Is: " + multiplication(num1, num2) + "</h1>");
        out.println("<h1>Division Is: " + division(num1, num2) + "</h1>");

        out.println("</body>");
        out.println("</html>");
    }
}



then click client created Project - then click clean and build 

then in client project only 
click on index.html
once file opens, right click the code area and click - RUN FILE 
