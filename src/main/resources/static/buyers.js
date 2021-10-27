$('document').ready(function () {

    $('.table .btn-outline-warning').on('click', function (event) {

        event.preventDefault();

        var href = $(this).attr('href');

        $.get(href, function (buyers, status) {
            $('#editOne').val(buyers.id);
            $('#editTwo').val(buyers.name);
            $('#editThree').val(buyers.price);
            $('#editFour').val(buyers.city);
        });

        $('#editModal').modal('show');
    });

    $('table #deleteButton').on('click', function (event) {
        event.preventDefault();
        var href = $(this).attr('href');

        $.get(href, function (buyers, status) {
            $('#deleteModal.modal-body').val(buyers.id);

        });

        $('#deleteModal #delRef').attr('href', href);
        $('#deleteModal').modal('show');
    });

});