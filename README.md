# Mold Preparation Time Estimator

A Java desktop application that estimates three key processing times for custom molds based on seven user-provided inputs. The calculated times are:

- **Machine Preparation Time**
- **Machining Time**
- **Total Gluing Time**

This tool is useful for manufacturing or industrial companies that need fast and consistent estimations based on mold dimensions and characteristics.

---

## 🧠 How It Works

The estimation is based on 7 parameters:

1. Length (cm)
2. Width (cm)
3. Height (cm)
4. Number of pieces
5. Total mold thickness (cm)
6. Maximum machining depth (cm)
7. Number of glue layers

The total gluing time depends directly on the number of layers:
- 1 layer → 0 min
- Each additional layer adds 15 min

Preparation and machining times are based on reference data provided by the client.

---

## 🖥️ User Interface

The application features a clear and modern Swing-based graphical user interface (GUI):

- **Organized layout** for data input.
- **Styled result panel** displaying estimated times.
- **Logo loaded** from `src/img/logo.png`.

---

## 📁 Project Structure

```
src/
└── com.programa_costos/
    ├── MainApp.java               # Entry point
    ├── model/
    │   └── Molde.java             # Mold data model
    ├── service/
    │   └── CalculadoraTiempos.java # Time calculation logic
    └── view/
        └── VentanaPrincipal.java  # Java Swing GUI
img/
└── logo.png                       # Company logo used in UI
```

---

## 🚀 How to Run

1. **Clone the repository**

```bash
git clone https://github.com/your-username/mold-time-estimator.git
cd mold-time-estimator
```

2. **Open in NetBeans or your preferred IDE**

3. **Build and Run** the project:
   - Main class: `MainApp.java`
   - Ensure `logo.png` is located in `src/img/`

---

## 🔧 Technologies Used

- Java 8+
- Swing for GUI

---

## 📌 Notes

- The application currently does not read from Excel files — data is entered manually.
- Calculation logic will be updated as more real-world data becomes available.
- Extendable design — future support for data loading, exporting results, etc.

---

## 📋 License

This project is licensed under the MIT license.