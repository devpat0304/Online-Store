# 🛒 Online Store

An interactive Java-based console application that simulates the operations of a small convenience store. The project was developed as part of CSE 1325 (Object-Oriented Programming) at the University of Texas at Arlington. This modular application showcases object-oriented design principles and offers functionalities like browsing products, applying tax rules, and generating receipts.

---

## 📂 Project Structure

The project is composed of six key Java classes, each fulfilling a distinct responsibility in this object-oriented design. Together, they simulate a virtual shopping experience using console-based interaction and file generation.

---

### 1. `Store.java` – 🧠 Main Controller (Entry Point)
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

---

### 2. `Product.java` – 🧱 Base Class (Abstract Product)
**Role:**  
Provides a blueprint for defining all store products, using encapsulation and abstraction.

**Attributes:**
- `name` – The name of the product (e.g., "Milk").
- `price` – The base price before tax is applied.

**Methods:**
- `getName()` – Returns the name of the product.
- `getPrice()` – Returns the base price (to be overridden in child classes if needed).
- `toString()` – Provides a clean, readable string representation of the product for display.

This class forms the backbone of both taxed and tax-free product types by enabling polymorphic behavior.

---

### 3. `Taxed.java` – 💰 Taxable Product
**Extends:** `Product.java`  
**Role:**  
Represents a product that includes tax in its final cost.

**Functionality:**
- Applies a fixed tax percentage (typically 8.25%) to the product price.
- Overrides `getPrice()` from `Product.java` to calculate the tax-inclusive price.
- Still retains all behaviors from the base `Product` class.

Used for items like soda, lunch meat, and paper plates that are legally subject to sales tax.

---

### 4. `Taxfree.java` – 🆓 Tax-Free Product
**Extends:** `Product.java`  
**Role:**  
Represents a product exempt from sales tax.

**Functionality:**
- Inherits the base price and all methods directly from `Product.java`.
- Does not override `getPrice()`, as no additional tax is applied.
- Used for essential food items like milk or bread.

This class simplifies handling tax-exempt items while still fitting into the polymorphic product system.

---

### 5. `Receipt.java` – 🧾 Receipt Generator
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

---

### 6. `README.md` – 📖 Documentation
**Role:**  
You are reading it!

This Markdown file serves as the project's documentation hub, providing:
- An overview of the project’s goals and scope.
- Detailed component breakdowns.
- Setup and usage instructions.
- Future improvement ideas.
- Credit to developers and references used.

---

Each class in this project adheres to **object-oriented principles** such as encapsulation, inheritance, and separation of concerns, enabling code reusability and maintainability throughout the application.

---

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

| Product       | Category | Price | Taxed? |
|---------------|----------|-------|--------|
| Milk          | Dairy    | 3.00  | No     |
| Soda          | Beverage | 1.50  | Yes    |
| Bread         | Bakery   | 2.50  | No     |
| Lunch Meat    | Deli     | 4.25  | Yes    |
| Paper Plates  | Utility  | 2.75  | Yes    |
| Mayonnaise    | Grocery  | 3.50  | Yes    |

---

## ▶️ How to Run

### ✅ Prerequisites
- Java JDK 8 or higher
- Terminal or command prompt
- Text editor or IDE (e.g., IntelliJ, VS Code, Eclipse)

### 💻 Steps

1. **Clone or Download the Repository**
   ```bash
   git clone https://github.com/devpat0304/Online-Store.git
   cd Online-Store
