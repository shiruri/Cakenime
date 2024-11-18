let slideIndex = 0;
let slidesContainer = document.querySelector('.slides');
let slides = document.querySelectorAll('.slide');

function showSlides(n) {
    slideIndex = (n + slides.length) % slides.length; // Ensure circular navigation
    slidesContainer.style.transform = `translateX(-${slideIndex * 100}%)`; // Slide to the selected slide
}

function plusSlides(n) {
    showSlides(slideIndex + n);
}

// Auto-play (optional)
setInterval(() => plusSlides(1), 5000); // Slide every 5 seconds
