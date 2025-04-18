/*!
    * Start Bootstrap - SB Admin v7.0.7 (https://startbootstrap.com/template/sb-admin)
    * Copyright 2013-2023 Start Bootstrap
    * Licensed under MIT (https://github.com/StartBootstrap/startbootstrap-sb-admin/blob/master/LICENSE)
    */
    // 
// Scripts
// 

window.addEventListener('DOMContentLoaded', event => {

    // Toggle the side navigation
    const sidebarToggle = document.body.querySelector('#sidebarToggle');
    if (sidebarToggle) {
        // Uncomment Below to persist sidebar toggle between refreshes
        // if (localStorage.getItem('sb|sidebar-toggle') === 'true') {
        //     document.body.classList.toggle('sb-sidenav-toggled');
        // }
        sidebarToggle.addEventListener('click', event => {
            event.preventDefault();
            document.body.classList.toggle('sb-sidenav-toggled');
            localStorage.setItem('sb|sidebar-toggle', document.body.classList.contains('sb-sidenav-toggled'));
        });
    }

});

    $(document).ready(function() {
        // Обработка клика по чекбоксу
        $('.task-checkbox').change(function() {
            $(this).closest('tr').toggleClass('completed', this.checked);
        });

        // Обработка клика по стрелке
        $('.toggle-children').click(function() {
            let target = $(this).data('target');
            $(target).toggle();
            $(this).find('.caret').text($(target).is(':visible') ? '∧' : '>');
        });


    });

    function toggleCompleted(checkbox) {
            const row = checkbox.closest('tr');
            if (checkbox.checked) {
                row.classList.add('completed');
            } else {
                row.classList.remove('completed');
            }
        }

        function toggleChildren(taskNumber) {
            const childRows = document.querySelectorAll(`.child-row`);
            childRows.forEach(row => {
                if (row.id === `children-${taskNumber}`) {
                    row.style.display = row.style.display === 'none' ? 'table-row' : 'none';
                }
            });
            const icon = event.target;
            icon.innerHTML = icon.innerHTML === '>' ? '↑' : '>';
        }