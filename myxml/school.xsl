<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
		<!-- TODO: Auto-generated template -->
		<html>
		<header>
			<link rel="stylesheet" type="text/css" href="my.css"/>
		</header>
			<body>
				<h2 align="center">Student  Details</h2>
				<table border="1" align="center">
					<tr>
						<th>firstname</th>
						<th>lastname</th>
						<th>city</th>
		
					</tr>
					<xsl:for-each select="school/student">
				      <tr>
				        <td><xsl:value-of select="firstname"/></td>
				        <td><xsl:value-of select="lastname"/></td>
				        <td><xsl:value-of select="city"/></td>
				      
				      </tr>
     			 </xsl:for-each>
				</table>
			</body>
		</html>
	</xsl:template>
</xsl:stylesheet>
