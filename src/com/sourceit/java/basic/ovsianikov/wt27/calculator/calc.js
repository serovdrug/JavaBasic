function eraseText() {
    document.getElementById('a').value = "";
    document.getElementById('b').value = "";
    document.getElementById('rezult').value = "";
}

function addNumbers(a, b) {
    var x = document.getElementById('a').value;
    var y = document.getElementById('b').value;
    document.getElementById('rezult').value = (+x) + (+y);
}

function minNumbers(a, b) {
    var x = document.getElementById('a').value;
    var y = document.getElementById('b').value;
    document.getElementById('rezult').value = (+x) - (+y);
}

function divNumbers(a, b) {
    var x = document.getElementById('a').value;
    var y = document.getElementById('b').value;
    document.getElementById('rezult').value = (+x) / (+y);
}

function multNumbers(a, b) {
    var x = document.getElementById('a').value;
    var y = document.getElementById('b').value;
    document.getElementById('rezult').value = (+x) * (+y);
}