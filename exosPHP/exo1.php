<?php
    $tableau1 = array();
    for($i=1;$i<=10;$i++){
        array_push($tableau1,$i);
    }
    $tableau2 = array();
    for($j=11;$j<=20;$j++){
        array_push($tableau2,$j);
    }
    $tableau3 = array();
    for($k=0;$k<10;$k++){
        array_push($tableau3,$tableau1[$k]+$tableau2[$k]);
    }
    foreach($tableau3 as $val){
        echo $val."<br />";
    }
?>
