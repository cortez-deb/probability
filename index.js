let email= document.getElementsByName("InputEmail").value;
let password1= document.getElementsByName("Password1").value;
let password2= document.getElementsByName("Password2").value;
function validate(email,password1,password2)
{
if(
email===undefined||email===null||email===''
||password1===undefined||password1===null||password1===''
||password2===undefined||password2===null||password2===''
){
document.getElementById("emailHelp").innerHTML="Please fill in the email";
document.getElementById("emailHelp").style.color="red";

}
}

