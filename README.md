# 🛒 Online Store

An interactive Java-based console application that simulates the operations of a small convenience store. The project was developed as part of CSE 1325 (Object-Oriented Programming) at the University of Texas at Arlington. This modular application showcases object-oriented design principles and offers functionalities like browsing products, applying tax rules, and generating receipts.

---

## 📂 Project Structure

The project is composed of six key Java classes:

### `1. Store.java` *(Main Class)*
- **Role:** Entry point of the program and handles the main loop for user interaction.
- **Functionality:**
  - Displays available products to the user.
  - Accepts user input to add items to a shopping cart.
  - Allows checkout by pressing `q` or `Q`.
  - Delegates receipt generation to `Receipt.java`.

### `2. Product.java`
- **Role:** Abstract representation of a product in the store.
- **Attributes:**
  - `name` – name of the product.
  - `price` – base price before tax.
- **Methods:**
  - `getName()`, `getPrice()`
  - `toString()` – for formatted display.

### `3. Taxed.java`
- **Extends:** `Product`
- **Role:** Represents a product that includes tax.
- **Functionality:**
  - Adds tax percentage (e.g., 8.25%) to the base price.
  - Overrides `getPrice()` to return price including tax.

### `4. Taxfree.java`
- **Extends:** `Product`
- **Role:** Represents a product that is exempt from tax.
- **Functionality:**
  - Inherits the price as-is from `Product.java`.
  - No override needed for tax calculations.

### `5. Receipt.java`
- **Role:** Compiles and prints the purchase summary after checkout.
- **Functionality:**
  - Tallies all selected products and quantities.
  - Calculates total cost.
  - Formats and prints a detailed receipt.
  - Creates a receipt text file using Java `FileWriter` to store transaction history.

### `6. README.md`
- **Role:** You are reading it! Provides documentation for the project.

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
