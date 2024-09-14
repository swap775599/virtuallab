<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Virtual Classroom - Home</title>
    <style>
        /* Global styles */
        body {
            font-family: 'Roboto', sans-serif;
            background-color: #f5f7fa;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            color: #333;
        }

        h1, h2 {
            color: #333;
            text-align: center;
        }

        .container {
            max-width: 1200px;
            width: 90%;
            margin: 0 auto;
            background-color: white;
            border-radius: 8px;
            box-shadow: 0px 4px 12px rgba(0, 0, 0, 0.1);
            overflow: hidden;
        }

        header {
            background-color: #007bff;
            color: white;
            padding: 20px;
            text-align: center;
        }

        /* Navigation Styles */
        nav {
            display: flex;
            justify-content: center;
            background-color: #0069d9;
            padding: 10px 0;
        }

        nav a {
            color: white;
            text-decoration: none;
            margin: 0 20px;
            font-size: 16px;
            text-transform: uppercase;
            transition: color 0.3s ease;
        }

        nav a:hover {
            color: #f8f9fa;
        }

        /* Hero Section */
        .hero {
            background-image: url('your-hero-image.jpg');
            background-size: cover;
            background-position: center;
            padding: 60px 0;
            text-align: center;
            color: white;
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
        }

        .hero h1 {
            font-size: 48px;
            font-weight: bold;
            margin-bottom: 10px;
            text-shadow: 2px 2px 8px rgba(0, 0, 0, 0.6);
        }

        .hero p {
            font-size: 18px;
            margin-bottom: 20px;
        }

        .cta-button {
            background-color: #28a745;
            color: white;
            padding: 15px 30px;
            border: none;
            border-radius: 4px;
            font-size: 18px;
            text-transform: uppercase;
            letter-spacing: 1px;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }

        .cta-button:hover {
            background-color: #218838;
        }

        /* Features Section */
        .features {
            display: flex;
            justify-content: space-around;
            padding: 40px;
            background-color: #f5f7fa;
        }

        .feature-box {
            background-color: white;
            width: 28%;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0px 4px 8px rgba(0, 0, 0, 0.1);
            text-align: center;
            transition: transform 0.3s ease, box-shadow 0.3s ease;
        }

        .feature-box:hover {
            transform: translateY(-10px);
            box-shadow: 0px 8px 20px rgba(0, 0, 0, 0.15);
        }

        .feature-box img {
            width: 60px;
            margin-bottom: 15px;
        }

        .feature-box h3 {
            margin-bottom: 10px;
            color: #007bff;
        }

        .feature-box p {
            font-size: 16px;
            color: #555;
        }

        /* Footer */
        footer {
            background-color: #343a40;
            color: white;
            padding: 20px;
            text-align: center;
            font-size: 14px;
        }

        /* Responsive */
        @media screen and (max-width: 768px) {
            .features {
                flex-direction: column;
                align-items: center;
            }

            .feature-box {
                width: 80%;
                margin-bottom: 20px;
            }

            .hero h1 {
                font-size: 36px;
            }
        }
    </style>
</head>
<body>

<div class="container">
    <!-- Header -->
    <header>
        <h1>Welcome to the Virtual Classroom</h1>
        <p>Empowering Education through Technology</p>
    </header>

    <!-- Navigation Bar -->
    <nav>
        <a href="#">Home</a>
        <a href="#">Classes</a>
        <a href="#">About</a>
        <a href="#">Contact</a>
    </nav>

    <!-- Hero Section -->
    <section class="hero">
        <h1>Enhance Your Learning Experience</h1>
        <p>Join us to explore the best educational resources online.</p>
        <button class="cta-button">Get Started</button>
    </section>

    <!-- Features Section -->
    <section class="features">
        <div class="feature-box">
            <img src="your-icon-url1.png" alt="Feature 1">
            <h3>Interactive Classes</h3>
            <p>Experience engaging and interactive live classes with our experienced instructors.</p>
        </div>

        <div class="feature-box">
            <img src="your-icon-url2.png" alt="Feature 2">
            <h3>Expert Teachers</h3>
            <p>Our platform brings you top educators from around the world for comprehensive learning.</p>
        </div>

        <div class="feature-box">
            <img src="your-icon-url3.png" alt="Feature 3">
            <h3>Flexible Scheduling</h3>
            <p>Learn at your own pace with flexible class timings and recorded sessions available anytime.</p>
        </div>
    </section>

    <!-- Footer -->
    <footer>
        <p>© 2024 Virtual Classroom. All rights reserved.</p>
    </footer>
</div>

</body>
</html>
