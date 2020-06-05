/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

const ruleta = document.querySelector("#ruleta");

ruleta.addEventListener("click",girar);

dinero = 2000;

function girar(){
    if (dinero) {
    	let rand = Math.random()*7200; 
    	sumarPuntos(0);
        calcular(rand);
    }  
    else {
    	alert("no te queda suficiente dinero");
    }
}
function sumarPuntos(p){
	dinero += p;
    document.querySelector("#dinero").innerHTML = "Dinero: $" + dinero ;
}


function calcular(rand){
    valor = rand / 360;
    valor = (valor - parseInt(valor.toString().split(".")[0])) * 360;
    ruleta.style.transform = "rotate("+rand+"deg)";
    setTimeout(()=>{
    switch(true){
    	case valor > 0 && valor <= 60:
    	    alert("toma 1");
            sumarPuntos(-100)
    	    break;
    	case valor > 60 && valor <= 120:
    	    alert("toma 2");
    	    sumarPuntos(-200);
    	    break;
        case valor > 120 && valor <= 180:
            alert("todos ponen");
            sumarPuntos(400);
            break; 
        case valor > 180 && valor <= 240:
            alert("pon 2");
            sumarPuntos(200);
            break;
        case valor > 240 && valor <= 300:
            alert("pon 1");
            sumarPuntos(100);
            break;
        case valor > 300 && valor <= 360:
            alert("toma todo");
            sumarPuntos(0);
            break;    
    }},5000);
}


