package com.example.wwm.controller;

import com.example.wwm.model.ResultModel;
import com.example.wwm.util.SwaggerUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.MalformedURLException;

/**
 * @author weiming wu
 * @date 2022/1/26 11:31
 */

@RestController("/test")
@Api(tags = { "测试接口", "测试接口" })
public class TestController {


    @PostMapping("/getDetil")
    @ApiOperation(value = "获取所有用户", notes = "", httpMethod = "POST")
    public Object testApi(String name) {
        ResultModel resultModel = new ResultModel();
        resultModel.setName(name);
        resultModel.setPhone("13556514348");
        resultModel.setSex("男");
        return resultModel;
    }



    @GetMapping("/ascii")
    @ApiOperation(value = "生成ascii", notes = "", httpMethod = "GET")
    public String exportAscii() throws MalformedURLException {
        SwaggerUtils.generateAsciiDocs();
        return "success";
    }


    @GetMapping("/asciiToFile")
    @ApiOperation(value = "生成ascii", notes = "", httpMethod = "GET")
    public String asciiToFile() throws MalformedURLException{
        SwaggerUtils.generateAsciiDocsToFile();
        return "success";
    }


    @GetMapping("/markdown")
    @ApiOperation(value = "生成markdown", notes = "", httpMethod = "GET")
    public String exportMarkdown() throws MalformedURLException{
        SwaggerUtils.generateMarkdownDocs();
        return "success";
    }


    @GetMapping("/markdownToFile")
    @ApiOperation(value = "生成markdown", notes = "", httpMethod = "GET")
    public String exportMarkdownToFile() throws MalformedURLException{
        SwaggerUtils.generateMarkdownDocsToFile();
        return "success";
    }


    @GetMapping("/confluence")
    @ApiOperation(value = "生成confluence", notes = "", httpMethod = "GET")
    public String confluence() throws MalformedURLException{
        SwaggerUtils.generateConfluenceDocs();
        return "success";
    }


    @GetMapping("/confluenceToFile")
    @ApiOperation(value = "生成confluence", notes = "", httpMethod = "GET")
    public String confluenceToFile() throws MalformedURLException{
        SwaggerUtils.generateConfluenceDocsToFile();
        return "success";
    }

}
