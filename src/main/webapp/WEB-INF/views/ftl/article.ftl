<#include "static/header.ftl">
<#include "static/navbar.ftl">
<div class="row">
    <div class="col-sm-3"></div>
    <div class="col-sm-6">
        <h2>${article.title}</h2>
        <p>${article.text}</p>
        <a href="/article/update?id=${article.id}"> <span class="badge badge-pill badge-info">Edit</span></a>
    </div>
    <div class="col-sm-3"></div>
</div>

<#include "static/footer.ftl">ń