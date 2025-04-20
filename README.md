### Student Name: Bạch Đức Cảnh
### Student ID: 22110012
### Project: To-Do List app

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

![image](https://github.com/user-attachments/assets/188ff75f-71b7-466b-be36-e57508ff22f5)

![image](https://github.com/user-attachments/assets/55e13816-d0cc-4869-a26b-5005014c1a33)

![image](https://github.com/user-attachments/assets/fff4e382-e176-4ec3-9649-0361293e83dd)

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

