# 🛒 Online Store

![Online Store Banner](image.png)

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
- Automatically generates an itemized receipt both in the console and as a `.txt` file.
- Clean object-oriented design following principles like abstraction and inheritance.

---

## 🖥️ Terminal-Only UI

> ⚠️ There is **no graphical user interface (GUI)**. The application runs entirely within the terminal.

**Why Terminal-Based?**
- The goal is to emphasize core Java concepts like OOP, file I/O, and terminal-based interaction rather than front-end development.

---

## 🧪 Sample Product List

The Online Store includes a variety of common convenience store items. Each item falls into a specific category and may or may not be taxed, reflecting typical retail practices.

| 🛍️ Product       | 🏷️ Category   | 💵 Price (USD) | 🧾 Taxed? |
|------------------|---------------|----------------|-----------|
| 🥛 Milk          | Dairy         | $3.00          | ❌ No     |
| 🥤 Soda          | Beverage      | $1.50          | ✅ Yes    |
| 🍞 Bread         | Bakery        | $2.50          | ❌ No     |
| 🥩 Lunch Meat    | Deli          | $4.25          | ✅ Yes    |
| 🍽️ Paper Plates | Utility       | $2.75          | ✅ Yes    |
| 🧴 Mayonnaise    | Grocery       | $3.50          | ✅ Yes    |

### 📌 Notes:
- ❌ **Tax-Free Items:** Milk and bread are treated as essentials and are exempt from tax.
- ✅ **Taxable Items:** Soda, lunch meat, paper plates, and mayonnaise include tax.
- Tax logic is implemented via inheritance using `Taxed.java` and `Taxfree.java`.

You can modify or extend this product list directly in `Store.java`.

---

## ▶️ How to Run

This section explains how to compile and run the **Online Store** project locally.

### ✅ Prerequisites

Ensure the following tools are installed:

- ☕ **Java JDK 8 or higher**  
  👉 [Download Java](https://www.oracle.com/java/technologies/javase-downloads.html)

- 💻 **Terminal or Command Line Interface**  
  - Windows: Command Prompt or PowerShell  
  - macOS/Linux: Terminal

- 🧑‍💻 **Text Editor or IDE** (recommended)  
  - [IntelliJ IDEA](https://www.jetbrains.com/idea/)  
  - [Visual Studio Code](https://code.visualstudio.com/)  
  - [Eclipse](https://www.eclipse.org/)

---

### 💻 Steps to Run the Project

#### 📥 1. Clone or Download the Repository

**Option A: Using Git**
```bash
git clone https://github.com/devpat0304/Online-Store.git
cd Online-Store
```

## 🧰 Option B: Manual Download and Execution

If you prefer not to use Git:

### 📥 Manual Download

1. Go to the GitHub repository: [Online Store GitHub](https://github.com/devpat0304/Online-Store)
2. Click the green **`Code`** button
3. Select **`Download ZIP`**
4. Extract the contents to a folder on your machine

### 💻 Navigate to Project Folder

Open a terminal window and navigate to the extracted folder:
```bash
cd path/to/Online-Store
```

---

## ▶️ Running the Project (Manual Method)

### 🗂️ Ensure All Required Files Are Present

Make sure the following `.java` files are located in the same folder:
- `Store.java`
- `Product.java`
- `Taxed.java`
- `Taxfree.java`
- `Receipt.java`

### ⚙️ 3. Compile the Java Source Files

Compile all the files using:
```bash
javac *.java
```

## ▶️ 4. Run the Application

Start the application with:
```bash
java Store
```
You should now see the Online Store interface in the terminal.

---

## 🧑‍🏫 5. Using the Application

Once the program is running:

- 📝 You'll be prompted to enter product names.
- 🛍️ To add an item, type its name (e.g., `Soda`) and press `Enter`.
- ➕ You may continue adding items one by one.
- 🧾 To checkout, type:

```text
q
```
or
```text
Q
```

---

## 🧾 What Happens at Checkout

Once you checkout:

- 🖨️ **A receipt is printed** directly in the terminal.
- 💾 **A file named `receipt.txt`** is created in your project folder for permanent record.

---

## 📄 6. View the Receipt File

After checkout:

1. Open your project folder
2. Locate and open `receipt.txt` using a text editor like:
   - Visual Studio Code
   - Notepad
   - Sublime Text

### 🧾 Receipt Includes:

- ✅ Purchased items with their quantities
- 💲 Individual prices and total cost
- 🕒 Date and time of transaction

The receipt provides a summary of the session and a saved transaction log.

---

## 🎯 Learning Objectives

This project was designed to reinforce the following Java and software development skills:

- Object-oriented design using abstraction and inheritance
- Java I/O for writing external files
- Console-based interaction and user input handling
- Modular class separation and responsibility management
- Compilation and execution workflows for Java applications

---

## 🚀 Future Enhancements

- Add persistent product inventory with file/database storage
- Implement a GUI using JavaFX or Swing
- Include product quantity tracking (stock levels)
- Add discount or promo code logic
- Support multilingual output

---

## 🙏 Thank You

Thank you for taking the time to explore this project!  
I hope you find it insightful, educational, or simply a fun way to see Java in action.  
Feel free to fork, modify, or contribute — and happy coding! 💻✨
