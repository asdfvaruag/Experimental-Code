function calcPrice(price, taxes, desc){
    taxes = taxes|| 0.05
    desc = desc||"Default Item"
    const total = price*(1+taxes)
    console.log(`${desc} WITH  tax ${total}`)
}
calcPrice(100,0.07,"My item")