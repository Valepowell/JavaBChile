function toggleLogin() {
    const btnlogin = document.getElementById('btnlogin');
    if (btnlogin.innerText === 'Iniciar sesión') {
        btnlogin.innerText = 'Cerrar sesión';
    } else {
        btnlogin.innerText = 'Iniciar sesión';
    }
}

function addDefinition() {
    const addDefinitionBtn = document.getElementById('add-definition-btn');
    addDefinitionBtn.style.display = 'none';
    alert('Petlopedia está definida por TI');
}

function likeDefinition(btnmegusta, title) {
    const currentLikes = parseInt(btnmegusta.innerText.split(' ')[0]);
    btnmegusta.innerText = `${currentLikes + 1} me gusta`;
    alert(`${title} was liked`);
}