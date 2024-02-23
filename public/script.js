// Orriaren titulua aldatu egun eta ordura jarraian
document.title = "Berriena: " + new Date().toLocaleDateString();

// Navigazioa bideratzeko linkak
document.querySelectorAll('nav ul li a').forEach(link => {
    link.addEventListener('click', e => {
        e.preventDefault();
        const target = e.target.getAttribute('href').substring(1);
        document.getElementById(target).scrollIntoView({
            behavior: 'smooth'
        });
    });
});
