console.log("Conectado");

function likes(elemento){
    let num_like = parseInt(elemento.closest(".like-count").querySelector(".like").innerHtml);
    num_likes++;
    elemento.closest(".like-count").querySelector(".like").innerHtm = num_likes;
}