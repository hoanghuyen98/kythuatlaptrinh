<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title>Form vẽ bảng</title>
    </head>
    <body>
    <center>
        <form action="" method="post">
            <table>
                <tr>
                    <td bgcolor="#7ab6de"><font color="#ffffff">Form vẽ bảng</font></td>
                </tr>
                
                <tr>
                    <td height="20px"></td>
                </tr>
                
                <tr>
                    <td>
                        <label> Số Dòng </label>
                    </td>
                    <td>
                        <input type="number" name="sodong">
                    </td>
                </tr>
                
                <tr>
                    <td>
                        <label> Số cột </label>
                    </td>
                    <td>
                        <input type="number" name="socot">
                    </td>
                </tr>
                
                <tr>
                    <td>
                        <input type="reset" value="Nhập lại">
                    </td>
                    <td>
                        <input type="submit" name="submit" value="Vẽ">
                    </td>
                </tr>
            </table>
                
        </form>
    </center>
        
        <?php
        $sodong = "";
        $socot = "";
        if(isset($_POST["submit"])){
            $sodong = $_POST["sodong"];
            $socot = $_POST["socot"];
        }
        if($sodong > 0 && $socot > 0)
            echo "<table border=1px>";
            for($i = 1; $i <= $sodong; $i++){
                echo "<tr>";
                for($j = 1; $j <= $socot; $j++){
                    $tich = $i*$j;
                        echo "<td width=100px height=15px> $tich </td>";   
                }
                echo "</tr>";   
            }
            echo "</table>"; 
        ?>
    </body>
</html>
