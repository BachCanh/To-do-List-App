# 📝 To-Do List Android App

A simple, beautiful To-Do List application built using **Kotlin** and **Jetpack Compose**, designed to help beginners learn core Android components and modern UI development.

---

## 📱 Features

- ✅ Add tasks with a name and due date  
- 🗂️ View tasks in a scrollable list  
- 🔀 Sort tasks by **Name** or **Due Date**  
- 📅 Use DatePicker to select due dates  
- 💡 Clean architecture using **Jetpack ViewModel**  
- 🖼️ Modern UI with **Material 3** and **Jetpack Compose**

---

## 🧰 Tech Stack

- **Minimum SDK**: 24 (Android 7.0)
- **Language**: Kotlin
- **UI Toolkit**: Jetpack Compose
- **Architecture**: MVVM (Model-View-ViewModel)

### Dependencies Used

- `androidx.compose.material3`
- `androidx.lifecycle.viewmodel.compose`
- `androidx.activity.compose`
- `androidx.lifecycle.runtime.ktx`
- `androidx.compose.ui.*`

---

## 📸 Screenshots

> _Add screenshots here for better presentation (optional)_

---

## 🚀 Getting Started

### 1. Clone the repository

```bash
git clone https://github.com/your-username/todo-list-compose.git
cd todo-list-compose
```

### 2. Open in Android Studio

1. Launch **Android Studio**
2. Click `File > Open`
3. Select this project folder

### 3. Run the App

1. Connect your Android device **or** start an emulator
2. Click the **Run ▶️** button in Android Studio

---

## 📂 Project Structure

```bash
📁 app
└── 📁 src
    └── 📁 main
        ├── 📁 ui        # Composable UI components
        ├── 📁 viewmodel # TaskViewModel (logic & state)
        ├── 📁 model     # Task data model
        └── MainActivity.kt
```

