$('document').ready(function () {

    $('.table .btn-outline-warning').on('click', function (event) {

        event.preventDefault();

        var href = $(this).attr('href');

        $.get(href, function (message, status) {
            $('#editOne').val(message.id);
            $('#editTwo').val(message.themessage);
            $('#editThree').val(message.fromwho);
            $('#editFour').val(message.towho);
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