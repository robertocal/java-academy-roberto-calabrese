function stampa(x, soluzione){
    console.log("Esercizio " + x + ", soluzione: " + soluzione)
}
function somma() {
    for(var i = 0; i < arguments.length; i+=2){
        stampa(1, (arguments[i] + arguments[i+1]))
    }
}
function differenza() {
    for(var i = 0; i < arguments.length; i+=2)
        stampa(2, (arguments[i] - arguments[i+1]))
}
function moltiplicazione() {
    for(var i = 0; i < arguments.length; i+=2)
        stampa(3, (arguments[i] * arguments[i+1]))
}
function divisione() {
    for(var i = 0; i < arguments.length; i+=2)
        stampa(4, (arguments[i] / arguments[i+1]))
}
function resto() {
    for(var i = 0; i < arguments.length; i+=2)
        stampa(5, (arguments[i] % arguments[i+1]))
}
function media_aritmetica() {
    for(var i = 0; i < arguments.length; i++){
        var sum = 0
        for(j = 0; j < arguments[i].length; j++){
            sum += arguments[i][j]
        }
        stampa(6, (sum/arguments[i].length))
    }
}
function pari_dispari(){
    for(var i = 0; i < arguments.length; i++){
        if(arguments[i] % 2 === 0)
            stampa(7, 'pari')
        else
            stampa(7, 'dispari')
    }
}
function maggiore_minore(){
    for(var i = 0; i < arguments.length; i+=2){
        if(arguments[i] > arguments[i+1]){
            stampa(8, 'primo numero maggiore del secondo')
        }else if(arguments[i] < arguments[i+1]){
            stampa(8, 'secondo numero maggiore del primo')
        }else if(arguments[i] === arguments[i+1]){
            stampa(8, 'numeri uguali')
        }
    }
}
function stringa_vuota(){
    for(var i = 0; i < arguments.length; i++){
        if (arguments[i].trim().length === 0) {
            stampa(9, 'stringa vuota')
          } else {
            stampa(9, 'stringa non vuota')
        }
    }
}
function sottostringa(){
    for(var i = 0; i < arguments.length; i++){
        if(arguments[i].includes('casa')){
            stampa(10, 'sottostringa contenuta')
        }else{
            stampa(10, 'sottostringa non contenuta')
        }
    }
}
function vocale_consonante(){
    for(var i = 0; i < arguments.length; i++){
        var char = arguments[i].toLowerCase();
        if(char === 'a' || char === 'e' || char === 'i' || char === 'o' || char === 'u'){
            stampa(11, 'vocale')
        }else{
            stampa(11, 'consonante')
        }
    }
}
function div3o5(){
    for(var i = 0; i < arguments.length; i++){
        if(arguments[i] % 3 === 0){
            if(arguments[i] % 5 === 0){
                stampa(12, 'numero divisibile per 3 e 5')
            }else{
                stampa(12, 'numero divisibile solo per 3')
            }
        }else if(arguments[i] % 5 === 0){
            stampa(12, 'numero divisibile solo per 5')
        }
    }
}
function stampa_array(){
    var array = [1,2,3,4,5]
    stampa(13, array)
    var array = [6,7,8,9,10]
    stampa(13, array)
}
function cerca_elemento(){
    for(var i = 0; i < arguments.length; i++){
        for(var j = 0; j < arguments[i].length; j++){
            if(arguments[i][j] === 3){
                stampa(14, 'elemento trovato')
                break
            }else{
                if(j === (arguments[i].length - 1)){
                    stampa(14, 'elemento non trovato')
                }
            }
        }
    }
}
function unione_array(){
    for(var i = 0; i < arguments.length; i+=2){
        stampa(15, (arguments[i].concat(arguments[i+1])))
    }
}
function sotto_array(){
    for(var i = 0; i < arguments.length; i++){
        var new_array = []
        for(var j=0; j<arguments[i].length; j++){
            if(arguments[i][j] % 2 === 0){
                new_array.push(arguments[i][j])
            }
        }
        stampa(16, new_array)
    }
}
function filtro(){
    for(var i = 0; i < arguments.length; i++){
        var new_array = arguments[i].filter(numero => numero > 5)
        stampa(17, new_array)
    }
}
function oggetto(){
    for(var i = 0; i < arguments.length; i++){
        var stringa = ''
        for(property in arguments[i]){
            stringa += arguments[i][property] + ' '
        }
        stampa(18, stringa)
    }
}
function oggetto_proprieta(){
    for(var i = 0; i < arguments.length; i++){
        for(property in arguments[i]){
            if(property === 'nome'){
                stampa(19, arguments[i][property])
            }
        }
    }
}
function modifica_proprieta(){
    for(var i = 0; i < arguments.length; i++){
        var nome_prima = arguments[i].nome
        arguments[i].nome = 'Pippo'
        stampa(20, 'prima: ' + nome_prima + ", dopo: " + arguments[i].nome)
    }
}
function somma2(a, b){
    return a+b
}
function sottofunzione(){
    for(var i = 0; i < arguments.length; i+=2){
        stampa(21, somma2(arguments[i], arguments[i+1]))
    }
}
function raddoppia(a){
    return a*2
}
function sottofunzione2(){
    for(var i = 0; i < arguments.length; i++){
        stampa(22, raddoppia(arguments[i]))
    }
}
function lunghezza_stringa(a){
    return a.length
}
function sottofunzione3(){
    for(var i = 0; i < arguments.length; i++){
        stampa(23, lunghezza_stringa(arguments[i]))
    }
}
function indice(a, b){
    return a.indexOf(b)
}
function sottofunzione4(){
    for(var i = 0; i < arguments.length; i+=2){
        stampa(24, indice(arguments[i], arguments[i+1]))
    }
}
function massimo(a, b){
    return Math.max(a,b)
}
function sottofunzione5(){
    for(var i = 0; i < arguments.length; i+=2){
        stampa(25, massimo(arguments[i], arguments[i+1]))
    }
}
function contrario(a){
    return a.split('').reverse().join('')
}
function sottofunzione6(){
    for(var i = 0; i < arguments.length; i++){
        stampa(26, contrario(arguments[i]))
    }
}
function somma_elementi_array(a){
    var somma_temp = 0
    for(var i = 0; i < a.length; i++) {
        somma_temp += a[i]
    }
    return somma_temp
}
function sottofunzione7(){
    for(var i = 0; i < arguments.length; i++){
        stampa(27, somma_elementi_array(arguments[i]))
        console.log(i)
    }
}
function massimo_in_array(a){
    return Math.max(...a)
}
function sottofunzione8(){
    for(var i = 0; i < arguments.length; i++){
        stampa(28, massimo_in_array(arguments[i]))
    }
}
function stringa_piu_lunga(a){
    if (a[0].length > a[1].length) {
        return a[0];
      } else if (a[1].length > a[0].length) {
        return a[1];
      } else {
        return "stringhe di uguale lunghezza";
    }
}
function sottofunzione9(){
    for(var i = 0; i < arguments.length; i++){
        stampa(29, stringa_piu_lunga(arguments[i]))
    }
}