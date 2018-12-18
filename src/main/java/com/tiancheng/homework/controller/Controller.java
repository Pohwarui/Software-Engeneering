package com.tiancheng.homework.controller;

import com.tiancheng.homework.domain.*;
import com.tiancheng.homework.domain.Process;
import com.tiancheng.homework.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@org.springframework.stereotype.Controller
@RequestMapping("uem")
public class Controller {

    @Autowired
    private Service service;

    /*@RequestMapping("addExaminee")
    public boolean addExaminee(HttpServletRequest request, HttpServletResponse response){
        String name = request.getParameter("name");

        Examinee examinee = new Examinee();
        examinee.setName(name);

        service.addExaminee(examinee);

        return true;
    }

    @RequestMapping("addExam")
    public boolean addExam(HttpServletRequest  request, HttpServletResponse response){
        String name = request.getParameter("name");

        Exam exam = new Exam();
        exam.setName(name);

        service.addExam(exam);

        return true;
    }

    @RequestMapping("addGrade")
    public boolean addGrade(HttpServletRequest request, HttpServletResponse response){
        String name = request.getParameter("name");

        Grade grade = new Grade();
        grade.setName(name);

        service.addGrade(grade);

        return true;
    }

    @RequestMapping("addPerson")
    public boolean addPerson(HttpServletRequest request, HttpServletResponse response){
        String name = request.getParameter("name");

        Person person = new Person();
        person.setName(name);

        service.addPerson(person);

        return true;
    }

    @RequestMapping("selectByExample")
    public ExamineeExample selectExamineeById(Examinee id) {
        return service.selectByExample(id);
    }

    @RequestMapping("selectByExample")
    public ExamExample selectExamById(Exam id) {
        return service.selectByExample(id);
    }

    @RequestMapping("selectByExample")
    public GradeExample selectGradeById(Grade id) {
        return service.selectByExample(id);
    }

    @RequestMapping("selectByExample")
    public PersonExample selectExamineeById(Person id) {
        return service.selectByExample(id);
    }*/

    @RequestMapping("getSingleExamineeInfo")
    @ResponseBody
    public Examinee getSingleExamineeInfo(HttpServletRequest request, HttpServletResponse response) {
        //int id = Integer.parseInt(request.getParameter("id"));

        int id = 1;
        Examinee examinee = service.getExamineeById(id);
        if(examinee != null) {
            return examinee;
        } else {
            return null;
        }
    }

    @RequestMapping("getAllServerInfo")
    @ResponseBody
    public List<Server> getServerInfo(HttpServletResponse response) {
        //int id = Integer.parseInt(request.getParameter("id"));
        List<Server> server = service.getServer();
        if(server != null) {
            return server;
        } else {
            return null;
        }
    }

    @RequestMapping("getAllNewsInfo")
    @ResponseBody
    public List<News> getNewsInfo(HttpServletResponse response) {
        //int id = Integer.parseInt(request.getParameter("id"));
        List<News> news = service.getNews();
        if(news != null) {
            return news;
        } else {
            return null;
        }
    }

    @RequestMapping("getAllRichengInfo")
    @ResponseBody
    public List<Richeng> getRichengInfo(HttpServletResponse response) {
        //int id = Integer.parseInt(request.getParameter("id"));
        List<Richeng> richeng = service.getRicheng();
        if(richeng != null) {
            return richeng;
        } else {
            return null;
        }
    }

    @RequestMapping("getAllProcessInfo")
    @ResponseBody
    public List<Process> getProcessInfo(HttpServletResponse response) {
        //int id = Integer.parseInt(request.getParameter("id"));
        List<Process> process = service.getProcess();
        if(process != null) {
            return process;
        } else {
            return null;
        }
    }
}
