<#include "static/header.ftl">
<#include "static/navbar.ftl">
<form method="post" action="/article/update">
    <div class="form-group">
        <label for="title">Title</label>
        <input class="form-control" type="text" placeholder="Default input" name="title" id="title" value="${article.title}">
    </div>
    <div class="form-group">
        <label for="title">text</label>
        <input class="form-control" type="text" placeholder="Default input" name="text"  id="title" value="${article.text}">
    </div>
    <div class="form-check form-check-inline">
        <input class="form-check-input" type="checkbox" id="inlineCheckbox1" name="techType" value="LIFE">
        <label class="form-check-label" for="inlineCheckbox1">LIFE</label>
    </div>
    <div class="form-check form-check-inline">
        <input class="form-check-input" type="checkbox" id="inlineCheckbox2" name="techType" value="TECH">
        <label class="form-check-label" for="inlineCheckbox2">TECH</label>
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
</form>

<#include "static/footer.ftl">