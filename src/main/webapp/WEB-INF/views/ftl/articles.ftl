<#include "static/header.ftl">
<#include "static/navbar.ftl">

<#list articles as article>
<div class="row">
    <div class="col-sm-3"></div>
    <div class="col-sm-6">
            <div class="jumbotron">
                <h1 class="display-4">${article.title}</h1>
                <hr class="my-4">
                <span class="badge badge-pill badge-info">${article.created}</span>
            </div>
    </div>
    <div class="col-sm-3"></div>
</div>
</#list>


<#include "static/footer.ftl">