
		$.ajax({url: "http://localhost:8080/register/view/allusers", success: function(result){
			
			
		    $("#main-container").html(result); 
		   }});	
