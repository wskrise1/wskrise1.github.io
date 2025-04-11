<!DOCTYPE html>
<html>
<head>
  <title>Gradebook</title>
  <style>
    
    table {
      width: 100%;
      border-collapse: collapse;
    }
    th, td {
      border: 1px solid #000;
      padding: 8px;
      text-align: center;
    }
    th {
      background-color: #f2f2f2;
    }
  </style>
</head>
<body>
  <h1>Gradebook</h1>
  <table id="gradebook">
    <tr>
      <th>Student Name</th>
      <th>Assignment 1</th>
      <th>Assignment 2</th>
      <!-- Add more as needed -->
    </tr>
    <!-- Future dynamic rows will go here -->
  </table>

  <script src="gradebook.js"></script>
</body>
</html>
function fetchGradeData() {
  console.log("fetchGradeData called");
 
}

function populateGradebook() {
  console.log("populateGradebook called");
  
}

fetchGradeData();
populateGradebook();
