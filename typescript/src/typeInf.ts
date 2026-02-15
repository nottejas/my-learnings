let up: string = Math.random() > 0.5 ? '10' : '5';

let num: any;
num = false;

let order = ['20', '40'];

let currOrder = false;

for(let ord of order){
    if(ord === '20'){
        currOrder = true
        break
    }
}

console.log(currOrder);
