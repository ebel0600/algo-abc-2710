<?php
    $tableau = array();
    for($i = 0; $i<10;$i++){
        $tableau[$i]=rand(1,100);
    }
    sort($tableau);
    $resultat = implode("; ", $tableau);

    echo "Les valeurs par ordre croissont sont comme suit :".$resultat;

?>