
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
		
		$.ajax({url: "http://localhost:8080/test/alladdress/"+emailAddress, success: function(result){
			
		    alert(result)
			 
		   }});	
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
	
	
	
	
	
	/*var myModal = new bootstrap.Modal(document.getElementById('staticBackdrop'), {
	  keyboard: true
	});
	
	
	
	
	
	var userName=document.getElementById('name').value;

	   if(userName.length == 0)
		{	
			document.getElementById('error-message').innerHTML ="Name cannot be black";
			myModal.show();
		    return;	
		}
		

		var emailData=document.getElementById('email').value;

		if(emailData.length == 0)
			{
				document.getElementById('error-message').innerHTML ="Email cannot be black";
				myModal.show();	
				
				return;	
			}
				
		var passwordData=document.getElementById('password').value;
		
		if(passwordData.length==0)
			{
				document.getElementById('error-message').innerHTML ="Password cannot be blank.";
								myModal.show();	
								
								return;
             }*/
			 
		
}

