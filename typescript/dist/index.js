"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
let up = Math.random() > 0.5 ? '10' : '5';
let num;
num = false;
let order = ['20', '40'];
let currOrder = false;
for (let ord of order) {
    if (ord === '20') {
        currOrder = true;
        break;
    }
}
console.log(currOrder);
//# sourceMappingURL=index.js.map