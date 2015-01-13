<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>



<c:url  value="register" var="registerAction"></c:url>

<form:form id="uname" name="uname" method="post" action="${registerAction}" modelAttribute="user">
<label>name</label>
<form:input path="name" id="" name="name"/>
<form:errors path="name" id=""></form:errors>

<label>email</label>
<form:input path="email" id="" name="email"/>
<form:errors path="email" id=""></form:errors>

<label>password</label>
<form:input path="password" id="" name="password"/>
<form:errors path="password" id=""></form:errors>

<label>enabl</label>
<form:input path="enabled" id="" name="enabled"/>
<form:errors path="enabled" id=""></form:errors>
<label>moblie</label>
<form:input path="mobile" id="" name="mobile"/>
<form:errors path="mobile" id=""></form:errors>


<input class="btn btn-lg btn btn-block" id="btn-login" type="submit" value="submit" >


 
 
 
 
</form:form>
