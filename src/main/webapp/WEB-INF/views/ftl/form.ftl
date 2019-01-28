<#include "static/header.ftl">
<#include "static/navbar.ftl">
<form method="post">
    <div class="form-group">
    <label for="title">Title</label>
    <input class="form-control" type="text" placeholder="Default input" id="title">
    </div>
    <div class="form-group">
        <label for="Text">textarea</label>
        <textarea class="form-control" id="Text" rows="5"></textarea>
    </div>
    <div class="form-check form-check-inline">
        <input class="form-check-input" type="checkbox" id="inlineCheckbox1" value="LIFE">
        <label class="form-check-label" for="inlineCheckbox1">LIFE</label>
    </div>
    <div class="form-check form-check-inline">
        <input class="form-check-input" type="checkbox" id="inlineCheckbox2" value="TECH">
        <label class="form-check-label" for="inlineCheckbox2">TECH</label>
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
</form>
<#include "static/footer.ftl">