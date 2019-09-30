var a = NaN;

if (a === NaN) {
    console.log("a is not a number");
}
if (a !== NaN) {
    console.log("a is not NaN");
}

var x = 4;
function doSomething(x) {
    console.log(x)
}
function doAnotherThing(x) {
    console.log(x)
}


switch (x) {
    case 1 || 2:
        doSomething(x);
        break;
    case 3:
        doAnotherThing(x);
        break;
    default:
        console.log("Boom!");
}