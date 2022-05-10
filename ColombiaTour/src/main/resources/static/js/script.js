window.onload=function mouse(){
    amazonas=document.getElementById("COL1283");
    amazonas.addEventListener('mouseenter', entro);

    antioquia=document.getElementById("COL1314");
    antioquia.addEventListener('mouseenter', entro2);


    
    
}

function entro(){
    document.getElementById("cambiar").innerText="Amazonas"

}

function entro2(){
    document.getElementById("cambiar").innerText="Antioquia"
}
