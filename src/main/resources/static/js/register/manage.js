function checkUsername()
{
	
	
	
	var userName=document.getElementById('name').value
	
	   if(userName.length > 0)
		{
			
		}else{
			
			alert("Username cannot be blank.");
		}
	
}

function checkEmailValidation()
{
	
	
	
	var userName=document.getElementById('email').value
	
	if(userName.length > 0)
		{
			
		}else{
			
			alert("Username cannot be blank.");
		}
	
}

function checkAllValidation()
{
	
	var userName=document.getElementById('name').value

	   if(userName.length == 0)
		{	
			alert("Please enter Username.");
			
			return;
		}
		
		var emailData=document.getElementById('email').value

		if(emailData.length == 0)
			{
				alert("Email cannot be blank.");
			}
		
	
	
}