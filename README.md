The Online Store is a Java program designed to emulate the functionality of a typical convenience store.

It provides a selection of essential food items like bread, lunch meat, milk, soda, paper plates, and mayonnaise.

Users can easily browse, select, and add items to a virtual shopping cart. Upon checkout, the Online Store generates a detailed receipt outlining the number of each item purchased and a clear breakdown of the total cost, including taxes.

The current system for the program functions as a shopping platform, providing users with the ability to browse and select items from a list. Primarily focused on presenting available products such as bread, lunch meat, milk, soda, paper plates, and mayonnaise, the existing system allows users to add selected items to a virtual shopping cart. Once users have completed their selection process, they can proceed to a checkout feature by clicking "q" or "Q", where the chosen items are confirmed for purchase.

Project Specification/ Function Modules

1. Store java class: Considered the Main class of the program
- The application employs techniques by printing information (list of products) within the terminal, ensuring a seamless and user-friendly experience; with the addition of scanner input of adding the items you would like to add to your virtual shopping cart.

2. Product.java class: Creates the object "product"
- The application allows you to create objects (products) each one gets its own name and a price tag. This way, you can keep everything organized and manage your virtual shopping cart.

3. Taxed.java: extends the Product class
- The application adds a "tax" (price) to the existing product with an existing price tag, essentially increasing the price of the original product.

4. Taxfree.java: extends the Product class
- The application declares a product as not having a "tax", if the product doesn't contain a tax.

5. ﻿﻿﻿Receipt.java: Prints details of receipt
- The application combines the prices of all items, calculates a total price, and generates a detailed receipt in a user-friendly format. This receipt includes the quantity of each item, and at the end, it declares the overall total price. Additionally, the system automatically produces a text file using File Writer, ensuring a convenient record of the transaction details.
