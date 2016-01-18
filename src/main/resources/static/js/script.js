


$(document).ready(function(){
    loadUsers();

});

function loadUsers(){
    $.ajax({

    			url: 'http://localhost:8080/users',
    			dataType: 'json',
    			success: function(data) {
    				for (var i = 0; i < data.length; i++) {
    				var user = data[i];
    				var row = "<tr>" + "<td>" + "<a href='http://localhost:8080/user?id="+ user.id  + "'>"+ user.id +"</a>"+ "</td>" +   "<td>" + user.name + "</td>" + "<td>" + user.surname + "</td>" + "</tr>";
    				$('.mytable').append(row ); //outputs the contents of data1

    			}
    	     }
        });
}