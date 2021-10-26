$('document').ready(function () {

    $('.table .btn-outline-warning').on('click', function (event) {

        event.preventDefault();

        var href = $(this).attr('href');

        $.get(href, function (messageboard, status) {
            $('#editOne').val(messageboard.id);
            $('#editTwo').val(messageboard.themessage);
            $('#editThree').val(messageboard.fromwho);
            $('#editFour').val(messageboard.towho);
        });

        $('#editModal').modal('show');
    });

    $('table #deleteButton').on('click', function (event) {
        event.preventDefault();
        var href = $(this).attr('href');
        $('#deleteModal #delRef').attr('href', href);
        $('#deleteModal').modal('show');
    });

});