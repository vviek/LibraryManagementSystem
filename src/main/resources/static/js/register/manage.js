
function checkUsername()
{
	var userName=document.getElementById('name').value;
	
	   if(userName.length > 0)
		{
			
		}else{
			
			const toastLiveExample = document.getElementById('liveToast')

				
				  const toastBootstrap = bootstrap.Toast.getOrCreateInstance(toastLiveExample)
				 
				  toastBootstrap.show()
		}
	
}

function checkEmailValidation()
{
	var emailAddress=document.getElementById('email').value;
	
	if(emailAddress.length > 0)
		{
			
		}else{
			
			const toastLiveExample = document.getElementById('liveToast')

				
				  const toastBootstrap = bootstrap.Toast.getOrCreateInstance(toastLiveExample)
				 
				  toastBootstrap.show()
		}
	
}

function checkPassword()
{
	
	const toastLiveExample = document.getElementById('liveToast')

	
	  const toastBootstrap = bootstrap.Toast.getOrCreateInstance(toastLiveExample)
	 
	  toastBootstrap.show()
	

	
	}

function checkConfirmPassword()
{
	const toastLiveExample = document.getElementById('liveToast')

		
		  const toastBootstrap = bootstrap.Toast.getOrCreateInstance(toastLiveExample)
		 
		  toastBootstrap.show()
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

