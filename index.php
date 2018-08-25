<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title>Máy tính bỏ túi</title>
    </head>
    <body>
    <center>
        <form border="px" action="" method="post">
            <table>
                <tr>
                    <td bgcolor="#7ab6de"><font color='#ffffff'>Máy tính bỏ túi </font> </td>
                </tr>

                <tr>
                    <td height="20px"></td>
                </tr>
                
                <tr>
                    <td>
                        <label><b>Số A</b></label>
                    </td>
                    <td>
                        <input type="number" name="soa">
                    </td>
                </tr>
                
                <tr>
                    <td>
                        <label><b>Số B</b></label>
                    </td>
                    <td>
                        <input type="number" name="sob">
                    </td>
                </tr>
                
                <tr>
                    <td>
                        <label><b>Lựa chọn</b></label>
                    </td>
                    <td>
                        <input type="radio" name="lc" value="cong2so">
                        <b>Cộng 2 số</b> 
                        
                        <br>
                        <input type="radio" name="lc" value="hieu2so">
                        <b>Hiệu 2 số</b> 
                        
                        <br>
                        <input type="radio" name="lc" value="nhan2so">
                        <b>Nhân 2 số</b> 
                        
                        <br>
                        <input type="radio" name="lc" value="chia2so">
                        <b>Chia 2 số</b> 
                        
                    </td>
                    
                </tr>
                
                <tr>
                    <td>
                        <input type="reset" value="Nhập lại">
                    </td>
                    <td>
                        <input type="submit" value="Tính" name="submit">
                    </td>
                </tr>
            </table>
        </form>  
    </center>

        <?php
            $soa  ; $sob; $lc = "";
            if(isset($_POST["submit"])){
                $soa = $_POST["soa"];
                $sob = $_POST["sob"];
                $lc = $_POST["lc"];
            }
           
            if(($lc == "cong2so") && $lc != NULL)               
                echo $soa + $sob;
            if(($lc == "hieu2so") && $lc != NULL)               
                echo $soa - $sob;
            if(($lc == "nhan2so") && $lc != NULL)               
                echo $soa * $sob;
            if(($lc == "chia2so") && $lc != NULL)               
                echo $soa / $sob;
                
        ?>
    </body>
</html>
