$('document').ready(function () {

    $('.table .btn-outline-warning').on('click', function (event) {

        event.preventDefault();

        var href = $(this).attr('href');

        $.get(href, function (listings, status) {
            $('#editId').val(listings.id);
            $('#editAddress').val(listings.address);
            $('#editCity').val(listings.city);
            $('#editPrice').val(listings.price);
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