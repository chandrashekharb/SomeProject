<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<tiles:insertAttribute name="public-styles" />
		<script type="text/javascript" src="<c:url value="/resources/UI/bootstrap/js/jquery-2.1.1.js" />"></script>
		<title><tiles:getAsString name="public-title" /></title>
	</head>
	<body>
		<tiles:insertAttribute name="public-header" />
		<div class="container">
			<tiles:insertAttribute name="public-content" />
			<tiles:insertAttribute name="public-footer" />
		</div>
		<tiles:insertAttribute name="public-scripts" />
	</body>
</html>