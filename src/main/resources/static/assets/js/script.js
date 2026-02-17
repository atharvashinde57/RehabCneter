/**
 * Sanchit Rehab - Main Script
 */

'use strict';

/**
 * Custom Cursor
 */
const cursorDot = document.querySelector('[data-cursor-dot]');
const cursorOutline = document.querySelector('[data-cursor-outline]');

window.addEventListener('mousemove', function (e) {
  const posX = e.clientX;
  const posY = e.clientY;

  // Dot moves instantly
  cursorDot.style.left = `${posX}px`;
  cursorDot.style.top = `${posY}px`;

  // Outline moves with slight delay (animation in CSS or via animate)
  cursorOutline.animate({
    left: `${posX}px`,
    top: `${posY}px`
  }, { duration: 500, fill: "forwards" });
});

/**
 * Mobile Navbar Toggle
 */
const navbar = document.querySelector('[data-navbar]');
const navToggler = document.querySelector('[data-nav-toggler]');
const navLinks = document.querySelectorAll('.navbar-link');

// Toggle nav on button click
navToggler.addEventListener('click', function () {
  const navbarElement = document.getElementById('navbar');
  navbarElement.classList.toggle('active');
  this.classList.toggle('active');
});

// Close nav when a link is clicked
navLinks.forEach(link => {
  link.addEventListener('click', function () {
    const navbarElement = document.getElementById('navbar');
    navbarElement.classList.remove('active');
    navToggler.classList.remove('active');
  });
});

/**
 * Header Scroll State
 */
const header = document.querySelector('#header');

window.addEventListener('scroll', function () {
  if (window.scrollY > 100) {
    header.classList.add('active'); // Add background or shadow if needed in CSS
  } else {
    header.classList.remove('active');
  }
});

/**
 * Scroll Reveal Animation
 */
const revealElements = document.querySelectorAll('.fade-in-up, .section-title, .section-text, .service-card');

const revealCallback = function (entries, observer) {
  entries.forEach(entry => {
    if (entry.isIntersecting) {
      entry.target.classList.add('revealed');
      // Add animation class if not present
      entry.target.style.animation = 'fadeInUp 0.8s forwards';
      observer.unobserve(entry.target);
    }
  });
};

const revealObserver = new IntersectionObserver(revealCallback, {
  root: null,
  threshold: 0.15
});

revealElements.forEach(element => {
  // Initial state hidden
  element.style.opacity = '0'; 
  revealObserver.observe(element);
});
