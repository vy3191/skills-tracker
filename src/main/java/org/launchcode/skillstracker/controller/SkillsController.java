package org.launchcode.skillstracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {

    @GetMapping("")
    @ResponseBody
    public String init() {
        String html = "<h1>Sills Tracker</h1>" +
                      "<h2>Choose your language</h2>"+
                      "<ol>" +
                       "<li>javaScript</li>"+
                        "<li>Java</li>"+
                        "<li>Python</li>"+
                      "</ol>";
        return html;
    }

    @GetMapping("form")
    @ResponseBody
    public String chooseLanguage() {
        String getName = "<input type='text' name='name' />";
        String selectOne = "<select name='languageOne'>" +
                              "<option value='HTML'>HTML</option>"+
                              "<option value='CSS'>CSS</option>"+
                              "<option value='JavaScript'>JavaScript</option>"+
                            "</select>";
        String selectTwo = "<select name='languageTwo'>" +
                "<option value='Pyhton'>Pyhton</option>"+
                "<option value='C#'>C#</option>"+
                "<option value='Java'>Java</option>"+
                "</select>";
        String selectThree = "<select name='languageThree'>" +
                "<option value='MySqul'>MySqul</option>"+
                "<option value='MangoDB'>MangoDB</option>"+
                "<option value='Go'>Go</option>"+
                "</select>";
        String button = "<button type='submit'>Submit</button>";
        return "<form method='POST'>"+
                 "Name: "+ "</br>" +
                  getName + "</br>" +
                  "My favorite language: " + "</br>" +
                    selectOne + "</br>" +
                  "My Second favorite language: " + "</br>" +
                     selectTwo + "</br>" +
                  "My third favorite language: " + "</br>" +
                     selectThree + "</br>" +
                     button + "</br>" +
               "</form>";
    }

    @PostMapping("form")
    @ResponseBody
    public String chooseLanguage(@RequestParam String name, @RequestParam String languageOne, @RequestParam String languageTwo, @RequestParam String languageThree ) {
        return "<h1>"+name+"</h1>"+
                 "<table style='color:red;'>"+
                  "<tr>"+
                   "<th>Language-1</th>"+
                   "<th>Language-2</th>"+
                   "<th>Language-3</th>"+
                   "</tr>"+
                 "<tr><td>"+languageOne+"</td>"+
                 "<td>"+languageTwo+"</td>"+
                 "<td>"+languageThree+"</td></tr>"+
                "</table>";

    }


}
