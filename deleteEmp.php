<?php 
 //Getting Id
 if (isset($_GET['id'])) { // If the id get variable is set
    $id = $_GET['id'];
} else { // If the id get variable is not set
    $id = 1;
}
 
 //Importing database
 require_once('dbconnect.php');
 
 //Creating sql query
 $sql = "DELETE FROM employee WHERE id='$id';";
 
 //Deleting record in database 
 if(mysqli_query($con,$sql)){
 echo 'Employee Deleted Successfully';
 }else{
 echo 'Could Not Delete Employee Try Again';
 }
 
 //closing connection 
 mysqli_close($con);
 ?>