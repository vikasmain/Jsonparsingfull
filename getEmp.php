<?php 
 
 //Getting the requested id
 if (isset($_GET['id'])) { // If the id get variable is set
    $id = $_GET['id'];
} else { // If the id get variable is not set
    $id = 1;
}
 
 
 //Importing database
 require_once('dbconnect.php');
 
 //Creating sql query with where clause to get an specific employee
 $sql = "SELECT * FROM employee WHERE id='$id'";
 
 //getting result 
 $r = mysqli_query($con,$sql);
 
 //pushing result to an array 
 $result = array();
 $row = mysqli_fetch_array($r);
 array_push($result,array(
 "id"=>$row['id'],
 "name"=>$row['name'],
 "desg"=>$row['designation'],
 "salary"=>$row['salary']
 ));
 
 //displaying in json format 
 echo json_encode(array('result'=>$result));
 
 mysqli_close($con);
 ?>