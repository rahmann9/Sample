

// Function to add a new transaction to the table
function addTransaction() {
  // Retrieve form values
  var type = document.getElementById('type').value;
  var amount = document.getElementById('amount').value;
  var description = document.getElementById('description').value;

  // Validate amount (for simplicity, assuming amount is always valid in this example)
  if (type && amount) {
    // Create a new row in the table
    var tableBody = document.getElementById('transactionTableBody');
    var newRow = tableBody.insertRow();

    // Create cells for the row
    var dateCell = newRow.insertCell(0);
    var typeCell = newRow.insertCell(1);
    var amountCell = newRow.insertCell(2);
    var descriptionCell = newRow.insertCell(3);

    // Populate cells with data
    dateCell.textContent = getCurrentDate();
    typeCell.textContent = type.charAt(0).toUpperCase() + type.slice(1); // Capitalize first letter
    amountCell.textContent = '$' + amount;
    descriptionCell.textContent = description;

    // Clear the form inputs after adding the transaction
    document.getElementById('type').value = 'expense'; // Reset type to default
    document.getElementById('amount').value = '';
    document.getElementById('description').value = '';
  } else {
    alert('Please fill out all fields.');
  }
}

// Function to get the current date in YYYY-MM-DD format
function getCurrentDate() {
  var now = new Date();
  var year = now.getFullYear();
  var month = ('0' + (now.getMonth() + 1)).slice(-2); // Add leading zero if needed
  var day = ('0' + now.getDate()).slice(-2); // Add leading zero if needed
  return year + '-' + month + '-' + day;
}
