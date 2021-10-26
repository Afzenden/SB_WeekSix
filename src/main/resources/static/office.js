$('document').ready(function () {

    $('.table .btn-outline-warning').on('click', function (event) {

        event.preventDefault();

        var href = $(this).attr('href');

        $.get(href, function (office, status) {
            $('#editId').val(office.id);
            $('#editName').val(office.name);
            $('#editPhone').val(office.phone);
            $('#editEmail').val(office.email);
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