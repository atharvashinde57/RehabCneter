# Sanchit Rehab Center - Modern Website Redesign

A comprehensive, full-stack redesign of the **Sanchit Rehab** website, built to provide a compassionate, professional, and accessible digital presence for addiction recovery services in Gwalior.

![Project Banner](src/main/resources/static/assets/images/hero.jpg)

## 🚀 Key Features

### 🎨 Modern UI/UX
-   **Glassmorphism Design**: Featured in the navigation and cards for a premium, clean look.
-   **Responsive Layout**: Fully optimized for Mobile, Tablet, and Desktop.
-   **Custom Cursor**: A unique magnetic cursor effect that enhances interactivity.
-   **Smooth Animations**: Scroll-triggered fade-in effects for a dynamic user experience.

### 🛠 Technical Enhancements
-   **Spring Boot Backend**: robust Java-based server utilizing Thymeleaf for server-side rendering.
-   **Dynamic Routing**: Dedicated controllers for handling page navigation and content injection.
-   **SEO Optimized**: Semantic HTML structure, meta tags, and schema markup implemented for better search visibility.
-   **Performance**: Lightweight assets and clean CSS ensure fast load times.

### 📄 Pages & Functionality
1.  **Home Page**: Immersive Hero section, "Why Choose Us", and Approach highlights.
2.  **About Us**: Detailed facility information, team introduction, and mission statement.
3.  **Services**:
    *   **Modern Dropdown Menu**: Easy navigation to specific treatments.
    *   **Dedicated Sub-pages**: Alcohol, Drug, Nicotine, Cannabis, Opioids, and Gambling addiction treatments.
4.  **Gallery**: Responsive masonry grid showcasing facility amenities (Gym, Yoga, Medical Room).
5.  **Contact**:
    *   **Professional Layout**: High-contrast black/white design.
    *   **Google Maps Integration**: Direct location embedding.
    *   **Click-to-Call**: Direct phone links for immediate support.

---

## 🛠 Tech Stack

-   **Backend**: Java 17, Spring Boot 3.2.0
-   **Frontend**: HTML5, CSS3 (Custom Properties), JavaScript (ES6+)
-   **Templating**: Thymeleaf
-   **Build Tool**: Maven

---

## 🏃‍♂️ Running Locally

### Prerequisites
-   Java 17 Development Kit (JDK) installed.
-   Maven installed (or use the provided `mvnw` wrapper).

### Steps
1.  **Clone the Repository**
    ```bash
    git clone https://github.com/atharvashinde57/RehabCneter.git
    cd RehabCneter
    ```

2.  **Run the Application**
    ```bash
    mvn spring-boot:run
    ```

3.  **Access the Site**
    Open your browser and navigate to:
    `http://localhost:8080`

---

## ☁️ Deployment (Render)

This project is configured for easy deployment on **Render** using Docker.

1.  **Push to GitHub**: Ensure your latest code is on the `main` branch.
2.  **Create Web Service on Render**:
    *   **New +** > **Web Service**.
    *   Connect your GitHub repository: `atharvashinde57/RehabCneter`.
    *   **Runtime**: Select **Docker** (Critical Step).
    *   **Region**: Singapore (Recommended).
3.  **Deploy**: Render will automatically build via the `Dockerfile` and start the server.
    *   *Note*: The `Dockerfile` includes workaround scripts to handle "start" or "run" commands if you accidentally leave them in settings.

---

## 📁 Project Structure

```
src
├── main
│   ├── java
│   │   └── com.sanchitrehab
│   │       ├── SanchitRehabApplication.java  # Main Entry Point
│   │       └── controller
│   │           └── HomeController.java       # Route Handling
│   └── resources
│       ├── static
│       │   └── assets                        # CSS, JS, Images
│       ├── templates                         # HTML Fragments & Pages
│       └── application.properties            # Configuration
└── test                                      # Unit Tests
```

---

## 📞 Contact Support

For technical support or inquiries about the codebase, please open an issue in this repository.

**Sanchit Rehab** - *Your Path to Recovery Starts Here.*
