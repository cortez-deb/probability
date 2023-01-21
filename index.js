let email= document.getElementByName("InputEmail").value;
let password1= document.getElementByName("Password1").value;
let password2= document.getElementByName("Password2").value;
function validate(email,password1,password2)
{
if(
email.length==0
||password1.length==0
||password2.length==0
)
{  
    if(email.length==0)
    {
        document.getElementById("emailHelp").innerHTML="Please fill in the email";
        document.getElementById("emailHelp").style.color="red";
        
    }
     if(password1.length==0)
    {
        document.getElementById("password1").innerHTML="Please fill in the password";
        document.getElementById("password1").style.color="red";
    }
    if(ppassword2.length==0)
    {
        document.getElementById("password2").innerHTML="Please fill in the password";
        document.getElementById("password2").style.color="red";
    }

}
else{
    if(password1==password2){
        document.getElementById("addme").style.visibility="visible";
    }
    else{
      //  Headers("location:filterManagerRegData.php");
    }
}
}

