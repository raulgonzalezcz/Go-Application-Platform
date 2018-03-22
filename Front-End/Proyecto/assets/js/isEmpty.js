function isEmpty() {
    if (document.getElementById("texto").value == "") {
        alert("estas todo pendejo");
    }
    else {

    	var appName = document.getElementById("texto").value;
    	document.getElementById("myForm").submit();
    }

    return;
}

$(function(){
       $('subscribe-email-form').on('submit', function(e){
            e.preventDefault();
            $.ajax({
                url: "/notifications/subscribe/",
                type: "POST",
                data: $("subscribe-email-form").serialize(),
                success: function(data){
                    alert("Successfully submitted.")
                }
            });
       }); 
    });
