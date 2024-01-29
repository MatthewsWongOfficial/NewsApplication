# Mandiri News App

## Overview

Mandiri News App is a modern Android application that provides users with the latest news articles. The app is built using Kotlin and follows the principles of the Model-View-ViewModel (MVVM) architecture.

## Tech Stack

- **Kotlin**: The programming language used for developing the entire application.
- **Android Jetpack Libraries**: Utilized for a variety of Android components and features, including Navigation, LiveData, ViewModel, etc.
- **Compose UI**: The application leverages Jetpack Compose for building the user interface.
- **Material3 Design**: Utilized for consistent and modern design elements.
- **Navigation Component**: Used for handling navigation and managing app navigation graph.
- **Retrofit**: A popular HTTP client library for making network requests.
- **ViewModel and LiveData**: For managing UI-related data in a lifecycle-conscious way.
- **Dependency Injection with Dagger Hilt**: Used for providing and managing dependencies in the app.

## App Flow

1. **Splash Screen**: Briefly introduces the app and prepares it for the main screen.
2. **News Activity**: The main screen where users can explore the latest news articles.
3. **Navigation Drawer**: Provides navigation options for different sections or categories of news.
4. **Article Details Screen**: Users can view detailed information about a selected news article.
5. **Network Requests**: Retrofit is used to fetch news data from a remote server.
6. **Error Handling**: Proper handling of errors and network connectivity issues.

