package top.lyunk.test.springaiissue4396;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springaicommunity.mcp.annotation.McpTool;

import org.springframework.stereotype.Component;

@Component
public class MyMcpTools {
    @McpTool
    public String getCurrentTime() {
        return LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME);
    }
}
