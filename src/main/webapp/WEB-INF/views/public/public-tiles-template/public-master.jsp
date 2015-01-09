<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<tiles:insertAttribute name="public-styles" />
		<title><tiles:getAsString name="public-title" /></title>
	</head>
	<body>
		<tiles:insertAttribute name="public-header" />
		<tiles:insertAttribute name="public-content" />
		<tiles:insertAttribute name="public-footer" />
		<tiles:insertAttribute name="public-scripts" />
	</body>
</html>