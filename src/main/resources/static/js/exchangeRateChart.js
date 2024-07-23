document.addEventListener("DOMContentLoaded", function () {
    fetch('/rates')
        .then(response => response.json())
        .then(data => {
            const ctx = document.getElementById('rateChart').getContext('2d');
            const labels = Object.keys(data);
            const values = Object.values(data).map(rate => parseFloat(rate));

            new Chart(ctx, {
                type: 'line',
                data: {
                    labels: labels,
                    datasets: [{
                        label: 'Exchange Rate',
                        data: values,
                        borderColor: 'rgba(75, 192, 192, 1)',
                        borderWidth: 2,
                        fill: false
                    }]
                },
                options: {
                    responsive: true,
                    scales: {
                        x: {
                            title: {
                                display: true,
                                text: 'Currency'
                            }
                        },
                        y: {
                            title: {
                                display: true,
                                text: 'Rate'
                            },
                            beginAtZero: false
                        }
                    }
                }
            });
        })
        .catch(error => console.error('Error fetching exchange rates:', error));
});