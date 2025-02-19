function checkUsername()
{
	
	
	
	var userName=document.getElementById('name').value;
	
	   if(userName.length > 0)
		{
			
		}else{
			
			alert("Username cannot be blank.");
		}
	
}

function checkEmailValidation()
{
	
	
	
	var emailAddress=document.getElementById('email').value;
	
	if(emailAddress.length > 0)
		{
			
		}else{
			
			alert("Email cannot be blank.");
		}
	
}

function checkPassword()
{
	var password=document.getElementById('password').value;
	
	if(password.length > 0)
		{
		}
	if(password.length>6){
			alert("Password should be atleast 6 digit")
		}
		else{
			alert("Password cannot be blank");
		}
}

function checkConfirmPassword()
{
	var password=document.getElementById('confirmpassword').value;
		
		if(password.length > 0)
			{
			}
			else{
						alert("Password cannot be blank");
					}
}

function checkAllValidation()
{
	
	var userName=document.getElementById('name').value;

	   if(userName.length == 0)
		{	
			alert("Please enter Username.");
			
			return;
		}
		
		var emailData=document.getElementById('email').value;

		if(emailData.length == 0)
			{
				alert("Email cannot be blank.");
			}
		
		var passwordData=document.getElementById('password').value;
		
		if(passwordData.length==0)
			{
				alert("Password cannot be blank.")
             }
		var confirmPasswordData=document.getElementById('confirmpassword').value;
						
		if(confirmPasswordData.length==0)
			{
				alert("Password cannot be blank.");
			}
}

