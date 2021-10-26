$('document').ready(function () {

    $('.table .btn-outline-warning').on('click', function (event) {

        event.preventDefault();

        var href = $(this).attr('href');

        $.get(href, function (agent, status) {
            $('#editOne').val(agent.id);
            $('#editTwo').val(agent.name);
            $('#editThree').val(agent.phone);
            $('#editFour').val(agent.email);
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