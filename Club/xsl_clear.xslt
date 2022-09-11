<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <html class="w">
            <style>
                .w {
                min-width:1200px;
                }
                .td2 {
                width:110px;
                color:red;
                }
            </style>
            <body>
                <h1>Список арендованных компьютеров</h1>
                <table border="1">
                    <xsl:for-each select="base/clients/client">
                        <tr>
                            <td><xsl:value-of select="fullname"/></td>
                            <td><xsl:value-of select="passport"/></td>
                            <td><xsl:value-of select="rented_computer"/></td>
                            <td><xsl:value-of select="rented_date_and_time"/></td>
                        </tr>
                    </xsl:for-each>
                </table>
                <p>
                    <h2>
                        <xsl:value-of select="count(base/clients/client)"/>
                    </h2>
                </p>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>
