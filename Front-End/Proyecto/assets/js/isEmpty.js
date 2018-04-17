function isEmpty() {
    if (document.getElementById("texto").value == "") {
        alert("Ingresa un nombre valido.");
    }
    else {
        var appName = document.getElementById("texto").value;
        appName=appName.replace(/ /g,"-");

        document.getElementById("myForm").submit();
    }
    return;
}
$(function () {
    $('subscribe-email-form').on('submit', function (e) {
        e.preventDefault();
        $.ajax({
            url: "/notifications/subscribe/",
            type: "POST",
            data: $("subscribe-email-form").serialize(),
            success: function (data) {
                alert("Successfully submitted.");
            }
        });
    });
});
