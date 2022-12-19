let cache ={

}

function fib(n){
    if(n==1||n==2) return 1;
    if(!cache[n]){
    let value = fib(n-1)+fib(n-2);

    cache[n] = value;
    }
    return cache[n];
}
let t1 = performance.now();
const r = fib(40);
console.log(r);
let t2 = performance.now();
console.log(t2-t1)

let a ={1:6,2:1,4:5};
console.log(4 in a);