# 🛒 Online Store

An **interactive Java-based console application** that simulates the core operations of a small convenience store 🏪. This project was developed as part of **CSE 1325: Object-Oriented Programming** at **The University of Texas at Arlington** 🎓

The **Online Store** application allows users to browse a selection of virtual products — such as 🍞 bread, 🥛 milk, 🥤 soda, and more — and add them to a digital shopping cart 🛍️. It incorporates **object-oriented principles** like **inheritance**, **polymorphism**, and **modular design**, with separate classes for handling products, tax rules, checkout, and receipt generation.

### 🔧 Key Features:
- Differentiation between **taxable** and **tax-free** items 💸
- Automatic **tax calculation** based on product type
- A fully **text-based user interface** for terminal usage 💻
- **Dynamic receipt generation** in both console output and a persistent `.txt` file using Java’s file I/O operations 🧾
- Intuitive product selection and checkout experience using simple keyboard inputs ⌨️

This project emphasizes clean architecture and educational implementation of **Java fundamentals** such as:
- 🧱 Class hierarchies
- 🔁 Method overriding
- 🗂️ File handling
- 🧍‍♂️ User input via `Scanner`
- 🧮 Dynamic lists using `ArrayList`

Despite being a console-based application, the project simulates the essence of real-world store functionality 🛒 with logical design patterns and modular code organization, making it a valuable learning experience for students like me aiming to strengthen their Java and object-oriented programming skills.

---

### 📦 This Repository Contains:
- 📁 Source code (`.java` files)
- 📄 Project documentation
- 📝 Sample receipts
- 🧾 A comprehensive README for setup and instructions

🔽 Scroll down to explore the project structure, features, usage guide, and future enhancement ideas!

---

## 📂 Project Structure

The project is composed of six key Java classes. Click to expand each section for detailed explanations:

<details>
  <summary>🧠 1. <code>Store.java</code> – Main Controller (Entry Point)</summary>

**Role:**  
Serves as the main entry point of the application and acts as the central hub for all user interaction and system flow control.

**Key Responsibilities:**
- Initializes the list of products available in the store.
- Presents users with a clean menu-like terminal interface to view and add items.
- Accepts user input using `Scanner` to:
  - Add items to a virtual shopping cart.
  - Exit and trigger the checkout process by entering `q` or `Q`.
- Manages an internal list of selected `Product` objects (both taxed and tax-free).
- Delegates the final receipt generation to the `Receipt.java` class.

</details>

<details>
  <summary>🧱 2. <code>Product.java</code> – Base Class (Abstract Product)</summary>

**Role:**  
Provides a blueprint for defining all store products, using encapsulation and abstraction.

**Attributes:**
- `name` – The name of the product (e.g., "Milk").
- `price` – The base price before tax is applied.

**Methods:**
- `getName()` – Returns the name of the product.
- `getPrice()` – Returns the base price (to be overridden in child classes if needed).
- `toString()` – Provides a clean, readable string representation of the product for display.

</details>

<details>
  <summary>💰 3. <code>Taxed.java</code> – Taxable Product</summary>

**Extends:** `Product.java`  
**Role:**  
Represents a product that includes tax in its final cost.

**Functionality:**
- Applies a fixed tax percentage (typically 8.25%) to the product price.
- Overrides `getPrice()` from `Product.java` to calculate the tax-inclusive price.
- Still retains all behaviors from the base `Product` class.

Used for items like soda, lunch meat, and paper plates that are legally subject to sales tax.

</details>

<details>
  <summary>🆓 4. <code>Taxfree.java</code> – Tax-Free Product</summary>

**Extends:** `Product.java`  
**Role:**  
Represents a product exempt from sales tax.

**Functionality:**
- Inherits the base price and all methods directly from `Product.java`.
- Does not override `getPrice()`, as no additional tax is applied.
- Used for essential food items like milk or bread.

</details>

<details>
  <summary>🧾 5. <code>Receipt.java</code> – Receipt Generator</summary>

**Role:**  
Handles the compilation and output of the final transaction receipt after user checkout.

**Functionality:**
- Receives the list of purchased items from `Store.java`.
- Aggregates products and quantities into a formatted summary.
- Calculates and displays:
  - Quantity of each item.
  - Individual and total prices.
  - Final total including tax where applicable.
- Outputs the receipt in two ways:
  - **Console:** Instant terminal display.
  - **File:** Generates a `receipt.txt` file using Java’s `FileWriter` for permanent storage.

Also includes a timestamp in the receipt for proper record-keeping.

</details>

<details>
  <summary>📖 6. <code>README.md</code> – Documentation</summary>

**Role:**  
You are reading it!

This Markdown file serves as the project's documentation hub, providing:
- An overview of the project’s goals and scope.
- Detailed component breakdowns.
- Setup and usage instructions.
- Future improvement ideas.

</details>
"""

## 📦 Features

- Browse a list of predefined products (e.g., milk, soda, bread, etc.).
- Items are classified into taxed or tax-free categories.
- Add multiple items to the shopping cart.
- Checkout via keyboard input.
- Dynamically generates an itemized receipt both on the console and as a `.txt` file.
- Clean object-oriented design with abstraction and inheritance.

---

## 🖥️ Terminal-Only UI

> There is **no GUI** interface. The application runs entirely in a terminal window.

- **Why Terminal?**
  - The goal was to focus on core object-oriented programming skills and file I/O handling in Java, not front-end development.

---

## 🧪 Sample Product List

The Online Store provides a simple but diverse inventory of common convenience store items. Each product falls into a specific category and may or may not be subject to sales tax, depending on its type. This system is designed to reflect real-world tax logic in many regions (e.g., tax exemptions on essential groceries like dairy and bakery items).

Below is the default product list available in the store:

| 🛍️ Product       | 🏷️ Category   | 💵 Price (USD) | 🧾 Taxed? |
|------------------|---------------|----------------|-----------|
| 🥛 Milk          | Dairy         | $3.00          | ❌ No      |
| 🥤 Soda          | Beverage      | $1.50          | ✅ Yes     |
| 🍞 Bread         | Bakery        | $2.50          | ❌ No      |
| 🥩 Lunch Meat    | Deli          | $4.25          | ✅ Yes     |
| 🍽️ Paper Plates | Utility       | $2.75          | ✅ Yes     |
| 🧴 Mayonnaise    | Grocery       | $3.50          | ✅ Yes     |

---

### 📌 Notes:
- ❌ **Tax-Free Items:** Milk and bread are treated as essentials and are exempt from tax.
- ✅ **Taxable Items:** Soda, lunch meat, paper plates, and mayonnaise are taxed at the configured rate (e.g., 8.25%).
- The tax logic is implemented using subclassing: `Taxed.java` for taxable items and `Taxfree.java` for exempt items.

These products can be typed exactly as shown during runtime to add them to your shopping cart. The list is customizable in the code and can be extended by modifying the `Store.java` file.


---

## ▶️ How to Run

This section provides a step-by-step walkthrough for compiling and executing the **Online Store** Java project locally on your machine.

---

### ✅ Prerequisites

Make sure the following tools and setups are ready on your computer before running the project:

- ☕ **Java Development Kit (JDK)** – Version 8 or higher  
  👉 [Download Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html)

- 💻 **Command Line Interface**  
  - Windows: Command Prompt or PowerShell  
  - macOS/Linux: Terminal

- 🧑‍💻 **Text Editor or IDE** (Optional but recommended)  
  Examples:
  - [IntelliJ IDEA](https://www.jetbrains.com/idea/)
  - [Visual Studio Code](https://code.visualstudio.com/)
  - [Eclipse](https://www.eclipse.org/)

---

### 💻 Steps to Run the Project

#### 📥 1. Clone or Download the Repository

You can either clone the repository using Git or download it manually as a ZIP.

**Option A: Using Git**
```bash
git clone https://github.com/devpat0304/Online-Store.git
cd Online-Store
```

## 🧰 Option B: Manual Download and Execution

If you do not have Git installed or prefer a manual setup, follow the steps below to download, compile, and run the **Online Store** Java application.

---

### 📥 1. Download the Project ZIP

1. Navigate to the GitHub repository: [Online Store GitHub](https://github.com/devpat0304/Online-Store)
2. Click the green **`Code`** button.
3. Select **`Download ZIP`**.
4. Extract the contents to a folder of your choice on your computer.

---

### 💻 2. Open Terminal and Navigate to the Project Folder

Open your terminal (Command Prompt, PowerShell, Terminal, etc.) and use the `cd` command to enter the extracted folder.

```bash
cd path/to/Online-Store
```

## ▶️ Running the Project (Manual Method)

Follow these instructions to compile and run the **Online Store** Java application manually from the terminal.

---

### 🗂️ Ensure All Required Files Are Present

Make sure all the following `.java` files are located in the **same directory**:

- `Store.java`
- `Product.java`
- `Taxed.java`
- `Taxfree.java`
- `Receipt.java`

---

### ⚙️ 3. Compile the Java Source Files

Open your terminal in the folder where the above files are located, and run:

```bash
javac *.java
```

## ▶️ 4. Run the Application

After compiling the source code, start the application by running the following command in your terminal:

```bash
java Store
```

## 🧑‍🏫 5. Using the Application

Once the program is running:

- 📝 You will be prompted to enter product names.
- 🛍️ To add an item to your cart, type the name of the product (e.g., `Soda`) and press `Enter`.
- ➕ You can add as many products as you like by repeating this step.
- 🧾 To proceed to checkout, type:

```text
q
```

## 🧾 What Happens at Checkout

When you proceed to checkout, the system will perform the following actions:

- 🖨️ **Print** a detailed receipt directly in the terminal for immediate reference.
- 💾 **Generate** a file named `receipt.txt` inside your project folder to store the transaction permanently.

---

## 📄 6. View the Receipt File

After checkout is complete:

1. Navigate to your project folder.
2. Locate and open the file named `receipt.txt` using any text editor, such as:
   - Visual Studio Code (VS Code)
   - Notepad
   - Sublime Text
   - Any IDE or plain-text viewer

---

### 🧾 The Receipt Contains:

- ✅ A complete list of all purchased products and the quantity of each.
- 💲 Individual prices for each item and the calculated total cost.
- 🕒 A timestamp showing the exact date and time when the purchase was completed.

This receipt serves both as a confirmation for the current session and as a saved record for future reference.




