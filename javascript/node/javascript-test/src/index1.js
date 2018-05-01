(function() {
    function req(url) {
        let req = new XMLHttpRequest()
        req.open('GET', url)
        req.onreadystatechange = () => {
            console.log(req.responseText)
        }
        req.send()
    }

    let btnA = document.querySelector('#btn-a')
    btnA.addEventListener('click', () => { req('http://localhost:4000')})

})();